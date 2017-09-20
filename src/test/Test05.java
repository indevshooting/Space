package test;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Test03の省略した書き方

public class Test05 extends Applet{
	int x = 10;
	int y = 10;

	public void init(){
		//Listenerの引数の中にMouseAdapter・イベントを書き込む
		addMouseListener(new MouseAdapter(){

			//マウスを押した時のイベント
			public void mousePressed(MouseEvent e){
				x = e.getX();
				y = e.getY();
				repaint();
			}

		});
	}

	//描画メソッド
	public void paint(Graphics g){
		g.fillOval(x, y, 10, 10);
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