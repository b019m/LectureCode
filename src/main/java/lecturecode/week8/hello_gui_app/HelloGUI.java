package lecturecode.week8.hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame {
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

   // write a constructor to set up the object
    HelloGUI() {
        setContentPane(mainPanel);

        setPreferredSize(new Dimension(500, 500));
        pack(); // packs all the components in
        setVisible(true); // makes JFrame visible
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // JFrames doesn't stop running unless you close it

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // coded here - this will run when the button is clicked
                myFirstLabel.setText("Hello GUI Programmer!!");
            }
        });

    }
}
