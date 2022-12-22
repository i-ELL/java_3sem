package package_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ClickCounter implements ActionListener
{
    // Initialize the counter
    private int i_1 = 0, i_2=0;

    // label to display the counter value
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    // Increment button
    private JButton but1;
    // Decrement button
    private JButton but2;

    public JPanel getPanel() {
        // Create the panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        // Add increment button to JPanel
        but1 = new JButton("AC Milan");
        but1.addActionListener(this);
        panel.add(but1);

        // Add decrement button to JPanel
        but2 = new JButton("Real Madrid");
        but2.addActionListener(this);
        panel.add(but2);

        // Add the counter to JPanel
        label1 = new JLabel("Result: " + i_1 + " X " + i_2);
        panel.add(label1);

        label2 = new JLabel("Last Scorer: N/A");
        panel.add(label2);

        label3 = new JLabel("Winner: DRAW");
        panel.add(label3);

        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but1) {
            i_1++;
            label2.setText("Last Scorer: " + "AC Milan");
        }
        else {
            i_2++;
            label2.setText("Last Scorer: " + "Real Madrid");
        }
        label1.setText("Result: " + i_1 + " X " + i_2);
        if (i_1 > i_2) label3.setText("Winner: AC Milan");
        else if (i_2 > i_1) label3.setText("Winner: Real Madrid");
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Click Counter");
        frame.setSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panel
        ClickCounter counter = new ClickCounter();
        JPanel counterPanel = counter.getPanel();

        // Add the panel to the center of the window
        Container content = frame.getContentPane();
        content.add(counterPanel, BorderLayout.CENTER);

        // Show the window
        frame.setVisible(true);
    }
}
