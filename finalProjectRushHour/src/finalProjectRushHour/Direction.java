package finalProjectRushHour;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Direction extends JPanel {
	 private ImageIcon icon;
	 private Image img;

	 public Direction(int x, int y, int width, int height) {
	     icon = new ImageIcon("�ڹ� �ڵ��� ����/ȭ��ǥ.jpg");
	     img = icon.getImage();
	     
	 }

	 public void paintComponent(Graphics g) {
	     super.paintComponent(g);
	     
	     g.drawImage(img, 800, 350, 200, 100, this);
	     
	 }
}