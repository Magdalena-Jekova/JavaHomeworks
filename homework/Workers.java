package homework;

public class Workers extends CitizensInfo {
    private int salary;

    public Workers(String type){
        setType("W");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
