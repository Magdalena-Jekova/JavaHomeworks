package homework;

public abstract class Engine {
    private int power;

    public Engine(int power){
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
