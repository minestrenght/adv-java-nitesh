package pkg;

import javax.swing.*;

public class Start {

    public static void main(String[] args) {
        JFrame f = new JFrame("Software Employees");
        Object[][] r = {
            {"Avinash", "Sharma", "Developer", 19},
            {"Sana", "Munshi", "Tester", 20},
            {"Nitesh", "Singh", "Developer", 20},
            {"Anand", "Maurya", "Developer", 19},
            {"Nikita", "Parab", "Tester", 20},
            {"Madhvi", "Yadav", "Tester", 20}
        };//rows
        Object[] c = {
            "First Name", "Last Name", "Position", "Age"
        };//columns
        f.getContentPane().add(new JScrollPane(new JTable(r, c)));
        f.pack();//auto resize
        f.setVisible(true);//show on d screen
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//kill app on close
    }
}
