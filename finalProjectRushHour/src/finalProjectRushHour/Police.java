package finalProjectRushHour;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Police extends JPanel {
	 private ImageIcon icon;
	 private Image img;

	 public Police(int x, int y, int width, int height) {
	     icon = new ImageIcon("자바 자동차 사진/경찰.jpg");
	     img = icon.getImage();
	     
	 }

	 public void paintComponent(Graphics g) {
	     super.paintComponent(g);
	     
	     g.drawImage(img, 50, 200, 300, 600, this);
	     
	 }
}