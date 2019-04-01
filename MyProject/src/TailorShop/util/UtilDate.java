package TailorShop.util;

import java.util.Calendar;
import java.util.Date;

public class UtilDate {

    public static Date getDeliveryDate(Date currentDate, int day) {
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, day);
        return c.getTime();
    }
    
     
}
