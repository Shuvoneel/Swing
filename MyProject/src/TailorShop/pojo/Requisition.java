package TailorShop.pojo;

import java.util.Date;

public class Requisition {

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

    public Requisition() {
    }

    public Requisition(int id) {
        this.id = id;
    }

    public Requisition(int id, int qty, double unitPrice, double totalPrice, double advance, double due, Date orderDate, Date deliveryDate, Client client, Measurement measurement, Category category) {
        this.id = id;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.advance = advance;
        this.due = due;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.client = client;
        this.measurement = measurement;
        this.category = category;
    }

    public Requisition(int qty, double unitPrice, double totalPrice, double advance, double due, Date orderDate, Date deliveryDate, Client client, Measurement measurement, Category category) {
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.advance = advance;
        this.due = due;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.client = client;
        this.measurement = measurement;
        this.category = category;
    }
    
    

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getAdvance() {
        return advance;
    }

    public double getDue() {
        return due;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public Client getClient() {
        return client;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public void setDue(double due) {
        this.due = due;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
