package finalProjectRushHour;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HardModeController implements KeyListener {
    private HardModePanel hardmodepanel;

    public HardModeController (HardModePanel  hardmodepanel) {
        this.hardmodepanel = hardmodepanel;
    }

    public void keyPressed(KeyEvent e) {
    	hardmodepanel.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
    	hardmodepanel.keyReleased(e);
    }

    public void keyTyped(KeyEvent e) {
    	hardmodepanel.keyTyped(e);
    }
}