/*
 * Decompiled with CFR 0.150.
 */
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.util.e.e;

public class cja {
    private static final FloatBuffer a;
    private static final FloatBuffer b;
    private static final il c;
    private static final dbc d;
    private static final dbc[] e;
    private static final azh f;
    private static final arm g;
    private static final bfd h;
    private static final ajk i;
    private static final ctu j;
    private static final bbs k;
    private static final aff l;
    private static final blu m;
    private static final cbl n;
    private static final cxj o;
    private static final dbc p;
    private static int q;
    private static final bed[] r;
    private static int s;
    private static final dbc t;
    private static final bpm u;
    private static final ayc v;

    public static void a() {
        GL11.H(8256);
    }

    public static void b() {
        GL11.m();
    }

    public static void c() {
        cja.c.a.a();
    }

    public static void d() {
        cja.c.a.b();
    }

    public static void a(int n2, float f2) {
        if (n2 != cja.c.b || f2 != cja.c.c) {
            cja.c.b = n2;
            cja.c.c = f2;
            GL11.b(n2, f2);
        }
    }

    public static void e() {
        d.b();
    }

    public static void f() {
        d.a();
    }

    public static void a(int n2) {
        e[n2].b();
    }

    public static void b(int n2) {
        e[n2].a();
    }

    public static void g() {
        cja.f.a.b();
    }

    public static void h() {
        cja.f.a.a();
    }

    public static void a(int n2, int n3) {
        if (n2 != cja.f.b || n3 != cja.f.c) {
            cja.f.b = n2;
            cja.f.c = n3;
            GL11.d(n2, n3);
        }
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        GL11.j(n2, n3, floatBuffer);
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        GL11.e(n2, floatBuffer);
    }

    public static void a(float f2, float f3, float f4) {
        GL11.b(f2, f3, f4);
    }

    public static void i() {
        cja.h.a.a();
    }

    public static void j() {
        cja.h.a.b();
    }

    public static void c(int n2) {
        if (n2 != cja.h.c) {
            cja.h.c = n2;
            GL11.n(n2);
        }
    }

    public static void a(boolean bl2) {
        if (bl2 != cja.h.b) {
            cja.h.b = bl2;
            GL11.b(bl2);
        }
    }

    public static void k() {
        cja.g.a.a();
    }

    public static void l() {
        cja.g.a.b();
    }

    public static void a(bjt bjt2, afi afi2) {
        cja.b(bjt2.p, afi2.o);
    }

    public static void b(int n2, int n3) {
        if (n2 != cja.g.b || n3 != cja.g.c) {
            cja.g.b = n2;
            cja.g.c = n3;
            GL11.a(n2, n3);
        }
    }

    public static void a(bjt bjt2, afi afi2, bjt bjt3, afi afi3) {
        cja.a(bjt2.p, afi2.o, bjt3.p, afi3.o);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        if (n2 != cja.g.b || n3 != cja.g.c || n4 != cja.g.d || n5 != cja.g.e) {
            cja.g.b = n2;
            cja.g.c = n3;
            cja.g.d = n4;
            cja.g.e = n5;
            cjg.c(n2, n3, n4, n5);
        }
    }

    public static void d(int n2) {
        GL14.a(n2);
    }

    public static void e(int n2) {
        b.put(0, (float)(n2 >> 16 & 0xFF) / 255.0f);
        b.put(1, (float)(n2 >> 8 & 0xFF) / 255.0f);
        b.put(2, (float)(n2 >> 0 & 0xFF) / 255.0f);
        b.put(3, (float)(n2 >> 24 & 0xFF) / 255.0f);
        cja.b(8960, 8705, b);
        cja.a(8960, 8704, 34160);
        cja.a(8960, 34161, 7681);
        cja.a(8960, 34176, 34166);
        cja.a(8960, 34192, 768);
        cja.a(8960, 34162, 7681);
        cja.a(8960, 34184, 5890);
        cja.a(8960, 34200, 770);
    }

