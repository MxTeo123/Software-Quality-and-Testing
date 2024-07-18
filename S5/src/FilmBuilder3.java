public class FilmBuilder3 extends  abstractFilmBuilder{
    Film film;
    public FilmBuilder3(String titlu, int anAparitie){
        film=new Film();
        this.film.title=titlu;
        this.film.anAparitie=anAparitie;
    }
    @Override
    public void adaugaDurataMinute(int durataMinute) {

    }

    @Override
    public void adaugaRegizor(String regizor) {

    }

    @Override
    public void adaugaGenul(String genul) {

    }

    @Override
    public void adaugaRatingImdb(double rating) {

    }

    @Override
    public void adaugaPretBilet(double pret) {

    }

    @Override
    public void esteIn4D() {

    }

    @Override
    public Film build() {
        return null;
    }
}
