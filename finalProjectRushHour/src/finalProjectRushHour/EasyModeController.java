package finalProjectRushHour;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EasyModeController implements KeyListener {
    private EasyModePanel easymodepanel;

    public EasyModeController(EasyModePanel easymodepanel) {
        this.easymodepanel = easymodepanel;
    }

    public void keyPressed(KeyEvent e) {
    	easymodepanel.keyPressed(e);
    }

    public void keyReleased(KeyEvent e) {
    	easymodepanel.keyReleased(e);
    }

    public void keyTyped(KeyEvent e) {
    	easymodepanel.keyTyped(e);
    }
}
