package Command;

import java.util.ArrayList;
import java.util.List;

public class AplicatieBroker {
    private List<Ordin> ordine=new ArrayList<>();

    public void adaugaOrdin(Ordin ordin)
    {
        ordine.add(ordin);
    }
    public void trimiteOrdineSpreExecutie(){
        for(Ordin ordin:ordine){
            ordin.executareOrdin(ordin.nrActiuni);
        }
    }
}
