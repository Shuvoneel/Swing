package TailorShop.test;

import TailorShop.tables.CreateTables;

public class TestTable {

    public static void main(String[] args) {
        CreateTables.categoryTable();
        CreateTables.clientTable();
        CreateTables.measurementTable();
        CreateTables.requisitionTable();
        CreateTables.deliveryTable();
        CreateTables.summaryTable();
    }
}
