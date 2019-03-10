package march_10.evidence.util;

import java.io.BufferedReader;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import march_10.evidence.Student;

public class ReadAndWriteMethod {

    public static void writeToFile(String filename, List<Student> students) {
        File saveFile = new File(filename + ".txt");
        try {
            if (saveFile.exists() == false) {
                System.out.println("Created a new file");
                saveFile.createNewFile();
            }
            PrintWriter writer = new PrintWriter(new FileWriter(saveFile, true));
            for (Student s : students) {
                writer.append(s.getId() + ", " + s.getName() + ", " + s.getGender() + ", " + s.getEmail() + ", " + s.getCourse() + ", " + s.getRound() + ", " + s.getComments());
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Could not Log !!!");
        }
    }

    public static void readToTable(String filename, DefaultTableModel model) {
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File doesn't exist");

        }
    }
}
