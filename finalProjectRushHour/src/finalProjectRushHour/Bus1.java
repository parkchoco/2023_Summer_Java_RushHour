package finalProjectRushHour;

import javax.swing.*;
import java.awt.*;

public class Bus1 extends JPanel {
	
    private ImageIcon icon;
    private Image img;
    
    private int x;
    private int y;
   
    private boolean movingUp;
    private boolean movingDown;
  
    private int width;
    private int height;
   
    public Bus1(int x, int y, int width, int height) {
    	
    	
        icon = new ImageIcon("자바 자동차 사진/버스1.jpg");

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
        } else if (movingDown && y < 450) {//else if 버스1이 아래로 움직일때 y값이 450보다 작으면 y좌표를 100만큼 증가시킨다.
            y += 100;
        }
    }
    
}
