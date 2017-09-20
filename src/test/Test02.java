package test;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

//アプレットに画像を表示する

public class Test02 extends Applet {

	Image img,img_ringo;

	//アプレット起動時に1度だけ自動的に呼び出されるメソッド
	public void init(){
		//URL取得処理
			//現在のJavaファイルのパス(getCodeBase)をString型に格納
			String basePath = String.valueOf(getCodeBase());
			System.out.println("basePath = "+basePath);

			//binフォルダを取得するのでimgフォルダに置き換え
			String imgPath = basePath.replace("bin","img");
			System.out.println("imgPath = "+ imgPath);

			//URL型に変換(例外あるのでtry/catch)
			URL imgUrl;
			try {
				imgUrl = new URL(imgPath);
			} catch (MalformedURLException e) {
				System.out.println("URL変換エラー");
				return;
			}

		//画像取得
		//getImage(ディレクトリ,画像ファイル名)
		img = getImage(imgUrl,"player_shot.png");

		img_ringo = getImage(imgUrl,"ringo.jpg");
	}

	//描画メソッド
	public void paint(Graphics g){
		//切り抜き＆拡大縮小表示
		/*------------------------
		左から
		・取得した画像
		・表示開始X座標
		・表示開始Y座標
		・表示終了X座標
		・表示終了Y座標
		・切り抜き開始X座標
		・切り抜き開始Y座標
		・切り抜き終了X座標
		・切り抜き終了Y座標
		・ImageObserverインターフェースを実装しているオブジェクト(通常thisでOK))
		------------------------*/
		g.drawImage(img, 10,10,50,50,0,0,40,40,this);

		//拡大縮小表示(開始X座標・開始Y座標・幅・高さ)
		//g.drawImage(img, 0, 0, 40, 40, this);

		//原寸表示(開始X座標・開始Y座標)
		//g.drawImage(img_ringo,10,10,this);
	}
}
