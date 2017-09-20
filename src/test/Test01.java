package test;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

//アプレットに文字列と直線を表示する

//Appletクラスを拡張
public class Test01 extends Applet {

	//アプレット描画メソッド
	//アプレットにおけるメイン文
	public void paint(Graphics g){

		//色を設定
		//テスト
		g.setColor(Color.red);

		//フォントを設定
		//new Font("フォント名",フォントスタイル,フォントサイズ)
		g.setFont(new Font("Meiryo UI",Font.BOLD,30));

		//文字列表示
		//(表示文字列,X座標,Y座標)
		g.drawString("Hello Applet",50,30);

		//直線表示
		//(始点X,始点Y,終点X,終点Y)
		g.drawLine(10, 10, 30, 30);
		g.drawLine(260, 30, 280, 10);


	}

}
