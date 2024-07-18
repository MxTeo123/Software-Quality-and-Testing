package designPattern.decorator;

public class CocktailExtraShot extends DecoratorCocktail{
    public CocktailExtraShot(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void seConsuma() {
        super.seConsuma();
        System.out.println("A avut extra shot");
    }

    @Override
    public void sePrepara() {
        super.sePrepara();
        System.out.println("S a pus un shot extra");
    }
}
