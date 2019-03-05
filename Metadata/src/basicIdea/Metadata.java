package basicIdea;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Metadata {

    static Connection connection = CustomConnection.getDBConnection();
    static DatabaseMetaData metaData = null;

    static {
        try {
            metaData = connection.getMetaData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printGeneralMetada() throws SQLException {
        System.out.println("Database Name: " + metaData.getDatabaseProductName());
        System.out.println("Database Version: " + metaData.getDatabaseProductVersion());
        System.out.println("Logged Usert: " + metaData.getUserName());
        System.out.println("JDBC Driver: " + metaData.getDriverName());
        System.out.println("Driver Version: " + metaData.getDriverVersion());
        System.out.println("\n");
    }

    public static ArrayList getTableMetadata() throws SQLException {
        String table[] = {"TABLE"};
        ResultSet rs = null;
        ArrayList tables = null;
        rs = metaData.getTables(null, null, null, table);
        tables = new ArrayList();
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));
        }
        return tables;
    }

    public static void getColumnsMetada(ArrayList tables) throws SQLException {
        ResultSet rs = null;
        for (Object actualTable : tables) {
            rs = metaData.getColumns(null, null, actualTable.toString(), null);
            System.out.println(actualTable.toString().toUpperCase());
            while (rs.next()) {
                System.out.println("Column Name: " + rs.getString("COLUMN_NAME") + " Type Name: " + rs.getString("TYPE_NAME") + " Column Size: " + rs.getString("COLUMN_SIZE"));
                System.out.println("\n");
            }
        }
    }
}
