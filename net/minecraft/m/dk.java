/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import java.util.UUID;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.af;
import net.minecraft.f.ap;
import net.minecraft.f.y;
import net.minecraft.g.c.b;
import net.minecraft.g.ee;
import net.minecraft.g.fm;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.n;
import net.minecraft.u.b.o;
import net.minecraft.v.d;
import net.minecraft.w.f;
import net.minecraft.w.h;
import net.minecraft.w.l;
import net.minecraft.w.q;

public class dk
extends cg {
    public dk() {
        this.a(d.f);
    }

    @Override
    public String a(cu cu2) {
        String string = net.minecraft.u.d.b.a.a(String.valueOf(this.cw_()) + ".name").trim();
        String string2 = dk.h(cu2);
        if (string2 != null) {
            string = String.valueOf(string) + " " + net.minecraft.u.d.b.a.a("entity." + string2 + ".name");
        }
        return string;
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        net.minecraft.w.n n2;
        ap ap2;
        if (k2.C) {
            return ab.a;
        }
        if (!b2.a(b3.a(ad2), ad2, cu2)) {
            return ab.c;
        }
        b b4 = k2.n(b3);
        if (b4.c() == p.ac && (ap2 = k2.q(b3)) instanceof y) {
            af af2 = ((y)ap2).b();
            af2.a(dk.h(cu2));
            ap2.C();
            k2.a(b3, b4, b4, 3);
            if (!b2.J.d) {
                --cu2.b;
            }
            return ab.a;
        }
        b3 = b3.a(ad2);
        double d2 = 0.0;
        if (ad2 == ad.b && b4 instanceof fm) {
            d2 = 0.5;
        }
        if ((n2 = dk.a(k2, dk.h(cu2), (double)b3.cy_() + 0.5, (double)b3.k() + d2, (double)b3.l() + 0.5)) != null) {
            if (n2 instanceof l && cu2.s()) {
                n2.g(cu2.q());
            }
            dk.a(k2, b2, cu2, n2);
            if (!b2.J.d) {
                --cu2.b;
            }
        }
        return ab.a;
    }

    public static void a(k k2, net.minecraft.w.a.b b2, cu cu2, net.minecraft.w.n n2) {
        e e2;
        net.minecraft.c.a a2 = k2.l();
        if (a2 != null && n2 != null && (e2 = cu2.o()) != null && e2.b("EntityTag", 10)) {
            if (!(k2.C || !n2.cY() || b2 != null && a2.av().e(b2.ac()))) {
                return;
            }
            e e3 = n2.e(new e());
            UUID uUID = n2.cM();
            e3.a(e2.o("EntityTag"));
            n2.a(uUID);
            n2.f(e3);
        }
    }

    @Override
    public a a(cu cu2, k k2, net.minecraft.w.a.b b2, ah ah2) {
        if (k2.C) {
            return new a(ab.b, cu2);
        }
        o o2 = this.a(k2, b2, true);
        if (o2 != null && o2.a == net.minecraft.u.b.p.b) {
            net.minecraft.u.b.b b3 = o2.a();
            if (!(k2.n(b3).c() instanceof ee)) {
                return new a(ab.b, cu2);
            }
            if (k2.a(b2, b3) && b2.a(b3, o2.b, cu2)) {
                net.minecraft.w.n n2 = dk.a(k2, dk.h(cu2), (double)b3.cy_() + 0.5, (double)b3.k() + 0.5, (double)b3.l() + 0.5);
                if (n2 == null) {
                    return new a(ab.b, cu2);
                }
                if (n2 instanceof l && cu2.s()) {
                    n2.g(cu2.q());
                }
                dk.a(k2, b2, cu2, n2);
                if (!b2.J.d) {
                    --cu2.b;
                }
                b2.a(net.minecraft.r.o.b(this));
                return new a(ab.a, cu2);
            }
            return new a(ab.c, cu2);
        }
        return new a(ab.b, cu2);
    }

    public static net.minecraft.w.n a(k k2, String string, double d2, double d3, double d4) {
        if (string != null && net.minecraft.w.h.a.containsKey(string)) {
            net.minecraft.w.n n2 = null;
            for (int i2 = 0; i2 < 1; ++i2) {
                n2 = net.minecraft.w.h.b(string, k2);
                if (!(n2 instanceof l)) continue;
                f f2 = (f)n2;
                n2.b(d2, d3, d4, n.g(k2.p.nextFloat() * 360.0f), 0.0f);
                f2.am = f2.ba;
                f2.ak = f2.ba;
                f2.a(k2.C(new net.minecraft.u.b.b(f2)), null);
                k2.a(n2);
                f2.ad();
            }
            return n2;
        }
        return null;
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (q q2 : net.minecraft.w.h.a.values()) {
            cu cu2 = new cu(cg2, 1);
            dk.a(cu2, q2.a);
            list.add(cu2);
        }
    }

    public static void a(cu cu2, String string) {
        e e2 = cu2.n() ? cu2.o() : new e();
        e e3 = new e();
        e3.a("id", string);
        e2.a("EntityTag", e3);
        cu2.d(e2);
    }

    public static String h(cu cu2) {
        e e2 = cu2.o();
        if (e2 == null) {
            return null;
        }
        if (!e2.b("EntityTag", 10)) {
            return null;
        }
        e e3 = e2.o("EntityTag");
        return !e3.b("id", 8) ? null : e3.l("id");
    }
}

