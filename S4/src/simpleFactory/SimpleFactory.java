package simpleFactory;

public class SimpleFactory {
    public static PersonalSpital getPersonal(TipPersonal tipPersonal,String nume, float salariu)
    {
        switch (tipPersonal)
        {
            case MEDIC:{
                return new Medic(nume,salariu);
            }
            case ASISTENT:
            {
                return new Asistent(nume, salariu);
            }
            case BRACARDIER:
            {
                return new Bracardier(nume,salariu);
            }

        }
        return null;
    }
}
