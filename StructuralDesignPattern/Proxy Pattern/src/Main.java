//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "https://example.com/somefile.zip";
        String filename = "somefile.txt";
        Downloader proxy = new FileDownloaderProxy();
        proxy.download(url, filename);
    }
}