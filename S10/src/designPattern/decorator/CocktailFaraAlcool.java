package designPattern.decorator;

public class CocktailFaraAlcool extends DecoratorCocktail{
    public CocktailFaraAlcool(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void sePrepara() {
        super.sePrepara();
        System.out.println("Nu s a pus alcool");
    }

    @Override
    public void seConsuma() {
        super.seConsuma();
        System.out.println("s a consumat fara alcool! se poate conduce");
    }
}
