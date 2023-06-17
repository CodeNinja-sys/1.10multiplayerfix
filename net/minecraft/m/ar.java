/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fk;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.v.d;

public class ar
extends cg {
    protected final cn a;

    public ar(cn cn2) {
        this.a = cn2;
    }

    public ar a(String string) {
        super.b(string);
        return this;
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        b b4 = k2.n(b3);
        cn cn2 = b4.c();
        if (!cn2.b(k2, b3)) {
            b3 = b3.a(ad2);
        }
        if (cu2.b != 0 && b2.a(b3, ad2, cu2) && k2.a(this.a, b3, false, ad2, null, cu2)) {
            int n2 = this.a(cu2.h());
            b b5 = this.a.a(k2, b3, ad2, f2, f3, f4, n2, b2);
            if (k2.a(b3, b5, 11)) {
                b5 = k2.n(b3);
                if (b5.c() == this.a) {
                    ar.a(k2, b2, b3, cu2);
                    this.a.a(k2, b3, b5, b2, cu2);
                }
                fk fk2 = this.a.w();
                k2.a(b2, b3, fk2.e(), bu.e, (fk2.a() + 1.0f) / 2.0f, fk2.b() * 0.8f);
                --cu2.b;
            }
            return ab.a;
        }
        return ab.c;
    }

    public static boolean a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, cu cu2) {
        ap ap2;
        a a2 = k2.l();
        if (a2 == null) {
            return false;
        }
        if (cu2.n() && cu2.o().b("BlockEntityTag", 10) && (ap2 = k2.q(b3)) != null) {
            if (!(k2.C || !ap2.bK_() || b2 != null && b2.aN())) {
                return false;
            }
            e e2 = ap2.a(new e());
            e e3 = e2.g();
            e e4 = (e)cu2.o().c("BlockEntityTag");
            e2.a(e4);
            e2.a("x", b3.cy_());
            e2.a("y", b3.k());
            e2.a("z", b3.l());
            if (!e2.equals(e3)) {
                ap2.b(e2);
                ap2.C();
                return true;
            }
        }
        return false;
    }

    public boolean a(k k2, net.minecraft.u.b.b b2, ad ad2, net.minecraft.w.a.b b3, cu cu2) {
        cn cn2 = k2.n(b2).c();
        if (cn2 == p.aH) {
            ad2 = ad.b;
        } else if (!cn2.b(k2, b2)) {
            b2 = b2.a(ad2);
        }
        return k2.a(this.a, b2, false, ad2, null, cu2);
    }

    @Override
    public String d(cu cu2) {
        return this.a.p();
    }

    @Override
    public String cw_() {
        return this.a.p();
    }

    @Override
    public d a() {
        return this.a.s();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        this.a.a(cg2, d2, list);
    }

    public cn e() {
        return this.a;
    }

    @Override
    public /* synthetic */ cg b(String string) {
        return this.a(string);
    }
}

