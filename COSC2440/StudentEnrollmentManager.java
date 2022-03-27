package COSC2440;
import java.util.List;
import java.io.*;

public interface StudentEnrollmentManager {

    String file = "src\\default.csv";
    BufferedReader reader = null;
    String line = "";
    try {
        reader = new BufferedReader(new FileReader(file));
        while((line = reader.readLine()) != null) {
         
        String[] row = line.split(",");
    } 
    catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
    }
}

