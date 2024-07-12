public class FileDownloaderProxy implements Downloader {
    Downloader downloader;
    public FileDownloaderProxy() {
        String firefoxUserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:102.0) Gecko/20100101 Firefox/102.0";
        this.downloader = new FileDownloader(firefoxUserAgent);
    }

    @Override
    public void download(String url, String fileName) {
        downloader.download(url, fileName);
    }
}
