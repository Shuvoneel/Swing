package TailorShop.pojo;

import java.util.Date;

public class Delivery {

    private int id;
    private int qty;
    private String paidStatus;
    private Date deliveryDate;
    private String deliveryStatus;
    private Category category;
    private Requisition order;

    public Delivery() {
    }

    public Delivery(int id) {
        this.id = id;
    }

    public Delivery(int id, int qty, String paidStatus, Date deliveryDate, String deliveryStatus, Category category, Requisition order) {
        this.id = id;
        this.qty = qty;
        this.paidStatus = paidStatus;
        this.deliveryDate = deliveryDate;
        this.deliveryStatus = deliveryStatus;
        this.category = category;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public String getPaidStatus() {
        return paidStatus;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public Category getCategory() {
        return category;
    }

    public Requisition getOrder() {
        return order;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPaidStatus(String paidStatus) {
        this.paidStatus = paidStatus;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setOrder(Requisition order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Delivery{" + "id=" + id + ", qty=" + qty + ", paidStatus=" + paidStatus + ", deliveryDate=" + deliveryDate + ", deliveryStatus=" + deliveryStatus + ", category=" + category + ", order=" + order + '}';
    }

}
