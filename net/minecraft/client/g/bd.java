/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.g.a;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ai;
import net.minecraft.client.g.ak;
import net.minecraft.client.g.al;
import net.minecraft.client.g.aq;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.ba;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bf;
import net.minecraft.client.g.bg;
import net.minecraft.client.g.bi;
import net.minecraft.client.g.bj;
import net.minecraft.client.g.bn;
import net.minecraft.client.g.bq;
import net.minecraft.client.g.bt;
import net.minecraft.client.g.bv;
import net.minecraft.client.g.bx;
import net.minecraft.client.g.cs;
import net.minecraft.client.g.d;
import net.minecraft.client.g.i;
import net.minecraft.client.g.l;
import net.minecraft.client.g.m;
import net.minecraft.client.g.n;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.util.e.e;

public class bd {
    private static final FloatBuffer a;
    private static final FloatBuffer b;
    private static final ak c;
    private static final m d;
    private static final m[] e;
    private static final n f;
    private static final i g;
    private static final aq h;
    private static final bf i;
    private static final ba j;
    private static final bg k;
    private static final al l;
    private static final bv m;
    private static final ai n;
    private static final bx o;
    private static final m p;
    private static int q;
    private static final bi[] r;
    private static int s;
    private static final m t;
    private static final a u;
    private static final bn v;

    static {
        int n2;
        a = BufferUtils.f(16);
        b = BufferUtils.f(4);
        c = new ak(null);
        d = new m(2896);
        e = new m[8];
        for (n2 = 0; n2 < 8; ++n2) {
            bd.e[n2] = new m(16384 + n2);
        }
        f = new n(null);
        g = new i(null);
        h = new aq(null);
        i = new bf(null);
        j = new ba(null);
        k = new bg(null);
        l = new al(null);
        m = new bv(null);
        n = new ai(null);
        o = new bx(null);
        p = new m(2977);
        r = new bi[8];
        for (n2 = 0; n2 < 8; ++n2) {
            bd.r[n2] = new bi(null);
        }
        s = 7425;
        t = new m(32826);
        u = new a(null);
        v = new bn();
    }

    public static void a() {
        GL11.H(8256);
    }

    public static void b() {
        GL11.m();
    }

    public static void c() {
        bd.c.a.a();
    }

    public static void d() {
        bd.c.a.b();
    }

