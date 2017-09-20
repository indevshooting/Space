package test;
import java.applet.Applet;
import java.awt.Graphics;

//Runnableクラスを実装
public class Test07 extends Applet implements Runnable {
	int num;

	public void init(){
		Thread th = new Thread(this);
		th.start();
	}

	public void run(){
		for(int i=0;i<100;i++){
			try {
				num = i;
				repaint();
				//スレッドを1秒ごとに一時停止する
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread.sleepでエラーが発生しました");
			}
		}
	}

	public void paint(Graphics g){
		String str = "一秒ごとに右の数字が増えます：" +num;
		g.drawString(str,10,10);
	}
}
