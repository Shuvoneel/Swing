package TailorShop.pojo;

import java.util.Date;

public class Summary {

    private int id;
    private Date date;
    private int order_id;
    private int totalOrder;

    public Summary() {
    }

    public Summary(int id) {
        this.id = id;
    }

    public Summary(Date date) {
        this.date = date;
    }

    public Summary(Date date, int order_id, int totalOrder) {
        this.date = date;
        this.order_id = order_id;
        this.totalOrder = totalOrder;
    }

    public Summary(int id, Date date, int order_id, int totalOrder) {
        this.id = id;
        this.date = date;
        this.order_id = order_id;
        this.totalOrder = totalOrder;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getTotalOrder() {
        return totalOrder;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotalOrder(int totalOrder) {
        this.totalOrder = totalOrder;
    }

}
