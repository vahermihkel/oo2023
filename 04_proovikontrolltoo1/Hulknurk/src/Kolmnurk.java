import java.util.List;

public class Kolmnurk {
    List<Double> xCoords;
    List<Double> yCoords;

    // parem klõps -> generate -> constructor
    public Kolmnurk(List<Double> xCoords, List<Double> yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    public double lisaJaAnnaYmberm66t(double newX, double newY) {
        xCoords.add(newX);
        yCoords.add(newY);
//        Math.pow();
        return 2.0; // EI TEE
    }



}
