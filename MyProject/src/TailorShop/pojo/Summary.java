package TailorShop.pojo;

import java.util.Date;

public class Summary {

    private int id;
    private Date orderDate;
    private int qty;
    private String deliveryStatus;
    private Client client;
    private Requisition requisition;

    public Summary() {
    }

    public Summary(int id) {
        this.id = id;
    }

    public Summary(int id, Date orderDate, int qty, String deliveryStatus, Client client, Requisition order) {
        this.id = id;
        this.orderDate = orderDate;
        this.qty = qty;
        this.deliveryStatus = deliveryStatus;
        this.client = client;
        this.requisition = order;
    }

    public int getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getQty() {
        return qty;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public Client getClient() {
        return client;
    }

    public Requisition getOrder() {
        return requisition;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setOrder(Requisition order) {
        this.requisition = order;
    }

}
