package model;


public class Sale {
    private int saleNo;
    private Product product;
    private Customer cust;
    private int p_qty;
    private double price;

    public Sale(int saleNo, Product product, Customer cust, int p_qty, double price) {
        this.saleNo = saleNo;
        this.product = product;
        this.cust = cust;
        this.p_qty = p_qty;
        this.price = price;
    }

    public Sale(Product product, Customer cust, int p_qty, double price) {
        this.product = product;
        this.cust = cust;
        this.p_qty = p_qty;
        this.price = price;
    }

    public int getSaleNo() {
        return saleNo;
    }

    public void setId(int saleNo) {
        this.saleNo = saleNo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public int getP_qty() {
        return p_qty;
    }

    public void setP_qty(int p_qty) {
        this.p_qty = p_qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
