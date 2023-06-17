/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.b.aj;
import io.netty.b.j;
import io.netty.c.a.g;
import io.netty.c.a.k;
import io.netty.util.z;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;
import net.minecraft.e.e;
import net.minecraft.e.h;
import net.minecraft.e.l;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.d.b;

public class a
extends io.netty.b.g {
    private final io.netty.b.g a;

    public a(io.netty.b.g g2) {
        this.a = g2;
    }

    public static int a(int n2) {
        for (int i2 = 1; i2 < 5; ++i2) {
            if ((n2 & -1 << i2 * 7) != 0) continue;
            return i2;
        }
        return 5;
    }

    public a a(byte[] arrby) {
        this.d(arrby.length);
        this.c(arrby);
        return this;
    }

    public byte[] a() {
        return this.b(this.r());
    }

    public byte[] b(int n2) {
        int n3 = this.e();
        if (n3 > n2) {
            throw new g("ByteArray with size " + n3 + " is bigger than allowed " + n2);
        }
        byte[] arrby = new byte[n3];
        this.b(arrby);
        return arrby;
    }

    public a a(int[] arrn) {
        this.d(arrn.length);
        int[] arrn2 = arrn;
        int n2 = arrn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrn2[i2];
            this.d(n3);
        }
        return this;
    }

    public int[] b() {
        return this.c(this.r());
    }

    public int[] c(int n2) {
        int n3 = this.e();
        if (n3 > n2) {
            throw new g("VarIntArray with size " + n3 + " is bigger than allowed " + n2);
        }
        int[] arrn = new int[n3];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = this.e();
        }
        return arrn;
    }

    public a a(long[] arrl) {
        this.d(arrl.length);
        long[] arrl2 = arrl;
        int n2 = arrl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = arrl2[i2];
            this.b(l2);
        }
        return this;
    }

    public long[] b(long[] arrl) {
        return this.a(arrl, this.r() / 8);
    }

    public long[] a(long[] arrl, int n2) {
        int n3 = this.e();
        if (arrl == null || arrl.length != n3) {
            if (n3 > n2) {
                throw new g("LongArray with size " + n3 + " is bigger than allowed " + n2);
            }
            arrl = new long[n3];
        }
        for (int i2 = 0; i2 < arrl.length; ++i2) {
            arrl[i2] = this.M();
        }
        return arrl;
    }

    public net.minecraft.u.b.b c() {
        return net.minecraft.u.b.b.a(this.M());
    }

    public a a(net.minecraft.u.b.b b2) {
        this.b(b2.h());
        return this;
    }

    public net.minecraft.u.d.a d() {
        return b.a(this.e(32767));
    }

    public a a(net.minecraft.u.d.a a2) {
        return this.a(b.a(a2));
    }

    public Enum a(Class class_) {
        return ((Enum[])class_.getEnumConstants())[this.e()];
    }

    public a a(Enum enum_) {
        return this.d(enum_.ordinal());
    }

    public int e() {
        byte by2;
        int n2 = 0;
        int n3 = 0;
        do {
            by2 = this.E();
            n2 |= (by2 & 0x7F) << n3++ * 7;
            if (n3 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by2 & 0x80) == 128);
        return n2;
    }

    public long f() {
        byte by2;
        long l2 = 0L;
        int n2 = 0;
        do {
            by2 = this.E();
            l2 |= (long)(by2 & 0x7F) << n2++ * 7;
            if (n2 <= 10) continue;
            throw new RuntimeException("VarLong too big");
        } while ((by2 & 0x80) == 128);
        return l2;
    }

    public a a(UUID uUID) {
        this.b(uUID.getMostSignificantBits());
        this.b(uUID.getLeastSignificantBits());
        return this;
    }

    public UUID g() {
        return new UUID(this.M(), this.M());
    }

    public a d(int n2) {
        while ((n2 & 0xFFFFFF80) != 0) {
            this.B(n2 & 0x7F | 0x80);
            n2 >>>= 7;
        }
        this.B(n2);
        return this;
    }

    public a a(long l2) {
        while ((l2 & 0xFFFFFFFFFFFFFF80L) != 0L) {
            this.B((int)(l2 & 0x7FL) | 0x80);
            l2 >>>= 7;
        }
        this.B((int)l2);
        return this;
    }

    public a a(e e2) {
        if (e2 == null) {
            this.B(0);
        } else {
            try {
                h.a(e2, (DataOutput)new io.netty.b.k(this));
            }
            catch (IOException iOException) {
                throw new k(iOException);
            }
        }
        return this;
    }

    public e h() {
        int n2 = this.p();
        byte by2 = this.E();
        if (by2 == 0) {
            return null;
        }
        this.g(n2);
        try {
            return h.a(new j(this), new l(0x200000L));
        }
        catch (IOException iOException) {
            throw new k(iOException);
        }
    }

    public a a(cu cu2) {
        if (cu2 == null) {
            this.C(-1);
        } else {
            this.C(cg.a(cu2.a()));
            this.B(cu2.b);
            this.C(cu2.h());
            e e2 = null;
            if (cu2.a().l() || cu2.a().o()) {
                e2 = cu2.o();
            }
            this.a(e2);
        }
        return this;
    }

    public cu i() {
        cu cu2 = null;
        short s2 = this.G();
        if (s2 >= 0) {
            byte by2 = this.E();
            short s3 = this.G();
            cu2 = new cu(cg.c(s2), (int)by2, (int)s3);
            cu2.d(this.h());
        }
        return cu2;
    }

    public String e(int n2) {
        int n3 = this.e();
        if (n3 > n2 * 4) {
            throw new g("The received encoded string buffer length is longer than maximum allowed (" + n3 + " > " + n2 * 4 + ")");
        }
        if (n3 < 0) {
            throw new g("The received encoded string buffer length is less than zero! Weird string!");
        }
        String string = new String(this.y(n3).X(), aj.c);
        if (string.length() > n2) {
            throw new g("The received string length is longer than maximum allowed (" + n3 + " > " + n2 + ")");
        }
        return string;
    }

    public a a(String string) {
        byte[] arrby = string.getBytes(aj.c);
        if (arrby.length > 32767) {
            throw new k("String too big (was " + string.length() + " bytes encoded, max " + 32767 + ")");
        }
        this.d(arrby.length);
        this.c(arrby);
        return this;
    }

    @Override
    public int j() {
        return this.a.j();
    }

    @Override
    public io.netty.b.g f(int n2) {
        return this.a.f(n2);
    }

    @Override
    public int k() {
        return this.a.k();
    }

    @Override
    public io.netty.b.h l() {
        return this.a.l();
    }

    @Override
    public ByteOrder m() {
        return this.a.m();
    }

    @Override
    public io.netty.b.g a(ByteOrder byteOrder) {
        return this.a.a(byteOrder);
    }

    @Override
    public io.netty.b.g n() {
        return this.a.n();
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
    public io.netty.b.g g(int n2) {
        return this.a.g(n2);
    }

    @Override
    public int q() {
        return this.a.q();
    }

    @Override
    public io.netty.b.g h(int n2) {
        return this.a.h(n2);
    }

    @Override
    public io.netty.b.g a(int n2, int n3) {
        return this.a.a(n2, n3);
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
    public io.netty.b.g w() {
        return this.a.w();
    }

    @Override
    public io.netty.b.g x() {
        return this.a.x();
    }

    @Override
    public io.netty.b.g y() {
        return this.a.y();
    }

    @Override
    public io.netty.b.g z() {
        return this.a.z();
    }

    @Override
    public io.netty.b.g A() {
        return this.a.A();
    }

    @Override
    public io.netty.b.g B() {
        return this.a.B();
    }

    @Override
    public io.netty.b.g C() {
        return this.a.C();
    }

    @Override
    public io.netty.b.g k(int n2) {
        return this.a.k(n2);
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
    public io.netty.b.g a(int n2, io.netty.b.g g2) {
        return this.a.a(n2, g2);
    }

    @Override
    public io.netty.b.g a(int n2, io.netty.b.g g2, int n3) {
        return this.a.a(n2, g2, n3);
    }

    @Override
    public io.netty.b.g a(int n2, io.netty.b.g g2, int n3, int n4) {
        return this.a.a(n2, g2, n3, n4);
    }

    @Override
    public io.netty.b.g a(int n2, byte[] arrby) {
        return this.a.a(n2, arrby);
    }

    @Override
    public io.netty.b.g a(int n2, byte[] arrby, int n3, int n4) {
        return this.a.a(n2, arrby, n3, n4);
    }

    @Override
    public io.netty.b.g a(int n2, ByteBuffer byteBuffer) {
        return this.a.a(n2, byteBuffer);
    }

    @Override
    public io.netty.b.g a(int n2, OutputStream outputStream, int n3) {
        return this.a.a(n2, outputStream, n3);
    }

    @Override
    public int a(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        return this.a.a(n2, gatheringByteChannel, n3);
    }

    @Override
    public io.netty.b.g b(int n2, boolean bl2) {
        return this.a.b(n2, bl2);
    }

    @Override
    public io.netty.b.g b(int n2, int n3) {
        return this.a.b(n2, n3);
    }

    @Override
    public io.netty.b.g c(int n2, int n3) {
        return this.a.c(n2, n3);
    }

    @Override
    public io.netty.b.g d(int n2, int n3) {
        return this.a.d(n2, n3);
    }

    @Override
    public io.netty.b.g e(int n2, int n3) {
        return this.a.e(n2, n3);
    }

    @Override
    public io.netty.b.g a(int n2, long l2) {
        return this.a.a(n2, l2);
    }

    @Override
    public io.netty.b.g f(int n2, int n3) {
        return this.a.f(n2, n3);
    }

    @Override
    public io.netty.b.g a(int n2, float f2) {
        return this.a.a(n2, f2);
    }

    @Override
    public io.netty.b.g a(int n2, double d2) {
        return this.a.a(n2, d2);
    }

    @Override
    public io.netty.b.g b(int n2, io.netty.b.g g2) {
        return this.a.b(n2, g2);
    }

    @Override
    public io.netty.b.g b(int n2, io.netty.b.g g2, int n3) {
        return this.a.b(n2, g2, n3);
    }

    @Override
    public io.netty.b.g b(int n2, io.netty.b.g g2, int n3, int n4) {
        return this.a.b(n2, g2, n3, n4);
    }

    @Override
    public io.netty.b.g b(int n2, byte[] arrby) {
        return this.a.b(n2, arrby);
    }

    @Override
    public io.netty.b.g b(int n2, byte[] arrby, int n3, int n4) {
        return this.a.b(n2, arrby, n3, n4);
    }

    @Override
    public io.netty.b.g b(int n2, ByteBuffer byteBuffer) {
        return this.a.b(n2, byteBuffer);
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
    public io.netty.b.g g(int n2, int n3) {
        return this.a.g(n2, n3);
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
    public io.netty.b.g y(int n2) {
        return this.a.y(n2);
    }

    @Override
    public io.netty.b.g z(int n2) {
        return this.a.z(n2);
    }

    @Override
    public io.netty.b.g a(io.netty.b.g g2) {
        return this.a.a(g2);
    }

    @Override
    public io.netty.b.g a(io.netty.b.g g2, int n2) {
        return this.a.a(g2, n2);
    }

    @Override
    public io.netty.b.g a(io.netty.b.g g2, int n2, int n3) {
        return this.a.a(g2, n2, n3);
    }

    @Override
    public io.netty.b.g b(byte[] arrby) {
        return this.a.b(arrby);
    }

    @Override
    public io.netty.b.g a(byte[] arrby, int n2, int n3) {
        return this.a.a(arrby, n2, n3);
    }

    @Override
    public io.netty.b.g a(ByteBuffer byteBuffer) {
        return this.a.a(byteBuffer);
    }

    @Override
    public io.netty.b.g a(OutputStream outputStream, int n2) {
        return this.a.a(outputStream, n2);
    }

    @Override
    public int a(GatheringByteChannel gatheringByteChannel, int n2) {
        return this.a.a(gatheringByteChannel, n2);
    }

    @Override
    public io.netty.b.g A(int n2) {
        return this.a.A(n2);
    }

    @Override
    public io.netty.b.g a(boolean bl2) {
        return this.a.a(bl2);
    }

    @Override
    public io.netty.b.g B(int n2) {
        return this.a.B(n2);
    }

    @Override
    public io.netty.b.g C(int n2) {
        return this.a.C(n2);
    }

    @Override
    public io.netty.b.g D(int n2) {
        return this.a.D(n2);
    }

    @Override
    public io.netty.b.g E(int n2) {
        return this.a.E(n2);
    }

    @Override
    public io.netty.b.g b(long l2) {
        return this.a.b(l2);
    }

    @Override
    public io.netty.b.g F(int n2) {
        return this.a.F(n2);
    }

    @Override
    public io.netty.b.g a(float f2) {
        return this.a.a(f2);
    }

    @Override
    public io.netty.b.g a(double d2) {
        return this.a.a(d2);
    }

    @Override
    public io.netty.b.g b(io.netty.b.g g2) {
        return this.a.b(g2);
    }

    @Override
    public io.netty.b.g b(io.netty.b.g g2, int n2) {
        return this.a.b(g2, n2);
    }

    @Override
    public io.netty.b.g b(io.netty.b.g g2, int n2, int n3) {
        return this.a.b(g2, n2, n3);
    }

    @Override
    public io.netty.b.g c(byte[] arrby) {
        return this.a.c(arrby);
    }

    @Override
    public io.netty.b.g b(byte[] arrby, int n2, int n3) {
        return this.a.b(arrby, n2, n3);
    }

    @Override
    public io.netty.b.g b(ByteBuffer byteBuffer) {
        return this.a.b(byteBuffer);
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
    public io.netty.b.g G(int n2) {
        return this.a.G(n2);
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
    public int a(io.netty.b.l l2) {
        return this.a.a(l2);
    }

    @Override
    public int a(int n2, int n3, io.netty.b.l l2) {
        return this.a.a(n2, n3, l2);
    }

    @Override
    public int b(io.netty.b.l l2) {
        return this.a.b(l2);
    }

    @Override
    public int b(int n2, int n3, io.netty.b.l l2) {
        return this.a.b(n2, n3, l2);
    }

    @Override
    public io.netty.b.g Q() {
        return this.a.Q();
    }

    @Override
    public io.netty.b.g h(int n2, int n3) {
        return this.a.h(n2, n3);
    }

    @Override
    public io.netty.b.g R() {
        return this.a.R();
    }

    @Override
    public io.netty.b.g i(int n2, int n3) {
        return this.a.i(n2, n3);
    }

    @Override
    public io.netty.b.g S() {
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
    public ByteBuffer k(int n2, int n3) {
        return this.a.k(n2, n3);
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
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    @Override
    public int c(io.netty.b.g g2) {
        return this.a.c(g2);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    @Override
    public io.netty.b.g H(int n2) {
        return this.a.H(n2);
    }

    @Override
    public io.netty.b.g ab() {
        return this.a.ab();
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
    public /* synthetic */ z ae() {
        return this.ab();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.H(n2);
    }
}

