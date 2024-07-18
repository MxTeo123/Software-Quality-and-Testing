package S;

public class Personaj {
    String nume;
    int energie=100;
    IMiscare stareMiscare=new MiscareEnergica();
    public Personaj(String nume)
    {
        this.nume=nume;
    }
    public void seMisca(){
        this.stareMiscare.miscare();
    }
    public void joaca(int puncte ){

    }
}
