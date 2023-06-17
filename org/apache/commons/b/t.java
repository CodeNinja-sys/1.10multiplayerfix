/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.b.b;
import org.apache.commons.b.e.n;
import org.apache.commons.b.u;

public class t {
    private static final int g = -1;
    public static final char a = '/';
    public static final char b = '\\';
    public static final char c = File.separatorChar;
    public static final String d = "\n";
    public static final String e = "\r\n";
    public static final String f;
    private static final int h = 4096;
    private static final int i = 2048;
    private static char[] j;
    private static byte[] k;

    public static void a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection)uRLConnection).disconnect();
        }
    }

    public static void a(Reader reader) {
        t.a((Closeable)reader);
    }

    public static void a(Writer writer) {
        t.a((Closeable)writer);
    }

    public static void a(InputStream inputStream) {
        t.a((Closeable)inputStream);
    }

    public static void a(OutputStream outputStream) {
        t.a((Closeable)outputStream);
    }

    public static void a(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    public static void a(Selector selector) {
        if (selector != null) {
            try {
                selector.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    public static void a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    public static InputStream b(InputStream inputStream) {
        return org.apache.commons.b.e.b.b(inputStream);
    }

    public static BufferedReader b(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
    }

    public static byte[] c(InputStream inputStream) {
        org.apache.commons.b.e.b b2 = new org.apache.commons.b.e.b();
        t.a(inputStream, (OutputStream)b2);
        return b2.c();
    }

    public static byte[] a(InputStream inputStream, long l2) {
        if (l2 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + l2);
        }
        return t.a(inputStream, (int)l2);
    }

    public static byte[] a(InputStream inputStream, int n2) {
        int n3;
        int n4;
        if (n2 < 0) {
            throw new IllegalArgumentException("Size must be equal or greater than zero: " + n2);
        }
        if (n2 == 0) {
            return new byte[0];
        }
        byte[] arrby = new byte[n2];
        for (n3 = 0; n3 < n2 && (n4 = inputStream.read(arrby, n3, n2 - n3)) != -1; n3 += n4) {
        }
        if (n3 != n2) {
            throw new IOException("Unexpected readed size. current: " + n3 + ", excepted: " + n2);
        }
        return arrby;
    }

    public static byte[] c(Reader reader) {
        return t.a(reader, Charset.defaultCharset());
    }

    public static byte[] a(Reader reader, Charset charset) {
        org.apache.commons.b.e.b b2 = new org.apache.commons.b.e.b();
        t.a(reader, (OutputStream)b2, charset);
        return b2.c();
    }

    public static byte[] a(Reader reader, String string) {
        return t.a(reader, org.apache.commons.b.b.a(string));
    }

    public static byte[] a(String string) {
        return string.getBytes();
    }

    public static byte[] a(URI uRI) {
        return t.a(uRI.toURL());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] a(URL uRL) {
        URLConnection uRLConnection = uRL.openConnection();
        try {
            byte[] arrby = t.b(uRLConnection);
            return arrby;
        }
        finally {
            t.a(uRLConnection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] b(URLConnection uRLConnection) {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] arrby = t.c(inputStream);
            return arrby;
        }
        finally {
            inputStream.close();
        }
    }

    public static char[] d(InputStream inputStream) {
        return t.a(inputStream, Charset.defaultCharset());
    }

    public static char[] a(InputStream inputStream, Charset charset) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        t.a(inputStream, (Writer)charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static char[] a(InputStream inputStream, String string) {
        return t.a(inputStream, org.apache.commons.b.b.a(string));
    }

    public static char[] d(Reader reader) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        t.a(reader, (Writer)charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static String e(InputStream inputStream) {
        return t.b(inputStream, Charset.defaultCharset());
    }

    public static String b(InputStream inputStream, Charset charset) {
        n n2 = new n();
        t.a(inputStream, (Writer)n2, charset);
        return n2.toString();
    }

    public static String b(InputStream inputStream, String string) {
        return t.b(inputStream, org.apache.commons.b.b.a(string));
    }

    public static String e(Reader reader) {
        n n2 = new n();
        t.a(reader, (Writer)n2);
        return n2.toString();
    }

    public static String b(URI uRI) {
        return t.a(uRI, Charset.defaultCharset());
    }

    public static String a(URI uRI, Charset charset) {
        return t.a(uRI.toURL(), org.apache.commons.b.b.a(charset));
    }

    public static String a(URI uRI, String string) {
        return t.a(uRI, org.apache.commons.b.b.a(string));
    }

    public static String b(URL uRL) {
        return t.a(uRL, Charset.defaultCharset());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(URL uRL, Charset charset) {
        InputStream inputStream = uRL.openStream();
        try {
            String string = t.b(inputStream, charset);
            return string;
        }
        finally {
            inputStream.close();
        }
    }

    public static String a(URL uRL, String string) {
        return t.a(uRL, org.apache.commons.b.b.a(string));
    }

    public static String a(byte[] arrby) {
        return new String(arrby);
    }

    public static String a(byte[] arrby, String string) {
        return new String(arrby, org.apache.commons.b.b.a(string));
    }

    public static List f(InputStream inputStream) {
        return t.c(inputStream, Charset.defaultCharset());
    }

    public static List c(InputStream inputStream, Charset charset) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, org.apache.commons.b.b.a(charset));
        return t.f(inputStreamReader);
    }

    public static List c(InputStream inputStream, String string) {
        return t.c(inputStream, org.apache.commons.b.b.a(string));
    }

    public static List f(Reader reader) {
        BufferedReader bufferedReader = t.b(reader);
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = bufferedReader.readLine();
        while (string != null) {
            arrayList.add(string);
            string = bufferedReader.readLine();
        }
        return arrayList;
    }

    public static u g(Reader reader) {
        return new u(reader);
    }

    public static u d(InputStream inputStream, Charset charset) {
        return new u(new InputStreamReader(inputStream, org.apache.commons.b.b.a(charset)));
    }

    public static u d(InputStream inputStream, String string) {
        return t.d(inputStream, org.apache.commons.b.b.a(string));
    }

    public static InputStream a(CharSequence charSequence) {
        return t.a(charSequence, Charset.defaultCharset());
    }

    public static InputStream a(CharSequence charSequence, Charset charset) {
        return t.a(((Object)charSequence).toString(), charset);
    }

    public static InputStream a(CharSequence charSequence, String string) {
        return t.a(charSequence, org.apache.commons.b.b.a(string));
    }

    public static InputStream b(String string) {
        return t.a(string, Charset.defaultCharset());
    }

    public static InputStream a(String string, Charset charset) {
        return new ByteArrayInputStream(string.getBytes(org.apache.commons.b.b.a(charset)));
    }

    public static InputStream a(String string, String string2) {
        byte[] arrby = string.getBytes(org.apache.commons.b.b.a(string2));
        return new ByteArrayInputStream(arrby);
    }

    public static void a(byte[] arrby, OutputStream outputStream) {
        if (arrby != null) {
            outputStream.write(arrby);
        }
    }

    public static void a(byte[] arrby, Writer writer) {
        t.a(arrby, writer, Charset.defaultCharset());
    }

    public static void a(byte[] arrby, Writer writer, Charset charset) {
        if (arrby != null) {
            writer.write(new String(arrby, org.apache.commons.b.b.a(charset)));
        }
    }

    public static void a(byte[] arrby, Writer writer, String string) {
        t.a(arrby, writer, org.apache.commons.b.b.a(string));
    }

    public static void a(char[] arrc, Writer writer) {
        if (arrc != null) {
            writer.write(arrc);
        }
    }

    public static void a(char[] arrc, OutputStream outputStream) {
        t.a(arrc, outputStream, Charset.defaultCharset());
    }

    public static void a(char[] arrc, OutputStream outputStream, Charset charset) {
        if (arrc != null) {
            outputStream.write(new String(arrc).getBytes(org.apache.commons.b.b.a(charset)));
        }
    }

    public static void a(char[] arrc, OutputStream outputStream, String string) {
        t.a(arrc, outputStream, org.apache.commons.b.b.a(string));
    }

    public static void a(CharSequence charSequence, Writer writer) {
        if (charSequence != null) {
            t.a(((Object)charSequence).toString(), writer);
        }
    }

    public static void a(CharSequence charSequence, OutputStream outputStream) {
        t.a(charSequence, outputStream, Charset.defaultCharset());
    }

    public static void a(CharSequence charSequence, OutputStream outputStream, Charset charset) {
        if (charSequence != null) {
            t.a(((Object)charSequence).toString(), outputStream, charset);
        }
    }

    public static void a(CharSequence charSequence, OutputStream outputStream, String string) {
        t.a(charSequence, outputStream, org.apache.commons.b.b.a(string));
    }

    public static void a(String string, Writer writer) {
        if (string != null) {
            writer.write(string);
        }
    }

    public static void a(String string, OutputStream outputStream) {
        t.a(string, outputStream, Charset.defaultCharset());
    }

    public static void a(String string, OutputStream outputStream, Charset charset) {
        if (string != null) {
            outputStream.write(string.getBytes(org.apache.commons.b.b.a(charset)));
        }
    }

    public static void a(String string, OutputStream outputStream, String string2) {
        t.a(string, outputStream, org.apache.commons.b.b.a(string2));
    }

    public static void a(StringBuffer stringBuffer, Writer writer) {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static void a(StringBuffer stringBuffer, OutputStream outputStream) {
        t.a(stringBuffer, outputStream, (String)null);
    }

    public static void a(StringBuffer stringBuffer, OutputStream outputStream, String string) {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(org.apache.commons.b.b.a(string)));
        }
    }

    public static void a(Collection collection, String string, OutputStream outputStream) {
        t.a(collection, string, outputStream, Charset.defaultCharset());
    }

    public static void a(Collection collection, String string, OutputStream outputStream, Charset charset) {
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = f;
        }
        Charset charset2 = org.apache.commons.b.b.a(charset);
        for (Object e2 : collection) {
            if (e2 != null) {
                outputStream.write(e2.toString().getBytes(charset2));
            }
            outputStream.write(string.getBytes(charset2));
        }
    }

    public static void a(Collection collection, String string, OutputStream outputStream, String string2) {
        t.a(collection, string, outputStream, org.apache.commons.b.b.a(string2));
    }

    public static void a(Collection collection, String string, Writer writer) {
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = f;
        }
        for (Object e2 : collection) {
            if (e2 != null) {
                writer.write(e2.toString());
            }
            writer.write(string);
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long l2 = t.b(inputStream, outputStream);
        if (l2 > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l2;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        return t.a(inputStream, outputStream, new byte[4096]);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, byte[] arrby) {
        long l2 = 0L;
        int n2 = 0;
        while (-1 != (n2 = inputStream.read(arrby))) {
            outputStream.write(arrby, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    public static long a(InputStream inputStream, OutputStream outputStream, long l2, long l3) {
        return t.a(inputStream, outputStream, l2, l3, new byte[4096]);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, long l2, long l3, byte[] arrby) {
        int n2;
        int n3;
        if (l2 > 0L) {
            t.c(inputStream, l2);
        }
        if (l3 == 0L) {
            return 0L;
        }
        int n4 = n3 = arrby.length;
        if (l3 > 0L && l3 < (long)n3) {
            n4 = (int)l3;
        }
        long l4 = 0L;
        while (n4 > 0 && -1 != (n2 = inputStream.read(arrby, 0, n4))) {
            outputStream.write(arrby, 0, n2);
            l4 += (long)n2;
            if (l3 <= 0L) continue;
            n4 = (int)Math.min(l3 - l4, (long)n3);
        }
        return l4;
    }

    public static void a(InputStream inputStream, Writer writer) {
        t.a(inputStream, writer, Charset.defaultCharset());
    }

    public static void a(InputStream inputStream, Writer writer, Charset charset) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, org.apache.commons.b.b.a(charset));
        t.a((Reader)inputStreamReader, writer);
    }

    public static void a(InputStream inputStream, Writer writer, String string) {
        t.a(inputStream, writer, org.apache.commons.b.b.a(string));
    }

    public static int a(Reader reader, Writer writer) {
        long l2 = t.b(reader, writer);
        if (l2 > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l2;
    }

    public static long b(Reader reader, Writer writer) {
        return t.a(reader, writer, new char[4096]);
    }

    public static long a(Reader reader, Writer writer, char[] arrc) {
        long l2 = 0L;
        int n2 = 0;
        while (-1 != (n2 = reader.read(arrc))) {
            writer.write(arrc, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    public static long a(Reader reader, Writer writer, long l2, long l3) {
        return t.a(reader, writer, l2, l3, new char[4096]);
    }

    public static long a(Reader reader, Writer writer, long l2, long l3, char[] arrc) {
        int n2;
        if (l2 > 0L) {
            t.b(reader, l2);
        }
        if (l3 == 0L) {
            return 0L;
        }
        int n3 = arrc.length;
        if (l3 > 0L && l3 < (long)arrc.length) {
            n3 = (int)l3;
        }
        long l4 = 0L;
        while (n3 > 0 && -1 != (n2 = reader.read(arrc, 0, n3))) {
            writer.write(arrc, 0, n2);
            l4 += (long)n2;
            if (l3 <= 0L) continue;
            n3 = (int)Math.min(l3 - l4, (long)arrc.length);
        }
        return l4;
    }

    public static void a(Reader reader, OutputStream outputStream) {
        t.a(reader, outputStream, Charset.defaultCharset());
    }

    public static void a(Reader reader, OutputStream outputStream, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, org.apache.commons.b.b.a(charset));
        t.a(reader, (Writer)outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void a(Reader reader, OutputStream outputStream, String string) {
        t.a(reader, outputStream, org.apache.commons.b.b.a(string));
    }

    public static boolean a(InputStream inputStream, InputStream inputStream2) {
        int n2;
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        int n3 = inputStream.read();
        while (-1 != n3) {
            n2 = inputStream2.read();
            if (n3 != n2) {
                return false;
            }
            n3 = inputStream.read();
        }
        n2 = inputStream2.read();
        return n2 == -1;
    }

    public static boolean a(Reader reader, Reader reader2) {
        int n2;
        reader = t.b(reader);
        reader2 = t.b(reader2);
        int n3 = reader.read();
        while (-1 != n3) {
            n2 = reader2.read();
            if (n3 != n2) {
                return false;
            }
            n3 = reader.read();
        }
        n2 = reader2.read();
        return n2 == -1;
    }

    public static boolean b(Reader reader, Reader reader2) {
        BufferedReader bufferedReader = t.b(reader);
        BufferedReader bufferedReader2 = t.b(reader2);
        String string = bufferedReader.readLine();
        String string2 = bufferedReader2.readLine();
        while (string != null && string2 != null && string.equals(string2)) {
            string = bufferedReader.readLine();
            string2 = bufferedReader2.readLine();
        }
        return string == null ? string2 == null : string.equals(string2);
    }

    public static long b(InputStream inputStream, long l2) {
        long l3;
        long l4;
        if (l2 < 0L) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + l2);
        }
        if (k == null) {
            k = new byte[2048];
        }
        for (l3 = l2; l3 > 0L && (l4 = (long)inputStream.read(k, 0, (int)Math.min(l3, 2048L))) >= 0L; l3 -= l4) {
        }
        return l2 - l3;
    }

    public static long a(Reader reader, long l2) {
        long l3;
        long l4;
        if (l2 < 0L) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + l2);
        }
        if (j == null) {
            j = new char[2048];
        }
        for (l3 = l2; l3 > 0L && (l4 = (long)reader.read(j, 0, (int)Math.min(l3, 2048L))) >= 0L; l3 -= l4) {
        }
        return l2 - l3;
    }

    public static void c(InputStream inputStream, long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("Bytes to skip must not be negative: " + l2);
        }
        long l3 = t.b(inputStream, l2);
        if (l3 != l2) {
            throw new EOFException("Bytes to skip: " + l2 + " actual: " + l3);
        }
    }

    public static void b(Reader reader, long l2) {
        long l3 = t.a(reader, l2);
        if (l3 != l2) {
            throw new EOFException("Chars to skip: " + l2 + " actual: " + l3);
        }
    }

    public static int a(Reader reader, char[] arrc, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        if (n3 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + n3);
        }
        for (n5 = n3; n5 > 0 && -1 != (n6 = reader.read(arrc, n2 + (n4 = n3 - n5), n5)); n5 -= n6) {
        }
        return n3 - n5;
    }

    public static int a(Reader reader, char[] arrc) {
        return t.a(reader, arrc, 0, arrc.length);
    }

    public static int a(InputStream inputStream, byte[] arrby, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        if (n3 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + n3);
        }
        for (n5 = n3; n5 > 0 && -1 != (n6 = inputStream.read(arrby, n2 + (n4 = n3 - n5), n5)); n5 -= n6) {
        }
        return n3 - n5;
    }

    public static int a(InputStream inputStream, byte[] arrby) {
        return t.a(inputStream, arrby, 0, arrby.length);
    }

    public static void b(Reader reader, char[] arrc, int n2, int n3) {
        int n4 = t.a(reader, arrc, n2, n3);
        if (n4 != n3) {
            throw new EOFException("Length to read: " + n3 + " actual: " + n4);
        }
    }

    public static void b(Reader reader, char[] arrc) {
        t.b(reader, arrc, 0, arrc.length);
    }

    public static void b(InputStream inputStream, byte[] arrby, int n2, int n3) {
        int n4 = t.a(inputStream, arrby, n2, n3);
        if (n4 != n3) {
            throw new EOFException("Length to read: " + n3 + " actual: " + n4);
        }
    }

    public static void b(InputStream inputStream, byte[] arrby) {
        t.b(inputStream, arrby, 0, arrby.length);
    }

    static {
        n n2 = new n(4);
        PrintWriter printWriter = new PrintWriter(n2);
        printWriter.println();
        f = n2.toString();
        printWriter.close();
    }
}

