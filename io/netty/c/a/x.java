/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.b.bh;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.b.l;
import io.netty.c.a.w;
import io.netty.util.af;
import io.netty.util.c.ad;
import io.netty.util.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

final class x
extends g {
    private static final af b = w.a;
    private g c;
    private boolean d;
    private bh e;
    static final x a = new x(bi.c);

    x() {
    }

    x(g g2) {
        this.d(g2);
    }

    void d(g g2) {
        this.c = g2;
    }

    void a() {
        this.d = true;
    }

    @Override
    public int j() {
        if (this.d) {
            return this.c.j();
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public g f(int n2) {
        x.b();
        return this;
    }

    @Override
    public int k() {
        return this.j();
    }

    @Override
    public h l() {
        return this.c.l();
    }

    @Override
    public boolean o() {
        return this.c.o();
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    public byte[] X() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int Y() {
        throw new UnsupportedOperationException();
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
    public g w() {
        x.b();
        return this;
    }

    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public int c(g g2) {
        x.b();
        return 0;
    }

    @Override
    public g Q() {
        x.b();
        return this;
    }

    @Override
    public g h(int n2, int n3) {
        this.m(n2, n3);
        return this.c.h(n2, n3);
    }

    @Override
    public g B() {
        x.b();
        return this;
    }

    @Override
    public g k(int n2) {
        x.b();
        return this;
    }

    @Override
    public int a(int n2, boolean bl2) {
        x.b();
        return 0;
    }

    @Override
    public g S() {
        x.b();
        return this;
    }

    @Override
    public boolean l(int n2) {
        this.m(n2, 1);
        return this.c.l(n2);
    }

    @Override
    public byte m(int n2) {
        this.m(n2, 1);
        return this.c.m(n2);
    }

    @Override
    public short n(int n2) {
        this.m(n2, 1);
        return this.c.n(n2);
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.m(n2, n4);
        this.c.a(n2, arrby, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby) {
        this.m(n2, arrby.length);
        this.c.a(n2, arrby);
        return this;
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        x.b();
        return this;
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.m(n2, n4);
        this.c.a(n2, g2, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, g g2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g a(int n2, g g2) {
        x.b();
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        x.b();
        return 0;
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        x.b();
        return this;
    }

    @Override
    public int s(int n2) {
        this.m(n2, 4);
        return this.c.s(n2);
    }

    @Override
    public long t(int n2) {
        this.m(n2, 4);
        return this.c.t(n2);
    }

    @Override
    public long u(int n2) {
        this.m(n2, 8);
        return this.c.u(n2);
    }

    @Override
    public int q(int n2) {
        this.m(n2, 3);
        return this.c.q(n2);
    }

    @Override
    public int r(int n2) {
        this.m(n2, 3);
        return this.c.r(n2);
    }

    @Override
    public short o(int n2) {
        this.m(n2, 2);
        return this.c.o(n2);
    }

    @Override
    public int p(int n2) {
        this.m(n2, 2);
        return this.c.p(n2);
    }

    @Override
    public char v(int n2) {
        this.m(n2, 2);
        return this.c.v(n2);
    }

    @Override
    public float w(int n2) {
        this.m(n2, 4);
        return this.c.w(n2);
    }

    @Override
    public double x(int n2) {
        this.m(n2, 8);
        return this.c.x(n2);
    }

    @Override
    public int hashCode() {
        x.b();
        return 0;
    }

    @Override
    public int a(int n2, int n3, byte by2) {
        if (n2 == n3) {
            return -1;
        }
        if (Math.max(n2, n3) > this.c.q()) {
            throw b;
        }
        return this.c.a(n2, n3, by2);
    }

    @Override
    public int a(byte by2) {
        int n2 = this.c.a(by2);
        if (n2 < 0) {
            throw b;
        }
        return n2;
    }

    @Override
    public int a(int n2, byte by2) {
        int n3 = this.c.p();
        return this.b(n3, this.c.q() - n3, by2);
    }

    @Override
    public int b(int n2, int n3, byte by2) {
        int n4 = this.c.q();
        if (n2 >= n4) {
            throw b;
        }
        if (n2 <= n4 - n3) {
            return this.c.b(n2, n3, by2);
        }
        int n5 = this.c.b(n2, n4 - n2, by2);
        if (n5 < 0) {
            throw b;
        }
        return n5;
    }

    @Override
    public int a(l l2) {
        int n2 = this.c.a(l2);
        if (n2 < 0) {
            throw b;
        }
        return n2;
    }

    @Override
    public int a(int n2, int n3, l l2) {
        int n4 = this.c.q();
        if (n2 >= n4) {
            throw b;
        }
        if (n2 <= n4 - n3) {
            return this.c.a(n2, n3, l2);
        }
        int n5 = this.c.a(n2, n4 - n2, l2);
        if (n5 < 0) {
            throw b;
        }
        return n5;
    }

    @Override
    public int b(l l2) {
        if (this.d) {
            return this.c.b(l2);
        }
        x.b();
        return 0;
    }

    @Override
    public int b(int n2, int n3, l l2) {
        if (n2 + n3 > this.c.q()) {
            throw b;
        }
        return this.c.b(n2, n3, l2);
    }

    @Override
    public g x() {
        this.c.x();
        return this;
    }

    @Override
    public g z() {
        x.b();
        return this;
    }

    @Override
    public ByteOrder m() {
        return this.c.m();
    }

    @Override
    public g a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.m()) {
            return this;
        }
        bh bh2 = this.e;
        if (bh2 == null) {
            this.e = bh2 = new bh(this);
        }
        return bh2;
    }

    @Override
    public boolean u() {
        return this.d ? this.c.u() : true;
    }

    @Override
    public boolean i(int n2) {
        return this.d ? this.c.i(n2) : true;
    }

    @Override
    public int r() {
        if (this.d) {
            return this.c.r();
        }
        return Integer.MAX_VALUE - this.c.p();
    }

    @Override
    public boolean D() {
        this.a(1);
        return this.c.D();
    }

    @Override
    public byte E() {
        this.a(1);
        return this.c.E();
    }

    @Override
    public short F() {
        this.a(1);
        return this.c.F();
    }

    @Override
    public g a(byte[] arrby, int n2, int n3) {
        this.a(n3);
        this.c.a(arrby, n2, n3);
        return this;
    }

    @Override
    public g b(byte[] arrby) {
        this.a(arrby.length);
        this.c.b(arrby);
        return this;
    }

    @Override
    public g a(ByteBuffer byteBuffer) {
        x.b();
        return this;
    }

    @Override
    public g a(g g2, int n2, int n3) {
        this.a(n3);
        this.c.a(g2, n2, n3);
        return this;
    }

    @Override
    public g a(g g2, int n2) {
        x.b();
        return this;
    }

    @Override
    public g a(g g2) {
        this.a(g2.s());
        this.c.a(g2);
        return this;
    }

    @Override
    public int a(GatheringByteChannel gatheringByteChannel, int n2) {
        x.b();
        return 0;
    }

    @Override
    public g y(int n2) {
        this.a(n2);
        return this.c.y(n2);
    }

    @Override
    public g z(int n2) {
        this.a(n2);
        return this.c.z(n2);
    }

    @Override
    public g a(OutputStream outputStream, int n2) {
        x.b();
        return this;
    }

    @Override
    public int p() {
        return this.c.p();
    }

    @Override
    public g g(int n2) {
        this.c.g(n2);
        return this;
    }

    @Override
    public int K() {
        this.a(4);
        return this.c.K();
    }

    @Override
    public long L() {
        this.a(4);
        return this.c.L();
    }

    @Override
    public long M() {
        this.a(8);
        return this.c.M();
    }

    @Override
    public int I() {
        this.a(3);
        return this.c.I();
    }

    @Override
    public int J() {
        this.a(3);
        return this.c.J();
    }

    @Override
    public short G() {
        this.a(2);
        return this.c.G();
    }

    @Override
    public int H() {
        this.a(2);
        return this.c.H();
    }

    @Override
    public char N() {
        this.a(2);
        return this.c.N();
    }

    @Override
    public float O() {
        this.a(4);
        return this.c.O();
    }

    @Override
    public double P() {
        this.a(8);
        return this.c.P();
    }

    @Override
    public g y() {
        this.c.y();
        return this;
    }

    @Override
    public g A() {
        x.b();
        return this;
    }

    @Override
    public g b(int n2, boolean bl2) {
        x.b();
        return this;
    }

    @Override
    public g b(int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        x.b();
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby) {
        x.b();
        return this;
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        x.b();
        return this;
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        x.b();
        return this;
    }

    @Override
    public g b(int n2, g g2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g b(int n2, g g2) {
        x.b();
        return this;
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        x.b();
        return 0;
    }

    @Override
    public g g(int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        x.b();
        return 0;
    }

    @Override
    public g a(int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g e(int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g a(int n2, long l2) {
        x.b();
        return this;
    }

    @Override
    public g d(int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g c(int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g f(int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g a(int n2, float f2) {
        x.b();
        return this;
    }

    @Override
    public g a(int n2, double d2) {
        x.b();
        return this;
    }

    @Override
    public g A(int n2) {
        this.a(n2);
        this.c.A(n2);
        return this;
    }

    @Override
    public g R() {
        x.b();
        return this;
    }

    @Override
    public g i(int n2, int n3) {
        this.m(n2, n3);
        return this.c.i(n2, n3);
    }

    @Override
    public int T() {
        return this.c.T();
    }

    @Override
    public ByteBuffer U() {
        x.b();
        return null;
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        this.m(n2, n3);
        return this.c.j(n2, n3);
    }

    @Override
    public ByteBuffer[] V() {
        x.b();
        return null;
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        this.m(n2, n3);
        return this.c.l(n2, n3);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.m(n2, n3);
        return this.c.k(n2, n3);
    }

    @Override
    public String a(int n2, int n3, Charset charset) {
        this.m(n2, n3);
        return this.c.a(n2, n3, charset);
    }

    @Override
    public String a(Charset charset) {
        x.b();
        return null;
    }

    @Override
    public String toString() {
        return ad.a(this) + '(' + "ridx=" + this.p() + ", " + "widx=" + this.q() + ')';
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean j(int n2) {
        return false;
    }

    @Override
    public int s() {
        return 0;
    }

    @Override
    public int t() {
        return 0;
    }

    @Override
    public g a(boolean bl2) {
        x.b();
        return this;
    }

    @Override
    public g B(int n2) {
        x.b();
        return this;
    }

    @Override
    public g b(byte[] arrby, int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g c(byte[] arrby) {
        x.b();
        return this;
    }

    @Override
    public g b(ByteBuffer byteBuffer) {
        x.b();
        return this;
    }

    @Override
    public g b(g g2, int n2, int n3) {
        x.b();
        return this;
    }

    @Override
    public g b(g g2, int n2) {
        x.b();
        return this;
    }

    @Override
    public g b(g g2) {
        x.b();
        return this;
    }

    @Override
    public int a(InputStream inputStream, int n2) {
        x.b();
        return 0;
    }

    @Override
    public int a(ScatteringByteChannel scatteringByteChannel, int n2) {
        x.b();
        return 0;
    }

    @Override
    public g E(int n2) {
        x.b();
        return this;
    }

    @Override
    public g b(long l2) {
        x.b();
        return this;
    }

    @Override
    public g D(int n2) {
        x.b();
        return this;
    }

    @Override
    public g G(int n2) {
        x.b();
        return this;
    }

    @Override
    public int q() {
        return this.c.q();
    }

    @Override
    public g h(int n2) {
        x.b();
        return this;
    }

    @Override
    public g C(int n2) {
        x.b();
        return this;
    }

    @Override
    public g F(int n2) {
        x.b();
        return this;
    }

    @Override
    public g a(float f2) {
        x.b();
        return this;
    }

    @Override
    public g a(double d2) {
        x.b();
        return this;
    }

    private void m(int n2, int n3) {
        if (n2 + n3 > this.c.q()) {
            throw b;
        }
    }

    private void a(int n2) {
        if (this.c.r() < n2) {
            throw b;
        }
    }

    @Override
    public g C() {
        x.b();
        return this;
    }

    @Override
    public int ac() {
        return this.c.ac();
    }

    @Override
    public g ab() {
        x.b();
        return this;
    }

    @Override
    public g H(int n2) {
        x.b();
        return this;
    }

    @Override
    public boolean ad() {
        x.b();
        return false;
    }

    @Override
    public boolean I(int n2) {
        x.b();
        return false;
    }

    @Override
    public g n() {
        x.b();
        return this;
    }

    private static void b() {
        throw new UnsupportedOperationException("not a replayable operation");
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.H(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.ab();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.c((g)object);
    }

    static {
        a.a();
    }
}

