/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.d;

import io.netty.b.g;
import io.netty.c.d.b;
import io.netty.channel.bd;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class e
implements b {
    static final int a = 8192;
    private final PushbackInputStream b;
    private final int c;
    private long d;

    public e(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public e(InputStream inputStream, int n2) {
        if (inputStream == null) {
            throw new NullPointerException("in");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("chunkSize: " + n2 + " (expected: a positive integer)");
        }
        this.b = inputStream instanceof PushbackInputStream ? (PushbackInputStream)inputStream : new PushbackInputStream(inputStream);
        this.c = n2;
    }

    public long c() {
        return this.d;
    }

    @Override
    public boolean a() {
        int n2 = this.b.read();
        if (n2 < 0) {
            return true;
        }
        this.b.unread(n2);
        return false;
    }

    @Override
    public void b() {
        this.b.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public g a(bd bd2) {
        if (this.a()) {
            return null;
        }
        int n2 = this.b.available();
        int n3 = n2 <= 0 ? this.c : Math.min(this.c, this.b.available());
        boolean bl2 = true;
        g g2 = bd2.d().a(n3);
        try {
            this.d += (long)g2.a(this.b, n3);
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

