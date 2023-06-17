/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.b.l;
import io.netty.util.c.ad;
import io.netty.util.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

class bp
extends g {
    protected final g a;

    protected bp(g g2) {
        if (g2 == null) {
            throw new NullPointerException("buf");
        }
        this.a = g2;
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
    public h l() {
        return this.a.l();
    }

    @Override
    public ByteOrder m() {
        return this.a.m();
    }

    @Override
    public g a(ByteOrder byteOrder) {
        return this.a.a(byteOrder);
    }

    @Override
    public g n() {
        return this.a;
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
    public boolean v() {
        return this.a.v();
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
        return this.a.o(n2);
    }

    @Override
    public int p(int n2) {
        return this.a.p(n2);
    }

    @Override
    public int q(int n2) {
        return this.a.q(n2);
    }

    @Override
    public int r(int n2) {
        return this.a.r(n2);
    }

    @Override
    public int s(int n2) {
        return this.a.s(n2);
    }

    @Override
    public long t(int n2) {
        return this.a.t(n2);
    }

    @Override
    public long u(int n2) {
        return this.a.u(n2);
    }

    @Override
    public char v(int n2) {
        return this.a.v(n2);
    }

    @Override
    public float w(int n2) {
        return this.a.w(n2);
    }

    @Override
    public double x(int n2) {
        return this.a.x(n2);
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
        this.a.c(n2, n3);
        return this;
    }

    @Override
    public g d(int n2, int n3) {
        this.a.d(n2, n3);
        return this;
    }

    @Override
    public g e(int n2, int n3) {
        this.a.e(n2, n3);
        return this;
    }

    @Override
    public g a(int n2, long l2) {
        this.a.a(n2, l2);
        return this;
    }

    @Override
    public g f(int n2, int n3) {
        this.a.f(n2, n3);
        return this;
    }

    @Override
    public g a(int n2, float f2) {
        this.a.a(n2, f2);
        return this;
    }

    @Override
    public g a(int n2, double d2) {
        this.a.a(n2, d2);
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
        return this.a.G();
    }

    @Override
    public int H() {
        return this.a.H();
    }

    @Override
    public int I() {
        return this.a.I();
    }

    @Override
    public int J() {
        return this.a.J();
    }

    @Override
    public int K() {
        return this.a.K();
    }

    @Override
    public long L() {
        return this.a.L();
    }

    @Override
    public long M() {
        return this.a.M();
    }

    @Override
    public char N() {
        return this.a.N();
    }

    @Override
    public float O() {
        return this.a.O();
    }

    @Override
    public double P() {
        return this.a.P();
    }

    @Override
    public g y(int n2) {
        return this.a.y(n2);
    }

    @Override
    public g z(int n2) {
        return this.a.z(n2);
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
        this.a.C(n2);
        return this;
    }

    @Override
    public g D(int n2) {
        this.a.D(n2);
        return this;
    }

    @Override
    public g E(int n2) {
        this.a.E(n2);
        return this;
    }

    @Override
    public g b(long l2) {
        this.a.b(l2);
        return this;
    }

    @Override
    public g F(int n2) {
        this.a.F(n2);
        return this;
    }

    @Override
    public g a(float f2) {
        this.a.a(f2);
        return this;
    }

    @Override
    public g a(double d2) {
        this.a.a(d2);
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
        return this.a.Q();
    }

    @Override
    public g h(int n2, int n3) {
        return this.a.h(n2, n3);
    }

    @Override
    public g R() {
        return this.a.R();
    }

    @Override
    public g i(int n2, int n3) {
        return this.a.i(n2, n3);
    }

    @Override
    public g S() {
        return this.a.S();
    }

    @Override
    public int T() {
        return this.a.T();
    }

    @Override
    public ByteBuffer U() {
        return this.a.U();
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        return this.a.j(n2, n3);
    }

    @Override
    public ByteBuffer[] V() {
        return this.a.V();
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        return this.a.l(n2, n3);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        return this.a.k(n2, n3);
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
    public String a(Charset charset) {
        return this.a.a(charset);
    }

    @Override
    public String a(int n2, int n3, Charset charset) {
        return this.a.a(n2, n3, charset);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    @Override
    public int c(g g2) {
        return this.a.c(g2);
    }

    @Override
    public String toString() {
        return ad.a(this) + '(' + this.a.toString() + ')';
    }

    @Override
    public g H(int n2) {
        this.a.H(n2);
        return this;
    }

    @Override
    public g ab() {
        this.a.ab();
        return this;
    }

    @Override
    public boolean i(int n2) {
        return this.a.i(n2);
    }

    @Override
    public boolean j(int n2) {
        return this.a.j(n2);
    }

    @Override
    public int ac() {
        return this.a.ac();
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

