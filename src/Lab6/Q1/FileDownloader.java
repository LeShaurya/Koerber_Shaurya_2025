package Lab6.Q1;

public class FileDownloader implements Runnable{
    private String url;

    public FileDownloader(String url) {
        this.url = url;
    }
    @Override
    public void run() {
        Download.download(url);
    }
}
