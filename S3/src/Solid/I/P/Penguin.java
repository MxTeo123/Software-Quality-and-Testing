package Solid.I.P;

public class Penguin implements FeatheredCreature, SwimmingCreature {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {

        this.numberOfFeathers = initialFeatherCount;
    }



    @Override
    public void molt() {

        this.numberOfFeathers -= 1;
    }

    public void swim() {

        this.currentLocation = "in the water";
    }

    @Override
    public void Swim() {

    }
}