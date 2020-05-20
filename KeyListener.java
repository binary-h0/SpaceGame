package SpaceGame;

import java.awt.event.KeyEvent;

public interface KeyListener extends java.awt.event.KeyListener {
    void keyPressed(KeyEvent e);
    void keyReleased(KeyEvent e);
    void keyTyped(KeyEvent e);
}
