package homework;
import java.io.*;

public class Queries {
    public static void main (String[] args){
        File fileReference = new File("Citizens");
        try {
            String information;
            FileReader fileReferenceReader = new FileReader(fileReference);
            BufferedReader bufferedReader  = new BufferedReader(fileReferenceReader);
            while((information = bufferedReader.readLine()) != null) {
                String[] dataBase = information.split("@");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
