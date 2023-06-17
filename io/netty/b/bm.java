/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.bh;
import io.netty.b.bo;
import io.netty.b.e;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.util.c.u;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class bm
extends e {
    private static final boolean d = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    private final h e;
    private long f;
    private ByteBuffer g;
    private ByteBuffer h;
    private int i;
    private boolean j;

    protected bm(h h2, int n2, int n3) {
        super(n3);
        if (h2 == null) {
            throw new NullPointerException("alloc");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("initialCapacity: " + n2);
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("maxCapacity: " + n3);
        }
        if (n2 > n3) {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", n2, n3));
        }
        this.e = h2;
        this.d(this.P(n2));
    }

    protected bm(h h2, ByteBuffer byteBuffer, int n2) {
        super(n2);
        if (h2 == null) {
            throw new NullPointerException("alloc");
        }
        if (byteBuffer == null) {
            throw new NullPointerException("initialBuffer");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("initialBuffer is not a direct buffer.");
        }
        if (byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("initialBuffer is a read-only buffer.");
        }
        int n3 = byteBuffer.remaining();
        if (n3 > n2) {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", n3, n2));
        }
        this.e = h2;
        this.j = true;
        this.d(byteBuffer.slice().order(ByteOrder.BIG_ENDIAN));
        this.h(n3);
    }

    protected ByteBuffer P(int n2) {
        return ByteBuffer.allocateDirect(n2);
    }

    protected void c(ByteBuffer byteBuffer) {
        u.a(byteBuffer);
    }

    private void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            if (this.j) {
                this.j = false;
            } else {
                this.c(byteBuffer2);
            }
        }
        this.g = byteBuffer;
        this.f = u.b(byteBuffer);
        this.h = null;
        this.i = byteBuffer.remaining();
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public int j() {
        return this.i;
    }

    @Override
    public g f(int n2) {
        this.b();
        if (n2 < 0 || n2 > this.k()) {
            throw new IllegalArgumentException("newCapacity: " + n2);
        }
        int n3 = this.p();
        int n4 = this.q();
        int n5 = this.i;
        if (n2 > n5) {
            ByteBuffer byteBuffer = this.g;
            ByteBuffer byteBuffer2 = this.P(n2);
            byteBuffer.position(0).limit(byteBuffer.capacity());
            byteBuffer2.position(0).limit(byteBuffer.capacity());
            byteBuffer2.put(byteBuffer);
            byteBuffer2.clear();
            this.d(byteBuffer2);
        } else if (n2 < n5) {
            ByteBuffer byteBuffer = this.g;
            ByteBuffer byteBuffer3 = this.P(n2);
            if (n3 < n2) {
                if (n4 > n2) {
                    n4 = n2;
                    this.h(n4);
                }
                byteBuffer.position(n3).limit(n4);
                byteBuffer3.position(n3).limit(n4);
                byteBuffer3.put(byteBuffer);
                byteBuffer3.clear();
            } else {
                this.a(n2, n2);
            }
            this.d(byteBuffer3);
        }
        return this;
    }

    @Override
    public h l() {
        return this.e;
    }

    @Override
    public ByteOrder m() {
        return ByteOrder.BIG_ENDIAN;
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
        return this.f;
    }

    @Override
    protected byte c(int n2) {
        return u.c(this.Q(n2));
    }

    @Override
    protected short d(int n2) {
        short s2 = u.d(this.Q(n2));
        return d ? s2 : Short.reverseBytes(s2);
    }

    @Override
    protected int e(int n2) {
        long l2 = this.Q(n2);
        return (u.c(l2) & 0xFF) << 16 | (u.c(l2 + 1L) & 0xFF) << 8 | u.c(l2 + 2L) & 0xFF;
    }

    @Override
    protected int K(int n2) {
        int n3 = u.e(this.Q(n2));
        return d ? n3 : Integer.reverseBytes(n3);
    }

    @Override
    protected long L(int n2) {
        long l2 = u.f(this.Q(n2));
        return d ? l2 : Long.reverseBytes(l2);
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
            u.a(this.Q(n2), g2.aa() + (long)n3, (long)n4);
        } else if (g2.W()) {
            u.a(this.Q(n2), g2.X(), g2.Y() + n3, (long)n4);
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
            u.a(this.Q(n2), arrby, n3, (long)n4);
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
        if (byteBuffer == null) {
            throw new NullPointerException("dst");
        }
        int n3 = Math.min(this.j() - n2, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = bl2 ? this.d() : this.g.duplicate();
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
    protected void m(int n2, int n3) {
        u.a(this.Q(n2), (byte)n3);
    }

    @Override
    protected void n(int n2, int n3) {
        u.a(this.Q(n2), d ? (short)n3 : Short.reverseBytes((short)n3));
    }

    @Override
    protected void o(int n2, int n3) {
        long l2 = this.Q(n2);
        u.a(l2, (byte)(n3 >>> 16));
        u.a(l2 + 1L, (byte)(n3 >>> 8));
        u.a(l2 + 2L, (byte)n3);
    }

    @Override
    protected void p(int n2, int n3) {
        u.a(this.Q(n2), d ? n3 : Integer.reverseBytes(n3));
    }

    @Override
    protected void b(int n2, long l2) {
        u.a(this.Q(n2), d ? l2 : Long.reverseBytes(l2));
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
                u.a(g2.aa() + (long)n3, this.Q(n2), (long)n4);
            } else if (g2.W()) {
                u.a(g2.X(), g2.Y() + n3, this.Q(n2), (long)n4);
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
            u.a(arrby, n3, this.Q(n2), (long)n4);
        }
        return this;
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        this.b();
        ByteBuffer byteBuffer2 = this.d();
        if (byteBuffer == byteBuffer2) {
            byteBuffer = byteBuffer.duplicate();
        }
        byteBuffer2.clear().position(n2).limit(n2 + byteBuffer.remaining());
        byteBuffer2.put(byteBuffer);
        return this;
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.b();
        if (n3 != 0) {
            byte[] arrby = new byte[n3];
            u.a(this.Q(n2), arrby, 0, (long)n3);
            outputStream.write(arrby);
        }
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        return this.a(n2, gatheringByteChannel, n3, false);
    }

    private int a(int n2, GatheringByteChannel gatheringByteChannel, int n3, boolean bl2) {
        this.b();
        if (n3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = bl2 ? this.d() : this.g.duplicate();
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
    public int a(int n2, InputStream inputStream, int n3) {
        this.q(n2, n3);
        byte[] arrby = new byte[n3];
        int n4 = inputStream.read(arrby);
        if (n4 > 0) {
            u.a(arrby, 0, this.Q(n2), (long)n4);
        }
        return n4;
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.b();
        ByteBuffer byteBuffer = this.d();
        byteBuffer.clear().position(n2).limit(n2 + n3);
        try {
            return scatteringByteChannel.read(byteBuffer);
        }
        catch (ClosedChannelException closedChannelException) {
            return -1;
        }
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
    public g h(int n2, int n3) {
        this.q(n2, n3);
        g g2 = this.l().d(n3, this.k());
        if (n3 != 0) {
            if (g2.Z()) {
                u.a(this.Q(n2), g2.aa(), (long)n3);
                g2.a(0, n3);
            } else {
                g2.b(this, n2, n3);
            }
        }
        return g2;
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.q(n2, n3);
        return (ByteBuffer)this.d().clear().position(n2).limit(n2 + n3);
    }

    private ByteBuffer d() {
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer == null) {
            this.h = byteBuffer = this.g.duplicate();
        }
        return byteBuffer;
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        this.q(n2, n3);
        return ((ByteBuffer)this.g.duplicate().position(n2).limit(n2 + n3)).slice();
    }

    @Override
    protected void c() {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            return;
        }
        this.g = null;
        if (!this.j) {
            this.c(byteBuffer);
        }
    }

    @Override
    public g n() {
        return null;
    }

    long Q(int n2) {
        return this.f + (long)n2;
    }

    @Override
    protected bh a() {
        return new bo(this);
    }
}

