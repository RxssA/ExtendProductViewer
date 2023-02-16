package ie.atu.product6;


public class Animal implements Productable {
    private String type;
    private int age = 0;
    private String breed;
    private double price;


    public Animal() {
        super();
        type = "";
        age = 0 ;
        breed = "";
        price = 0;

    }

    public Animal(String type, int age, String breed, double price) {
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal " +
                "type='" + type + '\'' +
                ", age='" + age + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public String getPriceFormatted() {
        return null;
    }
}
