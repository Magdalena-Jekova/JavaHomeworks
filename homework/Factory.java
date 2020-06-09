package homework;

public class Factory {
    public static void main(String[] args) {

        Machine[] arrayOfMachines = new Machine[4];
        arrayOfMachines[0] = new Machine(50,5,"black");
        arrayOfMachines[1] = new Machine(60,6, "gray");
        arrayOfMachines[2] = new Machine(70,4, "white");
        arrayOfMachines[3] = new Machine(80, 5,"gray");

        printThePowerOfTheMachines(arrayOfMachines);
    }

    public static void printThePowerOfTheMachines(Machine[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d-та машина има мощност: %d ", i+1, array[i].getPower());
            System.out.println();
        }
    }
}
