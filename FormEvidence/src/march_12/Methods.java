package march_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Methods {

    public static void writeToFile(String filename, List<Student> students) {
        File saveFile = new File(filename + ".txt");
        try {
            if (saveFile.exists() == false) {
                System.out.println("New file Created");
                saveFile.createNewFile();
            }
            PrintWriter writer = new PrintWriter(new FileWriter(saveFile, true));
            for (Student s : students) {
                writer.append(s.getId() + ", " + s.getName() + ", " + s.getAge() + ", " + s.getGender() + ", " + s.getEmail() + ", " + s.getCourse() + ", " + s.getRound() + ", " + s.getMessage() + "\n");
            }
            writer.close();
        } catch (Exception e) {
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
        }
    }
}
