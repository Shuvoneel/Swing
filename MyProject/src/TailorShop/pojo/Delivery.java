package TailorShop.pojo;

import java.util.Date;

public class Delivery {

    private int id;
    private String client_name;
    private int order_id;
    private int qty;
    private Category category;
    private Requisition total_price;
    private Requisition due;
    private Requisition order_date;
    private Requisition delivery_date;

    public Delivery() {
    }

    public Delivery(int order_id) {
        this.order_id = order_id;
    }

    public Delivery(int id, String client_name, int order_id, int qty, Category category, Requisition total_price, Requisition due, Requisition order_date, Requisition delivery_date) {
        this.id = id;
        this.client_name = client_name;
        this.order_id = order_id;
        this.qty = qty;
        this.category = category;
        this.total_price = total_price;
        this.due = due;
        this.order_date = order_date;
        this.delivery_date = delivery_date;
    }

    public int getId() {
        return id;
    }

    public String getClient_name() {
        return client_name;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getQty() {
        return qty;
    }

    public Category getCategory() {
        return category;
    }

    public Requisition getTotal_price() {
        return total_price;
    }

    public Requisition getDue() {
        return due;
    }

    public Requisition getOrder_date() {
        return order_date;
    }

    public Requisition getDelivery_date() {
        return delivery_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTotal_price(Requisition total_price) {
        this.total_price = total_price;
    }

    public void setDue(Requisition due) {
        this.due = due;
    }

    public void setOrder_date(Requisition order_date) {
        this.order_date = order_date;
    }

    public void setDelivery_date(Requisition delivery_date) {
        this.delivery_date = delivery_date;
    }

}
