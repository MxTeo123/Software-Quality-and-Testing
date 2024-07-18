package factoryMethod;

public class Scadere implements OperatorBinar{
    @Override
    public double calculeaza(double numar1, double numar2) {
        return numar1-numar2;
    }
}
