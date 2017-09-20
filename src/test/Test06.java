package test;
import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ウィンドウ部品を用いる


//ActionListenerを実装
public class Test06 extends Applet implements ActionListener{
	Button button;
/*---------------------------------
	ボタン以外の部品
	Checkbox:チェックボックス
	Choice:プルダウンメニュー
	Label:ラベル
	List:リスト
	TextField:テキストフィールド
	TextArea:テキストエリア
	Scrollbar:スクロールバー
	Canvas:キャンバス
	Panel:パネル
	Dialog:ダイアログ
	FileDialog:ファイルダイアログ
	Frame:フレーム
-------------------------------------*/

	public void init(){
		//ボタン
		button = new Button("ボタン");

		add(button);
		//ボタンを押された時のイベントの準備
		button.addActionListener(this);
	}

	//ボタンが押された時の処理
	public void actionPerformed(ActionEvent ae) {
		//ボタンのラベルを中止に変更
		button.setLabel("中止");
	}


}