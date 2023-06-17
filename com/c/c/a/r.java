/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.p;
import com.c.c.a.s;
import com.c.c.a.t;
import com.c.c.a.u;
import com.c.c.a.v;
import com.c.c.c.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

public abstract class r {
    protected HttpURLConnection a;
    private boolean c;
    protected String b;
    private static final int d = 60000;
    private static final int e = 5000;

    public r(String string, int n2, int n3) {
        try {
            this.b = string;
            Proxy proxy = p.a();
            this.a = proxy != null ? (HttpURLConnection)new URL(string).openConnection(proxy) : (HttpURLConnection)new URL(string).openConnection();
            this.a.setConnectTimeout(n2);
            this.a.setReadTimeout(n3);
        }
        catch (MalformedURLException malformedURLException) {
            throw new a(malformedURLException.getMessage(), malformedURLException);
        }
        catch (IOException iOException) {
            throw new a(iOException.getMessage(), iOException);
        }
    }

    public void a(String string, String string2) {
        r.a(this.a, string, string2);
    }

    public static void a(HttpURLConnection httpURLConnection, String string, String string2) {
        String string3 = httpURLConnection.getRequestProperty("Cookie");
        if (string3 == null) {
            httpURLConnection.setRequestProperty("Cookie", string + "=" + string2);
        } else {
            httpURLConnection.setRequestProperty("Cookie", string3 + ";" + string + "=" + string2);
        }
    }

    public r b(String string, String string2) {
        this.a.addRequestProperty(string, string2);
        return this;
    }

    public int a() {
        return r.a(this.a);
    }

    public static int a(HttpURLConnection httpURLConnection) {
        String string = httpURLConnection.getHeaderField("Retry-After");
        try {
            return Integer.valueOf(string);
        }
        catch (Exception exception) {
            return 5;
        }
    }

    public int b() {
        try {
            this.d();
            return this.a.getResponseCode();
        }
        catch (Exception exception) {
            throw new a(exception.getMessage(), exception);
        }
    }

    public String c() {
        try {
            this.d();
            String string = null;
            string = this.b() >= 400 ? this.a(this.a.getErrorStream()) : this.a(this.a.getInputStream());
            this.f();
            return string;
        }
        catch (IOException iOException) {
            throw new a(iOException.getMessage(), iOException);
        }
    }

    private String a(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = inputStreamReader.read();
        while (n2 != -1) {
            stringBuilder.append((char)n2);
            n2 = inputStreamReader.read();
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void f() {
        byte[] arrby = new byte[1024];
        try {
            int n2 = 0;
            InputStream inputStream = this.a.getInputStream();
            while ((n2 = inputStream.read(arrby)) > 0) {
            }
            inputStream.close();
        }
        catch (Exception exception) {
            int n3;
            InputStream inputStream;
            block13: {
                inputStream = this.a.getErrorStream();
                n3 = 0;
                if (inputStream != null) break block13;
                return;
            }
            try {
                while ((n3 = inputStream.read(arrby)) > 0) {
                }
                inputStream.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        finally {
            if (this.a != null) {
                this.a.disconnect();
            }
        }
    }

    protected r d() {
        if (!this.c) {
            r r2 = this.e();
            this.c = true;
            return r2;
        }
        return this;
    }

    protected abstract r e();

    public static r a(String string) {
        return new t(string, 5000, 60000);
    }

    public static r a(String string, int n2, int n3) {
        return new t(string, n2, n3);
    }

    public static r c(String string, String string2) {
        return new u(string, string2, 5000, 60000);
    }

    public static r a(String string, String string2, int n2, int n3) {
        return new u(string, string2, n2, n3);
    }

    public static r b(String string) {
        return new s(string, 5000, 60000);
    }

    public static r d(String string, String string2) {
        return new v(string, string2, 5000, 60000);
    }

    public static r b(String string, String string2, int n2, int n3) {
        return new v(string, string2, n2, n3);
    }

    public String c(String string) {
        return r.a(this.a, string);
    }

    public static String a(HttpURLConnection httpURLConnection, String string) {
        try {
            return httpURLConnection.getHeaderField(string);
        }
        catch (Exception exception) {
            return "";
        }
    }
}

