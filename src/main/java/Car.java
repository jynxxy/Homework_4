import java.util.ArrayList;

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

        Country Poland = new Country("Poland", 'P');
        Country Germany = new Country("Germany", 'D');
        Country Holland = new Country("Holland", 'H');
        Country England = new Country("England", 'E');
        Country France = new Country("France", 'F');

//        Market<> Europe = new Market("Europe", Poland, Germany, Holland, England, France);

        Producent Toyota = new Producent("Toyota", "Corolla");
    }
}
