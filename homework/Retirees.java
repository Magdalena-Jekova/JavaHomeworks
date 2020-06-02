package homework;

public class Retirees extends CitizensInfo{
    private int pension;

    public Retirees(String type){
        setType("R");
    }

    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }
}
