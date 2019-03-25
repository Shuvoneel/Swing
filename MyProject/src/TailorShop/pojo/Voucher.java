package TailorShop.pojo;

public class Voucher {

    private int id;
    private int qty;
    private double unitPrice;
    private double totalPrice;
    private double advance;
    private double due;
    private Requisition order;

    public Voucher() {
    }

    public Voucher(int id) {
        this.id = id;
    }

    public Voucher(int id, int qty, double unitPrice, double totalPrice, double advance, double due, Requisition order, Category category) {
        this.id = id;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.advance = advance;
        this.due = due;
        this.order = order;
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

    public Requisition getOrder() {
        return order;
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

    public void setOrder(Requisition order) {
        this.order = order;
    }


}
