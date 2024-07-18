//public class Film2 {
//    private String title;
//    private int anAparitie;
//    private int durataMinute;
//    private String regizor;
//    private String genul;
//    private double ratingIMDB;
//    private double pretBilet;
//    private boolean esteIn4d;
//
//
//    private Film2() {
//    }
//
//    private Film2(String title, int anAparitie, int durataMinute, String regizor, String genul, double ratingIMDB, double pretBilet, boolean esteIn4d) {
//        this.title = title;
//        this.anAparitie = anAparitie;
//        this.durataMinute = durataMinute;
//        this.regizor = regizor;
//        this.genul = genul;
//        this.ratingIMDB = ratingIMDB;
//        this.pretBilet = pretBilet;
//        this.esteIn4d = esteIn4d;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    private void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getAnAparitie() {
//        return anAparitie;
//    }
//
//    private void setAnAparitie(int anAparitie) {
//        this.anAparitie = anAparitie;
//    }
//
//    public int getDurataMinute() {
//        return durataMinute;
//    }
//
//    private void setDurataMinute(int durataMinute) {
//        this.durataMinute = durataMinute;
//    }
//
//    public String getRegizor() {
//        return regizor;
//    }
//
//    private void setRegizor(String regizor) {
//        this.regizor = regizor;
//    }
//
//    public String getGenul() {
//        return genul;
//    }
//
//    private void setGenul(String genul) {
//        this.genul = genul;
//    }
//
//    public double getRatingIMDB() {
//        return ratingIMDB;
//    }
//
//    private void setRatingIMDB(double ratingIMDB) {
//        this.ratingIMDB = ratingIMDB;
//    }
//
//    public double getPretBilet() {
//        return pretBilet;
//    }
//
//    private void setPretBilet(double pretBilet) {
//        this.pretBilet = pretBilet;
//    }
//
//    public boolean isEsteIn4d() {
//        return esteIn4d;
//    }
//
//    private void setEsteIn4d(boolean esteIn4d) {
//        this.esteIn4d = esteIn4d;
//    }
//
//    public static class FilmBuilder{
//        private Film film=null;
//        public FilmBuilder(String titlu, int anAparitie)
//        {
//            this.film=new Film();
//            film.title=titlu;
//            film.anAparitie=anAparitie;
//        }
//
//
//
//        public FilmBuilder adaugaDurataMinute(int durata){
//            this.film.durataMinute=durata;
//            return this;
//        }
//        public FilmBuilder adaugaRegizor(String regizor)
//        {
//            this.film.regizor=regizor;
//            return this;
//        }
//        public FilmBuilder adaugaGenul(String gen){
//            this.film.genul=gen;
//            return this;
//        }
//        public FilmBuilder adaugaRatingImdb(double rating){
//            this.film.ratingIMDB=rating;
//            return this;
//        }
//        public FilmBuilder adaugaPretBilet(double pretBilet){
//            this.film.pretBilet=pretBilet;
//            return this;
//        }
//        public FilmBuilder adaugaEsteIn4d(boolean esteIn4D){
//            this.film.esteIn4d=esteIn4D;
//            return this;
//        }
//        public Film build(){
//            return film;
//        }
//
//    }
//
//
//}
