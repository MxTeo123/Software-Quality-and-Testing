package designPattern.decorator;

public class CocktailFaraGheata extends DecoratorCocktail{
    public CocktailFaraGheata(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void sePrepara() {
        super.sePrepara();
        System.out.println("Bautura este gata si calda");
    }
}
