package Strategy;

public class CosCumparaturi {
    double suma;
    String usernameClient;

    IPlata metodaPlata=null;

    public CosCumparaturi(double suma, String usernameClient, IPlata metodaPlata) {
        this.suma = suma;
        this.usernameClient = usernameClient;
        this.metodaPlata = metodaPlata;
    }
    public void setMetodaPlata(IPlata metodaPlata){
        this.metodaPlata=metodaPlata;
    }

    public void efectueazaPlata(){
        if(this.metodaPlata==null){
            throw new UnsupportedOperationException();
        }else {

        }
    }
}
