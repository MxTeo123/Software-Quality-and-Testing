package Strategy;

public class PlataTransferBancar implements IPlata{
    @Override
    public void plateste(double suma) {
        System.out.println(suma+" prin transfer bancar");
    }
}