    public static void a(int n2, float f2) {
        if (n2 != bd.c.b || f2 != bd.c.c) {
            bd.c.b = n2;
            bd.c.c = f2;
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
        bd.f.a.b();
    }

    public static void h() {
        bd.f.a.a();
    }

    public static void a(int n2, int n3) {
        if (n2 != bd.f.b || n3 != bd.f.c) {
            bd.f.b = n2;
            bd.f.c = n3;
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
        bd.h.a.a();
    }

    public static void j() {
        bd.h.a.b();
    }

    public static void c(int n2) {
        if (n2 != bd.h.c) {
            bd.h.c = n2;
            GL11.n(n2);
        }
    }

    public static void a(boolean bl2) {
        if (bl2 != bd.h.b) {
            bd.h.b = bl2;
            GL11.b(bl2);
        }
    }

    public static void k() {
        bd.g.a.a();
    }

    public static void l() {
        bd.g.a.b();
    }

    public static void a(ad ad2, bc bc2) {
        bd.b(ad2.p, bc2.o);
    }

    public static void b(int n2, int n3) {
        if (n2 != bd.g.b || n3 != bd.g.c) {
            bd.g.b = n2;
            bd.g.c = n3;
            GL11.a(n2, n3);
        }
    }

    public static void a(ad ad2, bc bc2, ad ad3, bc bc3) {
        bd.a(ad2.p, bc2.o, ad3.p, bc3.o);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        if (n2 != bd.g.b || n3 != bd.g.c || n4 != bd.g.d || n5 != bd.g.e) {
            bd.g.b = n2;
            bd.g.c = n3;
            bd.g.d = n4;
            bd.g.e = n5;
            ay.c(n2, n3, n4, n5);
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
        bd.b(8960, 8705, b);
        bd.a(8960, 8704, 34160);
        bd.a(8960, 34161, 7681);
        bd.a(8960, 34176, 34166);
        bd.a(8960, 34192, 768);
        bd.a(8960, 34162, 7681);
        bd.a(8960, 34184, 5890);
        bd.a(8960, 34200, 770);
    }

    public static void m() {
        bd.a(8960, 8704, 8448);
        bd.a(8960, 34161, 8448);
        bd.a(8960, 34162, 8448);
        bd.a(8960, 34176, 5890);
        bd.a(8960, 34184, 5890);
        bd.a(8960, 34192, 768);
        bd.a(8960, 34200, 770);
    }

    public static void n() {
        bd.i.a.b();
    }

    public static void o() {
        bd.i.a.a();
    }

    public static void a(cs cs2) {
        bd.t(cs2.d);
    }

    private static void t(int n2) {
        if (n2 != bd.i.b) {
            bd.i.b = n2;
            GL11.f(2917, n2);
        }
    }

    public static void a(float f2) {
        if (f2 != bd.i.c) {
            bd.i.c = f2;
            GL11.c(2914, f2);
        }
    }

    public static void b(float f2) {
        if (f2 != bd.i.d) {
            bd.i.d = f2;
            GL11.c(2915, f2);
        }
    }

    public static void c(float f2) {
        if (f2 != bd.i.e) {
            bd.i.e = f2;
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
        bd.j.a.b();
    }

    public static void q() {
        bd.j.a.a();
    }

    public static void a(bj bj2) {
        bd.u(bj2.d);
    }

    private static void u(int n2) {
        if (n2 != bd.j.b) {
            bd.j.b = n2;
            GL11.f(n2);
        }
    }

    public static void d(int n2, int n3) {
        GL11.p(n2, n3);
    }

    public static void r() {
        bd.k.a.b();
    }

    public static void s() {
        bd.k.a.a();
    }

    public static void a(float f2, float f3) {
        if (f2 != bd.k.c || f3 != bd.k.d) {
            bd.k.c = f2;
            bd.k.d = f3;
            GL11.b(f2, f3);
        }
    }

    public static void t() {
        bd.l.a.b();
    }

    public static void u() {
        bd.l.a.a();
    }

    public static void a(bt bt2) {
        bd.f(bt2.q);
    }

    public static void f(int n2) {
        if (n2 != bd.l.b) {
            bd.l.b = n2;
            GL11.x(n2);
        }
    }

    public static void a(d d2) {
        bd.c((d)d2).a.b();
    }

    public static void b(d d2) {
        bd.c((d)d2).a.a();
    }

    public static void a(d d2, int n2) {
        l l2 = bd.c(d2);
        if (n2 != l2.c) {
            l2.c = n2;
            GL11.l(l2.b, 9472, n2);
        }
    }

    public static void a(d d2, int n2, FloatBuffer floatBuffer) {
        GL11.m(bd.c((d)d2).b, n2, floatBuffer);
    }

    private static l c(d d2) {
        switch (d2) {
            case a: {
                return bd.m.a;
            }
            case b: {
                return bd.m.b;
            }
            case c: {
                return bd.m.c;
            }
            case d: {
                return bd.m.d;
            }
        }
        return bd.m.a;
    }

    public static void g(int n2) {
        if (q != n2 - ay.q) {
            q = n2 - ay.q;
            ay.k(n2);
        }
    }

    public static void v() {
        bd.r[bd.q].a.b();
    }

    public static void w() {
        bd.r[bd.q].a.a();
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
        bi[] arrbi = r;
        int n3 = r.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            bi bi2 = arrbi[i2];
            if (bi2.b != n2) continue;
            bi2.b = -1;
        }
    }

    public static void i(int n2) {
        if (n2 != bd.r[bd.q].b) {
            bd.r[bd.q].b = n2;
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
        if (bl2 != bd.u.a || bl3 != bd.u.b || bl4 != bd.u.c || bl5 != bd.u.d) {
            bd.u.a = bl2;
            bd.u.b = bl3;
            bd.u.c = bl4;
            bd.u.d = bl5;
            GL11.a(bl2, bl3, bl4, bl5);
        }
    }

    public static void a(double d2) {
        if (d2 != bd.n.a) {
            bd.n.a = d2;
            GL11.a(d2);
        }
    }

    public static void a(float f2, float f3, float f4, float f5) {
        if (f2 != bd.n.b.a || f3 != bd.n.b.b || f4 != bd.n.b.c || f5 != bd.n.b.d) {
            bd.n.b.a = f2;
            bd.n.b.b = f3;
            bd.n.b.c = f4;
            bd.n.b.d = f5;
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
        bd.a(bd.a(a, e2));
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
        if (f2 != bd.v.a || f3 != bd.v.b || f4 != bd.v.c || f5 != bd.v.d) {
            bd.v.a = f2;
            bd.v.b = f3;
            bd.v.c = f4;
            bd.v.d = f5;
            GL11.c(f2, f3, f4, f5);
        }
    }

    public static void d(float f2, float f3, float f4) {
        bd.c(f2, f3, f4, 1.0f);
    }

    public static void b(float f2, float f3) {
        GL11.f(f2, f3);
    }

    public static void e(float f2, float f3, float f4) {
        GL11.e(f2, f3, f4);
    }

    public static void F() {
        bd.v.a = -1.0f;
        bd.v.b = -1.0f;
        bd.v.c = -1.0f;
        bd.v.d = -1.0f;
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

    public static void a(bq bq2) {
        bq2.a();
    }

    public static void b(bq bq2) {
        bq2.b();
    }
}

