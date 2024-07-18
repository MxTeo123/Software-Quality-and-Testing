package Command;

public class Main {
    public static void main(String[] args) {

    AplicatieBroker aplicatieBroker=new AplicatieBroker();
    Broker broker=new Broker();

    aplicatieBroker.adaugaOrdin(new OrdinCumparare(broker,10));
    aplicatieBroker.adaugaOrdin(new OrdinCumparare(broker,25));
    aplicatieBroker.adaugaOrdin(new OrdinVanzare(broker,5));

    aplicatieBroker.trimiteOrdineSpreExecutie();
    }
}