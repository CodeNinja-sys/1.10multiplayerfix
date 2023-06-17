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

public class bk
extends e {
    private final h d;
    private ByteBuffer e;
    private ByteBuffer f;
    private int g;
    private boolean h;

    protected bk(h h2, int n2, int n3) {
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
        this.d = h2;
        this.d(ByteBuffer.allocateDirect(n2));
    }

    protected bk(h h2, ByteBuffer byteBuffer, int n2) {
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
        this.d = h2;
        this.h = true;
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
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            if (this.h) {
                this.h = false;
            } else {
                this.c(byteBuffer2);
            }
        }
        this.e = byteBuffer;
        this.f = null;
        this.g = byteBuffer.remaining();
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public int j() {
        return this.g;
    }

    @Override
    public g f(int n2) {
        this.b();
        if (n2 < 0 || n2 > this.k()) {
            throw new IllegalArgumentException("newCapacity: " + n2);
        }
        int n3 = this.p();
        int n4 = this.q();
        int n5 = this.g;
        if (n2 > n5) {
            ByteBuffer byteBuffer = this.e;
            ByteBuffer byteBuffer2 = this.P(n2);
            byteBuffer.position(0).limit(byteBuffer.capacity());
            byteBuffer2.position(0).limit(byteBuffer.capacity());
            byteBuffer2.put(byteBuffer);
            byteBuffer2.clear();
            this.d(byteBuffer2);
        } else if (n2 < n5) {
            ByteBuffer byteBuffer = this.e;
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
        return this.d;
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
        return false;
    }

    @Override
    public long aa() {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte m(int n2) {
        this.b();
        return this.c(n2);
    }

    @Override
    protected byte c(int n2) {
        return this.e.get(n2);
    }

    @Override
    public short o(int n2) {
        this.b();
        return this.d(n2);
    }

    @Override
    protected short d(int n2) {
        return this.e.getShort(n2);
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
        return this.e.getInt(n2);
    }

    @Override
    public long u(int n2) {
        this.b();
        return this.L(n2);
    }

    @Override
    protected long L(int n2) {
        return this.e.getLong(n2);
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
        this.a(n2, arrby, n3, n4, false);
        return this;
    }

    private void a(int n2, byte[] arrby, int n3, int n4, boolean bl2) {
        this.b(n2, n4, n3, arrby.length);
        if (n3 < 0 || n3 > arrby.length - n4) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", n3, n4, arrby.length));
        }
        ByteBuffer byteBuffer = bl2 ? this.d() : this.e.duplicate();
        byteBuffer.clear().position(n2).limit(n2 + n4);
        byteBuffer.get(arrby, n3, n4);
    }

    @Override
    public g a(byte[] arrby, int n2, int n3) {
        this.N(n3);
        this.a(this.b, arrby, n2, n3, true);
        this.b += n3;
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
        ByteBuffer byteBuffer2 = bl2 ? this.d() : this.e.duplicate();
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
    public g b(int n2, int n3) {
        this.b();
        this.m(n2, n3);
        return this;
    }

    @Override
    protected void m(int n2, int n3) {
        this.e.put(n2, (byte)n3);
    }

    @Override
    public g c(int n2, int n3) {
        this.b();
        this.n(n2, n3);
        return this;
    }

    @Override
    protected void n(int n2, int n3) {
        this.e.putShort(n2, (short)n3);
    }

    @Override
    public g d(int n2, int n3) {
        this.b();
        this.o(n2, n3);
        return this;
    }

    @Override
    protected void o(int n2, int n3) {
        this.b(n2, (int)((byte)(n3 >>> 16)));
        this.b(n2 + 1, (int)((byte)(n3 >>> 8)));
        this.b(n2 + 2, (int)((byte)n3));
    }

    @Override
    public g e(int n2, int n3) {
        this.b();
        this.p(n2, n3);
        return this;
    }

    @Override
    protected void p(int n2, int n3) {
        this.e.putInt(n2, n3);
    }

    @Override
    public g a(int n2, long l2) {
        this.b();
        this.b(n2, l2);
        return this;
    }

    @Override
    protected void b(int n2, long l2) {
        this.e.putLong(n2, l2);
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        this.a(n2, n4, n3, g2.j());
        if (g2.T() > 0) {
            for (ByteBuffer byteBuffer : g2.l(n3, n4)) {
                int n5 = byteBuffer.remaining();
                this.b(n2, byteBuffer);
                n2 += n5;
            }
        } else {
            g2.a(n3, this, n2, n4);
        }
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        this.a(n2, n4, n3, arrby.length);
        ByteBuffer byteBuffer = this.d();
        byteBuffer.clear().position(n2).limit(n2 + n4);
        byteBuffer.put(arrby, n3, n4);
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
        this.a(n2, outputStream, n3, false);
        return this;
    }

    private void a(int n2, OutputStream outputStream, int n3, boolean bl2) {
        this.b();
        if (n3 == 0) {
            return;
        }
        if (this.e.hasArray()) {
            outputStream.write(this.e.array(), n2 + this.e.arrayOffset(), n3);
        } else {
            byte[] arrby = new byte[n3];
            ByteBuffer byteBuffer = bl2 ? this.d() : this.e.duplicate();
            byteBuffer.clear().position(n2);
            byteBuffer.get(arrby);
            outputStream.write(arrby);
        }
    }

    @Override
    public g a(OutputStream outputStream, int n2) {
        this.N(n2);
        this.a(this.b, outputStream, n2, true);
        this.b += n2;
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
        ByteBuffer byteBuffer = bl2 ? this.d() : this.e.duplicate();
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
        this.b();
        if (this.e.hasArray()) {
            return inputStream.read(this.e.array(), this.e.arrayOffset() + n2, n3);
        }
        byte[] arrby = new byte[n3];
        int n4 = inputStream.read(arrby);
        if (n4 <= 0) {
            return n4;
        }
        ByteBuffer byteBuffer = this.d();
        byteBuffer.clear().position(n2);
        byteBuffer.put(arrby, 0, n4);
        return n4;
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.b();
        ByteBuffer byteBuffer = this.d();
        byteBuffer.clear().position(n2).limit(n2 + n3);
        try {
            return scatteringByteChannel.read(this.f);
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
        ByteBuffer byteBuffer;
        this.b();
        try {
            byteBuffer = (ByteBuffer)this.e.duplicate().clear().position(n2).limit(n2 + n3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IndexOutOfBoundsException("Too many bytes to read - Need " + (n2 + n3));
        }
        return this.l().d(n3, this.k()).b(byteBuffer);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.q(n2, n3);
        return (ByteBuffer)this.d().clear().position(n2).limit(n2 + n3);
    }

    private ByteBuffer d() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null) {
            this.f = byteBuffer = this.e.duplicate();
        }
        return byteBuffer;
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        this.q(n2, n3);
        return ((ByteBuffer)this.e.duplicate().position(n2).limit(n2 + n3)).slice();
    }

    @Override
    protected void c() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            return;
        }
        this.e = null;
        if (!this.h) {
            this.c(byteBuffer);
        }
    }

    @Override
    public g n() {
        return null;
    }
}

