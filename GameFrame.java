package SpaceGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        //Init
        setTitle("SpaceGame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Layout: contentPanel
        Container contentPanel = getContentPane();
        contentPanel.setBackground(Color.BLACK);
        contentPanel.setLayout(null);
        // **contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        // **contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        //Component: contentPanel
        String strArr [] = {"Start", "Option", "Exit"};
        for (int i = 0; i < strArr.length; i++){
            String s = strArr[i];
            JButton button = new JButton(s);
            button.setLocation(300, 300 + 80 * i);
            button.setSize(200, 50);
            button.addActionListener(new SpaceGameActionListener());
            contentPanel.add(button);
        }

        //Final
        setSize(800, 800); //TODO 상수 말고 화면 비율로 재설정 하기
        setVisible(true);
    }
}

class SpaceGameActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        switch (b.getText()){
            case "Start":
                break;
            case "Option":
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }
}

class SpaceGameKeyListener implements KeyListener{
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch(keyCode) {
            case KeyEvent.VK_UP:

                break;
            case KeyEvent.VK_DOWN:
                break;
            case KeyEvent.VK_LEFT:
                break;
            case KeyEvent.VK_RIGHT:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}