package Strategy;

public class PlataCash implements IPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("platesti "+suma+" cash la livrare");
    }
}
