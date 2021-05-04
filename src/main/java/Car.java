import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    Producent producent;
    boolean isAutomaticGear;
    Market market;
    String segment;
    List<Dimensions> dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, List<Dimensions> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
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

        Dimensions hatchback = new Dimensions(140, 450, 310);
        Dimensions SUV = new Dimensions(198, 500,700);
        Dimensions coupe = new Dimensions(137, 370, 280);
        Dimensions cabriolet = new Dimensions(140, 470, 390);
        Dimensions combi = new Dimensions(145, 450, 1400);
        Dimensions liftback = new Dimensions(146, 448, 550);
        Dimensions sedan = new Dimensions(150, 465, 600);
        Dimensions minivan = new Dimensions(162, 444, 484);
        Dimensions pickup = new Dimensions(170, 484, 484);
        Dimensions roadster = new Dimensions(112, 394, 86);

        List<Dimensions>  dimensions = new ArrayList<>();
        dimensions.add(hatchback);

        Producent prod1 = new Producent("Toyota", "Corolla");
        Producent prod2 = new Producent("Toyota", "Aygo");
        Producent prod3 = new Producent("Toyota", "Hilux");
        Producent prod4 = new Producent("Opel", "Corsa");
        Producent prod5 = new Producent("Opel", "Astra");
        Producent prod6 = new Producent("Honda", "Jazz");
        Producent prod7 = new Producent("Honda", "Civic");
        Producent prod8 = new Producent("Mercedes", "Vito");
        Producent prod9 = new Producent("Volkswagen", "Golf");
        Producent prod10 = new Producent("Volkswagen", "T-Cross");

//        Car auto1 = new Car(prod1, false, English, "normal", hatchback);

        Car auto2 = new Car(prod2, true, English, "normal", dimensions);


    }
}
