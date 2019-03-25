package TailorShop.test;

import TailorShop.util.UtilDate;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
        System.out.println(UtilDate.getDeliveryDate(new Date(), 7));
    }

}
