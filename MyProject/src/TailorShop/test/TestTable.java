package TailorShop.test;

import TailorShop.dao.MeasurementDao;
import TailorShop.pojo.Category;
import TailorShop.pojo.Measurement;
import TailorShop.service.MeasurementDaoImpl;

public class TestTable {

    public static void main(String[] args) {
        MeasurementDao measurement = new MeasurementDaoImpl();
        System.out.println(measurement.getCatNameByMsId(2));
    }
}
