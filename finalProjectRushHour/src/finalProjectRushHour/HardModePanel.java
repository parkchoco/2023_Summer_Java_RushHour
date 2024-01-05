package finalProjectRushHour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HardModePanel extends JPanel implements KeyListener {
	private static final int PANEL = 600;
    private static final int INNER_SQUARE = 100;
    private static final int GRID = 6;
    private static final int CELL = PANEL / GRID;
    
    private Direction direction;
    
    private PoliceCar policeCar;
    private Bus1 bus1;
    private Bus2 bus2;
    private Bus3 bus3;
    
    private Car1 car1;
    private Car2 car2;
    private Car3 car3;
    
    private Car4 car4;
    private Car5 car5;
    private Car6 car6;
    
    private Timer timer;
    private boolean isPoliceCarSelected; 
    private boolean isBus1Selected; 
    private boolean isBus2Selected; 
    private boolean isBus3Selected; 
    
    private boolean isCar1Selected; 
    private boolean isCar2Selected; 
    private boolean isCar3Selected;  
    
    private boolean isCar4Selected; 
    private boolean isCar5Selected; 
    private boolean isCar6Selected;
    
    public HardModePanel () {
        setPreferredSize(new Dimension(PANEL, PANEL));
        setBackground(new Color(200, 120, 120));

        policeCar = new PoliceCar(500, 350, 200, 100);
        bus1 = new Bus1(700, 150, 100, 300);
        bus2 = new Bus2(400, 150, 300, 100);
        bus3 = new Bus3(400, 650, 300, 100);

        car1 = new Car1(500, 250, 200, 100);
        car2 = new Car2(400, 250, 100, 200);
        car3 = new Car3(400, 450, 100, 200);
        
        car4 = new Car4(500, 450, 100, 200);
        car5 = new Car5(600, 450, 200, 100);
        car6 = new Car6(600, 550, 200, 100);
        
        direction = new Direction(800, 350, 100, 100);
        stopwatch();
        addKeyListener(this);
        setFocusable(true);

       
        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                policeCar.updatePosition();
                bus1.update();
                bus2.update();
                bus3.update();

                car1.update();
                car2.update();
                car3.update();
                
                car4.update();
                car5.update();
                car6.update();
                
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
        timerLabel.setFont(new Font("����", Font.BOLD, 30));
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
        bus2.paintComponent(g);
        bus3.paintComponent(g);

        car1.paintComponent(g);
        car2.paintComponent(g);
        car3.paintComponent(g);
        
        car4.paintComponent(g);
        car5.paintComponent(g);
        car6.paintComponent(g);
        

        
    }

    //36�� �� �׸��� �������
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
            isBus2Selected = false;
            isBus3Selected = false;

            isCar1Selected = false;
            isCar2Selected = false;
            isCar3Selected = false;
            
            isCar4Selected = false;
            isCar5Selected = false;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_S) {
        	
            isPoliceCarSelected = false;
            isBus1Selected = true;
            isBus2Selected = false;
            isBus3Selected = false;
 
            isCar1Selected = false;
            isCar2Selected = false;
            isCar3Selected = false;
            
            isCar4Selected = false;
            isCar5Selected = false;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_D) {
        	
        	isPoliceCarSelected = false;
            isBus1Selected = false;
            isBus2Selected = false;
            isBus3Selected = false;
          
            isCar1Selected = true;
            isCar2Selected = false;
            isCar3Selected = false;
            
            isCar4Selected = false;
            isCar5Selected = false;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_F) {
        	
        	isPoliceCarSelected = false;
            isBus1Selected = false;
            isBus2Selected = false;
            isBus3Selected = false;
           
            isCar1Selected = false;
            isCar2Selected = true;
            isCar3Selected = false;
            
            isCar4Selected = false;
            isCar5Selected = false;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_G) {
        	
        	isPoliceCarSelected = false;
            isBus1Selected = false;
            isBus2Selected = true;
            isBus3Selected = false;
         
            isCar1Selected = false;
            isCar2Selected = false;
            isCar3Selected = false;
            
            isCar4Selected = false;
            isCar5Selected = false;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_H) {
        	
        	isPoliceCarSelected = false;
            isBus1Selected = false;
            isBus2Selected = false;
            isBus3Selected = true;
     
            isCar1Selected = false;
            isCar2Selected = false;
            isCar3Selected = false;
            
            isCar4Selected = false;
            isCar5Selected = false;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_Z) {
        	isPoliceCarSelected = false;
            isBus1Selected = false;
            isBus2Selected = false;
            isBus3Selected = false;
        
            isCar1Selected = false;
            isCar2Selected = false;
            isCar3Selected = true;
            
            isCar4Selected = false;
            isCar5Selected = false;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_X) {
        	
            isPoliceCarSelected = false;
            isBus1Selected = false;
            isBus2Selected = false;
            isBus3Selected = false;
 
            isCar1Selected = false;
            isCar2Selected = false;
            isCar3Selected = false;
            
            isCar4Selected = true;
            isCar5Selected = false;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_C) {
        	
            isPoliceCarSelected = false;
            isBus1Selected = false;
            isBus2Selected = false;
            isBus3Selected = false;
 
            isCar1Selected = false;
            isCar2Selected = false;
            isCar3Selected = false;
            
            isCar4Selected = false;
            isCar5Selected = true;
            isCar6Selected = false;
        } else if (keyCode == KeyEvent.VK_V) {
        	
            isPoliceCarSelected = false;
            isBus1Selected = false;
            isBus2Selected = false;
            isBus3Selected = false;
 
            isCar1Selected = false;
            isCar2Selected = false;
            isCar3Selected = false;
            
            isCar4Selected = false;
            isCar5Selected = false;
            isCar6Selected = true;
        } else if (keyCode == KeyEvent.VK_LEFT && isPoliceCarSelected) {

            policeCar.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isPoliceCarSelected) {

            policeCar.moveRight();
        } else if (keyCode == KeyEvent.VK_UP && isBus1Selected) {
 
            bus1.moveUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isBus1Selected) {
           
            bus1.moveDown();
        } else if (keyCode == KeyEvent.VK_LEFT && isBus2Selected) {

            bus2.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isBus2Selected) {

            bus2.moveRight();
        } else if (keyCode == KeyEvent.VK_LEFT && isBus3Selected) {

            bus3.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isBus3Selected) {

        	bus3.moveRight();
        } else if (keyCode == KeyEvent.VK_LEFT && isCar1Selected) {

            car1.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isCar1Selected) {

            car1.moveRight();
        } else if (keyCode == KeyEvent.VK_UP && isCar2Selected) {
        	 
        	car2.moveUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isCar2Selected) {
           
        	car2.moveDown();
        } else if (keyCode == KeyEvent.VK_UP && isCar3Selected) {
       	 
        	car3.moveUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isCar3Selected) {
           
        	car3.moveDown();
        } else if (keyCode == KeyEvent.VK_UP && isCar4Selected) {
          	 
           	car4.moveUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isCar4Selected) {
              
           	car4.moveDown();
        } else if (keyCode == KeyEvent.VK_LEFT && isCar5Selected) {

            car5.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isCar5Selected) {

            car5.moveRight();
        } else if (keyCode == KeyEvent.VK_LEFT && isCar6Selected) {

            car6.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isCar6Selected) {

            car6.moveRight();
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
        } else if (keyCode == KeyEvent.VK_LEFT && isBus2Selected) {
        	bus2.stopMovingLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isBus2Selected) {
        	bus2.stopMovingRight();
        } else if (keyCode == KeyEvent.VK_LEFT && isBus3Selected) {
        	bus3.stopMovingLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isBus3Selected) {
        	bus3.stopMovingRight();
        } else if (keyCode == KeyEvent.VK_LEFT && isCar1Selected) {
            car1.stopMovingLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isCar1Selected) {
            car1.stopMovingRight();
        } else if (keyCode == KeyEvent.VK_UP && isCar2Selected) {
            car2.stopMovingUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isCar2Selected) {
            car2.stopMovingDown();
        } else if (keyCode == KeyEvent.VK_UP && isCar3Selected) {
            car3.stopMovingUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isCar3Selected) {
            car3.stopMovingDown();
        } else if (keyCode == KeyEvent.VK_UP && isCar4Selected) {
            car4.stopMovingUp();
        } else if (keyCode == KeyEvent.VK_DOWN && isCar4Selected) {
            car4.stopMovingDown();
        } else if (keyCode == KeyEvent.VK_LEFT && isCar5Selected) {
            car5.stopMovingLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isCar5Selected) {
            car5.stopMovingRight();
        } else if (keyCode == KeyEvent.VK_LEFT && isCar6Selected) {
            car6.stopMovingLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT && isCar6Selected) {
            car6.stopMovingRight();
        }
    }

    
    public void keyTyped(KeyEvent e) {
    }
}
