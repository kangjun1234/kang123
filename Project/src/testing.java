import java.util.InputMismatchException;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CYH
 */
public class testing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Loop Display Example");
        JLabel label = new JLabel();

        // Set an initial text (optional)
        label.setText("Data: ");

        // Sample data in an array
        String[] dataArray = {"First Data", "Second Data", "Third Data", "Fourth Data"};

        // Loop through the data and update the JLabel
        for (String data : dataArray) {
            // Get the current text of the JLabel
            String currentText = label.getText();

            // Concatenate the new data with the existing text
            String newText = currentText + data + " | ";

            // Set the updated text for the JLabel
            label.setText(newText);

            // Pause for a moment to see the changes (optional)
            try {
                Thread.sleep(1000);  // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Add the JLabel to the JFrame
        frame.add(label);

        // Set JFrame properties
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
