import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{
    private String userAgent;
    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }
    @Override
    public void download(String url, String fileName) {
        try {
            URL urlObj = new URL(url);
            URLConnection connection = urlObj.openConnection();
            connection.setRequestProperty("User-Agent", userAgent);
            InputStream inputStream = connection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.err.println("Failed to download file: " + e.getMessage());
        }
    }
}
