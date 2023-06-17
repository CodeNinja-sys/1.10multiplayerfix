/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.h.al;
import net.minecraft.w.h.p;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class be
extends ap {
    private final w a;
    private final w b;
    private final w c;
    private final w d;
    private final w e;
    private final w f;
    private final w g;
    private final w h;
    private final w i;
    private final w j;
    private final w k;
    private final w l;
    private final w m;
    private final w n;
    private final w o;
    private final w v;
    private final w w;
    private final w x;
    private final w y;
    private final w z;
    private final w A;
    private final w B;
    private final w C;
    private final w D;
    private final w E;
    private final w F;
    private final w G;
    private final w H;
    private final w I;
    private final w J;
    private final w K;
    private final w L;
    private final w M;
    private final w N;
    private final w O;
    private final w P;
    private final w Q;
    private final w R;
    private final w S;

    public be() {
        this.t = 128;
        this.u = 128;
        this.k = new w(this, 0, 34);
        this.k.a(-5.0f, -8.0f, -19.0f, 10, 10, 24);
        this.k.a(0.0f, 11.0f, 9.0f);
        this.l = new w(this, 44, 0);
        this.l.a(-1.0f, -1.0f, 0.0f, 2, 2, 3);
        this.l.a(0.0f, 3.0f, 14.0f);
        this.a(this.l, -1.134464f, 0.0f, 0.0f);
        this.m = new w(this, 38, 7);
        this.m.a(-1.5f, -2.0f, 3.0f, 3, 4, 7);
        this.m.a(0.0f, 3.0f, 14.0f);
        this.a(this.m, -1.134464f, 0.0f, 0.0f);
        this.n = new w(this, 24, 3);
        this.n.a(-1.5f, -4.5f, 9.0f, 3, 4, 7);
        this.n.a(0.0f, 3.0f, 14.0f);
        this.a(this.n, -1.40215f, 0.0f, 0.0f);
        this.o = new w(this, 78, 29);
        this.o.a(-2.5f, -2.0f, -2.5f, 4, 9, 5);
        this.o.a(4.0f, 9.0f, 11.0f);
        this.v = new w(this, 78, 43);
        this.v.a(-2.0f, 0.0f, -1.5f, 3, 5, 3);
        this.v.a(4.0f, 16.0f, 11.0f);
        this.w = new w(this, 78, 51);
        this.w.a(-2.5f, 5.1f, -2.0f, 4, 3, 4);
        this.w.a(4.0f, 16.0f, 11.0f);
        this.x = new w(this, 96, 29);
        this.x.a(-1.5f, -2.0f, -2.5f, 4, 9, 5);
        this.x.a(-4.0f, 9.0f, 11.0f);
        this.y = new w(this, 96, 43);
        this.y.a(-1.0f, 0.0f, -1.5f, 3, 5, 3);
        this.y.a(-4.0f, 16.0f, 11.0f);
        this.z = new w(this, 96, 51);
        this.z.a(-1.5f, 5.1f, -2.0f, 4, 3, 4);
        this.z.a(-4.0f, 16.0f, 11.0f);
        this.A = new w(this, 44, 29);
        this.A.a(-1.9f, -1.0f, -2.1f, 3, 8, 4);
        this.A.a(4.0f, 9.0f, -8.0f);
        this.B = new w(this, 44, 41);
        this.B.a(-1.9f, 0.0f, -1.6f, 3, 5, 3);
        this.B.a(4.0f, 16.0f, -8.0f);
        this.C = new w(this, 44, 51);
        this.C.a(-2.4f, 5.1f, -2.1f, 4, 3, 4);
        this.C.a(4.0f, 16.0f, -8.0f);
        this.D = new w(this, 60, 29);
        this.D.a(-1.1f, -1.0f, -2.1f, 3, 8, 4);
        this.D.a(-4.0f, 9.0f, -8.0f);
        this.E = new w(this, 60, 41);
        this.E.a(-1.1f, 0.0f, -1.6f, 3, 5, 3);
        this.E.a(-4.0f, 16.0f, -8.0f);
        this.F = new w(this, 60, 51);
        this.F.a(-1.6f, 5.1f, -2.1f, 4, 3, 4);
        this.F.a(-4.0f, 16.0f, -8.0f);
        this.a = new w(this, 0, 0);
        this.a.a(-2.5f, -10.0f, -1.5f, 5, 5, 7);
        this.a.a(0.0f, 4.0f, -10.0f);
        this.a(this.a, 0.5235988f, 0.0f, 0.0f);
        this.b = new w(this, 24, 18);
        this.b.a(-2.0f, -10.0f, -7.0f, 4, 3, 6);
        this.b.a(0.0f, 3.95f, -10.0f);
        this.a(this.b, 0.5235988f, 0.0f, 0.0f);
        this.c = new w(this, 24, 27);
        this.c.a(-2.0f, -7.0f, -6.5f, 4, 2, 5);
        this.c.a(0.0f, 4.0f, -10.0f);
        this.a(this.c, 0.5235988f, 0.0f, 0.0f);
        this.a.a(this.b);
        this.a.a(this.c);
        this.d = new w(this, 0, 0);
        this.d.a(0.45f, -12.0f, 4.0f, 2, 3, 1);
        this.d.a(0.0f, 4.0f, -10.0f);
        this.a(this.d, 0.5235988f, 0.0f, 0.0f);
        this.e = new w(this, 0, 0);
        this.e.a(-2.45f, -12.0f, 4.0f, 2, 3, 1);
        this.e.a(0.0f, 4.0f, -10.0f);
        this.a(this.e, 0.5235988f, 0.0f, 0.0f);
        this.f = new w(this, 0, 12);
        this.f.a(-2.0f, -16.0f, 4.0f, 2, 7, 1);
        this.f.a(0.0f, 4.0f, -10.0f);
        this.a(this.f, 0.5235988f, 0.0f, 0.2617994f);
        this.g = new w(this, 0, 12);
        this.g.a(0.0f, -16.0f, 4.0f, 2, 7, 1);
        this.g.a(0.0f, 4.0f, -10.0f);
        this.a(this.g, 0.5235988f, 0.0f, -0.2617994f);
        this.h = new w(this, 0, 12);
        this.h.a(-2.05f, -9.8f, -2.0f, 4, 14, 8);
        this.h.a(0.0f, 4.0f, -10.0f);
        this.a(this.h, 0.5235988f, 0.0f, 0.0f);
        this.G = new w(this, 0, 34);
        this.G.a(-3.0f, 0.0f, 0.0f, 8, 8, 3);
        this.G.a(-7.5f, 3.0f, 10.0f);
        this.a(this.G, 0.0f, 1.5707964f, 0.0f);
        this.H = new w(this, 0, 47);
        this.H.a(-3.0f, 0.0f, 0.0f, 8, 8, 3);
        this.H.a(4.5f, 3.0f, 10.0f);
        this.a(this.H, 0.0f, 1.5707964f, 0.0f);
        this.I = new w(this, 80, 0);
        this.I.a(-5.0f, 0.0f, -3.0f, 10, 1, 8);
        this.I.a(0.0f, 2.0f, 2.0f);
        this.J = new w(this, 106, 9);
        this.J.a(-1.5f, -1.0f, -3.0f, 3, 1, 2);
        this.J.a(0.0f, 2.0f, 2.0f);
        this.K = new w(this, 80, 9);
        this.K.a(-4.0f, -1.0f, 3.0f, 8, 1, 2);
        this.K.a(0.0f, 2.0f, 2.0f);
        this.M = new w(this, 74, 0);
        this.M.a(-0.5f, 6.0f, -1.0f, 1, 2, 2);
        this.M.a(5.0f, 3.0f, 2.0f);
        this.L = new w(this, 70, 0);
        this.L.a(-0.5f, 0.0f, -0.5f, 1, 6, 1);
        this.L.a(5.0f, 3.0f, 2.0f);
        this.O = new w(this, 74, 4);
        this.O.a(-0.5f, 6.0f, -1.0f, 1, 2, 2);
        this.O.a(-5.0f, 3.0f, 2.0f);
        this.N = new w(this, 80, 0);
        this.N.a(-0.5f, 0.0f, -0.5f, 1, 6, 1);
        this.N.a(-5.0f, 3.0f, 2.0f);
        this.P = new w(this, 74, 13);
        this.P.a(1.5f, -8.0f, -4.0f, 1, 2, 2);
        this.P.a(0.0f, 4.0f, -10.0f);
        this.a(this.P, 0.5235988f, 0.0f, 0.0f);
        this.Q = new w(this, 74, 13);
        this.Q.a(-2.5f, -8.0f, -4.0f, 1, 2, 2);
        this.Q.a(0.0f, 4.0f, -10.0f);
        this.a(this.Q, 0.5235988f, 0.0f, 0.0f);
        this.R = new w(this, 44, 10);
        this.R.a(2.6f, -6.0f, -6.0f, 0, 3, 16);
        this.R.a(0.0f, 4.0f, -10.0f);
        this.S = new w(this, 44, 5);
        this.S.a(-2.6f, -6.0f, -6.0f, 0, 3, 16);
        this.S.a(0.0f, 4.0f, -10.0f);
        this.j = new w(this, 58, 0);
        this.j.a(-1.0f, -11.5f, 5.0f, 2, 16, 4);
        this.j.a(0.0f, 4.0f, -10.0f);
        this.a(this.j, 0.5235988f, 0.0f, 0.0f);
        this.i = new w(this, 80, 12);
        this.i.a(-2.5f, -10.1f, -7.0f, 5, 5, 12, 0.2f);
        this.i.a(0.0f, 4.0f, -10.0f);
        this.a(this.i, 0.5235988f, 0.0f, 0.0f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        al al2 = (al)n2;
        p p2 = al2.p();
        float f8 = al2.q(0.0f);
        boolean bl2 = al2.r();
        boolean bl3 = bl2 && al2.dz();
        boolean bl4 = bl2 && al2.dp();
        boolean bl5 = p2.g();
        float f9 = al2.E();
        boolean bl6 = al2.cA();
        if (bl3) {
            this.i.a(f7);
            this.I.a(f7);
            this.J.a(f7);
            this.K.a(f7);
            this.L.a(f7);
            this.M.a(f7);
            this.N.a(f7);
            this.O.a(f7);
            this.P.a(f7);
            this.Q.a(f7);
            if (bl6) {
                this.R.a(f7);
                this.S.a(f7);
            }
        }
        if (!bl2) {
            bd.D();
            bd.b(f9, 0.5f + f9 * 0.5f, f9);
            bd.c(0.0f, 0.95f * (1.0f - f9), 0.0f);
        }
        this.o.a(f7);
        this.v.a(f7);
        this.w.a(f7);
        this.x.a(f7);
        this.y.a(f7);
        this.z.a(f7);
        this.A.a(f7);
        this.B.a(f7);
        this.C.a(f7);
        this.D.a(f7);
        this.E.a(f7);
        this.F.a(f7);
        if (!bl2) {
            bd.E();
            bd.D();
            bd.b(f9, f9, f9);
            bd.c(0.0f, 1.35f * (1.0f - f9), 0.0f);
        }
        this.k.a(f7);
        this.l.a(f7);
        this.m.a(f7);
        this.n.a(f7);
        this.h.a(f7);
        this.j.a(f7);
        if (!bl2) {
            bd.E();
            bd.D();
            float f10 = 0.5f + f9 * f9 * 0.5f;
            bd.b(f10, f10, f10);
            if (f8 <= 0.0f) {
                bd.c(0.0f, 1.35f * (1.0f - f9), 0.0f);
            } else {
                bd.c(0.0f, 0.9f * (1.0f - f9) * f8 + 1.35f * (1.0f - f9) * (1.0f - f8), 0.15f * (1.0f - f9) * f8);
            }
        }
        if (bl5) {
            this.f.a(f7);
            this.g.a(f7);
        } else {
            this.d.a(f7);
            this.e.a(f7);
        }
        this.a.a(f7);
        if (!bl2) {
            bd.E();
        }
        if (bl4) {
            this.G.a(f7);
            this.H.a(f7);
        }
    }

    private void a(w w2, float f2, float f3, float f4) {
        w2.f = f2;
        w2.g = f3;
        w2.h = f4;
    }

    private float a(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        super.a(l2, f2, f3, f4);
        float f5 = this.a(l2.al, l2.ak, f4);
        float f6 = this.a(l2.an, l2.am, f4);
        float f7 = l2.bd + (l2.bb - l2.bd) * f4;
        float f8 = f6 - f5;
        float f9 = f7 * ((float)Math.PI / 180);
        if (f8 > 20.0f) {
            f8 = 20.0f;
        }
        if (f8 < -20.0f) {
            f8 = -20.0f;
        }
        if (f3 > 0.2f) {
            f9 += net.minecraft.u.b.n.b(f2 * 0.4f) * 0.15f * f3;
        }
        al al2 = (al)l2;
        float f10 = al2.q(f4);
        float f11 = al2.s(f4);
        float f12 = 1.0f - f11;
        float f13 = al2.t(f4);
        boolean bl2 = al2.b != 0;
        boolean bl3 = al2.dz();
        boolean bl4 = al2.cA();
        float f14 = (float)l2.by + f4;
        float f15 = net.minecraft.u.b.n.b(f2 * 0.6662f + (float)Math.PI);
        float f16 = f15 * 0.8f * f3;
        this.a.d = 4.0f;
        this.a.e = -10.0f;
        this.l.d = 3.0f;
        this.m.e = 14.0f;
        this.H.d = 3.0f;
        this.H.e = 10.0f;
        this.k.f = 0.0f;
        this.a.f = 0.5235988f + f9;
        this.a.g = f8 * ((float)Math.PI / 180);
        this.a.f = f11 * (0.2617994f + f9) + f10 * 2.18166f + (1.0f - Math.max(f11, f10)) * this.a.f;
        this.a.g = f11 * f8 * ((float)Math.PI / 180) + (1.0f - Math.max(f11, f10)) * this.a.g;
        this.a.d = f11 * -6.0f + f10 * 11.0f + (1.0f - Math.max(f11, f10)) * this.a.d;
        this.a.e = f11 * -1.0f + f10 * -10.0f + (1.0f - Math.max(f11, f10)) * this.a.e;
        this.l.d = f11 * 9.0f + f12 * this.l.d;
        this.m.e = f11 * 18.0f + f12 * this.m.e;
        this.H.d = f11 * 5.5f + f12 * this.H.d;
        this.H.e = f11 * 15.0f + f12 * this.H.e;
        this.k.f = f11 * -45.0f * ((float)Math.PI / 180) + f12 * this.k.f;
        this.d.d = this.a.d;
        this.e.d = this.a.d;
        this.f.d = this.a.d;
        this.g.d = this.a.d;
        this.h.d = this.a.d;
        this.b.d = 0.02f;
        this.c.d = 0.0f;
        this.j.d = this.a.d;
        this.d.e = this.a.e;
        this.e.e = this.a.e;
        this.f.e = this.a.e;
        this.g.e = this.a.e;
        this.h.e = this.a.e;
        this.b.e = 0.02f - f13;
        this.c.e = f13;
        this.j.e = this.a.e;
        this.d.f = this.a.f;
        this.e.f = this.a.f;
        this.f.f = this.a.f;
        this.g.f = this.a.f;
        this.h.f = this.a.f;
        this.b.f = -0.09424778f * f13;
        this.c.f = 0.15707964f * f13;
        this.j.f = this.a.f;
        this.d.g = this.a.g;
        this.e.g = this.a.g;
        this.f.g = this.a.g;
        this.g.g = this.a.g;
        this.h.g = this.a.g;
        this.b.g = 0.0f;
        this.c.g = 0.0f;
        this.j.g = this.a.g;
        this.G.f = f16 / 5.0f;
        this.H.f = -f16 / 5.0f;
        float f17 = 1.5707964f;
        float f18 = 4.712389f;
        float f19 = -1.0471976f;
        float f20 = 0.2617994f * f11;
        float f21 = net.minecraft.u.b.n.b(f14 * 0.6f + (float)Math.PI);
        this.A.d = -2.0f * f11 + 9.0f * f12;
        this.A.e = -2.0f * f11 + -8.0f * f12;
        this.D.d = this.A.d;
        this.D.e = this.A.e;
        this.v.d = this.o.d + net.minecraft.u.b.n.a(1.5707964f + f20 + f12 * -f15 * 0.5f * f3) * 7.0f;
        this.v.e = this.o.e + net.minecraft.u.b.n.b(4.712389f + f20 + f12 * -f15 * 0.5f * f3) * 7.0f;
        this.y.d = this.x.d + net.minecraft.u.b.n.a(1.5707964f + f20 + f12 * f15 * 0.5f * f3) * 7.0f;
        this.y.e = this.x.e + net.minecraft.u.b.n.b(4.712389f + f20 + f12 * f15 * 0.5f * f3) * 7.0f;
        float f22 = (-1.0471976f + f21) * f11 + f16 * f12;
        float f23 = (-1.0471976f + -f21) * f11 + -f16 * f12;
        this.B.d = this.A.d + net.minecraft.u.b.n.a(1.5707964f + f22) * 7.0f;
        this.B.e = this.A.e + net.minecraft.u.b.n.b(4.712389f + f22) * 7.0f;
        this.E.d = this.D.d + net.minecraft.u.b.n.a(1.5707964f + f23) * 7.0f;
        this.E.e = this.D.e + net.minecraft.u.b.n.b(4.712389f + f23) * 7.0f;
        this.o.f = f20 + -f15 * 0.5f * f3 * f12;
        this.w.f = this.v.f = -0.08726646f * f11 + (-f15 * 0.5f * f3 - Math.max(0.0f, f15 * 0.5f * f3)) * f12;
        this.x.f = f20 + f15 * 0.5f * f3 * f12;
        this.z.f = this.y.f = -0.08726646f * f11 + (f15 * 0.5f * f3 - Math.max(0.0f, -f15 * 0.5f * f3)) * f12;
        this.A.f = f22;
        this.C.f = this.B.f = (this.A.f + (float)Math.PI * Math.max(0.0f, 0.2f + f21 * 0.2f)) * f11 + (f16 + Math.max(0.0f, f15 * 0.5f * f3)) * f12;
        this.D.f = f23;
        this.F.f = this.E.f = (this.D.f + (float)Math.PI * Math.max(0.0f, 0.2f - f21 * 0.2f)) * f11 + (-f16 + Math.max(0.0f, -f15 * 0.5f * f3)) * f12;
        this.w.d = this.v.d;
        this.w.e = this.v.e;
        this.z.d = this.y.d;
        this.z.e = this.y.e;
        this.C.d = this.B.d;
        this.C.e = this.B.e;
        this.F.d = this.E.d;
        this.F.e = this.E.e;
        if (bl3) {
            this.I.d = f11 * 0.5f + f12 * 2.0f;
            this.I.e = f11 * 11.0f + f12 * 2.0f;
            this.J.d = this.I.d;
            this.K.d = this.I.d;
            this.L.d = this.I.d;
            this.N.d = this.I.d;
            this.M.d = this.I.d;
            this.O.d = this.I.d;
            this.G.d = this.H.d;
            this.J.e = this.I.e;
            this.K.e = this.I.e;
            this.L.e = this.I.e;
            this.N.e = this.I.e;
            this.M.e = this.I.e;
            this.O.e = this.I.e;
            this.G.e = this.H.e;
            this.I.f = this.k.f;
            this.J.f = this.k.f;
            this.K.f = this.k.f;
            this.R.d = this.a.d;
            this.S.d = this.a.d;
            this.i.d = this.a.d;
            this.P.d = this.a.d;
            this.Q.d = this.a.d;
            this.R.e = this.a.e;
            this.S.e = this.a.e;
            this.i.e = this.a.e;
            this.P.e = this.a.e;
            this.Q.e = this.a.e;
            this.R.f = f9;
            this.S.f = f9;
            this.i.f = this.a.f;
            this.P.f = this.a.f;
            this.Q.f = this.a.f;
            this.i.g = this.a.g;
            this.P.g = this.a.g;
            this.R.g = this.a.g;
            this.Q.g = this.a.g;
            this.S.g = this.a.g;
            if (bl4) {
                this.L.f = -1.0471976f;
                this.M.f = -1.0471976f;
                this.N.f = -1.0471976f;
                this.O.f = -1.0471976f;
                this.L.h = 0.0f;
                this.M.h = 0.0f;
                this.N.h = 0.0f;
                this.O.h = 0.0f;
            } else {
                this.L.f = f16 / 3.0f;
                this.M.f = f16 / 3.0f;
                this.N.f = f16 / 3.0f;
                this.O.f = f16 / 3.0f;
                this.L.h = f16 / 5.0f;
                this.M.h = f16 / 5.0f;
                this.N.h = -f16 / 5.0f;
                this.O.h = -f16 / 5.0f;
            }
        }
        if ((f17 = -1.3089f + f3 * 1.5f) > 0.0f) {
            f17 = 0.0f;
        }
        if (bl2) {
            this.l.g = net.minecraft.u.b.n.b(f14 * 0.7f);
            f17 = 0.0f;
        } else {
            this.l.g = 0.0f;
        }
        this.m.g = this.l.g;
        this.n.g = this.l.g;
        this.m.d = this.l.d;
        this.n.d = this.l.d;
        this.m.e = this.l.e;
        this.n.e = this.l.e;
        this.l.f = f17;
        this.m.f = f17;
        this.n.f = -0.2618f + f17;
    }
}

