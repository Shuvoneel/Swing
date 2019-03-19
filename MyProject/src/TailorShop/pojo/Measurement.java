package TailorShop.pojo;

public class Measurement {

    private double length;
    private double width;
    private double shoulder;
    private double neck;
    private double waist;
    private double chest;
    private Category category;
    private Client client;

    public Measurement() {
    }

    public Measurement(double length, double width, double shoulder, double neck, double collarSize, String collarType, double hip, double waist, double chest, double bicep, double sleeve, double cuff, Category category, Client client) {
        this.length = length;
        this.width = width;
        this.shoulder = shoulder;
        this.neck = neck;
        this.waist = waist;
        this.chest = chest;
        this.category = category;
        this.client = client;
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

    public double getNeck() {
        return neck;
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

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setShoulder(double shoulder) {
        this.shoulder = shoulder;
    }

    public void setNeck(double neck) {
        this.neck = neck;
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
