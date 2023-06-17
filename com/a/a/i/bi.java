/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.bx;
import com.a.a.b.cm;
import com.a.a.b.dg;
import com.a.a.d.aga;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.i.aj;
import com.a.a.i.ak;
import com.a.a.i.aq;
import com.a.a.i.ax;
import com.a.a.i.bh;
import com.a.a.i.bj;
import com.a.a.i.bk;
import com.a.a.i.bl;
import com.a.a.i.bm;
import com.a.a.i.bn;
import com.a.a.i.cc;
import com.a.a.i.ce;
import com.a.a.i.cl;
import com.a.a.i.o;
import com.a.a.i.p;
import com.a.a.i.s;
import com.a.a.i.z;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class bi {
    private static final int a = 10000;
    private static final aga b = new bk();

    private bi() {
    }

    public static BufferedReader a(File file, Charset charset) {
        com.a.a.b.cl.a(file);
        com.a.a.b.cl.a(charset);
        return new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(file), charset));
    }

    public static BufferedWriter b(File file, Charset charset) {
        com.a.a.b.cl.a(file);
        com.a.a.b.cl.a(charset);
        return new BufferedWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file), charset));
    }

    public static s a(File file) {
        return new bm(file, null);
    }

    static byte[] a(InputStream inputStream, long l2) {
        if (l2 > Integer.MAX_VALUE) {
            throw new OutOfMemoryError("file is too large to fit in a byte array: " + l2 + " bytes");
        }
        return l2 == 0L ? z.a(inputStream) : z.a(inputStream, (int)l2);
    }

    public static p a(File file, bh ... arrbh) {
        return new bl(file, arrbh, null);
    }

    public static ak c(File file, Charset charset) {
        return bi.a(file).a(charset);
    }

    public static aj a(File file, Charset charset, bh ... arrbh) {
        return bi.a(file, arrbh).a(charset);
    }

    public static cc b(File file) {
        return z.a(bi.a(file));
    }

    public static cl c(File file) {
        return bi.a(file, false);
    }

    public static cl a(File file, boolean bl2) {
        return z.a(bi.a(file, bi.a(bl2)));
    }

    private static bh[] a(boolean bl2) {
        bh[] arrbh;
        if (bl2) {
            bh[] arrbh2 = new bh[1];
            arrbh = arrbh2;
            arrbh2[0] = bh.a;
        } else {
            arrbh = new bh[]{};
        }
        return arrbh;
    }

    public static cc d(File file, Charset charset) {
        return aq.a(bi.c(file, charset));
    }

    public static cl e(File file, Charset charset) {
        return bi.a(file, charset, false);
    }

    public static cl a(File file, Charset charset, boolean bl2) {
        return aq.a(bi.a(file, charset, bi.a(bl2)));
    }

    public static byte[] d(File file) {
        return bi.a(file).f();
    }

    public static String f(File file, Charset charset) {
        return bi.c(file, charset).d();
    }

    public static void a(cc cc2, File file) {
        z.c(cc2).a(bi.a(file, new bh[0]));
    }

    public static void a(byte[] arrby, File file) {
        bi.a(file, new bh[0]).a(arrby);
    }

    public static void a(File file, cl cl2) {
        bi.a(file).a(z.a(cl2));
    }

    public static void a(File file, OutputStream outputStream) {
        bi.a(file).a(outputStream);
    }

    public static void a(File file, File file2) {
        com.a.a.b.cl.a(!file.equals(file2), "Source %s and destination %s must be different", new Object[]{file, file2});
        bi.a(file).a(bi.a(file2, new bh[0]));
    }

    public static void a(cc cc2, File file, Charset charset) {
        aq.d(cc2).a(bi.a(file, charset, new bh[0]));
    }

    public static void a(CharSequence charSequence, File file, Charset charset) {
        bi.a(file, charset, new bh[0]).a(charSequence);
    }

    public static void b(CharSequence charSequence, File file, Charset charset) {
        bi.a(charSequence, file, charset, true);
    }

    private static void a(CharSequence charSequence, File file, Charset charset, boolean bl2) {
        bi.a(file, charset, bi.a(bl2)).a(charSequence);
    }

    public static void a(File file, Charset charset, cl cl2) {
        bi.c(file, charset).a(aq.a(cl2));
    }

    public static void a(File file, Charset charset, Appendable appendable) {
        bi.c(file, charset).a(appendable);
    }

    public static boolean b(File file, File file2) {
        com.a.a.b.cl.a(file);
        com.a.a.b.cl.a(file2);
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long l2 = file.length();
        long l3 = file2.length();
        if (l2 != 0L && l3 != 0L && l2 != l3) {
            return false;
        }
        return bi.a(file).a(bi.a(file2));
    }

    public static File a() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        String string = System.currentTimeMillis() + "-";
        for (int i2 = 0; i2 < 10000; ++i2) {
            File file2 = new File(file, string + i2);
            if (!file2.mkdir()) continue;
            return file2;
        }
        throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + string + "0 to " + string + 9999 + ')');
    }

    public static void e(File file) {
        com.a.a.b.cl.a(file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to update modification time of " + file);
        }
    }

    public static void f(File file) {
        com.a.a.b.cl.a(file);
        File file2 = file.getCanonicalFile().getParentFile();
        if (file2 == null) {
            return;
        }
        file2.mkdirs();
        if (!file2.isDirectory()) {
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    public static void c(File file, File file2) {
        com.a.a.b.cl.a(file);
        com.a.a.b.cl.a(file2);
        com.a.a.b.cl.a(!file.equals(file2), "Source %s and destination %s must be different", new Object[]{file, file2});
        if (!file.renameTo(file2)) {
            bi.a(file, file2);
            if (!file.delete()) {
                if (!file2.delete()) {
                    throw new IOException("Unable to delete " + file2);
                }
                throw new IOException("Unable to delete " + file);
            }
        }
    }

    public static String g(File file, Charset charset) {
        return bi.c(file, charset).e();
    }

    public static List h(File file, Charset charset) {
        return (List)bi.a(file, charset, new bj());
    }

    public static Object a(File file, Charset charset, ce ce2) {
        return aq.a(bi.d(file, charset), ce2);
    }

    public static Object a(File file, o o2) {
        return z.a(bi.b(file), o2);
    }

    public static ae a(File file, ai ai2) {
        return bi.a(file).a(ai2);
    }

    public static MappedByteBuffer g(File file) {
        com.a.a.b.cl.a(file);
        return bi.a(file, FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer a(File file, FileChannel.MapMode mapMode) {
        com.a.a.b.cl.a(file);
        com.a.a.b.cl.a(mapMode);
        if (!file.exists()) {
            throw new FileNotFoundException(file.toString());
        }
        return bi.a(file, mapMode, file.length());
    }

    public static MappedByteBuffer a(File file, FileChannel.MapMode mapMode, long l2) {
        com.a.a.b.cl.a(file);
        com.a.a.b.cl.a(mapMode);
        ax ax2 = ax.a();
        try {
            RandomAccessFile randomAccessFile = (RandomAccessFile)ax2.a(new RandomAccessFile(file, mapMode == FileChannel.MapMode.READ_ONLY ? "r" : "rw"));
            MappedByteBuffer mappedByteBuffer = bi.a(randomAccessFile, mapMode, l2);
            return mappedByteBuffer;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    private static MappedByteBuffer a(RandomAccessFile randomAccessFile, FileChannel.MapMode mapMode, long l2) {
        ax ax2 = ax.a();
        try {
            FileChannel fileChannel = (FileChannel)ax2.a(randomAccessFile.getChannel());
            MappedByteBuffer mappedByteBuffer = fileChannel.map(mapMode, 0L, l2);
            return mappedByteBuffer;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public static String a(String string) {
        com.a.a.b.cl.a(string);
        if (string.length() == 0) {
            return ".";
        }
        Iterable iterable = dg.a('/').a().a(string);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : iterable) {
            if (string2.equals(".")) continue;
            if (string2.equals("..")) {
                if (arrayList.size() > 0 && !((String)arrayList.get(arrayList.size() - 1)).equals("..")) {
                    arrayList.remove(arrayList.size() - 1);
                    continue;
                }
                arrayList.add("..");
                continue;
            }
            arrayList.add(string2);
        }
        Object object = bx.a('/').a(arrayList);
        if (string.charAt(0) == '/') {
            object = "/" + (String)object;
        }
        while (((String)object).startsWith("/../")) {
            object = ((String)object).substring(3);
        }
        if (((String)object).equals("/..")) {
            object = "/";
        } else if ("".equals(object)) {
            object = ".";
        }
        return object;
    }

    public static String b(String string) {
        com.a.a.b.cl.a(string);
        String string2 = new File(string).getName();
        int n2 = string2.lastIndexOf(46);
        return n2 == -1 ? "" : string2.substring(n2 + 1);
    }

    public static String c(String string) {
        com.a.a.b.cl.a(string);
        String string2 = new File(string).getName();
        int n2 = string2.lastIndexOf(46);
        return n2 == -1 ? string2 : string2.substring(0, n2);
    }

    public static aga b() {
        return b;
    }

    public static cm c() {
        return bn.a;
    }

    public static cm d() {
        return bn.b;
    }
}

