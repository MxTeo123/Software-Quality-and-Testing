package designPattern.Chain;

public class ManagerM2 extends AprobatorBuget{
    public static final int BUGET_MAXIM=3500;
    @Override
    public void aprobaBuget(float suma) {
        if(suma<BUGET_MAXIM){
            System.out.println("Buget aprobat de M2");
        }else{
            if(this.urmatorulAprobator!=null){
                urmatorulAprobator.aprobaBuget(suma);
            }else {
                System.out.println("Buget respins de M2");
            }
        }
    }
}
