package Solid.o;//https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898

public class Greeter {
    Personality personality;

    public Greeter(Personality personality)
    {
        this.personality=personality;
    }

    public String greet() {
        return this.personality.greet();
    }


}