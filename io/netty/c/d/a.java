/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.d;

import io.netty.b.g;
import io.netty.c.d.b;
import io.netty.channel.bd;
import java.io.File;
import java.io.RandomAccessFile;

public class a
implements b {
    private final RandomAccessFile a;
    private final long b;
    private final long c;
    private final int d;
    private long e;

    public a(File file) {
        this(file, 8192);
    }

    public a(File file, int n2) {
        this(new RandomAccessFile(file, "r"), n2);
    }

    public a(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, 8192);
    }

    public a(RandomAccessFile randomAccessFile, int n2) {
        this(randomAccessFile, 0L, randomAccessFile.length(), n2);
    }

    public a(RandomAccessFile randomAccessFile, long l2, long l3, int n2) {
        if (randomAccessFile == null) {
            throw new NullPointerException("file");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException("offset: " + l2 + " (expected: 0 or greater)");
        }
        if (l3 < 0L) {
            throw new IllegalArgumentException("length: " + l3 + " (expected: 0 or greater)");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("chunkSize: " + n2 + " (expected: a positive integer)");
        }
        this.a = randomAccessFile;
        this.e = this.b = l2;
        this.c = l2 + l3;
        this.d = n2;
        randomAccessFile.seek(l2);
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public long e() {
        return this.e;
    }

    @Override
    public boolean a() {
        return this.e >= this.c || !this.a.getChannel().isOpen();
    }

    @Override
    public void b() {
        this.a.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public g a(bd bd2) {
        long l2 = this.e;
        if (l2 >= this.c) {
            return null;
        }
        int n2 = (int)Math.min((long)this.d, this.c - l2);
        g g2 = bd2.d().c(n2);
        boolean bl2 = true;
        try {
            this.a.readFully(g2.X(), g2.Y(), n2);
            g2.h(n2);
            this.e = l2 + (long)n2;
            bl2 = false;
            g g3 = g2;
            return g3;
        }
        finally {
            if (bl2) {
                g2.ad();
            }
        }
    }

    @Override
    public /* synthetic */ Object b(bd bd2) {
        return this.a(bd2);
    }
}

