public abstract class abstractFilmBuilder {
    public abstract void adaugaDurataMinute(int durataMinute);
    public abstract void adaugaRegizor(String regizor);
    public abstract void adaugaGenul(String genul);
    public abstract void adaugaRatingImdb(double rating);
    public abstract void adaugaPretBilet(double pret);
    public abstract void esteIn4D();
    public abstract Film build();
}
