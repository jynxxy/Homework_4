public class Producent {

    public String model;
    public String type;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }

}
