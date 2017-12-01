import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerThread extends Thread {
	
	JLabel label;
	int counter = 0;
	
	public TimerThread(JLabel obj) {

		this.label = obj;
		
	}
	
	public void run() {
		
		while(true) {
			
			label.setText(String.format("%d",  counter++));
			
			try {
				
				Thread.sleep(100);
				
			} catch(InterruptedException e) {
				
				counter = 0;
				return;
			}
		}
	}
}


public class Ex1302 extends JFrame {
	
	JLabel label;
	TimerThread th = null;
	
	public Ex1302() {
		
		this.setTitle("Digital Timer");
		this.setSize(300, 160);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		label = new JLabel();
		label.setFont(new Font("Gothic", Font.BOLD, 80));
		this.setLayout(new FlowLayout());
		th = new TimerThread(label);
		label.requestFocus();
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if(th.isAlive())
					th.interrupt();
				else {
					th = new TimerThread(label);
					th.start();
				}
			}
		});
		
		this.add(label);
		this.setVisible(true);
		th.start();
	}
	
	public static void main(String [] args) {
		
		new Ex1302();
	}

}
