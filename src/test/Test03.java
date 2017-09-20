package test;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//マウスで反応するアプレット


//MouseListenerを実装
public class Test03 extends Applet implements MouseListener {
	int x = 10;
	int y = 10;

	public void init(){
		//マウスによるイベントを受ける準備
		addMouseListener(this);
	}

	//描画メソッド
	public void paint(Graphics g){
		//楕円の描画
		//(X座標,y座標,幅,高さ)
		g.fillOval(x, y, 10, 10);
	}

	//クリック時
	public void mouseClicked(MouseEvent e){

	}

	//マウスカーソルがアプレットに入った時
	public void mouseEntered(MouseEvent e){

	}

	//マウスカーソルがアプレットから出た時
	public void mouseExited(MouseEvent e){

	}

	//マウスボタンを押した時
	public void mousePressed(MouseEvent e){
		//マウスを押した位置を取得してx,yに格納
		x = e.getX();
		y = e.getY();

		//paintメソッドをもう一度呼び出す
		repaint();
	}

	//マウスボタンを離した時
	public void mouseReleased(MouseEvent e){

	}


	//ゲッター・セッター
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}