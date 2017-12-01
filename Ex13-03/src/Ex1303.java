import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class Clock extends Thread {

	JLabel label;
	int hour, min, second;
	
	public Clock(JLabel obj) {
	
	this.label = obj;
	
	}

     public void run()    {        while(true)        {            Calendar c = Calendar. getInstance ();            hour = c.get(Calendar. HOUR_OF_DAY );            min = c.get(Calendar. MINUTE );            second = c.get(Calendar. SECOND );            label.setText(String. format ("%02d:%02d:%02d", hour, min, second));                        try            {                Thread. sleep (1000);            }            catch(InterruptedException e)            {                return            }        }    } } public class ThreadEx3 extends JFrame {    JLabel label        public ThreadEx3()    {        this.setTitle("디지털 시계");        this.setSize(500, 160);        this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );            label = new JLabel();        label.setFont(new Font("Gothic", Font. BOLD , 80));        this.setLayout(new FlowLayout());        this.add(label);        Clock c = new Clock(label);                this.setVisible(true);                c.start();    }    public static void main(String[] args)     {        new ThreadEx3();    } 
	 }
