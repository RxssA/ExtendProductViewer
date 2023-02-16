package ie.atu.product6;
import ie.atu.product6.*;

public class ProductDB{

    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Productable p = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;

        } if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia group");
            p = myMusic;

        }
         if (productCode.equalsIgnoreCase("kdl43")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("SONY BRAVIA SMART TV KDL4WF663");
            myTv.setPrice(819);
            myTv.setScreenSize("55");
            myTv.getManufacture("Sony");
            p = myTv;

        }
        if (productCode.equalsIgnoreCase("Dog")) {
            Animal myAnimal = new Animal();
            myAnimal.setType(productCode);
            myAnimal.setPrice(819);
            myAnimal.setAge(2);
            myAnimal.setBreed("big dog");
            p = myAnimal;

        }
        if (productCode.equalsIgnoreCase("ed")) {
            Horse myHorse = new Horse();
            myHorse.setDan(productCode);
            myHorse.setSire("tt");
            myHorse.setPrice(819);
            myHorse.setAge(2);
            myHorse.setHeight(100);
            p =  myHorse;

        }
        return p;
    }


}

