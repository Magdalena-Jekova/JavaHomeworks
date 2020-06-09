package homework;

public class Machine {
    private int power;
    private int height;
    private String color;

    public Machine(int power, int height, String color){
        this.power = power;
        this.height = height;
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
