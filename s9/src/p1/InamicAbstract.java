package p1;

public abstract class InamicAbstract {
    String nume;

    public InamicAbstract(String nume) {
        this.nume = nume;
    }


    //metodele unui inamic( nod frunza)
    public abstract void ataca(int damage);
    public abstract void apara();
    public abstract void seVindeca();

    //metodele specifice unui nod composite

    public abstract void adaugaInamic(InamicAbstract nod);
    public abstract void stergeInamic(int index);
    public abstract InamicAbstract getInamic(String nume);


}
