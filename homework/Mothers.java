package homework;
import java.util.ArrayList;

public class Mothers extends CitizensInfo {
    private ArrayList<Children> children = new ArrayList<>();
    public Mothers(String type){
        setType("M");
    }

    public ArrayList<Children> getChildren(){
        return this.children;
    }

    public void setChildren (Children children){
        this.children.add(children);
    }

}
