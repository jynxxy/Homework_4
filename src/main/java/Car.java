import java.util.ArrayList;
import java.util.Arrays;

public class Car {

    Producent producent;
    boolean isAutomaticGear;
    Market market;
    String segment;
    ArrayList<Dimension> dimmension;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimmension) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimmension = dimmension;
    }

    public static void main(String[] args) {

        Country USA = new Country("USA", 'U');
        Country Japan = new Country("Japan", 'J');
        Country Korea = new Country("Korea", 'K');
        Country England = new Country("England", 'E');
        Country France = new Country("France", 'F');

        Market Europe = new Market("Europe", Arrays.asList(England, France));
        Market America = new Market("America", Arrays.asList(USA));
        Market Asia = new Market("Asia", Arrays.asList(Japan, Korea));
        Market English = new Market("English", Arrays.asList(England, USA));
        Market West = new Market("Europe", Arrays.asList(England, France, USA));

        Dimension hatchback = new Dimension(140, 450, 310);
        Dimension SUV = new Dimension(198, 500,700);
        Dimension coupe = new Dimension(137, 370, 280);
        Dimension kabriolet = new Dimension(140, 470, 390);
        Dimension kombi = new Dimension(145, 450, 1400);
        Dimension liftback = new Dimension(146, 448, 550);
        Dimension sedan = new Dimension(150, 465, 600);
        Dimension minivan = new Dimension(162, 444, 484);
        Dimension pickup = new Dimension(170, 484, 484);
        Dimension roadster = new Dimension(112, 394, 86);

        Producent producent1 = new Producent("Toyota", "Corolla");
        Producent producent2 = new Producent("Toyota", "Aygo");
        Producent producent3 = new Producent("Toyota", "Hilux");
        Producent producent4 = new Producent("Opel", "Corsa");
        Producent producent5 = new Producent("Opel", "Astra");
        Producent producent6 = new Producent("Honda", "Jazz");
        Producent producent7 = new Producent("Honda", "Civic");
        Producent producent8 = new Producent("Mercedes", "Vito");
        Producent producent9 = new Producent("Volkswagen", "Golf");
        Producent producent10 = new Producent("Volkswagen", "T-Cross");

//        Car auto1 = new Car(producent1, false, English, "normal", hatchback);


    }
}
