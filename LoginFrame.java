
//Wap to create frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    JLabel userL, passL;
    JTextField userT, passT;
    JButton loginB;

    LoginFrame() {
        // Set title of the frame
        super("Login Form");

        // Initialize components
        userL = new JLabel("User:");
        passL = new JLabel("Password:");
        userT = new JTextField(20);
        passT = new JTextField(20);
        loginB = new JButton("Log In");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(userL); add(userT);
        add(passL); add(passT);  // FIXED: Added passT instead of repeating passL
        add(loginB);

        // Add action listener to the button
        loginB.addActionListener(this);

        // Frame settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Simple action on button click
        String user = userT.getText();
        String pass = passT.getText();
        JOptionPane.showMessageDialog(this, "User: " + user + "\nPassword: " + pass);
    }

    public static void main(String[] args) {
        new LoginFrame();  // Create and show the frame
    }
}