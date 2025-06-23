import javax.swing.*;

public class SquareDifference {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Difference of Squares");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JTextField t1 = new JTextField();
        t1.setBounds(50, 30, 80, 25);
        frame.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 30, 80, 25);
        frame.add(t2);

        JButton btn = new JButton("Submit");
        btn.setBounds(100, 70, 100, 30);
        frame.add(btn);

        JLabel result = new JLabel("Result: ");
        result.setBounds(100, 110, 200, 25);
        frame.add(result);

        btn.addActionListener(_ -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int res = a * a - b * b;
            result.setText("Result: " + res);
        });

        frame.setVisible(true);
    }
}
 
    

