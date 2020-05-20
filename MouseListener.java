package SpaceGame;

import java.awt.event.MouseEvent;

public interface MouseListener extends java.awt.event.MouseListener {
    void mousePressed(MouseEvent e);
    void mouseReleased(MouseEvent e);
    void mouseClicked(MouseEvent e);
    void mouseEntered(MouseEvent e);
    void mouseExited(MouseEvent e);
}