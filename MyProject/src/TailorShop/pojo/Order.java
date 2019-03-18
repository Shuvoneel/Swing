package TailorShop.pojo;

import java.util.Date;

public class Order {

    private int id;
    private int qty;
    private double unitPrice;
    private double totalPrice;
    private double advance;
    private double due;
    private Date orderDate;
    private Date deliveryDate;
    private Client client;
    private Measurement measurement;
    private Category category;
}
