/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.ad;
import com.sun.jna.ax;
import com.sun.jna.ay;
import com.sun.jna.bx;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ac
extends ay {
    private static final Map b = Collections.synchronizedMap(ax.j ? new bx() : new HashMap());
    protected long a;

    public static void b() {
        b.size();
    }

    public ac(long l2) {
        this.a = l2;
        if (l2 <= 0L) {
            throw new IllegalArgumentException("Allocation size must be greater than zero");
        }
        this.J = ac.k(l2);
        if (this.J == 0L) {
            throw new OutOfMemoryError("Cannot allocate " + l2 + " bytes");
        }
    }

    protected ac() {
    }

    public ay a(long l2) {
        return this.a(l2, this.h() - l2);
    }

    public ay a(long l2, long l3) {
        if (l2 == 0L && l3 == this.h()) {
            return this;
        }
        this.b(l2, l3);
        return new ad(this, l2);
    }

    public ac a(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("Byte boundary must be positive: " + n2);
        }
        for (int i2 = 0; i2 < 32; ++i2) {
            if (n2 != 1 << i2) continue;
            long l2 = (long)n2 - 1L ^ 0xFFFFFFFFFFFFFFFFL;
            if ((this.J & l2) != this.J) {
                long l3 = this.J + (long)n2 - 1L & l2;
                long l4 = this.J + this.a - l3;
                if (l4 <= 0L) {
                    throw new IllegalArgumentException("Insufficient memory to align to the requested boundary");
                }
                return (ac)this.a(l3 - this.J, l4);
            }
            return this;
        }
        throw new IllegalArgumentException("Byte boundary must be a power of two");
    }

    protected void finalize() {
        this.c();
    }

    protected synchronized void c() {
        ac.j(this.J);
        this.J = 0L;
    }

    public void d() {
        this.m(this.a);
    }

    public boolean e() {
        return this.f();
    }

    public boolean f() {
        return this.J != 0L;
    }

    public long g() {
        return this.a;
    }

    public long h() {
        return this.g();
    }

    protected void b(long l2, long l3) {
        if (l2 < 0L) {
            throw new IndexOutOfBoundsException("Invalid offset: " + l2);
        }
        if (l2 + l3 > this.a) {
            String string = "Bounds exceeds available space : size=" + this.a + ", offset=" + (l2 + l3);
            throw new IndexOutOfBoundsException(string);
        }
    }

    public void a(long l2, byte[] arrby, int n2, int n3) {
        this.b(l2, (long)n3 * 1L);
        super.a(l2, arrby, n2, n3);
    }

    public void a(long l2, short[] arrs, int n2, int n3) {
        this.b(l2, (long)n3 * 2L);
        super.a(l2, arrs, n2, n3);
    }

    public void a(long l2, char[] arrc, int n2, int n3) {
        this.b(l2, (long)n3 * 2L);
        super.a(l2, arrc, n2, n3);
    }

    public void a(long l2, int[] arrn, int n2, int n3) {
        this.b(l2, (long)n3 * 4L);
        super.a(l2, arrn, n2, n3);
    }

    public void a(long l2, long[] arrl, int n2, int n3) {
        this.b(l2, (long)n3 * 8L);
        super.a(l2, arrl, n2, n3);
    }

    public void a(long l2, float[] arrf, int n2, int n3) {
        this.b(l2, (long)n3 * 4L);
        super.a(l2, arrf, n2, n3);
    }

    public void a(long l2, double[] arrd, int n2, int n3) {
        this.b(l2, (long)n3 * 8L);
        super.a(l2, arrd, n2, n3);
    }

    public void b(long l2, byte[] arrby, int n2, int n3) {
        this.b(l2, (long)n3 * 1L);
        super.b(l2, arrby, n2, n3);
    }

    public void b(long l2, short[] arrs, int n2, int n3) {
        this.b(l2, (long)n3 * 2L);
        super.b(l2, arrs, n2, n3);
    }

    public void b(long l2, char[] arrc, int n2, int n3) {
        this.b(l2, (long)n3 * 2L);
        super.b(l2, arrc, n2, n3);
    }

    public void b(long l2, int[] arrn, int n2, int n3) {
        this.b(l2, (long)n3 * 4L);
        super.b(l2, arrn, n2, n3);
    }

    public void b(long l2, long[] arrl, int n2, int n3) {
        this.b(l2, (long)n3 * 8L);
        super.b(l2, arrl, n2, n3);
    }

    public void b(long l2, float[] arrf, int n2, int n3) {
        this.b(l2, (long)n3 * 4L);
        super.b(l2, arrf, n2, n3);
    }

    public void b(long l2, double[] arrd, int n2, int n3) {
        this.b(l2, (long)n3 * 8L);
        super.b(l2, arrd, n2, n3);
    }

    public byte b(long l2) {
        this.b(l2, 1L);
        return super.b(l2);
    }

    public char c(long l2) {
        this.b(l2, 1L);
        return super.c(l2);
    }

    public short d(long l2) {
        this.b(l2, 2L);
        return super.d(l2);
    }

    public int e(long l2) {
        this.b(l2, 4L);
        return super.e(l2);
    }

    public long f(long l2) {
        this.b(l2, 8L);
        return super.f(l2);
    }

    public float g(long l2) {
        this.b(l2, 4L);
        return super.g(l2);
    }

    public double h(long l2) {
        this.b(l2, 8L);
        return super.h(l2);
    }

    public ay i(long l2) {
        this.b(l2, (long)ay.H);
        return super.i(l2);
    }

    public ByteBuffer c(long l2, long l3) {
        this.b(l2, l3);
        ByteBuffer byteBuffer = super.c(l2, l3);
        b.put(byteBuffer, this);
        return byteBuffer;
    }

    public String a(long l2, boolean bl2) {
        this.b(l2, 0L);
        return super.a(l2, bl2);
    }

    public void a(long l2, byte by2) {
        this.b(l2, 1L);
        super.a(l2, by2);
    }

    public void a(long l2, char c2) {
        this.b(l2, (long)Native.c);
        super.a(l2, c2);
    }

    public void a(long l2, short s2) {
        this.b(l2, 2L);
        super.a(l2, s2);
    }

    public void a(long l2, int n2) {
        this.b(l2, 4L);
        super.a(l2, n2);
    }

    public void d(long l2, long l3) {
        this.b(l2, 8L);
        super.d(l2, l3);
    }

    public void a(long l2, float f2) {
        this.b(l2, 4L);
        super.a(l2, f2);
    }

    public void a(long l2, double d2) {
        this.b(l2, 8L);
        super.a(l2, d2);
    }

    public void a(long l2, ay ay2) {
        this.b(l2, (long)ay.H);
        super.a(l2, ay2);
    }

    public void a(long l2, String string, boolean bl2) {
        if (bl2) {
            this.b(l2, ((long)string.length() + 1L) * (long)Native.c);
        } else {
            this.b(l2, (long)string.getBytes().length + 1L);
        }
        super.a(l2, string, bl2);
    }

    public String toString() {
        return "allocated@0x" + Long.toHexString(this.J) + " (" + this.a + " bytes)";
    }

    protected static void j(long l2) {
        Native.free(l2);
    }

    protected static long k(long l2) {
        return Native.malloc(l2);
    }
}

