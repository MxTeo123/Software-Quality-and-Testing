package simpleFactory;

public class Main {
    public static void main(String args[])
    {
        SimpleFactory simpleFactory=new SimpleFactory();

        PersonalSpital medic=simpleFactory.getPersonal(TipPersonal.MEDIC,"Gigel",8000);
        PersonalSpital asistent=simpleFactory.getPersonal(TipPersonal.ASISTENT,"Ionela", 4000);
        PersonalSpital bracardier=SimpleFactory.getPersonal(TipPersonal.BRACARDIER,"Ionel", 3700);

        System.out.println(medic.toString());
        System.out.println(asistent.toString());
        System.out.println(bracardier.toString());

    }

}
