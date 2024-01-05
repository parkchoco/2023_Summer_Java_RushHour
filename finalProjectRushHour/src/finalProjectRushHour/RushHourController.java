package finalProjectRushHour;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RushHourController {
	public static void openEasyFrame(String easy) {
		JFrame easyFrame = new JFrame(easy);
		easyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		easyFrame.setSize(1000, 1000);
        easyFrame.setLocationRelativeTo(null);

        JPanel easyContentPane = new EasyModePanel();
        easyFrame.setContentPane(easyContentPane);

		easyFrame.setVisible(true);

        new Guide();
        }

	public static void openNormalFrame(String normal) {
		JFrame normalFrame = new JFrame(normal);

		normalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        normalFrame.setSize(1000, 1000);
        normalFrame.setLocationRelativeTo(null);

        JPanel normalContentPane = new NormalModePanel();
        normalFrame.setContentPane(normalContentPane);

        normalFrame.setVisible(true);

        new Guide();
        }

    public static void openHardFrame(String hard) {
		JFrame hardFrame = new JFrame(hard);

        hardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        hardFrame.setSize(1000, 1000);
        hardFrame.setLocationRelativeTo(null);

        JPanel hardContentPane = new HardModePanel();
        hardFrame.setContentPane(hardContentPane);

        hardFrame.setVisible(true);

        new Guide();
    }
}