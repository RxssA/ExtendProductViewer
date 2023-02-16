package ie.atu.productv5;

public class Animal extends Product{
    private String type;
    private String age;
    private String breed;


    public Animal() {
        super();
        type = "";
        age = "";
        breed = "";
        count++;
    }


    @Override
    public String toString() {
        return "Animal " +
                "type='" + type + '\'' +
                ", age='" + age + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
