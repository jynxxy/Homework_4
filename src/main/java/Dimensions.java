import java.util.List;

public class Dimensions {

    public int high;
    public int width;
    public int trunkCapacity;

    public Dimensions(int high, int width, int trunkCapacity) {
        this.high = high;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }
}
