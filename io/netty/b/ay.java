/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.at;
import io.netty.b.az;
import io.netty.b.g;
import io.netty.util.c.u;
import io.netty.util.p;
import io.netty.util.t;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

final class ay
extends at {
    private static final p k = new az();

    static ay Q(int n2) {
        ay ay2 = (ay)k.a();
        ay2.O(1);
        ay2.a(n2);
        return ay2;
    }

    private ay(t t2, int n2) {
        super(t2, n2);
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    protected byte c(int n2) {
        return ((byte[])this.f)[this.P(n2)];
    }

    @Override
    protected short d(int n2) {
        n2 = this.P(n2);
        return (short)(((byte[])this.f)[n2] << 8 | ((byte[])this.f)[n2 + 1] & 0xFF);
    }

    @Override
    protected int e(int n2) {
        n2 = this.P(n2);
        return (((byte[])this.f)[n2] & 0xFF) << 16 | (((byte[])this.f)[n2 + 1] & 0xFF) << 8 | ((byte[])this.f)[n2 + 2] & 0xFF;
    }

    @Override
    protected int K(int n2) {
        n2 = this.P(n2);
        return (((byte[])this.f)[n2] & 0xFF) << 24 | (((byte[])this.f)[n2 + 1] & 0xFF) << 16 | (((byte[])this.f)[n2 + 2] & 0xFF) << 8 | ((byte[])this.f)[n2 + 3] & 0xFF;
    }

    @Override
    protected long L(int n2) {
        n2 = this.P(n2);
        return ((long)((byte[])this.f)[n2] & 0xFFL) << 56 | ((long)((byte[])this.f)[n2 + 1] & 0xFFL) << 48 | ((long)((byte[])this.f)[n2 + 2] & 0xFFL) << 40 | ((long)((byte[])this.f)[n2 + 3] & 0xFFL) << 32 | ((long)((byte[])this.f)[n2 + 4] & 0xFFL) << 24 | ((long)((byte[])this.f)[n2 + 5] & 0xFFL) << 16 | ((long)((byte[])this.f)[n2 + 6] & 0xFFL) << 8 | (long)((byte[])this.f)[n2 + 7] & 0xFFL;
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.b(n2, n4, n3, g2.j());
        if (g2.Z()) {
            u.a((byte[])this.f, this.P(n2), g2.aa() + (long)n3, (long)n4);
        } else if (g2.W()) {
            this.a(n2, g2.X(), g2.Y() + n3, n4);
        } else {
            g2.b(n3, (byte[])this.f, this.P(n2), n4);
        }
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.b(n2, n4, n3, arrby.length);
        System.arraycopy(this.f, this.P(n2), arrby, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        this.M(n2);
        byteBuffer.put((byte[])this.f, this.P(n2), Math.min(this.j() - n2, byteBuffer.remaining()));
        return this;
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.q(n2, n3);
        outputStream.write((byte[])this.f, this.P(n2), n3);
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        return this.a(n2, gatheringByteChannel, n3, false);
    }

    private int a(int n2, GatheringByteChannel gatheringByteChannel, int n3, boolean bl2) {
        this.q(n2, n3);
        n2 = this.P(n2);
        ByteBuffer byteBuffer = bl2 ? this.d() : ByteBuffer.wrap((byte[])this.f);
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
    protected void m(int n2, int n3) {
        ((byte[])this.f)[this.P((int)n2)] = (byte)n3;
    }

    @Override
    protected void n(int n2, int n3) {
        n2 = this.P(n2);
        ((byte[])this.f)[n2] = (byte)(n3 >>> 8);
        ((byte[])this.f)[n2 + 1] = (byte)n3;
    }

    @Override
    protected void o(int n2, int n3) {
        n2 = this.P(n2);
        ((byte[])this.f)[n2] = (byte)(n3 >>> 16);
        ((byte[])this.f)[n2 + 1] = (byte)(n3 >>> 8);
        ((byte[])this.f)[n2 + 2] = (byte)n3;
    }

    @Override
    protected void p(int n2, int n3) {
        n2 = this.P(n2);
        ((byte[])this.f)[n2] = (byte)(n3 >>> 24);
        ((byte[])this.f)[n2 + 1] = (byte)(n3 >>> 16);
        ((byte[])this.f)[n2 + 2] = (byte)(n3 >>> 8);
        ((byte[])this.f)[n2 + 3] = (byte)n3;
    }

    @Override
    protected void b(int n2, long l2) {
        n2 = this.P(n2);
        ((byte[])this.f)[n2] = (byte)(l2 >>> 56);
        ((byte[])this.f)[n2 + 1] = (byte)(l2 >>> 48);
        ((byte[])this.f)[n2 + 2] = (byte)(l2 >>> 40);
        ((byte[])this.f)[n2 + 3] = (byte)(l2 >>> 32);
        ((byte[])this.f)[n2 + 4] = (byte)(l2 >>> 24);
        ((byte[])this.f)[n2 + 5] = (byte)(l2 >>> 16);
        ((byte[])this.f)[n2 + 6] = (byte)(l2 >>> 8);
        ((byte[])this.f)[n2 + 7] = (byte)l2;
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        this.a(n2, n4, n3, g2.j());
        if (g2.Z()) {
            u.a(g2.aa() + (long)n3, (byte[])this.f, this.P(n2), (long)n4);
        } else if (g2.W()) {
            this.b(n2, g2.X(), g2.Y() + n3, n4);
        } else {
            g2.a(n3, (byte[])this.f, this.P(n2), n4);
        }
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        this.a(n2, n4, n3, arrby.length);
        System.arraycopy(arrby, n3, this.f, this.P(n2), n4);
        return this;
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        int n3 = byteBuffer.remaining();
        this.q(n2, n3);
        byteBuffer.get((byte[])this.f, this.P(n2), n3);
        return this;
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        this.q(n2, n3);
        return inputStream.read((byte[])this.f, this.P(n2), n3);
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.q(n2, n3);
        n2 = this.P(n2);
        try {
            return scatteringByteChannel.read((ByteBuffer)this.d().clear().position(n2).limit(n2 + n3));
        }
        catch (ClosedChannelException closedChannelException) {
            return -1;
        }
    }

    @Override
    public g h(int n2, int n3) {
        this.q(n2, n3);
        g g2 = this.l().c(n3, this.k());
        g2.b((byte[])this.f, this.P(n2), n3);
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
        ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])this.f, n2, n3);
        return byteBuffer.slice();
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.q(n2, n3);
        n2 = this.P(n2);
        return (ByteBuffer)this.d().clear().position(n2).limit(n2 + n3);
    }

    @Override
    public boolean W() {
        return true;
    }

    @Override
    public byte[] X() {
        return (byte[])this.f;
    }

    @Override
    public int Y() {
        return this.g;
    }

    @Override
    public boolean Z() {
        return false;
    }

    @Override
    public long aa() {
        throw new UnsupportedOperationException();
    }

    protected ByteBuffer a(byte[] arrby) {
        return ByteBuffer.wrap(arrby);
    }

    @Override
    protected p e() {
        return k;
    }

    /* synthetic */ ay(t t2, int n2, az az2) {
        this(t2, n2);
    }
}

