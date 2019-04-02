package TailorShop.pojo;

import java.util.Date;

public class ClientDetails {

    private String name;
    private int mobile;
    private String email;
    private String address;
    private int category;
    private int quantity;
    private Date orderDate;

    public ClientDetails() {
    }

    public ClientDetails(int mobile) {
        this.mobile = mobile;
    }

    public ClientDetails(String email) {
        this.email = email;
    }

    public ClientDetails(String name, int mobile, String email, String address, int category, int quantity, Date orderDate) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.category = category;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public String getName() {
        return name;
    }

    public int getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}
