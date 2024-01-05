package finalProjectRushHour;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Rub extends JPanel {
	private ImageIcon icon;
	private Image img;

	public Rub(int x, int y, int width, int height) {
	    icon = new ImageIcon("자바 자동차 사진/도둑.jpg");
	    img = icon.getImage(); 
	}

	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    
	    g.drawImage(img, 600, 50, 300, 500, this);
	    
	}
}