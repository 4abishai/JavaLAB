import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class C extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private List<JCheckBox> departmentCheckBoxes;
    private JTextField totalMarksField;
    private JTextField gradeField;

    public C() {
        setTitle("Student Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 700);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Department");
        tableModel.addColumn("Semester");
        tableModel.addColumn("Course No.");
        tableModel.addColumn("Total Marks");
        tableModel.addColumn("Grade");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel mainPanel = new JPanel(new GridLayout(2, 1));

        JPanel studentInfoPanel = new JPanel(new GridLayout(6, 2));
        studentInfoPanel.setBorder(BorderFactory.createTitledBorder("Student Information"));
        studentInfoPanel.add(new JLabel("Title:"));
        JComboBox<String> titleComboBox = new JComboBox<>(new String[] { "Mr.", "Mrs." });
        studentInfoPanel.add(titleComboBox);
        studentInfoPanel.add(new JLabel("First Name:"));
        JTextField firstNameField = new JTextField();
        studentInfoPanel.add(firstNameField);
        studentInfoPanel.add(new JLabel("Middle Name:"));
        JTextField middleNameField = new JTextField();
        studentInfoPanel.add(middleNameField);
        studentInfoPanel.add(new JLabel("Last Name:"));
        JTextField lastNameField = new JTextField();
        studentInfoPanel.add(lastNameField);
        studentInfoPanel.add(new JLabel("Gender:"));
        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        studentInfoPanel.add(genderPanel);

        JPanel yearSemesterPanel = new JPanel(new FlowLayout());
        yearSemesterPanel.add(new JLabel("Year:"));
        JComboBox<String> yearComboBox = new JComboBox<>(new String[] { "1st", "2nd", "3rd", "4th" });
        yearSemesterPanel.add(yearComboBox);
        yearSemesterPanel.add(new JLabel("Semester:"));
        JComboBox<String> semesterComboBox = new JComboBox<>(new String[] { "1st", "2nd", "3rd", "4th" });
        yearSemesterPanel.add(semesterComboBox);
        studentInfoPanel.add(yearSemesterPanel);

        departmentCheckBoxes = new ArrayList<>();
        JPanel departmentPanel = new JPanel(new GridLayout(1, 0));
        departmentPanel.add(new JLabel("Department:"));
        String[] departments = { "CSE", "CE", "Table", "Arch", "BBA", "ME", "IPE" };
        for (String department : departments) {
            JCheckBox checkBox = new JCheckBox(department);
            departmentCheckBoxes.add(checkBox);
            departmentPanel.add(checkBox);
        }
        studentInfoPanel.add(departmentPanel);

        JPanel studentGradePanel = new JPanel(new GridLayout(3, 2));
        studentGradePanel.setBorder(BorderFactory.createTitledBorder("Student Grade"));
        studentGradePanel.add(new JLabel("Course No.:"));
        JList<String> courseList = new JList<>(new String[] { "CSE 230", "CSE 260", "CSE 290" });
        studentGradePanel.add(courseList);
        studentGradePanel.add(new JLabel("Total Marks:"));
        totalMarksField = new JTextField();
        studentGradePanel.add(totalMarksField);
        studentGradePanel.add(new JLabel("Grade:"));
        gradeField = new JTextField();
        gradeField.setEditable(false);
        studentGradePanel.add(gradeField);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Show");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = (String) titleComboBox.getSelectedItem();
                String firstName = firstNameField.getText();
                String middleName = middleNameField.getText();
                String lastName = lastNameField.getText();
                String fullName = title + " " + firstName + " " + middleName + " " + lastName;
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";

                StringBuilder selectedDepartments = new StringBuilder();
                for (JCheckBox checkBox : departmentCheckBoxes) {
                    if (checkBox.isSelected()) {
                        if (selectedDepartments.length() > 0) {
                            selectedDepartments.append(", ");
                        }
                        selectedDepartments.append(checkBox.getText());
                    }
                }

                String semester = (String) semesterComboBox.getSelectedItem();
                String courseNo = courseList.getSelectedValue();
                String totalMarks = totalMarksField.getText();
                String grade = calculateGrade(Integer.parseInt(totalMarks));
                gradeField.setText(grade);

                tableModel.addRow(new Object[] { fullName, gender, selectedDepartments.toString(), semester, courseNo,
                        totalMarks, grade });
            }
        });
        buttonPanel.add(addButton);

        JButton calculateGradeButton = new JButton("Calculate Grade");
        calculateGradeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int totalMarks;
                try {
                    totalMarks = Integer.parseInt(totalMarksField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(C.this,
                            "Please enter a valid number for Total Marks.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String grade = calculateGrade(totalMarks);
                gradeField.setText(grade);
            }
        });
        buttonPanel.add(calculateGradeButton);

        mainPanel.add(studentInfoPanel);
        mainPanel.add(studentGradePanel);

        add(mainPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private String calculateGrade(int totalMarks) {
        if (totalMarks >= 90) {
            return "A";
        } else if (totalMarks >= 80) {
            return "B";
        } else if (totalMarks >= 70) {
            return "C";
        } else if (totalMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new C().setVisible(true);
            }
        });
    }
}