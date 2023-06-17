/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.af;
import io.netty.b.bg;
import io.netty.b.bh;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.l;
import io.netty.b.w;
import io.netty.util.ab;
import io.netty.util.c.ad;
import io.netty.util.c.u;
import io.netty.util.n;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public abstract class a
extends g {
    static final ab a = new ab(g.class);
    int b;
    int c;
    private int d;
    private int e;
    private int f;
    private bh g;

    protected a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("maxCapacity: " + n2 + " (expected: >= 0)");
        }
        this.f = n2;
    }

    @Override
    public int k() {
        return this.f;
    }

    protected final void a(int n2) {
        this.f = n2;
    }

    @Override
    public int p() {
        return this.b;
    }

    @Override
    public g g(int n2) {
        if (n2 < 0 || n2 > this.c) {
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d (expected: 0 <= readerIndex <= writerIndex(%d))", n2, this.c));
        }
        this.b = n2;
        return this;
    }

    @Override
    public int q() {
        return this.c;
    }

    @Override
    public g h(int n2) {
        if (n2 < this.b || n2 > this.j()) {
            throw new IndexOutOfBoundsException(String.format("writerIndex: %d (expected: readerIndex(%d) <= writerIndex <= capacity(%d))", n2, this.b, this.j()));
        }
        this.c = n2;
        return this;
    }

    @Override
    public g a(int n2, int n3) {
        if (n2 < 0 || n2 > n3 || n3 > this.j()) {
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d, writerIndex: %d (expected: 0 <= readerIndex <= writerIndex <= capacity(%d))", n2, n3, this.j()));
        }
        this.b = n2;
        this.c = n3;
        return this;
    }

    @Override
    public g w() {
        this.c = 0;
        this.b = 0;
        return this;
    }

    @Override
    public boolean u() {
        return this.c > this.b;
    }

    @Override
    public boolean i(int n2) {
        return this.c - this.b >= n2;
    }

    @Override
    public boolean v() {
        return this.j() > this.c;
    }

    @Override
    public boolean j(int n2) {
        return this.j() - this.c >= n2;
    }

    @Override
    public int r() {
        return this.c - this.b;
    }

    @Override
    public int s() {
        return this.j() - this.c;
    }

    @Override
    public int t() {
        return this.k() - this.c;
    }

    @Override
    public g x() {
        this.d = this.b;
        return this;
    }

    @Override
    public g y() {
        this.g(this.d);
        return this;
    }

    @Override
    public g z() {
        this.e = this.c;
        return this;
    }

    @Override
    public g A() {
        this.c = this.e;
        return this;
    }

    @Override
    public g B() {
        this.b();
        if (this.b == 0) {
            return this;
        }
        if (this.b != this.c) {
            this.b(0, this, this.b, this.c - this.b);
            this.c -= this.b;
            this.b(this.b);
            this.b = 0;
        } else {
            this.b(this.b);
            this.b = 0;
            this.c = 0;
        }
        return this;
    }

    @Override
    public g C() {
        this.b();
        if (this.b == 0) {
            return this;
        }
        if (this.b == this.c) {
            this.b(this.b);
            this.b = 0;
            this.c = 0;
            return this;
        }
        if (this.b >= this.j() >>> 1) {
            this.b(0, this, this.b, this.c - this.b);
            this.c -= this.b;
            this.b(this.b);
            this.b = 0;
        }
        return this;
    }

    protected final void b(int n2) {
        int n3 = this.d;
        if (n3 <= n2) {
            this.d = 0;
            int n4 = this.e;
            this.e = n4 <= n2 ? 0 : n4 - n2;
        } else {
            this.d = n3 - n2;
            this.e -= n2;
        }
    }

    @Override
    public g k(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException(String.format("minWritableBytes: %d (expected: >= 0)", n2));
        }
        if (n2 <= this.s()) {
            return this;
        }
        if (n2 > this.f - this.c) {
            throw new IndexOutOfBoundsException(String.format("writerIndex(%d) + minWritableBytes(%d) exceeds maxCapacity(%d): %s", this.c, n2, this.f, this));
        }
        int n3 = this.O(this.c + n2);
        this.f(n3);
        return this;
    }

    @Override
    public int a(int n2, boolean bl2) {
        if (n2 < 0) {
            throw new IllegalArgumentException(String.format("minWritableBytes: %d (expected: >= 0)", n2));
        }
        if (n2 <= this.s()) {
            return 0;
        }
        if (n2 > this.f - this.c && bl2) {
            if (this.j() == this.k()) {
                return 1;
            }
            this.f(this.k());
            return 3;
        }
        int n3 = this.O(this.c + n2);
        this.f(n3);
        return 2;
    }

    private int O(int n2) {
        int n3;
        int n4 = this.f;
        int n5 = 0x400000;
        if (n2 == 0x400000) {
            return 0x400000;
        }
        if (n2 > 0x400000) {
            int n6 = n2 / 0x400000 * 0x400000;
            n6 = n6 > n4 - 0x400000 ? n4 : (n6 += 0x400000);
            return n6;
        }
        for (n3 = 64; n3 < n2; n3 <<= 1) {
        }
        return Math.min(n3, n4);
    }

    @Override
    public g a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.m()) {
            return this;
        }
        bh bh2 = this.g;
        if (bh2 == null) {
            this.g = bh2 = this.a();
        }
        return bh2;
    }

    protected bh a() {
        return new bh(this);
    }

    @Override
    public byte m(int n2) {
        this.M(n2);
        return this.c(n2);
    }

    protected abstract byte c(int var1);

    @Override
    public boolean l(int n2) {
        return this.m(n2) != 0;
    }

    @Override
    public short n(int n2) {
        return (short)(this.m(n2) & 0xFF);
    }

    @Override
    public short o(int n2) {
        this.q(n2, 2);
        return this.d(n2);
    }

    protected abstract short d(int var1);

    @Override
    public int p(int n2) {
        return this.o(n2) & 0xFFFF;
    }

    @Override
    public int r(int n2) {
        this.q(n2, 3);
        return this.e(n2);
    }

    protected abstract int e(int var1);

    @Override
    public int q(int n2) {
        int n3 = this.r(n2);
        if ((n3 & 0x800000) != 0) {
            n3 |= 0xFF000000;
        }
        return n3;
    }

    @Override
    public int s(int n2) {
        this.q(n2, 4);
        return this.K(n2);
    }

    protected abstract int K(int var1);

    @Override
    public long t(int n2) {
        return (long)this.s(n2) & 0xFFFFFFFFL;
    }

    @Override
    public long u(int n2) {
        this.q(n2, 8);
        return this.L(n2);
    }

    protected abstract long L(int var1);

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
    public g a(int n2, byte[] arrby) {
        this.a(n2, arrby, 0, arrby.length);
        return this;
    }

    @Override
    public g a(int n2, g g2) {
        this.a(n2, g2, g2.s());
        return this;
    }

    @Override
    public g a(int n2, g g2, int n3) {
        this.a(n2, g2, g2.q(), n3);
        g2.h(g2.q() + n3);
        return this;
    }

    @Override
    public g b(int n2, int n3) {
        this.M(n2);
        this.m(n2, n3);
        return this;
    }

    protected abstract void m(int var1, int var2);

    @Override
    public g b(int n2, boolean bl2) {
        this.b(n2, bl2 ? 1 : 0);
        return this;
    }

    @Override
    public g c(int n2, int n3) {
        this.q(n2, 2);
        this.n(n2, n3);
        return this;
    }

    protected abstract void n(int var1, int var2);

    @Override
    public g f(int n2, int n3) {
        this.c(n2, n3);
        return this;
    }

    @Override
    public g d(int n2, int n3) {
        this.q(n2, 3);
        this.o(n2, n3);
        return this;
    }

    protected abstract void o(int var1, int var2);

    @Override
    public g e(int n2, int n3) {
        this.q(n2, 4);
        this.p(n2, n3);
        return this;
    }

    protected abstract void p(int var1, int var2);

    @Override
    public g a(int n2, float f2) {
        this.e(n2, Float.floatToRawIntBits(f2));
        return this;
    }

    @Override
    public g a(int n2, long l2) {
        this.q(n2, 8);
        this.b(n2, l2);
        return this;
    }

    protected abstract void b(int var1, long var2);

    @Override
    public g a(int n2, double d2) {
        this.a(n2, Double.doubleToRawLongBits(d2));
        return this;
    }

    @Override
    public g b(int n2, byte[] arrby) {
        this.b(n2, arrby, 0, arrby.length);
        return this;
    }

    @Override
    public g b(int n2, g g2) {
        this.b(n2, g2, g2.r());
        return this;
    }

    @Override
    public g b(int n2, g g2, int n3) {
        this.q(n2, n3);
        if (g2 == null) {
            throw new NullPointerException("src");
        }
        if (n3 > g2.r()) {
            throw new IndexOutOfBoundsException(String.format("length(%d) exceeds src.readableBytes(%d) where src is: %s", n3, g2.r(), g2));
        }
        this.b(n2, g2, g2.p(), n3);
        g2.g(g2.p() + n3);
        return this;
    }

    @Override
    public g g(int n2, int n3) {
        int n4;
        if (n3 == 0) {
            return this;
        }
        this.q(n2, n3);
        int n5 = n3 >>> 3;
        int n6 = n3 & 7;
        for (n4 = n5; n4 > 0; --n4) {
            this.a(n2, 0L);
            n2 += 8;
        }
        if (n6 == 4) {
            this.e(n2, 0);
        } else if (n6 < 4) {
            for (n4 = n6; n4 > 0; --n4) {
                this.b(n2, 0);
                ++n2;
            }
        } else {
            this.e(n2, 0);
            n2 += 4;
            for (n4 = n6 - 4; n4 > 0; --n4) {
                this.b(n2, 0);
                ++n2;
            }
        }
        return this;
    }

    @Override
    public byte E() {
        this.N(1);
        int n2 = this.b;
        byte by2 = this.m(n2);
        this.b = n2 + 1;
        return by2;
    }

    @Override
    public boolean D() {
        return this.E() != 0;
    }

    @Override
    public short F() {
        return (short)(this.E() & 0xFF);
    }

    @Override
    public short G() {
        this.N(2);
        short s2 = this.d(this.b);
        this.b += 2;
        return s2;
    }

    @Override
    public int H() {
        return this.G() & 0xFFFF;
    }

    @Override
    public int I() {
        int n2 = this.J();
        if ((n2 & 0x800000) != 0) {
            n2 |= 0xFF000000;
        }
        return n2;
    }

    @Override
    public int J() {
        this.N(3);
        int n2 = this.e(this.b);
        this.b += 3;
        return n2;
    }

    @Override
    public int K() {
        this.N(4);
        int n2 = this.K(this.b);
        this.b += 4;
        return n2;
    }

    @Override
    public long L() {
        return (long)this.K() & 0xFFFFFFFFL;
    }

    @Override
    public long M() {
        this.N(8);
        long l2 = this.L(this.b);
        this.b += 8;
        return l2;
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
        this.N(n2);
        if (n2 == 0) {
            return bi.c;
        }
        g g2 = bi.a(n2, this.f);
        g2.b(this, this.b, n2);
        this.b += n2;
        return g2;
    }

    @Override
    public g z(int n2) {
        g g2 = this.i(this.b, n2);
        this.b += n2;
        return g2;
    }

    @Override
    public g a(byte[] arrby, int n2, int n3) {
        this.N(n3);
        this.a(this.b, arrby, n2, n3);
        this.b += n3;
        return this;
    }

    @Override
    public g b(byte[] arrby) {
        this.a(arrby, 0, arrby.length);
        return this;
    }

    @Override
    public g a(g g2) {
        this.a(g2, g2.s());
        return this;
    }

    @Override
    public g a(g g2, int n2) {
        if (n2 > g2.s()) {
            throw new IndexOutOfBoundsException(String.format("length(%d) exceeds dst.writableBytes(%d) where dst is: %s", n2, g2.s(), g2));
        }
        this.a(g2, g2.q(), n2);
        g2.h(g2.q() + n2);
        return this;
    }

    @Override
    public g a(g g2, int n2, int n3) {
        this.N(n3);
        this.a(this.b, g2, n2, n3);
        this.b += n3;
        return this;
    }

    @Override
    public g a(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.remaining();
        this.N(n2);
        this.a(this.b, byteBuffer);
        this.b += n2;
        return this;
    }

    @Override
    public int a(GatheringByteChannel gatheringByteChannel, int n2) {
        this.N(n2);
        int n3 = this.a(this.b, gatheringByteChannel, n2);
        this.b += n3;
        return n3;
    }

    @Override
    public g a(OutputStream outputStream, int n2) {
        this.N(n2);
        this.a(this.b, outputStream, n2);
        this.b += n2;
        return this;
    }

    @Override
    public g A(int n2) {
        this.N(n2);
        this.b += n2;
        return this;
    }

    @Override
    public g a(boolean bl2) {
        this.B(bl2 ? 1 : 0);
        return this;
    }

    @Override
    public g B(int n2) {
        this.b();
        this.k(1);
        this.m(this.c++, n2);
        return this;
    }

    @Override
    public g C(int n2) {
        this.b();
        this.k(2);
        this.n(this.c, n2);
        this.c += 2;
        return this;
    }

    @Override
    public g D(int n2) {
        this.b();
        this.k(3);
        this.o(this.c, n2);
        this.c += 3;
        return this;
    }

    @Override
    public g E(int n2) {
        this.b();
        this.k(4);
        this.p(this.c, n2);
        this.c += 4;
        return this;
    }

    @Override
    public g b(long l2) {
        this.b();
        this.k(8);
        this.b(this.c, l2);
        this.c += 8;
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
    public g b(byte[] arrby, int n2, int n3) {
        this.b();
        this.k(n3);
        this.b(this.c, arrby, n2, n3);
        this.c += n3;
        return this;
    }

    @Override
    public g c(byte[] arrby) {
        this.b(arrby, 0, arrby.length);
        return this;
    }

    @Override
    public g b(g g2) {
        this.b(g2, g2.r());
        return this;
    }

    @Override
    public g b(g g2, int n2) {
        if (n2 > g2.r()) {
            throw new IndexOutOfBoundsException(String.format("length(%d) exceeds src.readableBytes(%d) where src is: %s", n2, g2.r(), g2));
        }
        this.b(g2, g2.p(), n2);
        g2.g(g2.p() + n2);
        return this;
    }

    @Override
    public g b(g g2, int n2, int n3) {
        this.b();
        this.k(n3);
        this.b(this.c, g2, n2, n3);
        this.c += n3;
        return this;
    }

    @Override
    public g b(ByteBuffer byteBuffer) {
        this.b();
        int n2 = byteBuffer.remaining();
        this.k(n2);
        this.b(this.c, byteBuffer);
        this.c += n2;
        return this;
    }

    @Override
    public int a(InputStream inputStream, int n2) {
        this.b();
        this.k(n2);
        int n3 = this.a(this.c, inputStream, n2);
        if (n3 > 0) {
            this.c += n3;
        }
        return n3;
    }

    @Override
    public int a(ScatteringByteChannel scatteringByteChannel, int n2) {
        this.b();
        this.k(n2);
        int n3 = this.a(this.c, scatteringByteChannel, n2);
        if (n3 > 0) {
            this.c += n3;
        }
        return n3;
    }

    @Override
    public g G(int n2) {
        int n3;
        if (n2 == 0) {
            return this;
        }
        this.k(n2);
        this.q(this.c, n2);
        int n4 = n2 >>> 3;
        int n5 = n2 & 7;
        for (n3 = n4; n3 > 0; --n3) {
            this.b(0L);
        }
        if (n5 == 4) {
            this.E(0);
        } else if (n5 < 4) {
            for (n3 = n5; n3 > 0; --n3) {
                this.B(0);
            }
        } else {
            this.E(0);
            for (n3 = n5 - 4; n3 > 0; --n3) {
                this.B(0);
            }
        }
        return this;
    }

    @Override
    public g Q() {
        return this.h(this.b, this.r());
    }

    @Override
    public g S() {
        return new af(this);
    }

    @Override
    public g R() {
        return this.i(this.b, this.r());
    }

    @Override
    public g i(int n2, int n3) {
        if (n3 == 0) {
            return bi.c;
        }
        return new bg(this, n2, n3);
    }

    @Override
    public ByteBuffer U() {
        return this.j(this.b, this.r());
    }

    @Override
    public ByteBuffer[] V() {
        return this.l(this.b, this.r());
    }

    @Override
    public String a(Charset charset) {
        return this.a(this.b, this.r(), charset);
    }

    @Override
    public String a(int n2, int n3, Charset charset) {
        ByteBuffer byteBuffer;
        if (n3 == 0) {
            return "";
        }
        if (this.T() == 1) {
            byteBuffer = this.j(n2, n3);
        } else {
            byteBuffer = ByteBuffer.allocate(n3);
            this.a(n2, byteBuffer);
            byteBuffer.flip();
        }
        return w.a(byteBuffer, charset);
    }

    @Override
    public int a(int n2, int n3, byte by2) {
        return w.a(this, n2, n3, by2);
    }

    @Override
    public int a(byte by2) {
        return this.b(this.p(), this.r(), by2);
    }

    @Override
    public int a(int n2, byte by2) {
        this.N(n2);
        return this.b(this.p(), n2, by2);
    }

    @Override
    public int b(int n2, int n3, byte by2) {
        int n4 = this.a(n2, n2 + n3, by2);
        if (n4 < 0) {
            return -1;
        }
        return n4 - n2;
    }

    @Override
    public int a(l l2) {
        int n2 = this.b;
        int n3 = this.c - n2;
        this.b();
        return this.c(n2, n3, l2);
    }

    @Override
    public int a(int n2, int n3, l l2) {
        this.q(n2, n3);
        return this.c(n2, n3, l2);
    }

    private int c(int n2, int n3, l l2) {
        if (l2 == null) {
            throw new NullPointerException("processor");
        }
        if (n3 == 0) {
            return -1;
        }
        int n4 = n2 + n3;
        int n5 = n2;
        try {
            do {
                if (l2.a(this.c(n5))) continue;
                return n5;
            } while (++n5 < n4);
        }
        catch (Exception exception) {
            u.a(exception);
        }
        return -1;
    }

    @Override
    public int b(l l2) {
        int n2 = this.b;
        int n3 = this.c - n2;
        this.b();
        return this.d(n2, n3, l2);
    }

    @Override
    public int b(int n2, int n3, l l2) {
        this.q(n2, n3);
        return this.d(n2, n3, l2);
    }

    private int d(int n2, int n3, l l2) {
        if (l2 == null) {
            throw new NullPointerException("processor");
        }
        if (n3 == 0) {
            return -1;
        }
        int n4 = n2 + n3 - 1;
        try {
            do {
                if (l2.a(this.c(n4))) continue;
                return n4;
            } while (--n4 >= n2);
        }
        catch (Exception exception) {
            u.a(exception);
        }
        return -1;
    }

    @Override
    public int hashCode() {
        return w.b(this);
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
        g g2;
        if (this.ac() == 0) {
            return ad.a(this) + "(freed)";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append("(ridx: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", widx: ");
        stringBuilder.append(this.c);
        stringBuilder.append(", cap: ");
        stringBuilder.append(this.j());
        if (this.f != Integer.MAX_VALUE) {
            stringBuilder.append('/');
            stringBuilder.append(this.f);
        }
        if ((g2 = this.n()) != null) {
            stringBuilder.append(", unwrapped: ");
            stringBuilder.append(g2);
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    protected final void M(int n2) {
        this.b();
        if (n2 < 0 || n2 >= this.j()) {
            throw new IndexOutOfBoundsException(String.format("index: %d (expected: range(0, %d))", n2, this.j()));
        }
    }

    protected final void q(int n2, int n3) {
        this.b();
        if (n3 < 0) {
            throw new IllegalArgumentException("length: " + n3 + " (expected: >= 0)");
        }
        if (n2 < 0 || n2 > this.j() - n3) {
            throw new IndexOutOfBoundsException(String.format("index: %d, length: %d (expected: range(0, %d))", n2, n3, this.j()));
        }
    }

    protected final void a(int n2, int n3, int n4, int n5) {
        this.q(n2, n3);
        if (n4 < 0 || n4 > n5 - n3) {
            throw new IndexOutOfBoundsException(String.format("srcIndex: %d, length: %d (expected: range(0, %d))", n4, n3, n5));
        }
    }

    protected final void b(int n2, int n3, int n4, int n5) {
        this.q(n2, n3);
        if (n4 < 0 || n4 > n5 - n3) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", n4, n3, n5));
        }
    }

    protected final void N(int n2) {
        this.b();
        if (n2 < 0) {
            throw new IllegalArgumentException("minimumReadableBytes: " + n2 + " (expected: >= 0)");
        }
        if (this.b > this.c - n2) {
            throw new IndexOutOfBoundsException(String.format("readerIndex(%d) + length(%d) exceeds writerIndex(%d): %s", this.b, n2, this.c, this));
        }
    }

    protected final void b() {
        if (this.ac() == 0) {
            throw new n(0);
        }
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.c((g)object);
    }
}

