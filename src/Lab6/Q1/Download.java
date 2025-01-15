package Lab6.Q1;

public class Download {
    public static void download(String url) {
        System.out.println("the " + url + " file will begin to download...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Download was interrupted.");
        }
        System.out.println(url + " File Downloaded.");
    }
}
