/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

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

public class bl
extends e {
    private final h d;
    private byte[] e;
    private ByteBuffer f;

    protected bl(h h2, int n2, int n3) {
        this(h2, new byte[n2], 0, 0, n3);
    }

    protected bl(h h2, byte[] arrby, int n2) {
        this(h2, arrby, 0, arrby.length, n2);
    }

    private bl(h h2, byte[] arrby, int n2, int n3, int n4) {
        super(n4);
        if (h2 == null) {
            throw new NullPointerException("alloc");
        }
        if (arrby == null) {
            throw new NullPointerException("initialArray");
        }
        if (arrby.length > n4) {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", arrby.length, n4));
        }
        this.d = h2;
        this.a(arrby);
        this.a(n2, n3);
    }

    private void a(byte[] arrby) {
        this.e = arrby;
        this.f = null;
    }

    @Override
    public h l() {
        return this.d;
    }

    @Override
    public ByteOrder m() {
        return ByteOrder.BIG_ENDIAN;
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public int j() {
        this.b();
        return this.e.length;
    }

    @Override
    public g f(int n2) {
        this.b();
        if (n2 < 0 || n2 > this.k()) {
            throw new IllegalArgumentException("newCapacity: " + n2);
        }
        int n3 = this.e.length;
        if (n2 > n3) {
            byte[] arrby = new byte[n2];
            System.arraycopy(this.e, 0, arrby, 0, this.e.length);
            this.a(arrby);
        } else if (n2 < n3) {
            byte[] arrby = new byte[n2];
            int n4 = this.p();
            if (n4 < n2) {
                int n5 = this.q();
                if (n5 > n2) {
                    n5 = n2;
                    this.h(n5);
                }
                System.arraycopy(this.e, n4, arrby, n4, n5 - n4);
            } else {
                this.a(n2, n2);
            }
            this.a(arrby);
        }
        return this;
    }

    @Override
    public boolean W() {
        return true;
    }

    @Override
    public byte[] X() {
        this.b();
        return this.e;
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public boolean Z() {
        return false;
    }

    @Override
    public long aa() {
        throw new UnsupportedOperationException();
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.b(n2, n4, n3, g2.j());
        if (g2.Z()) {
            u.a(this.e, n2, g2.aa() + (long)n3, (long)n4);
        } else if (g2.W()) {
            this.a(n2, g2.X(), g2.Y() + n3, n4);
        } else {
            g2.b(n3, this.e, n2, n4);
        }
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.b(n2, n4, n3, arrby.length);
        System.arraycopy(this.e, n2, arrby, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        this.b();
        byteBuffer.put(this.e, n2, Math.min(this.j() - n2, byteBuffer.remaining()));
        return this;
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.b();
        outputStream.write(this.e, n2, n3);
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        this.b();
        return this.a(n2, gatheringByteChannel, n3, false);
    }

    private int a(int n2, GatheringByteChannel gatheringByteChannel, int n3, boolean bl2) {
        this.b();
        ByteBuffer byteBuffer = bl2 ? this.d() : ByteBuffer.wrap(this.e);
        return gatheringByteChannel.write((ByteBuffer)byteBuffer.clear().position(n2).limit(n2 + n3));
    }

    @Override
    public int a(GatheringByteChannel gatheringByteChannel, int n2) {
        this.N(n2);
        int n3 = this.a(this.b, gatheringByteChannel, n2, true);
        this.b += n3;
        return n3;
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        this.a(n2, n4, n3, g2.j());
        if (g2.Z()) {
            u.a(g2.aa() + (long)n3, this.e, n2, (long)n4);
        } else if (g2.W()) {
            this.b(n2, g2.X(), g2.Y() + n3, n4);
        } else {
            g2.a(n3, this.e, n2, n4);
        }
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        this.a(n2, n4, n3, arrby.length);
        System.arraycopy(arrby, n3, this.e, n2, n4);
        return this;
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        this.b();
        byteBuffer.get(this.e, n2, byteBuffer.remaining());
        return this;
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        this.b();
        return inputStream.read(this.e, n2, n3);
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.b();
        try {
            return scatteringByteChannel.read((ByteBuffer)this.d().clear().position(n2).limit(n2 + n3));
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
    public ByteBuffer j(int n2, int n3) {
        this.b();
        return ByteBuffer.wrap(this.e, n2, n3).slice();
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        return new ByteBuffer[]{this.j(n2, n3)};
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.q(n2, n3);
        return (ByteBuffer)this.d().clear().position(n2).limit(n2 + n3);
    }

    @Override
    public byte m(int n2) {
        this.b();
        return this.c(n2);
    }

    @Override
    protected byte c(int n2) {
        return this.e[n2];
    }

    @Override
    public short o(int n2) {
        this.b();
        return this.d(n2);
    }

    @Override
    protected short d(int n2) {
        return (short)(this.e[n2] << 8 | this.e[n2 + 1] & 0xFF);
    }

    @Override
    public int r(int n2) {
        this.b();
        return this.e(n2);
    }

    @Override
    protected int e(int n2) {
        return (this.e[n2] & 0xFF) << 16 | (this.e[n2 + 1] & 0xFF) << 8 | this.e[n2 + 2] & 0xFF;
    }

    @Override
    public int s(int n2) {
        this.b();
        return this.K(n2);
    }

    @Override
    protected int K(int n2) {
        return (this.e[n2] & 0xFF) << 24 | (this.e[n2 + 1] & 0xFF) << 16 | (this.e[n2 + 2] & 0xFF) << 8 | this.e[n2 + 3] & 0xFF;
    }

    @Override
    public long u(int n2) {
        this.b();
        return this.L(n2);
    }

    @Override
    protected long L(int n2) {
        return ((long)this.e[n2] & 0xFFL) << 56 | ((long)this.e[n2 + 1] & 0xFFL) << 48 | ((long)this.e[n2 + 2] & 0xFFL) << 40 | ((long)this.e[n2 + 3] & 0xFFL) << 32 | ((long)this.e[n2 + 4] & 0xFFL) << 24 | ((long)this.e[n2 + 5] & 0xFFL) << 16 | ((long)this.e[n2 + 6] & 0xFFL) << 8 | (long)this.e[n2 + 7] & 0xFFL;
    }

    @Override
    public g b(int n2, int n3) {
        this.b();
        this.m(n2, n3);
        return this;
    }

    @Override
    protected void m(int n2, int n3) {
        this.e[n2] = (byte)n3;
    }

    @Override
    public g c(int n2, int n3) {
        this.b();
        this.n(n2, n3);
        return this;
    }

    @Override
    protected void n(int n2, int n3) {
        this.e[n2] = (byte)(n3 >>> 8);
        this.e[n2 + 1] = (byte)n3;
    }

    @Override
    public g d(int n2, int n3) {
        this.b();
        this.o(n2, n3);
        return this;
    }

    @Override
    protected void o(int n2, int n3) {
        this.e[n2] = (byte)(n3 >>> 16);
        this.e[n2 + 1] = (byte)(n3 >>> 8);
        this.e[n2 + 2] = (byte)n3;
    }

    @Override
    public g e(int n2, int n3) {
        this.b();
        this.p(n2, n3);
        return this;
    }

    @Override
    protected void p(int n2, int n3) {
        this.e[n2] = (byte)(n3 >>> 24);
        this.e[n2 + 1] = (byte)(n3 >>> 16);
        this.e[n2 + 2] = (byte)(n3 >>> 8);
        this.e[n2 + 3] = (byte)n3;
    }

    @Override
    public g a(int n2, long l2) {
        this.b();
        this.b(n2, l2);
        return this;
    }

    @Override
    protected void b(int n2, long l2) {
        this.e[n2] = (byte)(l2 >>> 56);
        this.e[n2 + 1] = (byte)(l2 >>> 48);
        this.e[n2 + 2] = (byte)(l2 >>> 40);
        this.e[n2 + 3] = (byte)(l2 >>> 32);
        this.e[n2 + 4] = (byte)(l2 >>> 24);
        this.e[n2 + 5] = (byte)(l2 >>> 16);
        this.e[n2 + 6] = (byte)(l2 >>> 8);
        this.e[n2 + 7] = (byte)l2;
    }

    @Override
    public g h(int n2, int n3) {
        this.q(n2, n3);
        byte[] arrby = new byte[n3];
        System.arraycopy(this.e, n2, arrby, 0, n3);
        return new bl(this.l(), arrby, this.k());
    }

    private ByteBuffer d() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null) {
            this.f = byteBuffer = ByteBuffer.wrap(this.e);
        }
        return byteBuffer;
    }

    @Override
    protected void c() {
        this.e = null;
    }

    @Override
    public g n() {
        return null;
    }
}

