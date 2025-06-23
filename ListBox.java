import javax.swing.*;

public class ListBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Box Demo");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("Adding Name to a List:");
        label.setBounds(20, 30, 200, 20);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(20, 60, 150, 25);
        frame.add(textField);

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JScrollPane pane = new JScrollPane(list);
        pane.setBounds(200, 30, 150, 150);
        frame.add(pane);

        JButton addBtn = new JButton("ADD>>");
        addBtn.setBounds(20, 100, 80, 30);
        frame.add(addBtn);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(150, 200, 80, 30);
        frame.add(exitBtn);

        addBtn.addActionListener(_ -> {
            String city = textField.getText();
            if (!city.isEmpty()) {
                model.addElement(city);
                textField.setText("");
            }
        });

        exitBtn.addActionListener(_ -> System.exit(0));

        frame.setVisible(true);
    }
}
 
    

