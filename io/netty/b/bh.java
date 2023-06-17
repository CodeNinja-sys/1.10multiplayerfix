/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.b.l;
import io.netty.b.w;
import io.netty.util.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public class bh
extends g {
    private final g a;
    private final ByteOrder b;

    public bh(g g2) {
        if (g2 == null) {
            throw new NullPointerException("buf");
        }
        this.a = g2;
        this.b = g2.m() == ByteOrder.BIG_ENDIAN ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
    }

    @Override
    public ByteOrder m() {
        return this.b;
    }

    @Override
    public g a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.b) {
            return this;
        }
        return this.a;
    }

    @Override
    public g n() {
        return this.a.n();
    }

    @Override
    public h l() {
        return this.a.l();
    }

    @Override
    public int j() {
        return this.a.j();
    }

    @Override
    public g f(int n2) {
        this.a.f(n2);
        return this;
    }

    @Override
    public int k() {
        return this.a.k();
    }

    @Override
    public boolean o() {
        return this.a.o();
    }

    @Override
    public int p() {
        return this.a.p();
    }

    @Override
    public g g(int n2) {
        this.a.g(n2);
        return this;
    }

    @Override
    public int q() {
        return this.a.q();
    }

    @Override
    public g h(int n2) {
        this.a.h(n2);
        return this;
    }

    @Override
    public g a(int n2, int n3) {
        this.a.a(n2, n3);
        return this;
    }

    @Override
    public int r() {
        return this.a.r();
    }

    @Override
    public int s() {
        return this.a.s();
    }

    @Override
    public int t() {
        return this.a.t();
    }

    @Override
    public boolean u() {
        return this.a.u();
    }

    @Override
    public boolean i(int n2) {
        return this.a.i(n2);
    }

    @Override
    public boolean v() {
        return this.a.v();
    }

    @Override
    public boolean j(int n2) {
        return this.a.j(n2);
    }

    @Override
    public g w() {
        this.a.w();
        return this;
    }

    @Override
    public g x() {
        this.a.x();
        return this;
    }

    @Override
    public g y() {
        this.a.y();
        return this;
    }

    @Override
    public g z() {
        this.a.z();
        return this;
    }

    @Override
    public g A() {
        this.a.A();
        return this;
    }

    @Override
    public g B() {
        this.a.B();
        return this;
    }

    @Override
    public g C() {
        this.a.C();
        return this;
    }

    @Override
    public g k(int n2) {
        this.a.k(n2);
        return this;
    }

    @Override
    public int a(int n2, boolean bl2) {
        return this.a.a(n2, bl2);
    }

    @Override
    public boolean l(int n2) {
        return this.a.l(n2);
    }

    @Override
    public byte m(int n2) {
        return this.a.m(n2);
    }

    @Override
    public short n(int n2) {
        return this.a.n(n2);
    }

    @Override
    public short o(int n2) {
        return w.a(this.a.o(n2));
    }

    @Override
    public int p(int n2) {
        return this.o(n2) & 0xFFFF;
    }

    @Override
    public int q(int n2) {
        return w.a(this.a.q(n2));
    }

    @Override
    public int r(int n2) {
        return this.q(n2) & 0xFFFFFF;
    }

    @Override
    public int s(int n2) {
        return w.b(this.a.s(n2));
    }

    @Override
    public long t(int n2) {
        return (long)this.s(n2) & 0xFFFFFFFFL;
    }

    @Override
    public long u(int n2) {
        return w.a(this.a.u(n2));
    }

    @Override
    public char v(int n2) {
        return (char)this.o(n2);
    }

    @Override
    public float w(int n2) {
        return Float.intBitsToFloat(this.s(n2));
    }

    @Override
    public double x(int n2) {
        return Double.longBitsToDouble(this.u(n2));
    }

    @Override
    public g a(int n2, g g2) {
        this.a.a(n2, g2);
        return this;
    }

    @Override
    public g a(int n2, g g2, int n3) {
        this.a.a(n2, g2, n3);
        return this;
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.a.a(n2, g2, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby) {
        this.a.a(n2, arrby);
        return this;
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.a.a(n2, arrby, n3, n4);
        return this;
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        this.a.a(n2, byteBuffer);
        return this;
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.a.a(n2, outputStream, n3);
        return this;
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        return this.a.a(n2, gatheringByteChannel, n3);
    }

    @Override
    public g b(int n2, boolean bl2) {
        this.a.b(n2, bl2);
        return this;
    }

    @Override
    public g b(int n2, int n3) {
        this.a.b(n2, n3);
        return this;
    }

    @Override
    public g c(int n2, int n3) {
        this.a.c(n2, w.a((short)n3));
        return this;
    }

    @Override
    public g d(int n2, int n3) {
        this.a.d(n2, w.a(n3));
        return this;
    }

    @Override
    public g e(int n2, int n3) {
        this.a.e(n2, w.b(n3));
        return this;
    }

    @Override
    public g a(int n2, long l2) {
        this.a.a(n2, w.a(l2));
        return this;
    }

    @Override
    public g f(int n2, int n3) {
        this.c(n2, n3);
        return this;
    }

    @Override
    public g a(int n2, float f2) {
        this.e(n2, Float.floatToRawIntBits(f2));
        return this;
    }

    @Override
    public g a(int n2, double d2) {
        this.a(n2, Double.doubleToRawLongBits(d2));
        return this;
    }

    @Override
    public g b(int n2, g g2) {
        this.a.b(n2, g2);
        return this;
    }

    @Override
    public g b(int n2, g g2, int n3) {
        this.a.b(n2, g2, n3);
        return this;
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        this.a.b(n2, g2, n3, n4);
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby) {
        this.a.b(n2, arrby);
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        this.a.b(n2, arrby, n3, n4);
        return this;
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        this.a.b(n2, byteBuffer);
        return this;
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        return this.a.a(n2, inputStream, n3);
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        return this.a.a(n2, scatteringByteChannel, n3);
    }

    @Override
    public g g(int n2, int n3) {
        this.a.g(n2, n3);
        return this;
    }

    @Override
    public boolean D() {
        return this.a.D();
    }

    @Override
    public byte E() {
        return this.a.E();
    }

    @Override
    public short F() {
        return this.a.F();
    }

    @Override
    public short G() {
        return w.a(this.a.G());
    }

    @Override
    public int H() {
        return this.G() & 0xFFFF;
    }

    @Override
    public int I() {
        return w.a(this.a.I());
    }

    @Override
    public int J() {
        return this.I() & 0xFFFFFF;
    }

    @Override
    public int K() {
        return w.b(this.a.K());
    }

    @Override
    public long L() {
        return (long)this.K() & 0xFFFFFFFFL;
    }

    @Override
    public long M() {
        return w.a(this.a.M());
    }

    @Override
    public char N() {
        return (char)this.G();
    }

    @Override
    public float O() {
        return Float.intBitsToFloat(this.K());
    }

    @Override
    public double P() {
        return Double.longBitsToDouble(this.M());
    }

    @Override
    public g y(int n2) {
        return this.a.y(n2).a(this.m());
    }

    @Override
    public g z(int n2) {
        return this.a.z(n2).a(this.b);
    }

    @Override
    public g a(g g2) {
        this.a.a(g2);
        return this;
    }

    @Override
    public g a(g g2, int n2) {
        this.a.a(g2, n2);
        return this;
    }

    @Override
    public g a(g g2, int n2, int n3) {
        this.a.a(g2, n2, n3);
        return this;
    }

    @Override
    public g b(byte[] arrby) {
        this.a.b(arrby);
        return this;
    }

    @Override
    public g a(byte[] arrby, int n2, int n3) {
        this.a.a(arrby, n2, n3);
        return this;
    }

    @Override
    public g a(ByteBuffer byteBuffer) {
        this.a.a(byteBuffer);
        return this;
    }

    @Override
    public g a(OutputStream outputStream, int n2) {
        this.a.a(outputStream, n2);
        return this;
    }

    @Override
    public int a(GatheringByteChannel gatheringByteChannel, int n2) {
        return this.a.a(gatheringByteChannel, n2);
    }

    @Override
    public g A(int n2) {
        this.a.A(n2);
        return this;
    }

    @Override
    public g a(boolean bl2) {
        this.a.a(bl2);
        return this;
    }

    @Override
    public g B(int n2) {
        this.a.B(n2);
        return this;
    }

    @Override
    public g C(int n2) {
        this.a.C(w.a((short)n2));
        return this;
    }

    @Override
    public g D(int n2) {
        this.a.D(w.a(n2));
        return this;
    }

    @Override
    public g E(int n2) {
        this.a.E(w.b(n2));
        return this;
    }

    @Override
    public g b(long l2) {
        this.a.b(w.a(l2));
        return this;
    }

    @Override
    public g F(int n2) {
        this.C(n2);
        return this;
    }

    @Override
    public g a(float f2) {
        this.E(Float.floatToRawIntBits(f2));
        return this;
    }

    @Override
    public g a(double d2) {
        this.b(Double.doubleToRawLongBits(d2));
        return this;
    }

    @Override
    public g b(g g2) {
        this.a.b(g2);
        return this;
    }

    @Override
    public g b(g g2, int n2) {
        this.a.b(g2, n2);
        return this;
    }

    @Override
    public g b(g g2, int n2, int n3) {
        this.a.b(g2, n2, n3);
        return this;
    }

    @Override
    public g c(byte[] arrby) {
        this.a.c(arrby);
        return this;
    }

    @Override
    public g b(byte[] arrby, int n2, int n3) {
        this.a.b(arrby, n2, n3);
        return this;
    }

    @Override
    public g b(ByteBuffer byteBuffer) {
        this.a.b(byteBuffer);
        return this;
    }

    @Override
    public int a(InputStream inputStream, int n2) {
        return this.a.a(inputStream, n2);
    }

    @Override
    public int a(ScatteringByteChannel scatteringByteChannel, int n2) {
        return this.a.a(scatteringByteChannel, n2);
    }

    @Override
    public g G(int n2) {
        this.a.G(n2);
        return this;
    }

    @Override
    public int a(int n2, int n3, byte by2) {
        return this.a.a(n2, n3, by2);
    }

    @Override
    public int a(byte by2) {
        return this.a.a(by2);
    }

    @Override
    public int a(int n2, byte by2) {
        return this.a.a(n2, by2);
    }

    @Override
    public int b(int n2, int n3, byte by2) {
        return this.a.b(n2, n3, by2);
    }

    @Override
    public int a(l l2) {
        return this.a.a(l2);
    }

    @Override
    public int a(int n2, int n3, l l2) {
        return this.a.a(n2, n3, l2);
    }

    @Override
    public int b(l l2) {
        return this.a.b(l2);
    }

    @Override
    public int b(int n2, int n3, l l2) {
        return this.a.b(n2, n3, l2);
    }

    @Override
    public g Q() {
        return this.a.Q().a(this.b);
    }

    @Override
    public g h(int n2, int n3) {
        return this.a.h(n2, n3).a(this.b);
    }

    @Override
    public g R() {
        return this.a.R().a(this.b);
    }

    @Override
    public g i(int n2, int n3) {
        return this.a.i(n2, n3).a(this.b);
    }

    @Override
    public g S() {
        return this.a.S().a(this.b);
    }

    @Override
    public int T() {
        return this.a.T();
    }

    @Override
    public ByteBuffer U() {
        return this.a.U().order(this.b);
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        return this.a.j(n2, n3).order(this.b);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        return this.j(n2, n3);
    }

    @Override
    public ByteBuffer[] V() {
        ByteBuffer[] arrbyteBuffer = this.a.V();
        for (int i2 = 0; i2 < arrbyteBuffer.length; ++i2) {
            arrbyteBuffer[i2] = arrbyteBuffer[i2].order(this.b);
        }
        return arrbyteBuffer;
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        ByteBuffer[] arrbyteBuffer = this.a.l(n2, n3);
        for (int i2 = 0; i2 < arrbyteBuffer.length; ++i2) {
            arrbyteBuffer[i2] = arrbyteBuffer[i2].order(this.b);
        }
        return arrbyteBuffer;
    }

    @Override
    public boolean W() {
        return this.a.W();
    }

    @Override
    public byte[] X() {
        return this.a.X();
    }

    @Override
    public int Y() {
        return this.a.Y();
    }

    @Override
    public boolean Z() {
        return this.a.Z();
    }

    @Override
    public long aa() {
        return this.a.aa();
    }

    @Override
    public String a(Charset charset) {
        return this.a.a(charset);
    }

    @Override
    public String a(int n2, int n3, Charset charset) {
        return this.a.a(n2, n3, charset);
    }

    @Override
    public int ac() {
        return this.a.ac();
    }

    @Override
    public g ab() {
        this.a.ab();
        return this;
    }

    @Override
    public g H(int n2) {
        this.a.H(n2);
        return this;
    }

    @Override
    public boolean ad() {
        return this.a.ad();
    }

    @Override
    public boolean I(int n2) {
        return this.a.I(n2);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof g) {
            return w.a(this, (g)object);
        }
        return false;
    }

    @Override
    public int c(g g2) {
        return w.b(this, g2);
    }

    @Override
    public String toString() {
        return "Swapped(" + this.a.toString() + ')';
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
}

