package factoryMethod;

public class FactoryAdunare extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Adunare();
    }
}
