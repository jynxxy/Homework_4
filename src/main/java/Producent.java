public class Producent {

    public String model;
    public String type;

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Producent{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
