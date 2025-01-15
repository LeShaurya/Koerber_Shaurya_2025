package Lab6.Q1;

import java.util.ArrayList;
import java.util.List;

public class DownloadApp {
    public static void main(String[] args) throws InterruptedException {
        List<String> downloadLinks = ReadFromFile.readFromFile();
        List<Thread> threads = new ArrayList<>();
        for(String link : downloadLinks) {
            threads.add(new Thread(new FileDownloader(link)));
        }
        for(Thread thread : threads) {
            thread.start();
        }

        for(Thread thread : threads) {
            thread.join();
        }

    }
}
