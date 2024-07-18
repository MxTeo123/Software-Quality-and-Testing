package designPattern.decorator;

public class Cocktail implements Bautura{
    String nume;

    public Cocktail(String nume) {
        this.nume = nume;
    }

    @Override
    public void sePrepara() {
        System.out.println("Se prepara cocktail-ul "+ this.nume);
    }

    @Override
    public void seConsuma() {
        System.out.println("S a terminat!");
    }
}
