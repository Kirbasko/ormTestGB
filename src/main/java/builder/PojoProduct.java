package builder;

public class PojoProduct {
    private String id;
    private String title;
    private String price;
    private String categoryTitle;

    public PojoProduct(String id, String title, String price, String categoryTitle) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.categoryTitle = categoryTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }
}
