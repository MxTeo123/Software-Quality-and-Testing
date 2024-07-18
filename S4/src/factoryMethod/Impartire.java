package factoryMethod;

public class Impartire implements OperatorBinar{
    @Override
    public double calculeaza(double numar1, double numar2) {
        if (numar2 != 0)
        {

            return numar1 / numar2;
    }
        else
        {
            throw new UnsupportedOperationException("nu se poate imp la 0");
        }
    }
}
