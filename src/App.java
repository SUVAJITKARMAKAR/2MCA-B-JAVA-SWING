import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    private JTextField usernameField, ageField, userIDField, followersField, followingField;

    public App() {
        setTitle("HELLO APPLICAITION");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel usernameLabel = new JLabel("USERNAME:");
        usernameField = new JTextField();

        JLabel ageLabel = new JLabel("AGEe:");
        ageField = new JTextField();

        JLabel userIDLabel = new JLabel("USERID:");
        userIDField = new JTextField();

        JLabel followersLabel = new JLabel("FOLLOWERS:");
        followersField = new JTextField();

        JLabel followingLabel = new JLabel("FOLLOWING:");
        followingField = new JTextField();

        JButton submitButton = new JButton("SUBMIT");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButtonClicked();
            }
        });

        mainPanel.add(usernameLabel);
        mainPanel.add(usernameField);
        mainPanel.add(ageLabel);
        mainPanel.add(ageField);
        mainPanel.add(userIDLabel);
        mainPanel.add(userIDField);
        mainPanel.add(followersLabel);
        mainPanel.add(followersField);
        mainPanel.add(followingLabel);
        mainPanel.add(followingField);
        mainPanel.add(new JLabel()); 
        mainPanel.add(submitButton);

        add(mainPanel);
    }

    private void submitButtonClicked() {
        String username = usernameField.getText();
        String age = ageField.getText();
        String userID = userIDField.getText();
        String followers = followersField.getText();
        String following = followingField.getText();

        // You can perform any actions with the entered data here
        // For now, let's just display the entered information in a dialog
        String userInfo = "USERNAME: " + username + "\n" +
                          "AGE: " + age + "\n" +
                          "USERID: " + userID + "\n" +
                          "FOLLOWERS: " + followers + "\n" +
                          "FOLLOWING: " + following;

        JOptionPane.showMessageDialog(this, userInfo, "USER INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}
