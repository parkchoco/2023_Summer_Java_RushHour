package finalProjectRushHour;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class RushHourView extends JPanel {
	private Police police;
	private Rub rub;
    
    public RushHourView() {
        setPreferredSize(new Dimension(1000, 1000));
        setBackground(new Color(200, 255, 120));
        police = new Police(100, 100, 100, 100);
        rub = new Rub(100, 100, 100, 100);
        setLayout(null);
        createButtons();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        police.paintComponent(g);
        rub.paintComponent(g);
        Font font = new Font("Times New Roman", Font.BOLD, 100);
        g.setFont(font);
        g.setColor(Color.RED);
        g.drawString("RUSH HOUR", 220, 250);
    }

    private void createButtons() {
    	Play("자바 자동차 사진/PoliceCarSound.wav");
        JButton easyButton = new JButton("easy");
        easyButton.setBounds(380, 360, 250, 50);
        easyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RushHourController.openEasyFrame("Easy Mode");
            }
        });
        add(easyButton);

        JButton normalButton = new JButton("normal");
        normalButton.setBounds(380, 460, 250, 50);
        normalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RushHourController.openNormalFrame("Normal Mode");
            }
        });
        
        add(normalButton);

        JButton hardButton = new JButton("hard");
        hardButton.setBounds(380, 560, 250, 50);
        hardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RushHourController.openHardFrame("Hard Mode");

            }
        });
        
        add(hardButton);
    }

    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("RUSH HOUR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RushHourView panel = new RushHourView();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
    
    public void Play(String music) {
        try {
            File PoliceCarSound = new File(music);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(PoliceCarSound);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
    	createAndShowGUI();
    	
    }

}