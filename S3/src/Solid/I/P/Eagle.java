package Solid.I.P;

public class Eagle implements FlyingCreature, FeatheredCreature{
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {

        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {

        this.currentLocation = "in the air";
    }


    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }
}