package Lab6.Q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
    static List<String> readFromFile() {
        List<String> downloadLinks = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader("download.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                downloadLinks.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not found.");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
        return downloadLinks;
    }
}
