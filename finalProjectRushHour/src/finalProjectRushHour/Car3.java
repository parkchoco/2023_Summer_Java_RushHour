package finalProjectRushHour;

import javax.swing.*;
import java.awt.*;

public class Car3 extends JPanel {
	private ImageIcon icon;
	private Image img;
	
	private int x;
	private int y;
	
	private boolean movingUp;
	private boolean movingDown;
	
	private int width;
	private int height;
	
	public Car3(int x, int y, int width, int height) {
	    icon = new ImageIcon("자바 자동차 사진/차2.jpg");
	    img = icon.getImage();
	
	    this.x = x;
	    this.y = y;
	
	    movingUp = false;
	    movingDown = false;
	
	    this.width = width;
	    this.height = height;
	}
	
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    
	    g.drawImage(img, this.x, this.y, width, height, this);
	
	}
	
	public void moveUp() {
	    movingUp = true;
	}
	
	public void moveDown() {
	    movingDown = true;
	}
	
	public void stopMovingUp() {
	    movingUp = false;
	}
	
	public void stopMovingDown() {
	    movingDown = false;
	}
	
	public void update() {
	    if (movingUp && y > 150) {
	        y -= 100;
	    } else if (movingDown && y < 550) {
	        y += 100;
	    }
	}
}
