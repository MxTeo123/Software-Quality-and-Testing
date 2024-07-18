package Command;

public class OrdinVanzare extends Ordin{
    private Broker broker;
    public OrdinVanzare(Broker broker, int nrActiuni) {
        super(nrActiuni);
        this.broker=broker;
    }

    @Override
    void executareOrdin(int nrActiuni) {
        this.broker.executaOrdin(nrActiuni);
    }
}
