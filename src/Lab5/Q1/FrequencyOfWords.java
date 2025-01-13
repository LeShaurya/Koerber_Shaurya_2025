package Lab5.Q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Lab5/Q1/story.txt"))) {
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    word = word.toLowerCase();
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
