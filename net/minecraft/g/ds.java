/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.f.ap;
import net.minecraft.f.m;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.b.e;
import net.minecraft.g.b.f;
import net.minecraft.g.bu;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.co;
import net.minecraft.g.id;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class ds
extends a {
    public static final f a = co.o;
    public static final e b = co.a;

    public ds() {
        super(h.H);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, (Comparable)((Object)bu.a)));
        this.c(-1.0f);
    }

    @Override
    public ap a(k k2, int n2) {
        return null;
    }

    public static ap a(b b2, ad ad2, boolean bl2, boolean bl3) {
        return new m(b2, ad2, bl2, bl3);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        ap ap2 = k2.q(b2);
        if (ap2 instanceof m) {
            ((m)ap2).i();
        } else {
            super.a(k2, b2, b3);
        }
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return false;
    }

    @Override
    public void a_(k k2, net.minecraft.u.b.b b2, b b3) {
        net.minecraft.u.b.b b4 = b2.a(((ad)((Object)b3.a(a))).e());
        b b5 = k2.n(b4);
        if (b5.c() instanceof id && ((Boolean)b5.a(id.a)).booleanValue()) {
            k2.f(b4);
        }
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (!k2.C && k2.q(b2) == null) {
            k2.f(b2);
            return true;
        }
        return false;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        m m2;
        if (!k2.C && (m2 = this.c(k2, b2)) != null) {
            b b4 = m2.b();
            b4.c().b(k2, b2, b4, 0);
        }
    }

    @Override
    public o a(b b2, k k2, net.minecraft.u.b.b b3, s s2, s s3) {
        return null;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.C) {
            k2.q(b3);
        }
    }

    @Override
    public net.minecraft.u.b.a a(b b2, k k2, net.minecraft.u.b.b b3) {
        m m2 = this.c(k2, b3);
        return m2 == null ? null : m2.a(k2, b3);
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        m m2 = this.c(n2, b3);
        return m2 != null ? m2.a(n2, b3) : x;
    }

    private m c(n n2, net.minecraft.u.b.b b2) {
        ap ap2 = n2.q(b2);
        return ap2 instanceof m ? (m)ap2 : null;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return null;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)co.b(n2))).a(b, (Comparable)((Object)((n2 & 8) > 0 ? bu.b : bu.a)));
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(a, (Comparable)((Object)bq2.a((ad)((Object)b2.a(a)))));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(a))));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(a))).b();
        if (b2.a(b) == bu.b) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected i a() {
        return new i(this, a, b);
    }
}

