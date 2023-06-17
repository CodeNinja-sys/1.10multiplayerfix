/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.d;

import io.netty.b.g;
import io.netty.c.d.b;
import io.netty.channel.bd;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public class d
implements b {
    private final ReadableByteChannel a;
    private final int b;
    private long c;
    private final ByteBuffer d;

    public d(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }

    public d(ReadableByteChannel readableByteChannel, int n2) {
        if (readableByteChannel == null) {
            throw new NullPointerException("in");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("chunkSize: " + n2 + " (expected: a positive integer)");
        }
        this.a = readableByteChannel;
        this.c = 0L;
        this.b = n2;
        this.d = ByteBuffer.allocate(n2);
    }

    public long c() {
        return this.c;
    }

    @Override
    public boolean a() {
        if (this.d.position() > 0) {
            return false;
        }
        if (this.a.isOpen()) {
            int n2 = this.a.read(this.d);
            if (n2 < 0) {
                return true;
            }
            this.c += (long)n2;
            return false;
        }
        return true;
    }

    @Override
    public void b() {
        this.a.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public g a(bd bd2) {
        int n2;
        if (this.a()) {
            return null;
        }
        int n3 = this.d.position();
        while ((n2 = this.a.read(this.d)) >= 0) {
            this.c += (long)n2;
            if ((n3 += n2) != this.b) continue;
            break;
        }
        this.d.flip();
        n2 = 1;
        g g2 = bd2.d().a(this.d.remaining());
        try {
            g2.b(this.d);
            this.d.clear();
            n2 = 0;
            g g3 = g2;
            return g3;
        }
        finally {
            if (n2 != 0) {
                g2.ad();
            }
        }
    }

    @Override
    public /* synthetic */ Object b(bd bd2) {
        return this.a(bd2);
    }
}

