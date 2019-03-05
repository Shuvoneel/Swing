package swing.evidence.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import swing.evidence.Student;

public class WriteAndReadMethod {

    public static void writeToFile(String filename, List<Student> students) {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("Created a new File");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : students) {
                out.append(s.getId() + ", " + s.getName() + ", " + s.getAge() + ", " + s.getEmail() + ", " + s.getGender() + ", " + s.getCourse() + ", " + s.getRound() + ", " + s.getComment() + "\n");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Could not Log !!!");
        }

    }

    public static void displayDatafromTable(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));

            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File doesn't exist");
        }
    }
}
