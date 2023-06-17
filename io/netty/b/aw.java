/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.at;
import io.netty.b.ax;
import io.netty.b.g;
import io.netty.util.p;
import io.netty.util.t;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

final class aw
extends at {
    private static final p k = new ax();

    static aw Q(int n2) {
        aw aw2 = (aw)k.a();
        aw2.O(1);
        aw2.a(n2);
        return aw2;
    }

    private aw(t t2, int n2) {
        super(t2, n2);
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
        return ((ByteBuffer)this.f).get(this.P(n2));
    }

    @Override
    protected short d(int n2) {
        return ((ByteBuffer)this.f).getShort(this.P(n2));
    }

    @Override
    protected int e(int n2) {
        n2 = this.P(n2);
        return (((ByteBuffer)this.f).get(n2) & 0xFF) << 16 | (((ByteBuffer)this.f).get(n2 + 1) & 0xFF) << 8 | ((ByteBuffer)this.f).get(n2 + 2) & 0xFF;
    }

    @Override
    protected int K(int n2) {
        return ((ByteBuffer)this.f).getInt(this.P(n2));
    }

    @Override
    protected long L(int n2) {
        return ((ByteBuffer)this.f).getLong(this.P(n2));
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
        ByteBuffer byteBuffer = bl2 ? this.d() : ((ByteBuffer)this.f).duplicate();
        n2 = this.P(n2);
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
        this.a(n2, outputStream, n3, false);
        return this;
    }

    private void a(int n2, OutputStream outputStream, int n3, boolean bl2) {
        this.q(n2, n3);
        if (n3 == 0) {
            return;
        }
        byte[] arrby = new byte[n3];
        ByteBuffer byteBuffer = bl2 ? this.d() : ((ByteBuffer)this.f).duplicate();
        byteBuffer.clear().position(this.P(n2));
        byteBuffer.get(arrby);
        outputStream.write(arrby);
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
        ((ByteBuffer)this.f).put(this.P(n2), (byte)n3);
    }

    @Override
    protected void n(int n2, int n3) {
        ((ByteBuffer)this.f).putShort(this.P(n2), (short)n3);
    }

    @Override
    protected void o(int n2, int n3) {
        n2 = this.P(n2);
        ((ByteBuffer)this.f).put(n2, (byte)(n3 >>> 16));
        ((ByteBuffer)this.f).put(n2 + 1, (byte)(n3 >>> 8));
        ((ByteBuffer)this.f).put(n2 + 2, (byte)n3);
    }

    @Override
    protected void p(int n2, int n3) {
        ((ByteBuffer)this.f).putInt(this.P(n2), n3);
    }

    @Override
    protected void b(int n2, long l2) {
        ((ByteBuffer)this.f).putLong(this.P(n2), l2);
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        this.a(n2, n4, n3, g2.j());
        if (g2.W()) {
            this.b(n2, g2.X(), g2.Y() + n3, n4);
        } else if (g2.T() > 0) {
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
        n2 = this.P(n2);
        byteBuffer.clear().position(n2).limit(n2 + n4);
        byteBuffer.put(arrby, n3, n4);
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
        if (n4 <= 0) {
            return n4;
        }
        ByteBuffer byteBuffer = this.d();
        byteBuffer.clear().position(this.P(n2));
        byteBuffer.put(arrby, 0, n4);
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
        g2.b(this, n2, n3);
        return g2;
    }

    @Override
    public int T() {
        return 1;
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        this.q(n2, n3);
        n2 = this.P(n2);
        return ((ByteBuffer)((ByteBuffer)this.f).duplicate().position(n2).limit(n2 + n3)).slice();
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        return new ByteBuffer[]{this.j(n2, n3)};
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
        return false;
    }

    @Override
    public long aa() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected p e() {
        return k;
    }

    @Override
    protected /* synthetic */ ByteBuffer a(Object object) {
        return this.c((ByteBuffer)object);
    }

    /* synthetic */ aw(t t2, int n2, ax ax2) {
        this(t2, n2);
    }
}

