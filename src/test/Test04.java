package test;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//マウスの動きに合わせたイベント

//MouseMotionListenerを実装
public class Test04 extends Applet implements MouseListener,MouseMotionListener {
	//座標
	int x = 10;
	int y = 10;
	//半径
	int r =5;
	//色
	Color c = Color.BLACK;

	public void init(){
		addMouseListener(this);
		//マウスの動きに反応させる準備
		addMouseMotionListener(this);
	}

	//円を描画
	public void paint(Graphics g){
		g.setColor(c);
		g.fillOval(x, y, r*2, r*2);
	}

	//マウスをドラッグした時
	public void mouseDragged(MouseEvent e){
		x = e.getX()-r;
		y = e.getY()-r;
		c = Color.RED;
		repaint();
	}

	//マウスを動かした時
	public void mouseMoved(MouseEvent e){
		x = e.getX()-r;
		y = e.getY()-r;
		repaint();
	}

	//MouseListenerの動作
	public void mouseClicked(MouseEvent e) {

	}


	public void mouseEntered(MouseEvent e) {


	}

	public void mouseExited(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {
		r = 10;
		x = e.getX()-r;
		y = e.getY()-r;
		c = Color.RED;
		repaint();

	}

	public void mouseReleased(MouseEvent e) {
		r = 5;
		x = e.getX()-r;
		y = e.getY()-r;
		c = Color.BLACK;
		repaint();
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

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}


}
