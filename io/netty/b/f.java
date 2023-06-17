/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.bp;
import io.netty.b.g;
import io.netty.b.l;
import io.netty.util.aa;
import io.netty.util.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

final class f
extends bp {
    private final aa b;

    f(g g2, aa aa2) {
        super(g2);
        this.b = aa2;
    }

    @Override
    public boolean ad() {
        boolean bl2 = super.ad();
        if (bl2) {
            this.b.b();
        } else {
            this.b.a();
        }
        return bl2;
    }

    @Override
    public boolean I(int n2) {
        boolean bl2 = super.I(n2);
        if (bl2) {
            this.b.b();
        } else {
            this.b.a();
        }
        return bl2;
    }

    @Override
    public g a(ByteOrder byteOrder) {
        this.b.a();
        if (this.m() == byteOrder) {
            return this;
        }
        return new f(super.a(byteOrder), this.b);
    }

    @Override
    public g R() {
        this.b.a();
        return new f(super.R(), this.b);
    }

    @Override
    public g i(int n2, int n3) {
        this.b.a();
        return new f(super.i(n2, n3), this.b);
    }

    @Override
    public g S() {
        this.b.a();
        return new f(super.S(), this.b);
    }

    @Override
    public g z(int n2) {
        this.b.a();
        return new f(super.z(n2), this.b);
    }

    @Override
    public g B() {
        this.b.a();
        return super.B();
    }

    @Override
    public g C() {
        this.b.a();
        return super.C();
    }

    @Override
    public g k(int n2) {
        this.b.a();
        return super.k(n2);
    }

    @Override
    public int a(int n2, boolean bl2) {
        this.b.a();
        return super.a(n2, bl2);
    }

    @Override
    public boolean l(int n2) {
        this.b.a();
        return super.l(n2);
    }

    @Override
    public byte m(int n2) {
        this.b.a();
        return super.m(n2);
    }

    @Override
    public short n(int n2) {
        this.b.a();
        return super.n(n2);
    }

    @Override
    public short o(int n2) {
        this.b.a();
        return super.o(n2);
    }

    @Override
    public int p(int n2) {
        this.b.a();
        return super.p(n2);
    }

    @Override
    public int q(int n2) {
        this.b.a();
        return super.q(n2);
    }

    @Override
    public int r(int n2) {
        this.b.a();
        return super.r(n2);
    }

    @Override
    public int s(int n2) {
        this.b.a();
        return super.s(n2);
    }

    @Override
    public long t(int n2) {
        this.b.a();
        return super.t(n2);
    }

    @Override
    public long u(int n2) {
        this.b.a();
        return super.u(n2);
    }

    @Override
    public char v(int n2) {
        this.b.a();
        return super.v(n2);
    }

    @Override
    public float w(int n2) {
        this.b.a();
        return super.w(n2);
    }

    @Override
    public double x(int n2) {
        this.b.a();
        return super.x(n2);
    }

    @Override
    public g a(int n2, g g2) {
        this.b.a();
        return super.a(n2, g2);
    }

    @Override
    public g a(int n2, g g2, int n3) {
        this.b.a();
        return super.a(n2, g2, n3);
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        this.b.a();
        return super.a(n2, g2, n3, n4);
    }

    @Override
    public g a(int n2, byte[] arrby) {
        this.b.a();
        return super.a(n2, arrby);
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        this.b.a();
        return super.a(n2, arrby, n3, n4);
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        this.b.a();
        return super.a(n2, byteBuffer);
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        this.b.a();
        return super.a(n2, outputStream, n3);
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        this.b.a();
        return super.a(n2, gatheringByteChannel, n3);
    }

    @Override
    public g b(int n2, boolean bl2) {
        this.b.a();
        return super.b(n2, bl2);
    }

    @Override
    public g b(int n2, int n3) {
        this.b.a();
        return super.b(n2, n3);
    }

    @Override
    public g c(int n2, int n3) {
        this.b.a();
        return super.c(n2, n3);
    }

    @Override
    public g d(int n2, int n3) {
        this.b.a();
        return super.d(n2, n3);
    }

    @Override
    public g e(int n2, int n3) {
        this.b.a();
        return super.e(n2, n3);
    }

    @Override
    public g a(int n2, long l2) {
        this.b.a();
        return super.a(n2, l2);
    }

    @Override
    public g f(int n2, int n3) {
        this.b.a();
        return super.f(n2, n3);
    }

    @Override
    public g a(int n2, float f2) {
        this.b.a();
        return super.a(n2, f2);
    }

    @Override
    public g a(int n2, double d2) {
        this.b.a();
        return super.a(n2, d2);
    }

    @Override
    public g b(int n2, g g2) {
        this.b.a();
        return super.b(n2, g2);
    }

    @Override
    public g b(int n2, g g2, int n3) {
        this.b.a();
        return super.b(n2, g2, n3);
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        this.b.a();
        return super.b(n2, g2, n3, n4);
    }

    @Override
    public g b(int n2, byte[] arrby) {
        this.b.a();
        return super.b(n2, arrby);
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        this.b.a();
        return super.b(n2, arrby, n3, n4);
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        this.b.a();
        return super.b(n2, byteBuffer);
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        this.b.a();
        return super.a(n2, inputStream, n3);
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.b.a();
        return super.a(n2, scatteringByteChannel, n3);
    }

    @Override
    public g g(int n2, int n3) {
        this.b.a();
        return super.g(n2, n3);
    }

    @Override
    public boolean D() {
        this.b.a();
        return super.D();
    }

    @Override
    public byte E() {
        this.b.a();
        return super.E();
    }

    @Override
    public short F() {
        this.b.a();
        return super.F();
    }

    @Override
    public short G() {
        this.b.a();
        return super.G();
    }

    @Override
    public int H() {
        this.b.a();
        return super.H();
    }

    @Override
    public int I() {
        this.b.a();
        return super.I();
    }

    @Override
    public int J() {
        this.b.a();
        return super.J();
    }

    @Override
    public int K() {
        this.b.a();
        return super.K();
    }

    @Override
    public long L() {
        this.b.a();
        return super.L();
    }

    @Override
    public long M() {
        this.b.a();
        return super.M();
    }

    @Override
    public char N() {
        this.b.a();
        return super.N();
    }

    @Override
    public float O() {
        this.b.a();
        return super.O();
    }

    @Override
    public double P() {
        this.b.a();
        return super.P();
    }

    @Override
    public g y(int n2) {
        this.b.a();
        return super.y(n2);
    }

    @Override
    public g a(g g2) {
        this.b.a();
        return super.a(g2);
    }

    @Override
    public g a(g g2, int n2) {
        this.b.a();
        return super.a(g2, n2);
    }

    @Override
    public g a(g g2, int n2, int n3) {
        this.b.a();
        return super.a(g2, n2, n3);
    }

    @Override
    public g b(byte[] arrby) {
        this.b.a();
        return super.b(arrby);
    }

    @Override
    public g a(byte[] arrby, int n2, int n3) {
        this.b.a();
        return super.a(arrby, n2, n3);
    }

    @Override
    public g a(ByteBuffer byteBuffer) {
        this.b.a();
        return super.a(byteBuffer);
    }

    @Override
    public g a(OutputStream outputStream, int n2) {
        this.b.a();
        return super.a(outputStream, n2);
    }

    @Override
    public int a(GatheringByteChannel gatheringByteChannel, int n2) {
        this.b.a();
        return super.a(gatheringByteChannel, n2);
    }

    @Override
    public g A(int n2) {
        this.b.a();
        return super.A(n2);
    }

    @Override
    public g a(boolean bl2) {
        this.b.a();
        return super.a(bl2);
    }

    @Override
    public g B(int n2) {
        this.b.a();
        return super.B(n2);
    }

    @Override
    public g C(int n2) {
        this.b.a();
        return super.C(n2);
    }

    @Override
    public g D(int n2) {
        this.b.a();
        return super.D(n2);
    }

    @Override
    public g E(int n2) {
        this.b.a();
        return super.E(n2);
    }

    @Override
    public g b(long l2) {
        this.b.a();
        return super.b(l2);
    }

    @Override
    public g F(int n2) {
        this.b.a();
        return super.F(n2);
    }

    @Override
    public g a(float f2) {
        this.b.a();
        return super.a(f2);
    }

    @Override
    public g a(double d2) {
        this.b.a();
        return super.a(d2);
    }

    @Override
    public g b(g g2) {
        this.b.a();
        return super.b(g2);
    }

    @Override
    public g b(g g2, int n2) {
        this.b.a();
        return super.b(g2, n2);
    }

    @Override
    public g b(g g2, int n2, int n3) {
        this.b.a();
        return super.b(g2, n2, n3);
    }

    @Override
    public g c(byte[] arrby) {
        this.b.a();
        return super.c(arrby);
    }

    @Override
    public g b(byte[] arrby, int n2, int n3) {
        this.b.a();
        return super.b(arrby, n2, n3);
    }

    @Override
    public g b(ByteBuffer byteBuffer) {
        this.b.a();
        return super.b(byteBuffer);
    }

    @Override
    public int a(InputStream inputStream, int n2) {
        this.b.a();
        return super.a(inputStream, n2);
    }

    @Override
    public int a(ScatteringByteChannel scatteringByteChannel, int n2) {
        this.b.a();
        return super.a(scatteringByteChannel, n2);
    }

    @Override
    public g G(int n2) {
        this.b.a();
        return super.G(n2);
    }

    @Override
    public int a(int n2, int n3, byte by2) {
        this.b.a();
        return super.a(n2, n3, by2);
    }

    @Override
    public int a(byte by2) {
        this.b.a();
        return super.a(by2);
    }

    @Override
    public int a(int n2, byte by2) {
        this.b.a();
        return super.a(n2, by2);
    }

    @Override
    public int b(int n2, int n3, byte by2) {
        this.b.a();
        return super.b(n2, n3, by2);
    }

    @Override
    public int a(l l2) {
        this.b.a();
        return super.a(l2);
    }

    @Override
    public int a(int n2, int n3, l l2) {
        this.b.a();
        return super.a(n2, n3, l2);
    }

    @Override
    public int b(l l2) {
        this.b.a();
        return super.b(l2);
    }

    @Override
    public int b(int n2, int n3, l l2) {
        this.b.a();
        return super.b(n2, n3, l2);
    }

    @Override
    public g Q() {
        this.b.a();
        return super.Q();
    }

    @Override
    public g h(int n2, int n3) {
        this.b.a();
        return super.h(n2, n3);
    }

    @Override
    public int T() {
        this.b.a();
        return super.T();
    }

    @Override
    public ByteBuffer U() {
        this.b.a();
        return super.U();
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        this.b.a();
        return super.j(n2, n3);
    }

    @Override
    public ByteBuffer[] V() {
        this.b.a();
        return super.V();
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        this.b.a();
        return super.l(n2, n3);
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        this.b.a();
        return super.k(n2, n3);
    }

    @Override
    public String a(Charset charset) {
        this.b.a();
        return super.a(charset);
    }

    @Override
    public String a(int n2, int n3, Charset charset) {
        this.b.a();
        return super.a(n2, n3, charset);
    }

    @Override
    public g ab() {
        this.b.a();
        return super.ab();
    }

    @Override
    public g H(int n2) {
        this.b.a();
        return super.H(n2);
    }

    @Override
    public g f(int n2) {
        this.b.a();
        return super.f(n2);
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.H(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.ab();
    }
}

