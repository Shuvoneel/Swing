package basicIdea;

import static basicIdea.Metadata.getTableMetadata;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMeta {
    
    public static void main(String[] args) {
        try {
            System.out.println("General Metadata:");
            try {
                Metadata.printGeneralMetada();
            } catch (SQLException ex) {
                Logger.getLogger(TestMeta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Tabledata:");
            try {
                for (Object obj : getTableMetadata()) {
                    System.out.println("Table Name: " + obj.toString());
                }
            } catch (Exception e) {
            }
            
            System.out.println("\n");
            System.out.println("Columndata:");
            Metadata.getColumnsMetada(getTableMetadata());
        } catch (SQLException ex) {
            Logger.getLogger(TestMeta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
