/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.b.l;
import io.netty.util.c.ad;
import io.netty.util.c.d;
import io.netty.util.c.u;
import io.netty.util.z;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public final class ag
extends g {
    private static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    private static final long b;
    private final h c;
    private final ByteOrder d;
    private final String e;
    private ag f;

    public ag(h h2) {
        this(h2, ByteOrder.BIG_ENDIAN);
    }

    private ag(h h2, ByteOrder byteOrder) {
        if (h2 == null) {
            throw new NullPointerException("alloc");
        }
        this.c = h2;
        this.d = byteOrder;
        this.e = ad.a(this) + (byteOrder == ByteOrder.BIG_ENDIAN ? "BE" : "LE");
    }

    @Override
    public int j() {
        return 0;
    }

    @Override
    public g f(int n2) {
        throw new ReadOnlyBufferException();
    }

    @Override
    public h l() {
        return this.c;
    }

    @Override
    public ByteOrder m() {
        return this.d;
    }

    @Override
    public g n() {
        return null;
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public int k() {
        return 0;
    }

    @Override
    public g a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.m()) {
            return this;
        }
        ag ag2 = this.f;
        if (ag2 != null) {
            return ag2;
        }
        this.f = ag2 = new ag(this.l(), byteOrder);
        return ag2;
    }

    @Override
    public int p() {
        return 0;
    }

    @Override
    public g g(int n2) {
        return this.a(n2);
    }

    @Override
    public int q() {
        return 0;
    }

    @Override
    public g h(int n2) {
        return this.a(n2);
    }

    @Override
    public g a(int n2, int n3) {
        this.a(n2);
        this.a(n3);
        return this;
    }

    @Override
    public int r() {
        return 0;
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
    public boolean u() {
        return false;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public g w() {
        return this;
    }

    @Override
    public g x() {
        return this;
    }

    @Override
    public g y() {
        return this;
    }

    @Override
    public g z() {
        return this;
    }

    @Override
    public g A() {
        return this;
    }

    @Override
    public g B() {
        return this;
    }

    @Override
    public g C() {
        return this;
    }

    @Override
    public g k(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("minWritableBytes: " + n2 + " (expected: >= 0)");
        }
        if (n2 != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }

    @Override
    public int a(int n2, boolean bl2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("minWritableBytes: " + n2 + " (expected: >= 0)");
        }
        if (n2 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public boolean l(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public byte m(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public short n(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public short o(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int p(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int q(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int r(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int s(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public long t(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public long u(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public char v(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public float w(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public double x(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g a(int n2, g g2) {
        return this.m(n2, g2.s());
    }

    @Override
    public g a(int n2, g g2, int n3) {
        return this.m(n2, n3);
    }

    @Override
    public g a(int n2, g g2, int n3, int n4) {
        return this.m(n2, n4);
    }

    @Override
    public g a(int n2, byte[] arrby) {
        return this.m(n2, arrby.length);
    }

    @Override
    public g a(int n2, byte[] arrby, int n3, int n4) {
        return this.m(n2, n4);
    }

    @Override
    public g a(int n2, ByteBuffer byteBuffer) {
        return this.m(n2, byteBuffer.remaining());
    }

    @Override
    public g a(int n2, OutputStream outputStream, int n3) {
        return this.m(n2, n3);
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        this.m(n2, n3);
        return 0;
    }

    @Override
    public g b(int n2, boolean bl2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g b(int n2, int n3) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g c(int n2, int n3) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g d(int n2, int n3) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g e(int n2, int n3) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g a(int n2, long l2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g f(int n2, int n3) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g a(int n2, float f2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g a(int n2, double d2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g b(int n2, g g2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g b(int n2, g g2, int n3) {
        return this.m(n2, n3);
    }

    @Override
    public g b(int n2, g g2, int n3, int n4) {
        return this.m(n2, n4);
    }

    @Override
    public g b(int n2, byte[] arrby) {
        return this.m(n2, arrby.length);
    }

    @Override
    public g b(int n2, byte[] arrby, int n3, int n4) {
        return this.m(n2, n4);
    }

    @Override
    public g b(int n2, ByteBuffer byteBuffer) {
        return this.m(n2, byteBuffer.remaining());
    }

    @Override
    public int a(int n2, InputStream inputStream, int n3) {
        this.m(n2, n3);
        return 0;
    }

    @Override
    public int a(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        this.m(n2, n3);
        return 0;
    }

    @Override
    public g g(int n2, int n3) {
        return this.m(n2, n3);
    }

    @Override
    public boolean D() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public byte E() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public short F() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public short G() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int H() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int I() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int J() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int K() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public long L() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public long M() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public char N() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public float O() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public double P() {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g y(int n2) {
        return this.b(n2);
    }

    @Override
    public g z(int n2) {
        return this.b(n2);
    }

    @Override
    public g a(g g2) {
        return this.b(g2.s());
    }

    @Override
    public g a(g g2, int n2) {
        return this.b(n2);
    }

    @Override
    public g a(g g2, int n2, int n3) {
        return this.b(n3);
    }

    @Override
    public g b(byte[] arrby) {
        return this.b(arrby.length);
    }

    @Override
    public g a(byte[] arrby, int n2, int n3) {
        return this.b(n3);
    }

    @Override
    public g a(ByteBuffer byteBuffer) {
        return this.b(byteBuffer.remaining());
    }

    @Override
    public g a(OutputStream outputStream, int n2) {
        return this.b(n2);
    }

    @Override
    public int a(GatheringByteChannel gatheringByteChannel, int n2) {
        this.b(n2);
        return 0;
    }

    @Override
    public g A(int n2) {
        return this.b(n2);
    }

    @Override
    public g a(boolean bl2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g B(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g C(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g D(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g E(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g b(long l2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g F(int n2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g a(float f2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g a(double d2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g b(g g2) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public g b(g g2, int n2) {
        return this.b(n2);
    }

    @Override
    public g b(g g2, int n2, int n3) {
        return this.b(n3);
    }

    @Override
    public g c(byte[] arrby) {
        return this.b(arrby.length);
    }

    @Override
    public g b(byte[] arrby, int n2, int n3) {
        return this.b(n3);
    }

    @Override
    public g b(ByteBuffer byteBuffer) {
        return this.b(byteBuffer.remaining());
    }

    @Override
    public int a(InputStream inputStream, int n2) {
        this.b(n2);
        return 0;
    }

    @Override
    public int a(ScatteringByteChannel scatteringByteChannel, int n2) {
        this.b(n2);
        return 0;
    }

    @Override
    public g G(int n2) {
        return this.b(n2);
    }

    @Override
    public int a(int n2, int n3, byte by2) {
        this.a(n2);
        this.a(n3);
        return -1;
    }

    @Override
    public int a(byte by2) {
        return -1;
    }

    @Override
    public int a(int n2, byte by2) {
        this.b(n2);
        return -1;
    }

    @Override
    public int b(int n2, int n3, byte by2) {
        this.m(n2, n3);
        return -1;
    }

    @Override
    public int a(l l2) {
        return -1;
    }

    @Override
    public int a(int n2, int n3, l l2) {
        this.m(n2, n3);
        return -1;
    }

    @Override
    public int b(l l2) {
        return -1;
    }

    @Override
    public int b(int n2, int n3, l l2) {
        this.m(n2, n3);
        return -1;
    }

    @Override
    public g Q() {
        return this;
    }

    @Override
    public g h(int n2, int n3) {
        return this.m(n2, n3);
    }

    @Override
    public g R() {
        return this;
    }

    @Override
    public g i(int n2, int n3) {
        return this.m(n2, n3);
    }

    @Override
    public g S() {
        return this;
    }

    @Override
    public int T() {
        return 1;
    }

    @Override
    public ByteBuffer U() {
        return a;
    }

    @Override
    public ByteBuffer j(int n2, int n3) {
        this.m(n2, n3);
        return this.U();
    }

    @Override
    public ByteBuffer[] V() {
        return new ByteBuffer[]{a};
    }

    @Override
    public ByteBuffer[] l(int n2, int n3) {
        this.m(n2, n3);
        return this.V();
    }

    @Override
    public ByteBuffer k(int n2, int n3) {
        return a;
    }

    @Override
    public boolean W() {
        return true;
    }

    @Override
    public byte[] X() {
        return io.netty.util.c.d.a;
    }

    @Override
    public int Y() {
        return 0;
    }

    @Override
    public boolean Z() {
        return b != 0L;
    }

    @Override
    public long aa() {
        if (this.Z()) {
            return b;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public String a(Charset charset) {
        return "";
    }

    @Override
    public String a(int n2, int n3, Charset charset) {
        this.m(n2, n3);
        return this.a(charset);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof g && !((g)object).u();
    }

    @Override
    public int c(g g2) {
        return g2.u() ? -1 : 0;
    }

    @Override
    public String toString() {
        return this.e;
    }

    @Override
    public boolean i(int n2) {
        return false;
    }

    @Override
    public boolean j(int n2) {
        return false;
    }

    @Override
    public int ac() {
        return 1;
    }

    @Override
    public g ab() {
        return this;
    }

    @Override
    public g H(int n2) {
        return this;
    }

    @Override
    public boolean ad() {
        return false;
    }

    @Override
    public boolean I(int n2) {
        return false;
    }

    private g a(int n2) {
        if (n2 != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }

    private g m(int n2, int n3) {
        if (n3 < 0) {
            throw new IllegalArgumentException("length: " + n3);
        }
        if (n2 != 0 || n3 != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }

    private g b(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("length: " + n2 + " (expected: >= 0)");
        }
        if (n2 != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this;
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
        long l2 = 0L;
        try {
            if (u.f()) {
                l2 = u.b(a);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        b = l2;
    }
}

