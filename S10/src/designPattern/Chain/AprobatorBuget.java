package designPattern.Chain;

public abstract class AprobatorBuget {
    protected AprobatorBuget urmatorulAprobator;

    public void adaugaUrmatorulAprobator(AprobatorBuget aprobatorBuget)
    {
        this.urmatorulAprobator=aprobatorBuget;
    }

    public abstract void aprobaBuget(float suma);

}
