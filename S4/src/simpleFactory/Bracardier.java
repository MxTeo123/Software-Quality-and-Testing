package simpleFactory;

public class Bracardier extends PersonalSpital{
    public Bracardier(String nume, float salariu) {
        super(nume, salariu);
    }
    public String toString()
    {
        final StringBuilder sb=new StringBuilder("Brancardier: ");
        sb.append(super.toString());
        return sb.toString();
    }
}
