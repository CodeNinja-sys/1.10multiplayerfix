/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import com.a.a.d.ov;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.g.a.m;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bq;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.v;
import net.minecraft.client.j.ap;
import net.minecraft.client.r;
import net.minecraft.j.i;
import net.minecraft.j.n;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;
import net.minecraft.w.a.j;
import net.minecraft.w.l;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class al
extends aa {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final m b = new m(16, 16);
    protected ap g;
    protected FloatBuffer h = v.e(4);
    protected List i = ov.a();
    protected boolean j;

    static {
        int[] arrn = b.b();
        for (int i2 = 0; i2 < 256; ++i2) {
            arrn[i2] = -1;
        }
        b.a();
    }

    public al(f f2, ap ap2, float f3) {
        super(f2);
        this.g = ap2;
        this.d = f3;
    }

    protected boolean a(s s2) {
        return this.i.add(s2);
    }

    protected boolean b(s s2) {
        return this.i.remove(s2);
    }

    public ap f() {
        return this.g;
    }

    protected float a(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    public void a() {
    }

    public void a(l l2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        bd.q();
        this.g.p = this.e(l2, f3);
        this.g.q = l2.cz();
        this.g.r = l2.ba();
        try {
            float f4;
            float f5 = this.a(l2.al, l2.ak, f3);
            float f6 = this.a(l2.an, l2.am, f3);
            float f7 = f6 - f5;
            if (l2.cz() && l2.df() instanceof l) {
                l l3 = (l)l2.df();
                f5 = this.a(l3.al, l3.ak, f3);
                f7 = f6 - f5;
                f4 = net.minecraft.u.b.n.g(f7);
                if (f4 < -85.0f) {
                    f4 = -85.0f;
                }
                if (f4 >= 85.0f) {
                    f4 = 85.0f;
                }
                f5 = f6 - f4;
                if (f4 * f4 > 2500.0f) {
                    f5 += f4 * 0.2f;
                }
            }
            float f8 = l2.bd + (l2.bb - l2.bd) * f3;
            this.a(l2, d2, d3, d4);
            f4 = this.b(l2, f3);
            this.a(l2, f4, f5, f3);
            float f9 = this.c(l2, f3);
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (!l2.cz()) {
                f10 = l2.ac + (l2.ad - l2.ac) * f3;
                f11 = l2.ae - l2.ad * (1.0f - f3);
                if (l2.ba()) {
                    f11 *= 3.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
            }
            bd.d();
            this.g.a(l2, f11, f10, f3);
            this.g.a(f11, f10, f4, f7, f8, f9, l2);
            if (this.f) {
                boolean bl2 = this.b(l2);
                bd.g();
                bd.e(this.c((net.minecraft.w.n)l2));
                if (!this.j) {
                    this.a(l2, f11, f10, f4, f7, f8, f9);
                }
                if (!(l2 instanceof b) || !((b)l2).a()) {
                    this.a(l2, f11, f10, f3, f4, f7, f8, f9);
                }
                bd.m();
                bd.h();
                if (bl2) {
                    this.g();
                }
            } else {
                boolean bl3 = this.d(l2, f3);
                this.a(l2, f11, f10, f4, f7, f8, f9);
                if (bl3) {
                    this.h();
                }
                bd.a(true);
                if (!(l2 instanceof b) || !((b)l2).a()) {
                    this.a(l2, f11, f10, f3, f4, f7, f8, f9);
                }
            }
            bd.B();
        }
        catch (Exception exception) {
            a.b("Couldn't render entity", (Throwable)exception);
        }
        bd.g(ay.r);
        bd.v();
        bd.g(ay.q);
        bd.p();
        bd.E();
        super.a((net.minecraft.w.n)l2, d2, d3, d4, f2, f3);
    }

    public float c(l l2, float f2) {
        bd.A();
        bd.b(-1.0f, -1.0f, 1.0f);
        this.a(l2, f2);
        float f3 = 0.0625f;
        bd.c(0.0f, -1.501f, 0.0f);
        return 0.0625f;
    }

    protected boolean b(l l2) {
        bd.f();
        bd.g(ay.r);
        bd.w();
        bd.g(ay.q);
        return true;
    }

    protected void g() {
        bd.e();
        bd.g(ay.r);
        bd.v();
        bd.g(ay.q);
    }

    protected void a(l l2, float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean bl2;
        boolean bl3 = !l2.cD() || this.f;
        boolean bl4 = bl2 = !bl3 && !l2.c_(r.z().j);
        if (bl3 || bl2) {
            if (!this.e(l2)) {
                return;
            }
            if (bl2) {
                bd.a(bq.c);
            }
            this.g.a(l2, f2, f3, f4, f5, f6, f7);
            if (bl2) {
                bd.b(bq.c);
            }
        }
    }

    protected boolean d(l l2, float f2) {
        return this.a(l2, f2, true);
    }

    protected boolean a(l l2, float f2, boolean bl2) {
        boolean bl3;
        float f3 = l2.n(f2);
        int n2 = this.a(l2, f3, f2);
        boolean bl4 = (n2 >> 24 & 0xFF) > 0;
        boolean bl5 = bl3 = l2.V > 0 || l2.Y > 0;
        if (!bl4 && !bl3) {
            return false;
        }
        if (!bl4 && !bl2) {
            return false;
        }
        bd.g(ay.q);
        bd.v();
        bd.a(8960, 8704, ay.t);
        bd.a(8960, ay.y, 8448);
        bd.a(8960, ay.z, ay.q);
        bd.a(8960, ay.A, ay.v);
        bd.a(8960, ay.C, 768);
        bd.a(8960, ay.D, 768);
        bd.a(8960, ay.F, 7681);
        bd.a(8960, ay.G, ay.q);
        bd.a(8960, ay.J, 770);
        bd.g(ay.r);
        bd.v();
        bd.a(8960, 8704, ay.t);
        bd.a(8960, ay.y, ay.u);
        bd.a(8960, ay.z, ay.w);
        bd.a(8960, ay.A, ay.x);
        bd.a(8960, ay.B, ay.w);
        bd.a(8960, ay.C, 768);
        bd.a(8960, ay.D, 768);
        bd.a(8960, ay.E, 770);
        bd.a(8960, ay.F, 7681);
        bd.a(8960, ay.G, ay.x);
        bd.a(8960, ay.J, 770);
        this.h.position(0);
        if (bl3) {
            this.h.put(1.0f);
            this.h.put(0.0f);
            this.h.put(0.0f);
            this.h.put(0.3f);
        } else {
            float f4 = (float)(n2 >> 24 & 0xFF) / 255.0f;
            float f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f6 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f7 = (float)(n2 & 0xFF) / 255.0f;
            this.h.put(f5);
            this.h.put(f6);
            this.h.put(f7);
            this.h.put(1.0f - f4);
        }
        this.h.flip();
        bd.b(8960, 8705, this.h);
        bd.g(ay.s);
        bd.v();
        bd.i(b.e());
        bd.a(8960, 8704, ay.t);
        bd.a(8960, ay.y, 8448);
        bd.a(8960, ay.z, ay.x);
        bd.a(8960, ay.A, ay.r);
        bd.a(8960, ay.C, 768);
        bd.a(8960, ay.D, 768);
        bd.a(8960, ay.F, 7681);
        bd.a(8960, ay.G, ay.x);
        bd.a(8960, ay.J, 770);
        bd.g(ay.q);
        return true;
    }

    protected void h() {
        bd.g(ay.q);
        bd.v();
        bd.a(8960, 8704, ay.t);
        bd.a(8960, ay.y, 8448);
        bd.a(8960, ay.z, ay.q);
        bd.a(8960, ay.A, ay.v);
        bd.a(8960, ay.C, 768);
        bd.a(8960, ay.D, 768);
        bd.a(8960, ay.F, 8448);
        bd.a(8960, ay.G, ay.q);
        bd.a(8960, ay.H, ay.v);
        bd.a(8960, ay.J, 770);
        bd.a(8960, ay.K, 770);
        bd.g(ay.r);
        bd.a(8960, 8704, ay.t);
        bd.a(8960, ay.y, 8448);
        bd.a(8960, ay.C, 768);
        bd.a(8960, ay.D, 768);
        bd.a(8960, ay.z, 5890);
        bd.a(8960, ay.A, ay.x);
        bd.a(8960, ay.F, 8448);
        bd.a(8960, ay.J, 770);
        bd.a(8960, ay.G, 5890);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.g(ay.s);
        bd.w();
        bd.i(0);
        bd.a(8960, 8704, ay.t);
        bd.a(8960, ay.y, 8448);
        bd.a(8960, ay.C, 768);
        bd.a(8960, ay.D, 768);
        bd.a(8960, ay.z, 5890);
        bd.a(8960, ay.A, ay.x);
        bd.a(8960, ay.F, 8448);
        bd.a(8960, ay.J, 770);
        bd.a(8960, ay.G, 5890);
        bd.g(ay.q);
    }

    protected void a(l l2, double d2, double d3, double d4) {
        bd.c((float)d2, (float)d3, (float)d4);
    }

    protected void a(l l2, float f2, float f3, float f4) {
        bd.b(180.0f - f3, 0.0f, 1.0f, 0.0f);
        if (l2.Y > 0) {
            float f5 = ((float)l2.Y + f4 - 1.0f) / 20.0f * 1.6f;
            if ((f5 = net.minecraft.u.b.n.c(f5)) > 1.0f) {
                f5 = 1.0f;
            }
            bd.b(f5 * this.c(l2), 0.0f, 0.0f, 1.0f);
        } else {
            String string = o.a(l2.X());
            if (string != null && ("Dinnerbone".equals(string) || "Grumm".equals(string)) && (!(l2 instanceof b) || ((b)l2).a(net.minecraft.w.a.j.a))) {
                bd.c(0.0f, l2.bm + 0.1f, 0.0f);
                bd.b(180.0f, 0.0f, 0.0f, 1.0f);
            }
        }
    }

    protected float e(l l2, float f2) {
        return l2.j(f2);
    }

    protected float b(l l2, float f2) {
        return (float)l2.by + f2;
    }

    protected void a(l l2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        for (s s2 : this.i) {
            boolean bl2 = this.a(l2, f4, s2.bZ_());
            s2.a(l2, f2, f3, f4, f5, f6, f7, f8);
            if (!bl2) continue;
            this.h();
        }
    }

    protected float c(l l2) {
        return 90.0f;
    }

    protected int a(l l2, float f2, float f3) {
        return 0;
    }

    protected void a(l l2, float f2) {
    }

    public void b(l l2, double d2, double d3, double d4) {
        if (this.a(l2)) {
            float f2;
            double d5 = l2.n(this.c.c);
            float f3 = f2 = l2.G() ? 32.0f : 64.0f;
            if (d5 < (double)(f2 * f2)) {
                String string = l2.aK().d();
                bd.a(516, 0.1f);
                this.a((net.minecraft.w.n)l2, d2, d3, d4, string, d5);
            }
        }
    }

    protected boolean a(l l2) {
        boolean bl2;
        net.minecraft.client.h.d d2 = r.z().j;
        boolean bl3 = bl2 = !l2.c_(d2);
        if (l2 != d2) {
            i i2 = l2.aA();
            i i3 = d2.aA();
            if (i2 != null) {
                n n2 = i2.h();
                switch (n2) {
                    case a: {
                        return bl2;
                    }
                    case b: {
                        return false;
                    }
                    case c: {
                        return i3 == null ? bl2 : i2.a(i3) && (i2.g() || bl2);
                    }
                    case d: {
                        return i3 == null ? bl2 : !i2.a(i3) && bl2;
                    }
                }
                return true;
            }
        }
        return r.w() && l2 != this.c.c && bl2 && !l2.cA();
    }

    @Override
    protected /* synthetic */ boolean d(net.minecraft.w.n n2) {
        return this.a((l)n2);
    }

    @Override
    public /* synthetic */ void a(net.minecraft.w.n n2, double d2, double d3, double d4) {
        this.b((l)n2, d2, d3, d4);
    }
}

