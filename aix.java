/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.n.a.dl;
import com.a.a.n.a.dq;
import com.a.a.n.a.du;
import com.a.a.n.a.gf;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class aix {
    public static final dq a = du.a(Executors.newCachedThreadPool(new gf().a(true).a("Downloader %d").a()));
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final d c = org.apache.logging.log4j.c.c();

    public static String a(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            try {
                stringBuilder.append(URLEncoder.encode((String)entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
            if (entry.getValue() == null) continue;
            stringBuilder.append('=');
            try {
                stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public static String a(URL uRL, Map map, boolean bl2, Proxy proxy) {
        return aix.a(uRL, aix.a(map), bl2, proxy);
    }

    private static String a(URL uRL, String string, boolean bl2, Proxy proxy) {
        try {
            String string2;
            if (proxy == null) {
                proxy = Proxy.NO_PROXY;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection(proxy);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", "" + string.getBytes().length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(string);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2);
                stringBuffer.append('\r');
            }
            bufferedReader.close();
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            if (!bl2) {
                c.b("Could not post to {}", uRL, exception);
            }
            return "";
        }
    }

    public static dl a(File file, String string, Map map, int n2, wd wd2, Proxy proxy) {
        dl dl2 = a.a(new bml(wd2, string, proxy, map, file, n2));
        return dl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a() {
        ServerSocket serverSocket = null;
        int n2 = -1;
        try {
            serverSocket = new ServerSocket(0);
            n2 = serverSocket.getLocalPort();
        }
        finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            }
            catch (IOException iOException) {}
        }
        return n2;
    }

    static /* synthetic */ d b() {
        return c;
    }
}

