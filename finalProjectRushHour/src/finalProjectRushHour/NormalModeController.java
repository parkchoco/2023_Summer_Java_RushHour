package finalProjectRushHour;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NormalModeController implements KeyListener {
    private NormalModePanel normalmodepanel;

    public NormalModeController(NormalModePanel normalmodepanel) {
        this.normalmodepanel = normalmodepanel;
    }

    public void keyPressed(KeyEvent e) {
    	normalmodepanel.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
    	normalmodepanel.keyReleased(e);
    }

    public void keyTyped(KeyEvent e) {
    	normalmodepanel.keyTyped(e);
    }
}