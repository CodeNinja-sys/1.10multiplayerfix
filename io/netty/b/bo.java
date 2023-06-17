/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.a;
import io.netty.b.bh;
import io.netty.b.g;
import io.netty.util.c.u;
import java.nio.ByteOrder;

final class bo
extends bh {
    private static final boolean a = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    private final boolean b;
    private final a c;

    bo(a a2) {
        super(a2);
        this.c = a2;
        this.b = a == (this.m() == ByteOrder.BIG_ENDIAN);
    }

    private long a(int n2) {
        return this.c.aa() + (long)n2;
    }

    @Override
    public long u(int n2) {
        this.c.q(n2, 8);
        long l2 = u.f(this.a(n2));
        return this.b ? l2 : Long.reverseBytes(l2);
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
    public char v(int n2) {
        return (char)this.o(n2);
    }

    @Override
    public long t(int n2) {
        return (long)this.s(n2) & 0xFFFFFFFFL;
    }

    @Override
    public int s(int n2) {
        this.c.q(n2, 4);
        int n3 = u.e(this.a(n2));
        return this.b ? n3 : Integer.reverseBytes(n3);
    }

    @Override
    public int p(int n2) {
        return this.o(n2) & 0xFFFF;
    }

    @Override
    public short o(int n2) {
        this.c.q(n2, 2);
        short s2 = u.d(this.a(n2));
        return this.b ? s2 : Short.reverseBytes(s2);
    }

    @Override
    public g c(int n2, int n3) {
        this.c.q(n2, 2);
        this.m(n2, n3);
        return this;
    }

    @Override
    public g e(int n2, int n3) {
        this.c.q(n2, 4);
        this.n(n2, n3);
        return this;
    }

    @Override
    public g a(int n2, long l2) {
        this.c.q(n2, 8);
        this.b(n2, l2);
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
    public g C(int n2) {
        this.c.b();
        this.c.k(2);
        this.m(this.c.c, n2);
        this.c.c += 2;
        return this;
    }

    @Override
    public g E(int n2) {
        this.c.b();
        this.c.k(4);
        this.n(this.c.c, n2);
        this.c.c += 4;
        return this;
    }

    @Override
    public g b(long l2) {
        this.c.b();
        this.c.k(8);
        this.b(this.c.c, l2);
        this.c.c += 8;
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

    private void m(int n2, int n3) {
        u.a(this.a(n2), this.b ? (short)n3 : Short.reverseBytes((short)n3));
    }

    private void n(int n2, int n3) {
        u.a(this.a(n2), this.b ? n3 : Integer.reverseBytes(n3));
    }

    private void b(int n2, long l2) {
        u.a(this.a(n2), this.b ? l2 : Long.reverseBytes(l2));
    }
}

