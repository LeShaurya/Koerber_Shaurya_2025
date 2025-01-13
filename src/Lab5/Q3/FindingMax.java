package Lab5.Q3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FindingMax {
    public static void main(String[] args) {
        double maxVal = Double.MIN_VALUE;
        try(BufferedReader br = new BufferedReader(new FileReader("src/Lab5/Q3/data.txt"))) {
            String line = null;
            while((line = br.readLine()) != null) {
                double value = Double.parseDouble(line);
                maxVal = Double.max(value, maxVal);
            }
//            Maximum value is: 99.43752090812772
            System.out.println("Maximum value is: " + maxVal);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
