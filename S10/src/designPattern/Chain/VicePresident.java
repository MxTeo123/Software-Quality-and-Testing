package designPattern.Chain;

public class VicePresident extends AprobatorBuget{
    @Override
    public void aprobaBuget(float suma) {
        System.out.println("Buget aprobat de vicepresedinte");
    }
}
