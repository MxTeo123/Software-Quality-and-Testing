package factoryMethod;

public class FactoryInmultire extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Inmultire();
    }
}
