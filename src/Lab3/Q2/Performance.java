package Lab3.Q2;

import java.io.*;

public class Performance {
    public static void usingByteStream() {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("img.png"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("op1.png"))) {
            byte[] buffer = new byte[4 * 1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);  // Write the read data into the output file
            }
            System.out.println("Done...");
        } catch (FileNotFoundException e) {
            System.out.println("File Not found.");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }

    public static void usingCharacterStream() {
        try(BufferedReader br = new BufferedReader(new FileReader("img.png"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("op.png"))) {
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
            }
            System.out.println("Done...");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO error occurred");
        }
    }

    public static void main(String[] args) {
        long startTimeNonBuffered = System.currentTimeMillis();
        usingCharacterStream();
        long endTimeNonBuffered = System.currentTimeMillis();
        long durationNonBuffered = endTimeNonBuffered - startTimeNonBuffered;
        System.out.println("For Character stream the time takes is:" + durationNonBuffered + " ms");

        startTimeNonBuffered = System.currentTimeMillis();
        usingByteStream();
        endTimeNonBuffered = System.currentTimeMillis();
        durationNonBuffered = endTimeNonBuffered - startTimeNonBuffered;
        System.out.println("For Byte stream the time takes is:" + durationNonBuffered + " ms");
    }
}
