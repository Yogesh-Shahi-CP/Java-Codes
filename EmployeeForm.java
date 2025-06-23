import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EmployeeForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Details");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels and TextFields
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(10, 10, 80, 25);
        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(100, 10, 100, 25);

        JLabel lastNameLabel = new JLabel("Surname:");
        lastNameLabel.setBounds(210, 10, 80, 25);
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(290, 10, 100, 25);

        // ComboBox for State
        JLabel stateLabel = new JLabel("State:");
        stateLabel.setBounds(400, 10, 50, 25);
        String[] states = {"Uttar Pradesh", "Delhi", "Punjab", "Uttarakhand"};
        JComboBox<String> stateBox = new JComboBox<>(states);
        stateBox.setBounds(450, 10, 150, 25);

        // CheckBoxes for Qualification
        JLabel qualLabel = new JLabel("Qualification:");
        qualLabel.setBounds(10, 50, 100, 25);
        JCheckBox cb10 = new JCheckBox("10th");
        cb10.setBounds(110, 50, 60, 25);
        JCheckBox cb12 = new JCheckBox("12th");
        cb12.setBounds(170, 50, 60, 25);
        JCheckBox cbBTech = new JCheckBox("B.Tech");
        cbBTech.setBounds(230, 50, 80, 25);

        // Radio Buttons for Department
        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(10, 90, 100, 25);
        JRadioButton rbME = new JRadioButton("ME");
        rbME.setBounds(110, 90, 50, 25);
        JRadioButton rbCSE = new JRadioButton("CSE");
        rbCSE.setBounds(160, 90, 60, 25);
        JRadioButton rbECE = new JRadioButton("ECE");
        rbECE.setBounds(220, 90, 60, 25);

        ButtonGroup deptGroup = new ButtonGroup();
        deptGroup.add(rbME);
        deptGroup.add(rbCSE);
        deptGroup.add(rbECE);

        // Proficiency (checkboxes assumed)
        JLabel profLabel = new JLabel("Proficiency Level:");
        profLabel.setBounds(10, 130, 120, 25);
        JCheckBox p1 = new JCheckBox("1");
        p1.setBounds(140, 130, 40, 25);
        JCheckBox p2 = new JCheckBox("2");
        p2.setBounds(180, 130, 40, 25);
        JCheckBox p3 = new JCheckBox("3");
        p3.setBounds(220, 130, 40, 25);

        // Table
        String[] columns = {"ID", "NAME", "SALARY"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(350, 50, 300, 200);

        // Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(580, 260, 80, 30);

        // Action Listener
        submitButton.addActionListener(_ -> {
            String name = firstNameField.getText() + " " + lastNameField.getText();
            String salary = JOptionPane.showInputDialog("Enter Salary:");
            int nextId = tableModel.getRowCount() + 1;
            tableModel.addRow(new Object[]{nextId, name, salary});
        });

        // Add components
        frame.add(firstNameLabel); frame.add(firstNameField);
        frame.add(lastNameLabel); frame.add(lastNameField);
        frame.add(stateLabel); frame.add(stateBox);
        frame.add(qualLabel); frame.add(cb10); frame.add(cb12); frame.add(cbBTech);
        frame.add(deptLabel); frame.add(rbME); frame.add(rbCSE); frame.add(rbECE);
        frame.add(profLabel); frame.add(p1); frame.add(p2); frame.add(p3);
        frame.add(scrollPane); frame.add(submitButton);

        frame.setVisible(true);
    }
}

