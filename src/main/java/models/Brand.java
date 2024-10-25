package models;

public class Brand {
    private final int id;
    private String brandName;
    private static int count = 1;

    public Brand() {
        this.id = count++;
    }

    public Brand(String brandName) {
        this.id = count++;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }
}