    public static void m() {
        cja.a(8960, 8704, 8448);
        cja.a(8960, 34161, 8448);
        cja.a(8960, 34162, 8448);
        cja.a(8960, 34176, 5890);
        cja.a(8960, 34184, 5890);
        cja.a(8960, 34192, 768);
        cja.a(8960, 34200, 770);
    }

    public static void n() {
        cja.i.a.b();
    }

    public static void o() {
        cja.i.a.a();
    }

    public static void a(aoj aoj2) {
        cja.t(aoj2.d);
    }

    private static void t(int n2) {
        if (n2 != cja.i.b) {
            cja.i.b = n2;
            GL11.f(2917, n2);
        }
    }

    public static void a(float f2) {
        if (f2 != cja.i.c) {
            cja.i.c = f2;
            GL11.c(2914, f2);
        }
    }

    public static void b(float f2) {
        if (f2 != cja.i.d) {
            cja.i.d = f2;
            GL11.c(2915, f2);
        }
    }

    public static void c(float f2) {
        if (f2 != cja.i.e) {
            cja.i.e = f2;
            GL11.c(2916, f2);
        }
    }

    public static void b(int n2, FloatBuffer floatBuffer) {
        GL11.d(n2, floatBuffer);
    }

    public static void c(int n2, int n3) {
        GL11.f(n2, n3);
    }

    public static void p() {
        cja.j.a.b();
    }

    public static void q() {
        cja.j.a.a();
    }

    public static void a(csw csw2) {
        cja.u(csw2.d);
    }

    private static void u(int n2) {
        if (n2 != cja.j.b) {
            cja.j.b = n2;
            GL11.f(n2);
        }
    }

    public static void d(int n2, int n3) {
        GL11.p(n2, n3);
    }

    public static void r() {
        cja.k.a.b();
    }

    public static void s() {
        cja.k.a.a();
    }

    public static void a(float f2, float f3) {
        if (f2 != cja.k.c || f3 != cja.k.d) {
            cja.k.c = f2;
            cja.k.d = f3;
            GL11.b(f2, f3);
        }
    }

    public static void t() {
        cja.l.a.b();
    }

    public static void u() {
        cja.l.a.a();
    }

    public static void a(amn amn2) {
        cja.f(amn2.q);
    }

    public static void f(int n2) {
        if (n2 != cja.l.b) {
            cja.l.b = n2;
            GL11.x(n2);
        }
    }

    public static void a(awb awb2) {
        cja.c((awb)awb2).a.b();
    }

    public static void b(awb awb2) {
        cja.c((awb)awb2).a.a();
    }

    public static void a(awb awb2, int n2) {
        bgx bgx2 = cja.c(awb2);
        if (n2 != bgx2.c) {
            bgx2.c = n2;
            GL11.l(bgx2.b, 9472, n2);
        }
    }

    public static void a(awb awb2, int n2, FloatBuffer floatBuffer) {
        GL11.m(cja.c((awb)awb2).b, n2, floatBuffer);
    }

    private static bgx c(awb awb2) {
        switch (awb2) {
            case a: {
                return cja.m.a;
            }
            case b: {
                return cja.m.b;
            }
            case c: {
                return cja.m.c;
            }
            case d: {
                return cja.m.d;
            }
        }
        return cja.m.a;
    }

    public static void g(int n2) {
        if (q != n2 - cjg.q) {
            q = n2 - cjg.q;
            cjg.k(n2);
        }
    }

    public static void v() {
        cja.r[cja.q].a.b();
    }

