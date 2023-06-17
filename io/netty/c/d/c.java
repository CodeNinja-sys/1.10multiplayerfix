/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.d;

import io.netty.b.g;
import io.netty.c.d.b;
import io.netty.channel.bd;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

public class c
implements b {
    private final FileChannel a;
    private final long b;
    private final long c;
    private final int d;
    private long e;

    public c(File file) {
        this(new FileInputStream(file).getChannel());
    }

    public c(File file, int n2) {
        this(new FileInputStream(file).getChannel(), n2);
    }

    public c(FileChannel fileChannel) {
        this(fileChannel, 8192);
    }

    public c(FileChannel fileChannel, int n2) {
        this(fileChannel, 0L, fileChannel.size(), n2);
    }

    public c(FileChannel fileChannel, long l2, long l3, int n2) {
        if (fileChannel == null) {
            throw new NullPointerException("in");
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
        if (l2 != 0L) {
            fileChannel.position(l2);
        }
        this.a = fileChannel;
        this.d = n2;
        this.e = this.b = l2;
        this.c = l2 + l3;
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
        return this.e >= this.c || !this.a.isOpen();
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
        g g2 = bd2.d().a(n2);
        boolean bl2 = true;
        try {
            int n3;
            int n4 = 0;
            while ((n3 = g2.a(this.a, n2 - n4)) >= 0 && (n4 += n3) != n2) {
            }
            this.e += (long)n4;
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

