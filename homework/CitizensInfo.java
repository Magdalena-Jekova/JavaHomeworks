package homework;

public class CitizensInfo {

    private String name;
    private String lastName;
    private int age;
    private String address;
    private String number;
    private String sex;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return getData();
    }

    public String getData(){
        return String.format("%s | %s | %s | %d | %s | %s | %s |",
                getType(), getName(),getLastName(),getAge(),getAddress(),getSex(),getNumber());
    }
}
