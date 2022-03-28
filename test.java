import java.io.BufferedReader;
import java.io.FileReader;

public class test {
    public static void main(String[] args) {
    String file = "src\\default.csv";
    BufferedReader reader = null;
    String line = "";
    try {
        reader = new BufferedReader(new FileReader(file));
        while((line = reader.readLine()) != null) {
         
        String[] row = line.split(",");

        for (String index : row)  {
            System.out.print(index);
            System.out.print("|");
        }
        System.out.println();
        }
    }   

    catch (Exception e) {
        e.printStackTrace();
    }
    }
}
