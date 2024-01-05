package finalProjectRushHour;

import javax.swing.*;
import java.awt.*;

public class Bus3 extends JPanel {
	private ImageIcon icon;
	private Image img;
	
	private int x;
	private int y;
	 
	private boolean movingLeft;
	private boolean movingRight;
	
	private int width;
	private int height;
	
	public Bus3(int x, int y, int width, int height) {
		icon = new ImageIcon("�ڹ� �ڵ��� ����/����3.jpg");
	    img = icon.getImage();
	
	    this.x = x;
	    this.y = y;
	     
	    movingLeft = false;
	    movingRight = false;
	
	    this.width = width;
	    this.height = height;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	    g.drawImage(img, x, y, width, height, this);
	
	}
	
	public void moveRight() {
	    movingRight = true;
	}
	
	public void moveLeft() {
	    movingLeft = true;
	}
	
	public void stopMovingLeft() {
	    movingLeft = false;
	}
	
	public void stopMovingRight() {
	    movingRight = false;
	}
	
	public void update() {
	    if (movingLeft && x > 200) {
	        x -= 100;
	    } else if (movingRight && x < 500) {
	        x += 100;
	    }
	}
}
