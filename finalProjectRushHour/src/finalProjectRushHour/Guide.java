package finalProjectRushHour;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Guide extends JFrame {
	
    private GuidePanel guidepanel;
    
    public Guide() {
        setTitle("Guide");
        
        guidepanel = new GuidePanel();
        getContentPane().add(guidepanel);

        pack();
        setLocationRelativeTo(null);
        setSize(300, 800);
        setVisible(true);
    }
}