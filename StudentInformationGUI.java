import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class StudentInformationGUI {
    public static void main(String[] args) {

        
        // Create the main frame
        JFrame frame = new JFrame("Student Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 450);
        frame.setLayout(new FlowLayout());

        // Create and add labels and text fields for each field
        JLabel name = new JLabel("Student Name:");
        JTextField nameField = new JTextField(25);
        JLabel rollNo = new JLabel("\nStudent Roll No:");
        JTextField rollNoField = new JTextField(25);
        JLabel cpi = new JLabel("\nCPI:");
        JTextField cpiField = new JTextField(20);
        JLabel email = new JLabel("\nE-mail:");
        JTextField emailField = new JTextField(20);

        frame.add(name);
        frame.add(nameField);
        frame.add(rollNo);
        frame.add(rollNoField);
        frame.add(cpi);
        frame.add(cpiField);
        frame.add(email);
        frame.add(emailField);

        // Create a button to display the information
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);

        // Create a text area to display the result
        JTextArea resultArea = new JTextArea(7, 15);
        resultArea.setEditable(false);
        frame.add(resultArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String rollNo = rollNoField.getText();
                String cpi = cpiField.getText();
                String email = emailField.getText();

                String result = "Name: " + name + "\nRoll No: " + rollNo + "\nCPI: " + cpi + "\nE-mail: " + email;
                try{
                    // BufferedWriter wr = new BufferedWriter(new FileWriter("out.txt"));
                    FileWriter wr = new FileWriter("out.txt");
                    wr.write(result);
                    wr.close();
                }catch(IOException et){
                    et.printStackTrace();
                }
                resultArea.setText(result);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}

