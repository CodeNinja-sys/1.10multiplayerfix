/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.b.b;
import org.apache.commons.b.b.h;
import org.apache.commons.b.b.j;
import org.apache.commons.b.b.l;
import org.apache.commons.b.b.n;
import org.apache.commons.b.b.v;
import org.apache.commons.b.b.w;
import org.apache.commons.b.m;
import org.apache.commons.b.p;
import org.apache.commons.b.t;
import org.apache.commons.b.u;

public class o {
    public static final long a = 1024L;
    public static final BigInteger b = BigInteger.valueOf(1024L);
    public static final long c = 0x100000L;
    public static final BigInteger d = b.multiply(b);
    private static final long p = 0x1E00000L;
    public static final long e = 0x40000000L;
    public static final BigInteger f = b.multiply(d);
    public static final long g = 0x10000000000L;
    public static final BigInteger h = b.multiply(f);
    public static final long i = 0x4000000000000L;
    public static final BigInteger j = b.multiply(h);
    public static final long k = 0x1000000000000000L;
    public static final BigInteger l = b.multiply(j);
    public static final BigInteger m = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(0x1000000000000000L));
    public static final BigInteger n = b.multiply(m);
    public static final File[] o = new File[0];
    private static final Charset q = Charset.forName("UTF-8");

    public static File a(File file, String ... arrstring) {
        if (file == null) {
            throw new NullPointerException("directorydirectory must not be null");
        }
        if (arrstring == null) {
            throw new NullPointerException("names must not be null");
        }
        File file2 = file;
        for (String string : arrstring) {
            file2 = new File(file2, string);
        }
        return file2;
    }

    public static File a(String ... arrstring) {
        if (arrstring == null) {
            throw new NullPointerException("names must not be null");
        }
        File file = null;
        for (String string : arrstring) {
            file = file == null ? new File(string) : new File(file, string);
        }
        return file;
    }

    public static String a() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File b() {
        return new File(org.apache.commons.b.o.a());
    }

    public static String c() {
        return System.getProperty("user.home");
    }

    public static File d() {
        return new File(org.apache.commons.b.o.c());
    }

    public static FileInputStream a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canRead()) {
                throw new IOException("File '" + file + "' cannot be read");
            }
        } else {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        return new FileInputStream(file);
    }

    public static FileOutputStream b(File file) {
        return org.apache.commons.b.o.a(file, false);
    }

    public static FileOutputStream a(File file, boolean bl2) {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        } else {
            File file2 = file.getParentFile();
            if (file2 != null && !file2.mkdirs() && !file2.isDirectory()) {
                throw new IOException("Directory '" + file2 + "' could not be created");
            }
        }
        return new FileOutputStream(file, bl2);
    }

    public static String a(BigInteger bigInteger) {
        String string = bigInteger.divide(l).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(l)) + " EB" : (bigInteger.divide(j).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(j)) + " PB" : (bigInteger.divide(h).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(h)) + " TB" : (bigInteger.divide(f).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(f)) + " GB" : (bigInteger.divide(d).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(d)) + " MB" : (bigInteger.divide(b).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(b)) + " KB" : String.valueOf(bigInteger) + " bytes")))));
        return string;
    }

    public static String a(long l2) {
        return org.apache.commons.b.o.a(BigInteger.valueOf(l2));
    }

    public static void c(File file) {
        boolean bl2;
        if (!file.exists()) {
            FileOutputStream fileOutputStream = org.apache.commons.b.o.b(file);
            t.a(fileOutputStream);
        }
        if (!(bl2 = file.setLastModified(System.currentTimeMillis()))) {
            throw new IOException("Unable to set the last modification time for " + file);
        }
    }

    public static File[] a(Collection collection) {
        return collection.toArray(new File[collection.size()]);
    }

    private static void a(Collection collection, File file, n n2, boolean bl2) {
        File[] arrfile = file.listFiles(n2);
        if (arrfile != null) {
            for (File file2 : arrfile) {
                if (file2.isDirectory()) {
                    if (bl2) {
                        collection.add(file2);
                    }
                    org.apache.commons.b.o.a(collection, file2, n2, bl2);
                    continue;
                }
                collection.add(file2);
            }
        }
    }

    public static Collection a(File file, n n2, n n3) {
        org.apache.commons.b.o.a(file, n2);
        n n4 = org.apache.commons.b.o.a(n2);
        n n5 = org.apache.commons.b.o.b(n3);
        LinkedList linkedList = new LinkedList();
        org.apache.commons.b.o.a(linkedList, file, org.apache.commons.b.b.l.b(new n[]{n4, n5}), false);
        return linkedList;
    }

    private static void a(File file, n n2) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory");
        }
        if (n2 == null) {
            throw new NullPointerException("Parameter 'fileFilter' is null");
        }
    }

    private static n a(n n2) {
        return org.apache.commons.b.b.l.a(new n[]{n2, org.apache.commons.b.b.l.a(org.apache.commons.b.b.h.b)});
    }

    private static n b(n n2) {
        return n2 == null ? org.apache.commons.b.b.j.b : org.apache.commons.b.b.l.a(new n[]{n2, org.apache.commons.b.b.h.b});
    }

    public static Collection b(File file, n n2, n n3) {
        org.apache.commons.b.o.a(file, n2);
        n n4 = org.apache.commons.b.o.a(n2);
        n n5 = org.apache.commons.b.o.b(n3);
        LinkedList<File> linkedList = new LinkedList<File>();
        if (file.isDirectory()) {
            linkedList.add(file);
        }
        org.apache.commons.b.o.a(linkedList, file, org.apache.commons.b.b.l.b(new n[]{n4, n5}), true);
        return linkedList;
    }

    public static Iterator c(File file, n n2, n n3) {
        return org.apache.commons.b.o.a(file, n2, n3).iterator();
    }

    public static Iterator d(File file, n n2, n n3) {
        return org.apache.commons.b.o.b(file, n2, n3).iterator();
    }

    private static String[] b(String[] arrstring) {
        String[] arrstring2 = new String[arrstring.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrstring2[i2] = "." + arrstring[i2];
        }
        return arrstring2;
    }

    public static Collection a(File file, String[] arrstring, boolean bl2) {
        n n2;
        if (arrstring == null) {
            n2 = w.b;
        } else {
            String[] arrstring2 = org.apache.commons.b.o.b(arrstring);
            n2 = new v(arrstring2);
        }
        return org.apache.commons.b.o.a(file, n2, bl2 ? w.b : org.apache.commons.b.b.j.b);
    }

    public static Iterator b(File file, String[] arrstring, boolean bl2) {
        return org.apache.commons.b.o.a(file, arrstring, bl2).iterator();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(File file, File file2) {
        boolean bl2;
        boolean bl3 = file.exists();
        if (bl3 != file2.exists()) {
            return false;
        }
        if (!bl3) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.length() != file2.length()) {
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream2 = new FileInputStream(file2);
            bl2 = t.a((InputStream)fileInputStream, fileInputStream2);
        }
        catch (Throwable throwable) {
            t.a(fileInputStream);
            t.a(fileInputStream2);
            throw throwable;
        }
        t.a(fileInputStream);
        t.a(fileInputStream2);
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(File file, File file2, String string) {
        boolean bl2;
        boolean bl3 = file.exists();
        if (bl3 != file2.exists()) {
            return false;
        }
        if (!bl3) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        InputStreamReader inputStreamReader = null;
        InputStreamReader inputStreamReader2 = null;
        try {
            if (string == null) {
                inputStreamReader = new InputStreamReader(new FileInputStream(file));
                inputStreamReader2 = new InputStreamReader(new FileInputStream(file2));
            } else {
                inputStreamReader = new InputStreamReader((InputStream)new FileInputStream(file), string);
                inputStreamReader2 = new InputStreamReader((InputStream)new FileInputStream(file2), string);
            }
            bl2 = t.b((Reader)inputStreamReader, inputStreamReader2);
        }
        catch (Throwable throwable) {
            t.a(inputStreamReader);
            t.a(inputStreamReader2);
            throw throwable;
        }
        t.a(inputStreamReader);
        t.a(inputStreamReader2);
        return bl2;
    }

    public static File a(URL uRL) {
        if (uRL == null || !"file".equalsIgnoreCase(uRL.getProtocol())) {
            return null;
        }
        String string = uRL.getFile().replace('/', File.separatorChar);
        string = org.apache.commons.b.o.a(string);
        return new File(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static String a(String string) {
        String string2 = string;
        if (string != null && string.indexOf(37) >= 0) {
            int n2 = string.length();
            StringBuffer stringBuffer = new StringBuffer();
            ByteBuffer byteBuffer = ByteBuffer.allocate(n2);
            int n3 = 0;
            while (n3 < n2) {
                if (string.charAt(n3) == '%') {
                    try {
                        do {
                            byte by2 = (byte)Integer.parseInt(string.substring(n3 + 1, n3 + 3), 16);
                            byteBuffer.put(by2);
                        } while ((n3 += 3) < n2 && string.charAt(n3) == '%');
                        continue;
                    }
                    catch (RuntimeException runtimeException) {
                    }
                    finally {
                        if (byteBuffer.position() <= 0) continue;
                        byteBuffer.flip();
                        stringBuffer.append(q.decode(byteBuffer).toString());
                        byteBuffer.clear();
                        continue;
                    }
                }
                stringBuffer.append(string.charAt(n3++));
            }
            string2 = stringBuffer.toString();
        }
        return string2;
    }

    public static File[] a(URL[] arruRL) {
        if (arruRL == null || arruRL.length == 0) {
            return o;
        }
        File[] arrfile = new File[arruRL.length];
        for (int i2 = 0; i2 < arruRL.length; ++i2) {
            URL uRL = arruRL[i2];
            if (uRL == null) continue;
            if (!uRL.getProtocol().equals("file")) {
                throw new IllegalArgumentException("URL could not be converted to a File: " + uRL);
            }
            arrfile[i2] = org.apache.commons.b.o.a(uRL);
        }
        return arrfile;
    }

    public static URL[] a(File[] arrfile) {
        URL[] arruRL = new URL[arrfile.length];
        for (int i2 = 0; i2 < arruRL.length; ++i2) {
            arruRL[i2] = arrfile[i2].toURI().toURL();
        }
        return arruRL;
    }

    public static void b(File file, File file2) {
        org.apache.commons.b.o.a(file, file2, true);
    }

    public static void a(File file, File file2, boolean bl2) {
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
        }
        File file3 = new File(file2, file.getName());
        org.apache.commons.b.o.b(file, file3, bl2);
    }

    public static void c(File file, File file2) {
        org.apache.commons.b.o.b(file, file2, true);
    }

    public static void b(File file, File file2, boolean bl2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File file3 = file2.getParentFile();
        if (file3 != null && !file3.mkdirs() && !file3.isDirectory()) {
            throw new IOException("Destination '" + file3 + "' directory cannot be created");
        }
        if (file2.exists() && !file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' exists but is read-only");
        }
        org.apache.commons.b.o.g(file, file2, bl2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long a(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long l2 = t.b((InputStream)fileInputStream, outputStream);
            return l2;
        }
        finally {
            fileInputStream.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void g(File file, File file2, boolean bl2) {
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        FileChannel fileChannel = null;
        FileChannel fileChannel2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file2);
            fileChannel = fileInputStream.getChannel();
            fileChannel2 = fileOutputStream.getChannel();
            long l2 = fileChannel.size();
            long l3 = 0L;
            for (long i2 = 0L; i2 < l2; i2 += fileChannel2.transferFrom(fileChannel, i2, l3)) {
                l3 = l2 - i2 > 0x1E00000L ? 0x1E00000L : l2 - i2;
            }
        }
        catch (Throwable throwable) {
            t.a(fileChannel2);
            t.a(fileOutputStream);
            t.a(fileChannel);
            t.a(fileInputStream);
            throw throwable;
        }
        t.a(fileChannel2);
        t.a(fileOutputStream);
        t.a(fileChannel);
        t.a(fileInputStream);
        if (file.length() != file2.length()) {
            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
        }
        if (bl2) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void d(File file, File file2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException("Source '" + file2 + "' is not a directory");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
        }
        org.apache.commons.b.o.c(file, new File(file2, file.getName()), true);
    }

    public static void e(File file, File file2) {
        org.apache.commons.b.o.c(file, file2, true);
    }

    public static void c(File file, File file2, boolean bl2) {
        org.apache.commons.b.o.a(file, file2, null, bl2);
    }

    public static void a(File file, File file2, FileFilter fileFilter) {
        org.apache.commons.b.o.a(file, file2, fileFilter, true);
    }

    public static void a(File file, File file2, FileFilter fileFilter, boolean bl2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        ArrayList<String> arrayList = null;
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] arrfile;
            File[] arrfile2 = arrfile = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
            if (arrfile != null && arrfile.length > 0) {
                arrayList = new ArrayList<String>(arrfile.length);
                for (File file3 : arrfile) {
                    File file4 = new File(file2, file3.getName());
                    arrayList.add(file4.getCanonicalPath());
                }
            }
        }
        org.apache.commons.b.o.a(file, file2, fileFilter, bl2, arrayList);
    }

    private static void a(File file, File file2, FileFilter fileFilter, boolean bl2, List list) {
        File[] arrfile;
        File[] arrfile2 = arrfile = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (arrfile == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : arrfile) {
            File file4 = new File(file2, file3.getName());
            if (list != null && list.contains(file3.getCanonicalPath())) continue;
            if (file3.isDirectory()) {
                org.apache.commons.b.o.a(file3, file4, fileFilter, bl2, list);
                continue;
            }
            org.apache.commons.b.o.g(file3, file4, bl2);
        }
        if (bl2) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void a(URL uRL, File file) {
        InputStream inputStream = uRL.openStream();
        org.apache.commons.b.o.a(inputStream, file);
    }

    public static void a(URL uRL, File file, int n2, int n3) {
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.setConnectTimeout(n2);
        uRLConnection.setReadTimeout(n3);
        InputStream inputStream = uRLConnection.getInputStream();
        org.apache.commons.b.o.a(inputStream, file);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = org.apache.commons.b.o.b(file);
            try {
                t.a(inputStream, (OutputStream)fileOutputStream);
                fileOutputStream.close();
            }
            finally {
                t.a(fileOutputStream);
            }
        }
        finally {
            t.a(inputStream);
        }
    }

    public static void d(File file) {
        if (!file.exists()) {
            return;
        }
        if (!org.apache.commons.b.o.s(file)) {
            org.apache.commons.b.o.f(file);
        }
        if (!file.delete()) {
            String string = "Unable to delete directory " + file + ".";
            throw new IOException(string);
        }
    }

    public static boolean e(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                org.apache.commons.b.o.f(file);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            return file.delete();
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static boolean f(File file, File file2) {
        if (file == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Not a directory: " + file);
        }
        if (file2 == null) {
            return false;
        }
        if (!file.exists() || !file2.exists()) {
            return false;
        }
        String string = file.getCanonicalPath();
        String string2 = file2.getCanonicalPath();
        return org.apache.commons.b.p.b(string, string2);
    }

    public static void f(File file) {
        if (!file.exists()) {
            String string = file + " does not exist";
            throw new IllegalArgumentException(string);
        }
        if (!file.isDirectory()) {
            String string = file + " is not a directory";
            throw new IllegalArgumentException(string);
        }
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        IOException iOException = null;
        for (File file2 : arrfile) {
            try {
                org.apache.commons.b.o.k(file2);
            }
            catch (IOException iOException2) {
                iOException = iOException2;
            }
        }
        if (null != iOException) {
            throw iOException;
        }
    }

    public static boolean a(File file, int n2) {
        int n3 = 0;
        int n4 = 0;
        while (!file.exists()) {
            if (n4++ >= 10) {
                n4 = 0;
                if (n3++ > n2) {
                    return false;
                }
            }
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
            }
            catch (Exception exception) {
                break;
            }
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(File file, Charset charset) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = org.apache.commons.b.o.a(file);
            String string = t.b((InputStream)fileInputStream, org.apache.commons.b.b.a(charset));
            return string;
        }
        finally {
            t.a(fileInputStream);
        }
    }

    public static String a(File file, String string) {
        return org.apache.commons.b.o.a(file, org.apache.commons.b.b.a(string));
    }

    public static String g(File file) {
        return org.apache.commons.b.o.a(file, Charset.defaultCharset());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] h(File file) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = org.apache.commons.b.o.a(file);
            byte[] arrby = t.a((InputStream)fileInputStream, file.length());
            return arrby;
        }
        finally {
            t.a(fileInputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static List b(File file, Charset charset) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = org.apache.commons.b.o.a(file);
            List list = t.c((InputStream)fileInputStream, org.apache.commons.b.b.a(charset));
            return list;
        }
        finally {
            t.a(fileInputStream);
        }
    }

    public static List b(File file, String string) {
        return org.apache.commons.b.o.b(file, org.apache.commons.b.b.a(string));
    }

    public static List i(File file) {
        return org.apache.commons.b.o.b(file, Charset.defaultCharset());
    }

    public static u c(File file, String string) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = org.apache.commons.b.o.a(file);
            return t.d((InputStream)fileInputStream, string);
        }
        catch (IOException iOException) {
            t.a(fileInputStream);
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            t.a(fileInputStream);
            throw runtimeException;
        }
    }

    public static u j(File file) {
        return org.apache.commons.b.o.c(file, null);
    }

    public static void a(File file, String string, Charset charset) {
        org.apache.commons.b.o.a(file, string, charset, false);
    }

    public static void a(File file, String string, String string2) {
        org.apache.commons.b.o.a(file, string, string2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, String string, Charset charset, boolean bl2) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = org.apache.commons.b.o.a(file, bl2);
            t.a(string, (OutputStream)fileOutputStream, charset);
            ((OutputStream)fileOutputStream).close();
        }
        finally {
            t.a(fileOutputStream);
        }
    }

    public static void a(File file, String string, String string2, boolean bl2) {
        org.apache.commons.b.o.a(file, string, org.apache.commons.b.b.a(string2), bl2);
    }

    public static void d(File file, String string) {
        org.apache.commons.b.o.a(file, string, Charset.defaultCharset(), false);
    }

    public static void a(File file, String string, boolean bl2) {
        org.apache.commons.b.o.a(file, string, Charset.defaultCharset(), bl2);
    }

    public static void a(File file, CharSequence charSequence) {
        org.apache.commons.b.o.a(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void a(File file, CharSequence charSequence, boolean bl2) {
        org.apache.commons.b.o.a(file, charSequence, Charset.defaultCharset(), bl2);
    }

    public static void a(File file, CharSequence charSequence, Charset charset) {
        org.apache.commons.b.o.a(file, charSequence, charset, false);
    }

    public static void a(File file, CharSequence charSequence, String string) {
        org.apache.commons.b.o.a(file, charSequence, string, false);
    }

    public static void a(File file, CharSequence charSequence, Charset charset, boolean bl2) {
        String string = charSequence == null ? null : ((Object)charSequence).toString();
        org.apache.commons.b.o.a(file, string, charset, bl2);
    }

    public static void a(File file, CharSequence charSequence, String string, boolean bl2) {
        org.apache.commons.b.o.a(file, charSequence, org.apache.commons.b.b.a(string), bl2);
    }

    public static void a(File file, byte[] arrby) {
        org.apache.commons.b.o.a(file, arrby, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, byte[] arrby, boolean bl2) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = org.apache.commons.b.o.a(file, bl2);
            ((OutputStream)fileOutputStream).write(arrby);
            ((OutputStream)fileOutputStream).close();
        }
        finally {
            t.a(fileOutputStream);
        }
    }

    public static void a(File file, String string, Collection collection) {
        org.apache.commons.b.o.a(file, string, collection, null, false);
    }

    public static void a(File file, String string, Collection collection, boolean bl2) {
        org.apache.commons.b.o.a(file, string, collection, null, bl2);
    }

    public static void a(File file, Collection collection) {
        org.apache.commons.b.o.a(file, null, collection, null, false);
    }

    public static void a(File file, Collection collection, boolean bl2) {
        org.apache.commons.b.o.a(file, null, collection, null, bl2);
    }

    public static void a(File file, String string, Collection collection, String string2) {
        org.apache.commons.b.o.a(file, string, collection, string2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(File file, String string, Collection collection, String string2, boolean bl2) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = org.apache.commons.b.o.a(file, bl2);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            t.a(collection, string2, (OutputStream)bufferedOutputStream, string);
            bufferedOutputStream.flush();
            fileOutputStream.close();
        }
        finally {
            t.a(fileOutputStream);
        }
    }

    public static void a(File file, Collection collection, String string) {
        org.apache.commons.b.o.a(file, null, collection, string, false);
    }

    public static void a(File file, Collection collection, String string, boolean bl2) {
        org.apache.commons.b.o.a(file, null, collection, string, bl2);
    }

    public static void k(File file) {
        if (file.isDirectory()) {
            org.apache.commons.b.o.d(file);
        } else {
            boolean bl2 = file.exists();
            if (!file.delete()) {
                if (!bl2) {
                    throw new FileNotFoundException("File does not exist: " + file);
                }
                String string = "Unable to delete file: " + file;
                throw new IOException(string);
            }
        }
    }

    public static void l(File file) {
        if (file.isDirectory()) {
            org.apache.commons.b.o.t(file);
        } else {
            file.deleteOnExit();
        }
    }

    private static void t(File file) {
        if (!file.exists()) {
            return;
        }
        file.deleteOnExit();
        if (!org.apache.commons.b.o.s(file)) {
            org.apache.commons.b.o.u(file);
        }
    }

    private static void u(File file) {
        if (!file.exists()) {
            String string = file + " does not exist";
            throw new IllegalArgumentException(string);
        }
        if (!file.isDirectory()) {
            String string = file + " is not a directory";
            throw new IllegalArgumentException(string);
        }
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        IOException iOException = null;
        for (File file2 : arrfile) {
            try {
                org.apache.commons.b.o.l(file2);
            }
            catch (IOException iOException2) {
                iOException = iOException2;
            }
        }
        if (null != iOException) {
            throw iOException;
        }
    }

    public static void m(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                String string = "File " + file + " exists and is " + "not a directory. Unable to create directory.";
                throw new IOException(string);
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            String string = "Unable to create directory " + file;
            throw new IOException(string);
        }
    }

    public static long n(File file) {
        if (!file.exists()) {
            String string = file + " does not exist";
            throw new IllegalArgumentException(string);
        }
        if (file.isDirectory()) {
            return org.apache.commons.b.o.p(file);
        }
        return file.length();
    }

    public static BigInteger o(File file) {
        if (!file.exists()) {
            String string = file + " does not exist";
            throw new IllegalArgumentException(string);
        }
        if (file.isDirectory()) {
            return org.apache.commons.b.o.q(file);
        }
        return BigInteger.valueOf(file.length());
    }

    public static long p(File file) {
        org.apache.commons.b.o.v(file);
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return 0L;
        }
        long l2 = 0L;
        for (File file2 : arrfile) {
            try {
                if (org.apache.commons.b.o.s(file2) || (l2 += org.apache.commons.b.o.n(file2)) >= 0L) continue;
                break;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return l2;
    }

    public static BigInteger q(File file) {
        org.apache.commons.b.o.v(file);
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigInteger = BigInteger.ZERO;
        for (File file2 : arrfile) {
            try {
                if (org.apache.commons.b.o.s(file2)) continue;
                bigInteger = bigInteger.add(BigInteger.valueOf(org.apache.commons.b.o.n(file2)));
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return bigInteger;
    }

    private static void v(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    public static boolean g(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (!file2.exists()) {
            throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
        }
        return org.apache.commons.b.o.a(file, file2.lastModified());
    }

    public static boolean a(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException("No specified date");
        }
        return org.apache.commons.b.o.a(file, date.getTime());
    }

    public static boolean a(File file, long l2) {
        if (file == null) {
            throw new IllegalArgumentException("No specified file");
        }
        if (!file.exists()) {
            return false;
        }
        return file.lastModified() > l2;
    }

    public static boolean h(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (!file2.exists()) {
            throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
        }
        return org.apache.commons.b.o.b(file, file2.lastModified());
    }

    public static boolean b(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException("No specified date");
        }
        return org.apache.commons.b.o.b(file, date.getTime());
    }

    public static boolean b(File file, long l2) {
        if (file == null) {
            throw new IllegalArgumentException("No specified file");
        }
        if (!file.exists()) {
            return false;
        }
        return file.lastModified() < l2;
    }

    public static long r(File file) {
        CRC32 cRC32 = new CRC32();
        org.apache.commons.b.o.a(file, cRC32);
        return cRC32.getValue();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Checksum a(File file, Checksum checksum) {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        CheckedInputStream checkedInputStream = null;
        try {
            checkedInputStream = new CheckedInputStream(new FileInputStream(file), checksum);
            t.a((InputStream)checkedInputStream, (OutputStream)new org.apache.commons.b.e.j());
        }
        catch (Throwable throwable) {
            t.a(checkedInputStream);
            throw throwable;
        }
        t.a(checkedInputStream);
        return checksum;
    }

    public static void i(File file, File file2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' is not a directory");
        }
        if (file2.exists()) {
            throw new m("Destination '" + file2 + "' already exists");
        }
        boolean bl2 = file.renameTo(file2);
        if (!bl2) {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
            }
            org.apache.commons.b.o.e(file, file2);
            org.apache.commons.b.o.d(file);
            if (file.exists()) {
                throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
            }
        }
    }

    public static void d(File file, File file2, boolean bl2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && bl2) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + bl2 + "]");
        }
        if (!file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
        org.apache.commons.b.o.i(file, new File(file2, file.getName()));
    }

    public static void j(File file, File file2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' is a directory");
        }
        if (file2.exists()) {
            throw new m("Destination '" + file2 + "' already exists");
        }
        if (file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is a directory");
        }
        boolean bl2 = file.renameTo(file2);
        if (!bl2) {
            org.apache.commons.b.o.c(file, file2);
            if (!file.delete()) {
                org.apache.commons.b.o.e(file2);
                throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
            }
        }
    }

    public static void e(File file, File file2, boolean bl2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && bl2) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + bl2 + "]");
        }
        if (!file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
        org.apache.commons.b.o.j(file, new File(file2, file.getName()));
    }

    public static void f(File file, File file2, boolean bl2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            org.apache.commons.b.o.d(file, file2, bl2);
        } else {
            org.apache.commons.b.o.e(file, file2, bl2);
        }
    }

    public static boolean s(File file) {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (org.apache.commons.b.p.a()) {
            return false;
        }
        File file2 = null;
        if (file.getParent() == null) {
            file2 = file;
        } else {
            File file3 = file.getParentFile().getCanonicalFile();
            file2 = new File(file3, file.getName());
        }
        return !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
    }
}

