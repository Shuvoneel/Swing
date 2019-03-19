package TailorShop.pojo;

public class Client {

    private int id;
    private String name;
    private int mobile;
    private String email;
    private String address;

    public Client() {
    }

    public Client(int id) {
        this.id = id;
    }

    public Client(String name, int mobile, String email, String address) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public Client(int id, String name, int mobile, String email, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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

}
