/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.bk;
import io.netty.b.e;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.util.c.ad;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

class bd
extends e {
    protected final ByteBuffer d;
    private final h e;
    private ByteBuffer f;

    bd(h h2, ByteBuffer byteBuffer) {
        super(byteBuffer.remaining());
        if (!byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("must be a readonly buffer: " + ad.a(byteBuffer));
        }
        this.e = h2;
        this.d = byteBuffer.slice().order(ByteOrder.BIG_ENDIAN);
        this.h(this.d.limit());
    }

    @Override
    protected void c() {
    }

    @Override
    public byte m(int n2) {
        this.b();
        return this.c(n2);
    }

    @Override
    protected byte c(int n2) {
        return this.d.get(n2);
    }

    @Override
    public short o(int n2) {
        this.b();
        return this.d(n2);
    }

    @Override
    protected short d(int n2) {
        return this.d.getShort(n2);
    }

    @Override
    public int r(int n2) {
        this.b();
        return this.e(n2);
    }

    @Override
    protected int e(int n2) {
        return (this.m(n2) & 0xFF) << 16 | (this.m(n2 + 1) & 0xFF) << 8 | this.m(n2 + 2) & 0xFF;
    }

    @Override
    public int s(int n2) {
        this.b();
        return this.K(n2);
    }

    @Override
    protected int K(int n2) {
        return this.d.getInt(n2);
    }

    @Override
    public long u(int n2) {
        this.b();
        return this.L(n2);
    }

    @Override
    protected long L(int n2) {
        return this.d.getLong(n2);
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.b(n2, n4, n3, g2.j());
        if (g2.W()) {
            this.a(n2, g2.X(), g2.Y() + n3, n4);
        } else if (g2.T() > 0) {
            for (ByteBuffer byteBuffer : g2.l(n3, n4)) {
                int n5 = byteBuffer.remaining();
                this.a(n2, byteBuffer);
                n2 += n5;
            }
        } else {
            g2.b(n3, this, n2, n4);
        }
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.b(n2, n4, n3, arrby.length);
        if (n3 < 0 || n3 > arrby.length - n4) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", n3, n4, arrby.length));
        }
        ByteBuffer byteBuffer = this.d();
        byteBuffer.clear().position(n2).limit(n2 + n4);
        byteBuffer.get(arrby, n3, n4);
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
    protected void m(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void n(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void o(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void p(int n2, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    protected void b(int n2, long l2) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public int j() {
        return this.k();
    }

    @Override
    public g f(int n2) {
        throw new ReadOnlyBufferException();
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
    public g n() {
        return null;
    }

    @Override
    public boolean o() {
        return this.d.isDirect();
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.b();
        if (n3 == 0) {
            return this;
        }
        if (this.d.hasArray()) {
            outputStream.write(this.d.array(), n2 + this.d.arrayOffset(), n3);
        } else {
            byte[] arrby = new byte[n3];
            ByteBuffer byteBuffer = this.d();
            byteBuffer.clear().position(n2);
            byteBuffer.get(arrby);
            outputStream.write(arrby);
        }
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        this.b();
        if (n3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.d();
        byteBuffer.clear().position(n2).limit(n2 + n3);
        return gatheringByteChannel.write(byteBuffer);
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        throw new ReadOnlyBufferException();
    }

    protected final ByteBuffer d() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null) {
            this.f = byteBuffer = this.d.duplicate();
        }
        return byteBuffer;
    }

    @Override
    public g h(int n2, int n3) {
        ByteBuffer byteBuffer;
        this.b();
        try {
            byteBuffer = (ByteBuffer)this.d().clear().position(n2).limit(n2 + n3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IndexOutOfBoundsException("Too many bytes to read - Need " + (n2 + n3));
        }
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(n3);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.order(this.m());
        byteBuffer2.clear();
        return new bk(this.l(), byteBuffer2, this.k());
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
        return (ByteBuffer)this.d.duplicate().position(n2).limit(n2 + n3);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.b();
        return (ByteBuffer)this.d().clear().position(n2).limit(n2 + n3);
    }

    @Override
    public boolean W() {
        return this.d.hasArray();
    }

    @Override
    public byte[] X() {
        return this.d.array();
    }

    @Override
    public int Y() {
        return this.d.arrayOffset();
    }

    @Override
    public boolean Z() {
        return false;
    }

    @Override
    public long aa() {
        throw new UnsupportedOperationException();
    }
}

