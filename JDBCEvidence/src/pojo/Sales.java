package pojo;

public class Sales {

    private int id;
    private Product product;
    private Customer customer;
    private int quantity;
    private double price;

    public Sales(Product product, Customer customer, int quantity, double price) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
        this.price = price;
    }

    public Sales(int id, Product product, Customer customer, int quantity, double price) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