    public static void w() {
        cja.r[cja.q].a.a();
    }

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        GL11.n(n2, n3, floatBuffer);
    }

    public static void a(int n2, int n3, int n4) {
        GL11.m(n2, n3, n4);
    }

    public static void a(int n2, int n3, float f2) {
        GL11.e(n2, n3, f2);
    }

    public static void b(int n2, int n3, float f2) {
        GL11.c(n2, n3, f2);
    }

    public static void b(int n2, int n3, int n4) {
        GL11.k(n2, n3, n4);
    }

    public static int c(int n2, int n3, int n4) {
        return GL11.d(n2, n3, n4);
    }

    public static int x() {
        return GL11.c();
    }

    public static void h(int n2) {
        GL11.e(n2);
        for (bed bed2 : r) {
            if (bed2.b != n2) continue;
            bed2.b = -1;
        }
    }

    public static void i(int n2) {
        if (n2 != cja.r[cja.q].b) {
            cja.r[cja.q].b = n2;
            GL11.b(3553, n2);
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        GL11.a(n2, n3, n4, n5, n6, n7, n8, n9, intBuffer);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        GL11.b(n2, n3, n4, n5, n6, n7, n8, n9, intBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        GL11.a(n2, n3, n4, n5, n6, n7, n8, n9);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        GL11.b(n2, n3, n4, n5, intBuffer);
    }

    public static void y() {
        p.b();
    }

    public static void z() {
        p.a();
    }

    public static void j(int n2) {
        if (n2 != s) {
            s = n2;
            GL11.C(n2);
        }
    }

    public static void A() {
        t.b();
    }

    public static void B() {
        t.a();
    }

    public static void b(int n2, int n3, int n4, int n5) {
        GL11.e(n2, n3, n4, n5);
    }

    public static void a(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        if (bl2 != cja.u.a || bl3 != cja.u.b || bl4 != cja.u.c || bl5 != cja.u.d) {
            cja.u.a = bl2;
            cja.u.b = bl3;
            cja.u.c = bl4;
            cja.u.d = bl5;
            GL11.a(bl2, bl3, bl4, bl5);
        }
    }

    public static void a(double d2) {
        if (d2 != cja.n.a) {
            cja.n.a = d2;
            GL11.a(d2);
        }
    }

    public static void a(float f2, float f3, float f4, float f5) {
        if (f2 != cja.n.b.a || f3 != cja.n.b.b || f4 != cja.n.b.c || f5 != cja.n.b.d) {
            cja.n.b.a = f2;
            cja.n.b.b = f3;
            cja.n.b.c = f4;
            cja.n.b.d = f5;
            GL11.a(f2, f3, f4, f5);
        }
    }

    public static void k(int n2) {
        GL11.a(n2);
    }

    public static void l(int n2) {
        GL11.B(n2);
    }

    public static void C() {
        GL11.g();
    }

    public static void D() {
        GL11.j();
    }

    public static void E() {
        GL11.k();
    }

    public static void c(int n2, FloatBuffer floatBuffer) {
        GL11.c(n2, floatBuffer);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7) {
        GL11.b(d2, d3, d4, d5, d6, d7);
    }

    public static void b(float f2, float f3, float f4, float f5) {
        GL11.d(f2, f3, f4, f5);
    }

    public static void b(float f2, float f3, float f4) {
        GL11.c(f2, f3, f4);
    }

    public static void a(double d2, double d3, double d4) {
        GL11.c(d2, d3, d4);
    }

    public static void c(float f2, float f3, float f4) {
        GL11.f(f2, f3, f4);
    }

    public static void b(double d2, double d3, double d4) {
        GL11.f(d2, d3, d4);
    }

    public static void a(FloatBuffer floatBuffer) {
        GL11.b(floatBuffer);
    }

    public static void a(e e2) {
        cja.a(cja.a(a, e2));
    }

    public static FloatBuffer a(FloatBuffer floatBuffer, e e2) {
        floatBuffer.clear();
        float f2 = e2.a * e2.a;
        float f3 = e2.a * e2.b;
        float f4 = e2.a * e2.c;
        float f5 = e2.a * e2.d;
        float f6 = e2.b * e2.b;
        float f7 = e2.b * e2.c;
        float f8 = e2.b * e2.d;
        float f9 = e2.c * e2.c;
        float f10 = e2.c * e2.d;
        floatBuffer.put(1.0f - 2.0f * (f6 + f9));
        floatBuffer.put(2.0f * (f3 + f10));
        floatBuffer.put(2.0f * (f4 - f8));
        floatBuffer.put(0.0f);
        floatBuffer.put(2.0f * (f3 - f10));
        floatBuffer.put(1.0f - 2.0f * (f2 + f9));
        floatBuffer.put(2.0f * (f7 + f5));
        floatBuffer.put(0.0f);
        floatBuffer.put(2.0f * (f4 + f8));
        floatBuffer.put(2.0f * (f7 - f5));
        floatBuffer.put(1.0f - 2.0f * (f2 + f6));
        floatBuffer.put(0.0f);
        floatBuffer.put(0.0f);
        floatBuffer.put(0.0f);
        floatBuffer.put(0.0f);
        floatBuffer.put(1.0f);
        floatBuffer.rewind();
        return floatBuffer;
    }

    public static void c(float f2, float f3, float f4, float f5) {
        if (f2 != cja.v.a || f3 != cja.v.b || f4 != cja.v.c || f5 != cja.v.d) {
            cja.v.a = f2;
            cja.v.b = f3;
            cja.v.c = f4;
            cja.v.d = f5;
            GL11.c(f2, f3, f4, f5);
        }
    }

    public static void d(float f2, float f3, float f4) {
        cja.c(f2, f3, f4, 1.0f);
    }

    public static void b(float f2, float f3) {
        GL11.f(f2, f3);
    }

    public static void e(float f2, float f3, float f4) {
        GL11.e(f2, f3, f4);
    }

    public static void F() {
        cja.v.a = -1.0f;
        cja.v.b = -1.0f;
        cja.v.c = -1.0f;
        cja.v.d = -1.0f;
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        GL11.b(n2, n3, byteBuffer);
    }

    public static void c(int n2, int n3, int n4, int n5) {
        GL11.d(n2, n3, n4, (long)n5);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        GL11.d(n2, n3, n4, byteBuffer);
    }

    public static void d(int n2, int n3, int n4, int n5) {
        GL11.c(n2, n3, n4, (long)n5);
    }

    public static void b(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        GL11.c(n2, n3, n4, byteBuffer);
    }

    public static void e(int n2, int n3, int n4, int n5) {
        GL11.a(n2, n3, n4, (long)n5);
    }

    public static void c(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        GL11.a(n2, n3, n4, byteBuffer);
    }

    public static void m(int n2) {
        GL11.j(n2);
    }

    public static void n(int n2) {
        GL11.i(n2);
    }

    public static void o(int n2) {
        GL11.c(n2);
    }

    public static void G() {
        GL11.a();
    }

    public static void d(int n2, int n3, int n4) {
        GL11.b(n2, n3, n4);
    }

    public static void d(float f2) {
        GL11.b(f2);
    }

    public static void p(int n2) {
        GL11.b(n2);
    }

    public static void e(int n2, int n3) {
        GL11.c(n2, n3);
    }

    public static void f(int n2, int n3) {
        GL11.s(n2, n3);
    }

    public static void H() {
        GL11.h();
    }

    public static int q(int n2) {
        return GL11.s(n2);
    }

    public static void g(int n2, int n3) {
        GL11.r(n2, n3);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        GL11.a(n2, n3, n4, n5, n6, n7, intBuffer);
    }

    public static int I() {
        return GL11.b();
    }

    public static String r(int n2) {
        return GL11.v(n2);
    }

    public static void a(int n2, IntBuffer intBuffer) {
        GL11.c(n2, intBuffer);
    }

    public static int s(int n2) {
        return GL11.r(n2);
    }

    public static void a(asc asc2) {
        asc2.a();
    }

    public static void b(asc asc2) {
        asc2.b();
    }

    static {
        int n2;
        a = BufferUtils.f(16);
        b = BufferUtils.f(4);
        c = new il(null);
        d = new dbc(2896);
        e = new dbc[8];
        for (n2 = 0; n2 < 8; ++n2) {
            cja.e[n2] = new dbc(16384 + n2);
        }
        f = new azh(null);
        g = new arm(null);
        h = new bfd(null);
        i = new ajk(null);
        j = new ctu(null);
        k = new bbs(null);
        l = new aff(null);
        m = new blu(null);
        n = new cbl(null);
        o = new cxj(null);
        p = new dbc(2977);
        r = new bed[8];
        for (n2 = 0; n2 < 8; ++n2) {
            cja.r[n2] = new bed(null);
        }
        s = 7425;
        t = new dbc(32826);
        u = new bpm(null);
        v = new ayc();
    }
}

