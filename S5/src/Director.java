public class Director {
    abstractFilmBuilder builder;
    public Director(abstractFilmBuilder builder){
        this.builder=builder;

    }
    public Film getFilm(){
        return  this.builder.build();
    }
    public void construieste(){
        this.builder.esteIn4D();
        //to do

    }
}
