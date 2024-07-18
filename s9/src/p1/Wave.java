package p1;

import java.util.ArrayList;

public class Wave extends InamicAbstract{
    ArrayList<InamicAbstract>inamici=new ArrayList<>();
    public Wave(String nume) {
        super(nume);
    }

    @Override
    public void ataca(int damage) {
        System.out.println("    "+this.nume+" ataca cu damage "+damage);
        for(InamicAbstract inamic: inamici)
    {
    inamic.ataca(damage);

    }

    }

    @Override
    public void apara() {
        System.out.println("    "+this.nume+" se apara ");
        for(InamicAbstract inamic: inamici)
        {
            inamic.apara();

        }
    }

    @Override
    public void seVindeca() {
        System.out.println("    "+this.nume+" se vindeca ");
        for(InamicAbstract inamic: inamici)
        {
            inamic.seVindeca();

        }
    }

    @Override
    public void adaugaInamic(InamicAbstract nod) {
        this.inamici.add(nod);
    }

    @Override
    public void stergeInamic(int index) {
        if(index>=0 && index<this.inamici.size())
        {
            System.out.println("Inamicul "+this.inamici.get(index).nume+" a fost sters");
        }

    }

    @Override
    public InamicAbstract getInamic(String nume) {
  InamicAbstract inamic=null;
        for(InamicAbstract obj: inamici){
            if(inamic.nume.equals(nume))
            {
                inamic=obj;
            }

        }
        return inamic;
    }
}
