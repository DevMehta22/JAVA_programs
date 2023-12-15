import javax.swing.*;
import java.awt.*;

public class Box_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Vertical BoxLayout
        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        JButton button1 = new JButton("Instagram");
        JButton button2 = new JButton("Snapchat");
        JButton button3 = new JButton("Facebook");
        verticalPanel.add(button1);
        verticalPanel.add(button2);
        verticalPanel.add(button3);

        // Horizontal BoxLayout
        JPanel horizontalPanel = new JPanel();
        horizontalPanel.setLayout(new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));
        JButton button4 = new JButton("Home");
        JButton button5 = new JButton("Login");
        JButton button6 = new JButton("Signup");
        horizontalPanel.add(button4);
        horizontalPanel.add(button5);
        horizontalPanel.add(button6);

        frame.add(verticalPanel, BorderLayout.EAST);
        frame.add(horizontalPanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
