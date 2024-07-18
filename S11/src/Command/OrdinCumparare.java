package Command;

public class OrdinCumparare extends Ordin{
    Broker broker;
    public OrdinCumparare(Broker broker, int nrActiuni) {
        super(nrActiuni);
        this.broker=broker;
    }

    @Override
    void executareOrdin(int nrActiuni) {
        broker.executaOrdin(nrActiuni);

    }
}
