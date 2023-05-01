package work.yj1211.live.utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpUtil {
    public static String doGet(String url) {
        try (final CloseableHttpClient client = HttpClients.createDefault()) {
            /* 发送 GET 请求 */
            final HttpGet request = new HttpGet(url);
            final HttpResponse response = client.execute(request);

            /* 请求发送成功，并得到响应 */
            /* 读取服务器返回过来的json字符串数据 */
            return EntityUtils.toString(response.getEntity());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
