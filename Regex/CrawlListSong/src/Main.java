import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:127.0) Gecko/20100101 Firefox/127.0");
            httpURLConnection.setRequestProperty("Cookie", "JSESSIONID=1ci30ga296vbcetw0qkxpj9gf; NCT_BALLOON_INDEX=true; nctads_ck=sie0ee6xdwrtzfnyvz6yfb8n_1719907783820; nct_uuid=D528B43C88DA485F881799FA12A9484E");
            httpURLConnection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
            httpURLConnection.connect();//
            InputStream inputFile = httpURLConnection.getInputStream();
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(inputFile);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("name_song\"(.*?)>(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(2));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
