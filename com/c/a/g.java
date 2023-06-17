/*
 * Decompiled with CFR 0.150.
 */
package com.c.a;

import com.c.a.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import org.apache.commons.b.b;
import org.apache.commons.b.t;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.d;

public abstract class g
extends c {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Proxy b;

    protected g(Proxy proxy) {
        ao.a(proxy);
        this.b = proxy;
    }

    public Proxy c() {
        return this.b;
    }

    protected HttpURLConnection a(URL uRL) {
        ao.a(uRL);
        a.a("Opening connection to " + uRL);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection(this.b);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setUseCaches(false);
        return httpURLConnection;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String a(URL uRL, String string, String string2) {
        ao.a(uRL);
        ao.a((Object)string);
        ao.a((Object)string2);
        HttpURLConnection httpURLConnection = this.a(uRL);
        byte[] arrby = string.getBytes(org.apache.commons.b.b.f);
        httpURLConnection.setRequestProperty("Content-Type", string2 + "; charset=utf-8");
        httpURLConnection.setRequestProperty("Content-Length", "" + arrby.length);
        httpURLConnection.setDoOutput(true);
        a.a("Writing POST data to " + uRL + ": " + string);
        OutputStream outputStream = null;
        try {
            outputStream = httpURLConnection.getOutputStream();
            t.a(arrby, outputStream);
        }
        finally {
            t.a(outputStream);
        }
        a.a("Reading data from " + uRL);
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            String string3 = t.b(inputStream, org.apache.commons.b.b.f);
            a.a("Successful read, server response was " + httpURLConnection.getResponseCode());
            a.a("Response: " + string3);
            String string4 = string3;
            return string4;
        }
        catch (IOException iOException) {
            t.a(inputStream);
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                a.a("Reading error page from " + uRL);
                String string5 = t.b(inputStream, org.apache.commons.b.b.f);
                a.a("Successful read, server response was " + httpURLConnection.getResponseCode());
                a.a("Response: " + string5);
                String string6 = string5;
                return string6;
            }
            a.a("Request failed", (Throwable)iOException);
            throw iOException;
        }
        finally {
            t.a(inputStream);
        }
    }

    public String b(URL uRL) {
        ao.a(uRL);
        HttpURLConnection httpURLConnection = this.a(uRL);
        a.a("Reading data from " + uRL);
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            String string = t.b(inputStream, org.apache.commons.b.b.f);
            a.a("Successful read, server response was " + httpURLConnection.getResponseCode());
            a.a("Response: " + string);
            String string2 = string;
            return string2;
        }
        catch (IOException iOException) {
            t.a(inputStream);
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                a.a("Reading error page from " + uRL);
                String string = t.b(inputStream, org.apache.commons.b.b.f);
                a.a("Successful read, server response was " + httpURLConnection.getResponseCode());
                a.a("Response: " + string);
                String string3 = string;
                return string3;
            }
            a.a("Request failed", (Throwable)iOException);
            throw iOException;
        }
        finally {
            t.a(inputStream);
        }
    }

    public static URL a(String string) {
        try {
            return new URL(string);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("Couldn't create constant for " + string, malformedURLException);
        }
    }

    public static String a(Map map) {
        if (map == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            try {
                stringBuilder.append(URLEncoder.encode((String)entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                a.b("Unexpected exception building query", (Throwable)unsupportedEncodingException);
            }
            if (entry.getValue() == null) continue;
            stringBuilder.append('=');
            try {
                stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                a.b("Unexpected exception building query", (Throwable)unsupportedEncodingException);
            }
        }
        return stringBuilder.toString();
    }

    public static URL a(URL uRL, String string) {
        try {
            if (uRL.getQuery() != null && uRL.getQuery().length() > 0) {
                return new URL(uRL.getProtocol(), uRL.getHost(), uRL.getPort(), uRL.getFile() + "&" + string);
            }
            return new URL(uRL.getProtocol(), uRL.getHost(), uRL.getPort(), uRL.getFile() + "?" + string);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException("Could not concatenate given URL with GET arguments!", malformedURLException);
        }
    }
}

