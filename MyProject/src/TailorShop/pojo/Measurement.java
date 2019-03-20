package TailorShop.pojo;

public class Measurement {

    private int id;
    private double length;
    private double width;
    private double shoulder;
    private double waist;
    private double chest;
    private Category category;
    private Client client;

    public Measurement() {
    }

    public Measurement(int id) {
        this.id = id;
    }

    public Measurement(double length, double width, double shoulder, double waist, double chest, Category category, Client client) {
        this.length = length;
        this.width = width;
        this.shoulder = shoulder;
        this.waist = waist;
        this.chest = chest;
        this.category = category;
        this.client = client;
    }

    public Measurement(int id, double length, double width, double shoulder, double waist, double chest, Category category, Client client) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.shoulder = shoulder;
        this.waist = waist;
        this.chest = chest;
        this.category = category;
        this.client = client;
    }

    public Measurement(int id, double length, double width, double shoulder, double waist, double chest, Category category) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.shoulder = shoulder;
        this.waist = waist;
        this.chest = chest;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Measurement{" + "length=" + length + ", width=" + width + ", shoulder=" + shoulder + ", waist=" + waist + ", chest=" + chest + '}';
    }

    public int getId() {
        return id;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getShoulder() {
        return shoulder;
    }

    public double getWaist() {
        return waist;
    }

    public double getChest() {
        return chest;
    }

    public Category getCategory() {
        return category;
    }

    public Client getClient() {
        return client;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setShoulder(double shoulder) {
        this.shoulder = shoulder;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public void setChest(double chest) {
        this.chest = chest;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
