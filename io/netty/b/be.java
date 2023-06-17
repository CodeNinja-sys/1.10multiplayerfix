/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.bd;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.util.c.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class be
extends bd {
    private static final boolean e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    private final long f;

    be(h h2, ByteBuffer byteBuffer) {
        super(h2, byteBuffer);
        this.f = u.b(byteBuffer);
    }

    @Override
    protected byte c(int n2) {
        return u.c(this.P(n2));
    }

    @Override
    protected short d(int n2) {
        short s2 = u.d(this.P(n2));
        return e ? s2 : Short.reverseBytes(s2);
    }

    @Override
    protected int e(int n2) {
        long l2 = this.P(n2);
        return (u.c(l2) & 0xFF) << 16 | (u.c(l2 + 1L) & 0xFF) << 8 | u.c(l2 + 2L) & 0xFF;
    }

    @Override
    protected int K(int n2) {
        int n3 = u.e(this.P(n2));
        return e ? n3 : Integer.reverseBytes(n3);
    }

    @Override
    protected long L(int n2) {
        long l2 = u.f(this.P(n2));
        return e ? l2 : Long.reverseBytes(l2);
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.q(n2, n4);
        if (g2 == null) {
            throw new NullPointerException("dst");
        }
        if (n3 < 0 || n3 > g2.j() - n4) {
            throw new IndexOutOfBoundsException("dstIndex: " + n3);
        }
        if (g2.Z()) {
            u.a(this.P(n2), g2.aa() + (long)n3, (long)n4);
        } else if (g2.W()) {
            u.a(this.P(n2), g2.X(), g2.Y() + n3, (long)n4);
        } else {
            g2.b(n3, this, n2, n4);
        }
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.q(n2, n4);
        if (arrby == null) {
            throw new NullPointerException("dst");
        }
        if (n3 < 0 || n3 > arrby.length - n4) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", n3, n4, arrby.length));
        }
        if (n4 != 0) {
            u.a(this.P(n2), arrby, n3, (long)n4);
        }
        return this;
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        this.M(n2);
        if (byteBuffer == null) {
            throw new NullPointerException("dst");
        }
        int n3 = Math.min(this.j() - n2, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = this.d();
        byteBuffer2.clear().position(n2).limit(n2 + n3);
        byteBuffer.put(byteBuffer2);
        return this;
    }

    @Override
    public g h(int n2, int n3) {
        this.q(n2, n3);
        g g2 = this.l().d(n3, this.k());
        if (n3 != 0) {
            if (g2.Z()) {
                u.a(this.P(n2), g2.aa(), (long)n3);
                g2.a(0, n3);
            } else {
                g2.b(this, n2, n3);
            }
        }
        return g2;
    }

    private long P(int n2) {
        return this.f + (long)n2;
    }
}

