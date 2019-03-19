package TailorShop.pojo;

public class Category {

    private int id;
    private String catName;

    public Category() {
    }

    public Category(int id) {
        this.id = id;
    }

    public Category(int id, String catName) {
        this.id = id;
        this.catName = catName;
    }

    public int getId() {
        return id;
    }

    public String getCatName() {
        return catName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

}
