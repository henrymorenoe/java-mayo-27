package individualTarde;

public class Rectangulo extends FiguraGeometrica{

    private double base = 0;
    private  double altura = 0;

    @Override
    public double area() {
        return (base*altura)/2;
    }
}
