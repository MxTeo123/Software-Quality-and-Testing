package designPattern.decorator;

public class Main {
    public static void main(String[] args) {
        Cocktail cocktail=new Cocktail("Cuba libre");

        cocktail.sePrepara();
        cocktail.seConsuma();
        System.out.println("--------------------------");


        DecoratorCocktail cocktailFaraAlcool=new CocktailFaraAlcool(cocktail);
        cocktailFaraAlcool.sePrepara();
        cocktailFaraAlcool.seConsuma();
        System.out.println("--------------------------");

        Cocktail cocktail2=new Cocktail("Mojito");
        DecoratorCocktail extraShotCocktail=new CocktailExtraShot(cocktail2);
        DecoratorCocktail faraGheataSiExtraShotCocktail=new CocktailFaraGheata(extraShotCocktail);
        faraGheataSiExtraShotCocktail.sePrepara();
        faraGheataSiExtraShotCocktail.seConsuma();
        System.out.println("--------------------------");
    }
}