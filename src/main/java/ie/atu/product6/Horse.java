package ie.atu.product6;

public class Horse extends Animal{
    private String Dan;
    private String sire;
    private int height;

    public Horse() {
        this.Dan = Dan;
        this.sire = sire;
        this.height = height;
    }

    public Horse(String type, int age, String breed, double price, String dan, String sire, int height) {
        super(type, age, breed, price);
        Dan = dan;
        this.sire = sire;
        this.height = height;
    }

    public String getDan() {
        return Dan;
    }

    public void setDan(String dan) {
        Dan = dan;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
