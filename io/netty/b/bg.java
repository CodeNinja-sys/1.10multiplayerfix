/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.af;
import io.netty.b.bi;
import io.netty.b.d;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.b.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class bg
extends d {
    private final g d;
    private final int e;
    private final int f;

    public bg(g g2, int n2, int n3) {
        super(n3);
        if (n2 < 0 || n2 > g2.j() - n3) {
            throw new IndexOutOfBoundsException(g2 + ".slice(" + n2 + ", " + n3 + ')');
        }
        if (g2 instanceof bg) {
            this.d = ((bg)g2).d;
            this.e = ((bg)g2).e + n2;
        } else if (g2 instanceof af) {
            this.d = g2.n();
            this.e = n2;
        } else {
            this.d = g2;
            this.e = n2;
        }
        this.f = n3;
        this.h(n3);
    }

    @Override
    public g n() {
        return this.d;
    }

    @Override
    public h l() {
        return this.d.l();
    }

    @Override
    public ByteOrder m() {
        return this.d.m();
    }

    @Override
    public boolean o() {
        return this.d.o();
    }

    @Override
    public int j() {
        return this.f;
    }

    @Override
    public g f(int n2) {
        throw new UnsupportedOperationException("sliced buffer");
    }

    @Override
    public boolean W() {
        return this.d.W();
    }

    @Override
    public byte[] X() {
        return this.d.X();
    }

    @Override
    public int Y() {
        return this.d.Y() + this.e;
    }

    @Override
    public boolean Z() {
        return this.d.Z();
    }

    @Override
    public long aa() {
        return this.d.aa() + (long)this.e;
    }

    @Override
    protected byte c(int n2) {
        return this.d.m(n2 + this.e);
    }

    @Override
    protected short d(int n2) {
        return this.d.o(n2 + this.e);
    }

    @Override
    protected int e(int n2) {
        return this.d.r(n2 + this.e);
    }

    @Override
    protected int K(int n2) {
        return this.d.s(n2 + this.e);
    }

    @Override
    protected long L(int n2) {
        return this.d.u(n2 + this.e);
    }

    @Override
    public g S() {
        g g2 = this.d.i(this.e, this.f);
        g2.a(this.p(), this.q());
        return g2;
    }

    @Override
    public g h(int n2, int n3) {
        this.q(n2, n3);
        return this.d.h(n2 + this.e, n3);
    }

    @Override
    public g i(int n2, int n3) {
        this.q(n2, n3);
        if (n3 == 0) {
            return bi.c;
        }
        return this.d.i(n2 + this.e, n3);
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.q(n2, n4);
        this.d.a(n2 + this.e, g2, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.q(n2, n4);
        this.d.a(n2 + this.e, arrby, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        this.q(n2, byteBuffer.remaining());
        this.d.a(n2 + this.e, byteBuffer);
        return this;
    }

    @Override
    protected void m(int n2, int n3) {
        this.d.b(n2 + this.e, n3);
    }

    @Override
    protected void n(int n2, int n3) {
        this.d.c(n2 + this.e, n3);
    }

    @Override
    protected void o(int n2, int n3) {
        this.d.d(n2 + this.e, n3);
    }

    @Override
    protected void p(int n2, int n3) {
        this.d.e(n2 + this.e, n3);
    }

    @Override
    protected void b(int n2, long l2) {
        this.d.a(n2 + this.e, l2);
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        this.q(n2, n4);
        this.d.b(n2 + this.e, arrby, n3, n4);
        return this;
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        this.q(n2, n4);
        this.d.b(n2 + this.e, g2, n3, n4);
        return this;
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        this.q(n2, byteBuffer.remaining());
        this.d.b(n2 + this.e, byteBuffer);
        return this;
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.q(n2, n3);
        this.d.a(n2 + this.e, outputStream, n3);
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        this.q(n2, n3);
        return this.d.a(n2 + this.e, gatheringByteChannel, n3);
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        this.q(n2, n3);
        return this.d.a(n2 + this.e, inputStream, n3);
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.q(n2, n3);
        return this.d.a(n2 + this.e, scatteringByteChannel, n3);
    }

    @Override
    public int T() {
        return this.d.T();
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        this.q(n2, n3);
        return this.d.j(n2 + this.e, n3);
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        this.q(n2, n3);
        return this.d.l(n2 + this.e, n3);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.q(n2, n3);
        return this.j(n2, n3);
    }

    @Override
    public int a(int n2, int n3, l l2) {
        int n4 = this.d.a(n2 + this.e, n3, l2);
        if (n4 >= this.e) {
            return n4 - this.e;
        }
        return -1;
    }

    @Override
    public int b(int n2, int n3, l l2) {
        int n4 = this.d.b(n2 + this.e, n3, l2);
        if (n4 >= this.e) {
            return n4 - this.e;
        }
        return -1;
    }
}

