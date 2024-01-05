package finalProjectRushHour;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GuidePanel extends JPanel {
	
	private PoliceCar policecar;
	
	private Bus1 bus1;
	private Bus2 bus2;
	private Bus3 bus3;
	private Bus4 bus4;
	
	private Car1 car1;
	private Car2 car2;
	private Car3 car3;
	
	private Car4 car4;
	private Car5 car5;
	private Car6 car6;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        policecar = new PoliceCar(35, 150, 90, 45);
        
        bus1 = new Bus1(75, 520, 45, 135);
        bus2 = new Bus2(10, 230, 135, 45);
        bus3 = new Bus3(10, 310, 135, 45);
        bus4 = new Bus4(175, 520, 45, 135);
        
        car1 = new Car1(160, 150, 90, 45);
        car2 = new Car2(50, 390, 45, 90);
        car3 = new Car3(130, 390, 45, 90);
        
        car4 = new Car4(210, 390, 45, 90);
        car5 = new Car5(160, 230, 90, 45);
        car6 = new Car6(160, 310, 90, 45);
        
        Font title = new Font("Times New Roman", Font.BOLD, 30);
        g.setFont(title);
        g.setColor(Color.RED);
        g.drawString("RUSH HOUR", 55, 50);
        g.drawString("Guide", 100, 80);
        
        Font guide = new Font("Times New Roman", Font.BOLD, 10);
        g.setFont(guide);
        g.setColor(Color.BLACK);
        g.drawString("a game in which a police car is moved outside", 53, 100);
        g.drawString("Select the car you want to move to using a,s,d,f...", 45, 115);
        g.drawString("Use the up, down, left, and right direction keys to move the car", 15, 130);
        
        g.drawString("press A ก็ กๆ ", 50, 210);
        g.drawString("press D ก็ กๆ ", 175, 210);
        
        g.drawString("press G ก็ กๆ ", 50, 290);
        g.drawString("press C ก็ กๆ ", 175, 290);
        
        g.drawString("press H ก็ กๆ ", 50, 370);
        g.drawString("press V ก็ กๆ ", 175, 370);
        
        g.drawString("press F ก่ ก้ ", 45, 495);
        g.drawString("press Z ก่ ก้ ", 122, 495);
        g.drawString("press X ก่ ก้ ", 205, 495);
        
        g.drawString("press S ก่ ก้ ", 75, 670);
        g.drawString("press J ก่ ก้ ", 175, 670);
        
        policecar.paintComponent(g);
        
        bus1.paintComponent(g);
        bus2.paintComponent(g);
        bus3.paintComponent(g);
        bus4.paintComponent(g);
        
        car1.paintComponent(g);
        car2.paintComponent(g);
        car3.paintComponent(g);
        
        car4.paintComponent(g);
        car5.paintComponent(g);
        car6.paintComponent(g);
        
        
    }
}