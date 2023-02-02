package ie.atu.productv5;

public class Tv extends Product{
    private String ScreenSize;
    private String Manufacture;

    public Tv(){
        super();
        ScreenSize= "";
        Manufacture = "";
        count++;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getManufacture(String sony) {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "" +
                "Screen Size is' " + ScreenSize +
                ", Manufacture is '" + Manufacture;
    }
}
