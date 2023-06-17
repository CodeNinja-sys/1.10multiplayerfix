/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.h;
import io.netty.b.l;
import io.netty.util.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public abstract class g
implements z,
Comparable {
    public abstract int j();

    public abstract g f(int var1);

    public abstract int k();

    public abstract h l();

    public abstract ByteOrder m();

    public abstract g a(ByteOrder var1);

    public abstract g n();

    public abstract boolean o();

    public abstract int p();

    public abstract g g(int var1);

    public abstract int q();

    public abstract g h(int var1);

    public abstract g a(int var1, int var2);

    public abstract int r();

    public abstract int s();

    public abstract int t();

    public abstract boolean u();

    public abstract boolean i(int var1);

    public abstract boolean v();

    public abstract boolean j(int var1);

    public abstract g w();

    public abstract g x();

    public abstract g y();

    public abstract g z();

    public abstract g A();

    public abstract g B();

    public abstract g C();

    public abstract g k(int var1);

    public abstract int a(int var1, boolean var2);

    public abstract boolean l(int var1);

    public abstract byte m(int var1);

    public abstract short n(int var1);

    public abstract short o(int var1);

    public abstract int p(int var1);

    public abstract int q(int var1);

    public abstract int r(int var1);

    public abstract int s(int var1);

    public abstract long t(int var1);

    public abstract long u(int var1);

    public abstract char v(int var1);

    public abstract float w(int var1);

    public abstract double x(int var1);

    public abstract g a(int var1, g var2);

    public abstract g a(int var1, g var2, int var3);

    public abstract g a(int var1, g var2, int var3, int var4);

    public abstract g a(int var1, byte[] var2);

    public abstract g a(int var1, byte[] var2, int var3, int var4);

    public abstract g a(int var1, ByteBuffer var2);

    public abstract g a(int var1, OutputStream var2, int var3);

    public abstract int a(int var1, GatheringByteChannel var2, int var3);

    public abstract g b(int var1, boolean var2);

    public abstract g b(int var1, int var2);

    public abstract g c(int var1, int var2);

    public abstract g d(int var1, int var2);

    public abstract g e(int var1, int var2);

    public abstract g a(int var1, long var2);

    public abstract g f(int var1, int var2);

    public abstract g a(int var1, float var2);

    public abstract g a(int var1, double var2);

    public abstract g b(int var1, g var2);

    public abstract g b(int var1, g var2, int var3);

    public abstract g b(int var1, g var2, int var3, int var4);

    public abstract g b(int var1, byte[] var2);

    public abstract g b(int var1, byte[] var2, int var3, int var4);

    public abstract g b(int var1, ByteBuffer var2);

    public abstract int a(int var1, InputStream var2, int var3);

    public abstract int a(int var1, ScatteringByteChannel var2, int var3);

    public abstract g g(int var1, int var2);

    public abstract boolean D();

    public abstract byte E();

    public abstract short F();

    public abstract short G();

    public abstract int H();

    public abstract int I();

    public abstract int J();

    public abstract int K();

    public abstract long L();

    public abstract long M();

    public abstract char N();

    public abstract float O();

    public abstract double P();

    public abstract g y(int var1);

    public abstract g z(int var1);

    public abstract g a(g var1);

    public abstract g a(g var1, int var2);

    public abstract g a(g var1, int var2, int var3);

    public abstract g b(byte[] var1);

    public abstract g a(byte[] var1, int var2, int var3);

    public abstract g a(ByteBuffer var1);

    public abstract g a(OutputStream var1, int var2);

    public abstract int a(GatheringByteChannel var1, int var2);

    public abstract g A(int var1);

    public abstract g a(boolean var1);

    public abstract g B(int var1);

    public abstract g C(int var1);

    public abstract g D(int var1);

    public abstract g E(int var1);

    public abstract g b(long var1);

    public abstract g F(int var1);

    public abstract g a(float var1);

    public abstract g a(double var1);

    public abstract g b(g var1);

    public abstract g b(g var1, int var2);

    public abstract g b(g var1, int var2, int var3);

    public abstract g c(byte[] var1);

    public abstract g b(byte[] var1, int var2, int var3);

    public abstract g b(ByteBuffer var1);

    public abstract int a(InputStream var1, int var2);

    public abstract int a(ScatteringByteChannel var1, int var2);

    public abstract g G(int var1);

    public abstract int a(int var1, int var2, byte var3);

    public abstract int a(byte var1);

    public abstract int a(int var1, byte var2);

    public abstract int b(int var1, int var2, byte var3);

    public abstract int a(l var1);

    public abstract int a(int var1, int var2, l var3);

    public abstract int b(l var1);

    public abstract int b(int var1, int var2, l var3);

    public abstract g Q();

    public abstract g h(int var1, int var2);

    public abstract g R();

    public abstract g i(int var1, int var2);

    public abstract g S();

    public abstract int T();

    public abstract ByteBuffer U();

    public abstract ByteBuffer j(int var1, int var2);

    public abstract ByteBuffer k(int var1, int var2);

    public abstract ByteBuffer[] V();

    public abstract ByteBuffer[] l(int var1, int var2);

    public abstract boolean W();

    public abstract byte[] X();

    public abstract int Y();

    public abstract boolean Z();

    public abstract long aa();

    public abstract String a(Charset var1);

    public abstract String a(int var1, int var2, Charset var3);

    public abstract int hashCode();

    public abstract boolean equals(Object var1);

    public abstract int c(g var1);

    public abstract String toString();

    public abstract g H(int var1);

    public abstract g ab();

    @Override
    public /* synthetic */ z J(int n2) {
        return this.H(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.ab();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.c((g)object);
    }
}

