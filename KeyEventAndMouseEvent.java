import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class KeyEventAndMouseEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyEvent and MouseEvent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        JLabel keyEventLabel = new JLabel("Key Events:");
        JLabel mouseEventLabel = new JLabel("Mouse Events:");

        panel.add(keyEventLabel);
        panel.add(mouseEventLabel);

        frame.add(panel);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                keyEventLabel.setText("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                keyEventLabel.setText("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                keyEventLabel.setText("Key Released: " + e.getKeyChar());
            }
        });

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseEventLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mouseEventLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mouseEventLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.setVisible(true);
    }
}

