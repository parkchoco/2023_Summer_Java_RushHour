package finalProjectRushHour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class EasyModePanel extends JPanel implements KeyListener {
    private static final int PANEL = 600;
    private static final int INNER_SQUARE = 100;
    private static final int GRID = 6;
    private static final int CELL = PANEL / GRID;
    
    private Direction direction;
    
    private PoliceCar policeCar;
    private Bus1 bus1;
    private Car1 car1;
    private Car2 car2;
    private Timer timer;
    private boolean isPoliceCarSelected; 
    private boolean isBus1Selected; 
    private boolean isCar1Selected; 
    private boolean isCar2Selected; 
    
    
    public EasyModePanel() {
        setPreferredSize(new Dimension(PANEL, PANEL));
        setBackground(new Color(200, 255, 120));

        policeCar = new PoliceCar(200, 350, 200, 100);
        bus1 = new Bus1(700, 150, 100, 300);
        car1 = new Car1(600, 550, 200, 100);
        car2 = new Car2(600, 250, 100, 200);
        
        direction = new Direction(800, 350, 100, 100);
        
        addKeyListener(this);
        setFocusable(true);
        stopwatch();
       
        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                policeCar.updatePosition();
                bus1.update();
                car1.update();
                car2.update();
                repaint();
            }
        });
        timer.start();
    }
    public void stopwatch() {
        JFrame Frame = new JFrame("Timer");
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.setSize(200, 100);
        Frame.setLayout(null);

        JLabel timerLabel = new JLabel("00:00:00");
        timerLabel.setFont(new Font("굴림", Font.BOLD, 30));
        timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timerLabel.setBounds(0, 0, 190, 60);
        Frame.add(timerLabel);

        long startTime = System.currentTimeMillis();

        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long currentTime = System.currentTimeMillis() - startTime;
                long minutes = currentTime / (1000 * 60);
                long seconds = (currentTime / 1000) % 60;
                long milliseconds = (currentTime % 1000) / 10;

                String timeString = String.format("%02d:%02d:%02d", minutes, seconds, milliseconds);
                timerLabel.setText(timeString);
            }
        });
        timer.start();

        Frame.setVisible(true);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawInnerSquares(g);
        direction.paintComponent(g);
        policeCar.paintComponent(g);
        bus1.paintComponent(g);
        car1.paintComponent(g);
        car2.paintComponent(g);
        
    }

    //36개 판 그리기 보드게임
    private void drawInnerSquares(Graphics g) {
        int startX = (PANEL - INNER_SQUARE) / 2 - 50;
        int startY = (PANEL - INNER_SQUARE) / 2 - 100;

        g.setColor(Color.RED);
        for (int row = 0; row < GRID; row++) {
            for (int col = 0; col < GRID; col++) {
                int x = startX + col * CELL;
                int y = startY + row * CELL;
                g.drawRect(x, y, INNER_SQUARE, INNER_SQUARE);
            }
        }
    }

    
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_A) {
        	
            isPoliceCarSelected = true;
            isBus1Selected = false;
            isCar1Selected = false;
            isCar2Selected = false;
        } else if (keyCode == KeyEvent.VK_S) {
        	
            isPoliceCarSelected = false;
            isBus1Selected = true;
            isCar1Selected = false;
            isCar2Selected = false;
        } else if (keyCode == KeyEvent.VK_D) {
        	
            isPoliceCarSelected = false;
            isBus1Selected = false;
            isCar1Selected = true;
            isCar2Selected = false;
        } else if (keyCode == KeyEvent.VK_F) {
        	
            isPoliceCarSelected = false;
            isBus1Selected = false;
            isCar1Selected = false;
            isCar2Selected = true;
        } else if (keyCode == KeyEvent.VK_LEFT && isPoliceCarSelected) {

            policeCar.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isPoliceCarSelected) {

            policeCar.moveRight();
        } else if (keyCode == KeyEvent.VK_UP && isBus1Selected) {
 
            bus1.moveUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isBus1Selected) {
           
            bus1.moveDown();
        }else if (keyCode == KeyEvent.VK_LEFT && isCar1Selected) {

            car1.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isCar1Selected) {

            car1.moveRight();
        }
        else if (keyCode == KeyEvent.VK_UP && isCar2Selected) {
        	 
        	car2.moveUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isCar2Selected) {
           
        	car2.moveDown();
        }
    }

    
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT && isPoliceCarSelected) {
            policeCar.stopMovingLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isPoliceCarSelected) {
            policeCar.stopMovingRight();
        } else if (keyCode == KeyEvent.VK_UP && isBus1Selected) {
            bus1.stopMovingUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isBus1Selected) {
            bus1.stopMovingDown();
        } else if (keyCode == KeyEvent.VK_LEFT && isCar1Selected) {
            car1.stopMovingLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isCar1Selected) {
            car1.stopMovingRight();
        } else if (keyCode == KeyEvent.VK_UP && isCar2Selected) {
            car2.stopMovingUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isCar2Selected) {
            car2.stopMovingDown();
        }
    }

    
    public void keyTyped(KeyEvent e) {
    }
}
