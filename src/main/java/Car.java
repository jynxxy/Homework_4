import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    Producent producent;
    boolean isAutomaticGear;
    Market market;
    String segment;
    List<Dimensions> dimensions;
    Country country;

    public Car(Producent producent, boolean isAutomaticGear, Market market, Country country, String segment, List<Dimensions> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
        this.country = country;
    }

    public List<Dimensions> getDimensions() {
        return dimensions;
    }

    public Producent getProducent() {
        return producent;
    }


    public static void main(String[] args) {

        Country USA = new Country("USA", 'U');
        Country Japan = new Country("Japan", 'J');
        Country Korea = new Country("Korea", 'K');
        Country England = new Country("England", 'E');
        Country France = new Country("France", 'F');

        Market market1 = new Market("Europe", Arrays.asList(England, France));
        Market market2 = new Market("America", Arrays.asList(USA));
        Market market3 = new Market("Asia", Arrays.asList(Japan, Korea));
        Market market4 = new Market("all", Arrays.asList(England, USA, Japan, Korea, France));
        Market market5 = new Market("Europe", Arrays.asList(England, France, USA));

        Dimensions hatchback = new Dimensions(140, 450, 310);
        Dimensions SUV = new Dimensions(198, 500, 700);
        Dimensions coupe = new Dimensions(137, 370, 280);
        Dimensions cabriolet = new Dimensions(140, 470, 390);
        Dimensions combi = new Dimensions(145, 450, 1400);
        Dimensions liftback = new Dimensions(146, 448, 550);
        Dimensions sedan = new Dimensions(150, 465, 600);
        Dimensions minivan = new Dimensions(162, 444, 484);
        Dimensions pickup = new Dimensions(170, 484, 280);
        Dimensions roadster = new Dimensions(112, 394, 86);

        List<Dimensions> dimensions = new ArrayList<>();
        dimensions.add(hatchback);
        dimensions.add(SUV);
        dimensions.add(coupe);
        dimensions.add(cabriolet);
        dimensions.add(combi);
        dimensions.add(liftback);
        dimensions.add(sedan);
        dimensions.add(minivan);
        dimensions.add(pickup);
        dimensions.add(roadster);

        Producent prod1 = new Producent("Toyota", "Corolla");
        Producent prod2 = new Producent("Toyota", "Aygo");
        Producent prod3 = new Producent("Toyota", "Hilux");
        Producent prod4 = new Producent("Opel", "Corsa");
        Producent prod5 = new Producent("Opel", "Astra");
        Producent prod6 = new Producent("Honda", "Jazz");
        Producent prod7 = new Producent("BMW", "X3");
        Producent prod8 = new Producent("Mercedes", "Vito");
        Producent prod9 = new Producent("BMW", "X4");
        Producent prod10 = new Producent("BMW", "X1");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(prod1, false, market4, England, "standard", dimensions));
        cars.add(new Car(prod2, false, market4, England, "standard", dimensions));
        cars.add(new Car(prod3, false, market2, France, "medium", dimensions));
        cars.add(new Car(prod4, false, market4, Japan, "standard", dimensions));
        cars.add(new Car(prod5, false, market3, USA, "medium", dimensions));
        cars.add(new Car(prod6, false, market5, USA, "standard", dimensions));
        cars.add(new Car(prod6, false, market5, USA, "standard", dimensions.));
        cars.add(new Car(prod2, false, market4, Korea, "standard", dimensions));
        cars.add(new Car(prod3, false, market4, Korea, "standard", dimensions));
        cars.add(new Car(prod2, true, market3, France, "standard", dimensions));
        cars.add(new Car(prod8, true, market4, France, "medium", dimensions));
        cars.add(new Car(prod7, true, market4, France, "premium", dimensions));
        cars.add(new Car(prod9, true, market1, England, "premium", dimensions));
        cars.add(new Car(prod9, true, market4, England, "premium", dimensions));
        cars.add(new Car(prod10, true, market4, Japan, "premium", dimensions));


        for (Car c : cars) {
            String producentModel = c.getProducent().model;
            if (producentModel.equals("BMW") && c.isAutomaticGear && c.hasCarCapacityOverValue()) {
                System.out.println(c.getProducent());
            }
        }
    }

    public boolean hasCarCapacityOverValue() {
        for (Dimensions dimension : getDimensions()) {
            if (dimension.getTrunkCapacity() < 300) {
                return false;
            }
        }
        return true;
    }
}
