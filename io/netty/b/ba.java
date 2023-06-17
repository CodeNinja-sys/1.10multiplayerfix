/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ak;
import io.netty.b.at;
import io.netty.b.bb;
import io.netty.b.bh;
import io.netty.b.bo;
import io.netty.b.g;
import io.netty.util.c.u;
import io.netty.util.p;
import io.netty.util.t;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

final class ba
extends at {
    private static final boolean k = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    private static final p l = new bb();
    private long m;

    static ba Q(int n2) {
        ba ba2 = (ba)l.a();
        ba2.O(1);
        ba2.a(n2);
        return ba2;
    }

    private ba(t t2, int n2) {
        super(t2, n2);
    }

    @Override
    void a(ak ak2, long l2, int n2, int n3, int n4) {
        super.a(ak2, l2, n2, n3, n4);
        this.f();
    }

    @Override
    void a(ak ak2, int n2) {
        super.a(ak2, n2);
        this.f();
    }

    private void f() {
        this.m = u.b((ByteBuffer)this.f) + (long)this.g;
    }

    protected ByteBuffer c(ByteBuffer byteBuffer) {
        return byteBuffer.duplicate();
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    protected byte c(int n2) {
        return u.c(this.R(n2));
    }

    @Override
    protected short d(int n2) {
        short s2 = u.d(this.R(n2));
        return k ? s2 : Short.reverseBytes(s2);
    }

    @Override
    protected int e(int n2) {
        long l2 = this.R(n2);
        return (u.c(l2) & 0xFF) << 16 | (u.c(l2 + 1L) & 0xFF) << 8 | u.c(l2 + 2L) & 0xFF;
    }

    @Override
    protected int K(int n2) {
        int n3 = u.e(this.R(n2));
        return k ? n3 : Integer.reverseBytes(n3);
    }

    @Override
    protected long L(int n2) {
        long l2 = u.f(this.R(n2));
        return k ? l2 : Long.reverseBytes(l2);
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
        if (n4 != 0) {
            if (g2.Z()) {
                u.a(this.R(n2), g2.aa() + (long)n3, (long)n4);
            } else if (g2.W()) {
                u.a(this.R(n2), g2.X(), g2.Y() + n3, (long)n4);
            } else {
                g2.b(n3, this, n2, n4);
            }
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
            throw new IndexOutOfBoundsException("dstIndex: " + n3);
        }
        if (n4 != 0) {
            u.a(this.R(n2), arrby, n3, (long)n4);
        }
        return this;
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        this.a(n2, byteBuffer, false);
        return this;
    }

    private void a(int n2, ByteBuffer byteBuffer, boolean bl2) {
        this.M(n2);
        int n3 = Math.min(this.j() - n2, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = bl2 ? this.d() : ((ByteBuffer)this.f).duplicate();
        n2 = this.P(n2);
        byteBuffer2.clear().position(n2).limit(n2 + n3);
        byteBuffer.put(byteBuffer2);
    }

    @Override
    public g a(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.remaining();
        this.N(n2);
        this.a(this.b, byteBuffer, true);
        this.b += n2;
        return this;
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.q(n2, n3);
        if (n3 != 0) {
            byte[] arrby = new byte[n3];
            u.a(this.R(n2), arrby, 0, (long)n3);
            outputStream.write(arrby);
        }
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        return this.a(n2, gatheringByteChannel, n3, false);
    }

    private int a(int n2, GatheringByteChannel gatheringByteChannel, int n3, boolean bl2) {
        this.q(n2, n3);
        if (n3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = bl2 ? this.d() : ((ByteBuffer)this.f).duplicate();
        n2 = this.P(n2);
        byteBuffer.clear().position(n2).limit(n2 + n3);
        return gatheringByteChannel.write(byteBuffer);
    }

    @Override
    public int a(GatheringByteChannel gatheringByteChannel, int n2) {
        this.N(n2);
        int n3 = this.a(this.b, gatheringByteChannel, n2, true);
        this.b += n3;
        return n3;
    }

    @Override
    protected void m(int n2, int n3) {
        u.a(this.R(n2), (byte)n3);
    }

    @Override
    protected void n(int n2, int n3) {
        u.a(this.R(n2), k ? (short)n3 : Short.reverseBytes((short)n3));
    }

    @Override
    protected void o(int n2, int n3) {
        long l2 = this.R(n2);
        u.a(l2, (byte)(n3 >>> 16));
        u.a(l2 + 1L, (byte)(n3 >>> 8));
        u.a(l2 + 2L, (byte)n3);
    }

    @Override
    protected void p(int n2, int n3) {
        u.a(this.R(n2), k ? n3 : Integer.reverseBytes(n3));
    }

    @Override
    protected void b(int n2, long l2) {
        u.a(this.R(n2), k ? l2 : Long.reverseBytes(l2));
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        this.q(n2, n4);
        if (g2 == null) {
            throw new NullPointerException("src");
        }
        if (n3 < 0 || n3 > g2.j() - n4) {
            throw new IndexOutOfBoundsException("srcIndex: " + n3);
        }
        if (n4 != 0) {
            if (g2.Z()) {
                u.a(g2.aa() + (long)n3, this.R(n2), (long)n4);
            } else if (g2.W()) {
                u.a(g2.X(), g2.Y() + n3, this.R(n2), (long)n4);
            } else {
                g2.a(n3, this, n2, n4);
            }
        }
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        this.q(n2, n4);
        if (n4 != 0) {
            u.a(arrby, n3, this.R(n2), (long)n4);
        }
        return this;
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        this.q(n2, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = this.d();
        if (byteBuffer == byteBuffer2) {
            byteBuffer = byteBuffer.duplicate();
        }
        n2 = this.P(n2);
        byteBuffer2.clear().position(n2).limit(n2 + byteBuffer.remaining());
        byteBuffer2.put(byteBuffer);
        return this;
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        this.q(n2, n3);
        byte[] arrby = new byte[n3];
        int n4 = inputStream.read(arrby);
        if (n4 > 0) {
            u.a(arrby, 0, this.R(n2), (long)n4);
        }
        return n4;
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.q(n2, n3);
        ByteBuffer byteBuffer = this.d();
        n2 = this.P(n2);
        byteBuffer.clear().position(n2).limit(n2 + n3);
        try {
            return scatteringByteChannel.read(byteBuffer);
        }
        catch (ClosedChannelException closedChannelException) {
            return -1;
        }
    }

    @Override
    public g h(int n2, int n3) {
        this.q(n2, n3);
        g g2 = this.l().d(n3, this.k());
        if (n3 != 0) {
            if (g2.Z()) {
                u.a(this.R(n2), g2.aa(), (long)n3);
                g2.a(0, n3);
            } else {
                g2.b(this, n2, n3);
            }
        }
        return g2;
    }

    @Override
    public int T() {
        return 1;
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        return new ByteBuffer[]{this.j(n2, n3)};
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        this.q(n2, n3);
        n2 = this.P(n2);
        return ((ByteBuffer)((ByteBuffer)this.f).duplicate().position(n2).limit(n2 + n3)).slice();
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.q(n2, n3);
        n2 = this.P(n2);
        return (ByteBuffer)this.d().clear().position(n2).limit(n2 + n3);
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public byte[] X() {
        throw new UnsupportedOperationException("direct buffer");
    }

    @Override
    public int Y() {
        throw new UnsupportedOperationException("direct buffer");
    }

    @Override
    public boolean Z() {
        return true;
    }

    @Override
    public long aa() {
        return this.m;
    }

    private long R(int n2) {
        return this.m + (long)n2;
    }

    @Override
    protected p e() {
        return l;
    }

    @Override
    protected bh a() {
        return new bo(this);
    }

    @Override
    protected /* synthetic */ ByteBuffer a(Object object) {
        return this.c((ByteBuffer)object);
    }

    /* synthetic */ ba(t t2, int n2, bb bb2) {
        this(t2, n2);
    }
}

