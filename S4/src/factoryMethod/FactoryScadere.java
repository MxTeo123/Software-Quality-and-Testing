package factoryMethod;

public class FactoryScadere extends FactoryOperatorBinar{
    @Override
    public OperatorBinar getOperatorBinar() throws UnsupportedOperationException {
        return new Scadere();
    }
}
