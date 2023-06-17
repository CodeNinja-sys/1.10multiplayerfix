/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import org.apache.commons.b.c.x;
import org.apache.commons.b.o;
import org.apache.commons.b.t;

public class w
implements Runnable {
    private static final int a = 1000;
    private static final String b = "r";
    private static final int c = 4096;
    private final byte[] d;
    private final File e;
    private final long f;
    private final boolean g;
    private final x h;
    private final boolean i;
    private volatile boolean j = true;

    public w(File file, x x2) {
        this(file, x2, 1000L);
    }

    public w(File file, x x2, long l2) {
        this(file, x2, l2, false);
    }

    public w(File file, x x2, long l2, boolean bl2) {
        this(file, x2, l2, bl2, 4096);
    }

    public w(File file, x x2, long l2, boolean bl2, boolean bl3) {
        this(file, x2, l2, bl2, bl3, 4096);
    }

    public w(File file, x x2, long l2, boolean bl2, int n2) {
        this(file, x2, l2, bl2, false, n2);
    }

    public w(File file, x x2, long l2, boolean bl2, boolean bl3, int n2) {
        this.e = file;
        this.f = l2;
        this.g = bl2;
        this.d = new byte[n2];
        this.h = x2;
        x2.a(this);
        this.i = bl3;
    }

    public static w a(File file, x x2, long l2, boolean bl2, int n2) {
        w w2 = new w(file, x2, l2, bl2, n2);
        Thread thread = new Thread(w2);
        thread.setDaemon(true);
        thread.start();
        return w2;
    }

    public static w a(File file, x x2, long l2, boolean bl2, boolean bl3, int n2) {
        w w2 = new w(file, x2, l2, bl2, bl3, n2);
        Thread thread = new Thread(w2);
        thread.setDaemon(true);
        thread.start();
        return w2;
    }

    public static w a(File file, x x2, long l2, boolean bl2) {
        return w.a(file, x2, l2, bl2, 4096);
    }

    public static w a(File file, x x2, long l2, boolean bl2, boolean bl3) {
        return w.a(file, x2, l2, bl2, bl3, 4096);
    }

    public static w a(File file, x x2, long l2) {
        return w.a(file, x2, l2, false);
    }

    public static w a(File file, x x2) {
        return w.a(file, x2, 1000L, false);
    }

    public File a() {
        return this.e;
    }

    public long b() {
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        RandomAccessFile randomAccessFile = null;
        try {
            long l2 = 0L;
            long l3 = 0L;
            while (this.j && randomAccessFile == null) {
                try {
                    randomAccessFile = new RandomAccessFile(this.e, b);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    this.h.a();
                }
                if (randomAccessFile == null) {
                    try {
                        Thread.sleep(this.f);
                    }
                    catch (InterruptedException interruptedException) {}
                    continue;
                }
                l3 = this.g ? this.e.length() : 0L;
                l2 = System.currentTimeMillis();
                randomAccessFile.seek(l3);
            }
            while (this.j) {
                boolean bl2 = o.a(this.e, l2);
                long l4 = this.e.length();
                if (l4 < l3) {
                    this.h.b();
                    try {
                        RandomAccessFile randomAccessFile2 = randomAccessFile;
                        randomAccessFile = new RandomAccessFile(this.e, b);
                        l3 = 0L;
                        t.a(randomAccessFile2);
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        this.h.a();
                    }
                    continue;
                }
                if (l4 > l3) {
                    l3 = this.a(randomAccessFile);
                    l2 = System.currentTimeMillis();
                } else if (bl2) {
                    l3 = 0L;
                    randomAccessFile.seek(l3);
                    l3 = this.a(randomAccessFile);
                    l2 = System.currentTimeMillis();
                }
                if (this.i) {
                    t.a(randomAccessFile);
                }
                try {
                    Thread.sleep(this.f);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                if (!this.j || !this.i) continue;
                randomAccessFile = new RandomAccessFile(this.e, b);
                randomAccessFile.seek(l3);
            }
        }
        catch (Exception exception) {
            this.h.a(exception);
        }
        finally {
            t.a(randomAccessFile);
        }
    }

    public void c() {
        this.j = false;
    }

    private long a(RandomAccessFile randomAccessFile) {
        int n2;
        long l2;
        StringBuilder stringBuilder = new StringBuilder();
        long l3 = l2 = randomAccessFile.getFilePointer();
        boolean bl2 = false;
        while (this.j && (n2 = randomAccessFile.read(this.d)) != -1) {
            block5: for (int i2 = 0; i2 < n2; ++i2) {
                byte by2 = this.d[i2];
                switch (by2) {
                    case 10: {
                        bl2 = false;
                        this.h.a(stringBuilder.toString());
                        stringBuilder.setLength(0);
                        l3 = l2 + (long)i2 + 1L;
                        continue block5;
                    }
                    case 13: {
                        if (bl2) {
                            stringBuilder.append('\r');
                        }
                        bl2 = true;
                        continue block5;
                    }
                    default: {
                        if (bl2) {
                            bl2 = false;
                            this.h.a(stringBuilder.toString());
                            stringBuilder.setLength(0);
                            l3 = l2 + (long)i2 + 1L;
                        }
                        stringBuilder.append((char)by2);
                    }
                }
            }
            l2 = randomAccessFile.getFilePointer();
        }
        randomAccessFile.seek(l3);
        return l3;
    }
}

