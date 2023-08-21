package Exercise;

import javax.swing.*;

//  Does not work as intended!

public class BirthdayCalculatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Birthday Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField dayField = new JTextField(10);
        JTextField monthField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        
        
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Day:"));
        panel.add(dayField);
        panel.add(new JLabel("Month:"));
        panel.add(monthField);
        panel.add(calculateButton);
        // display the result in a JLabel
        JLabel resultLabel = new JLabel();
        panel.add(resultLabel);
        





        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        calculateButton.addActionListener(e -> {
            String day = dayField.getText();
            String month = monthField.getText();

            // Call Python script with day and month as arguments using ProcessBuilder
            ProcessBuilder processBuilder = new ProcessBuilder("python3", "birthday_calculator.py", day, month);
            try {
                Process process = processBuilder.start();
                System.out.println("Python script started");
                process.waitFor();
                System.out.println("Python script finished");
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        

    }
}
