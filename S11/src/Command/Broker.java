package Command;

public class Broker {
    public void executaOrdin(int nrActiuni){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("s a executat ordinu");
    }
}
