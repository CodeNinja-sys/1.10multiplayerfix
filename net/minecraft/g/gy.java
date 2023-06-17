/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.h;
import net.minecraft.g.b.f;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.de;
import net.minecraft.g.dq;
import net.minecraft.g.fu;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bq;
import net.minecraft.u.d.l;
import net.minecraft.w.f.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class gy
extends dq {
    public static final f b = de.j;
    public static final g c = g.a("damage", 0, 2);
    protected static final a d = new a(0.0, 0.0, 0.125, 1.0, 1.0, 0.875);
    protected static final a e = new a(0.125, 0.0, 0.0, 0.875, 1.0, 1.0);
    protected static final d f = org.apache.logging.log4j.c.c();

    protected gy() {
        super(h.g);
        this.z(this.O.b().a(b, (Comparable)((Object)ad.c)).a(c, Integer.valueOf(0)));
        this.f(0);
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, net.minecraft.w.l l2) {
        ad ad3 = l2.cl_().f();
        try {
            return super.a(k2, b2, ad2, f2, f3, f4, n2, l2).a(b, (Comparable)((Object)ad3)).a(c, Integer.valueOf(n2 >> 2));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            if (!k2.C) {
                f.f(String.format("Invalid damage property for anvil at %s. Found %d, must be in [0, 1, 2]", b2, n2 >> 2));
                if (l2 instanceof net.minecraft.w.a.b) {
                    ((net.minecraft.w.a.b)l2).a(new l("Invalid damage property. Please pick in [0, 1, 2]", new Object[0]));
                }
            }
            return super.a(k2, b2, ad2, f2, f3, f4, 0, l2).a(b, (Comparable)((Object)ad3)).a(c, Integer.valueOf(0));
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (!k2.C) {
            b4.a(new fu(k2, b2));
        }
        return true;
    }

    @Override
    public int k(b b2) {
        return (Integer)b2.a(c);
    }

    @Override
    public a a(b b2, net.minecraft.q.n n2, net.minecraft.u.b.b b3) {
        ad ad2 = (ad)((Object)b2.a(b));
        return ad2.l() == ae.a ? d : e;
    }

    @Override
    public void a(cg cg2, net.minecraft.v.d d2, List list) {
        list.add(new cu(cg2));
        list.add(new cu(cg2, 1, 1));
        list.add(new cu(cg2, 1, 2));
    }

    @Override
    protected void a(n n2) {
        n2.a(true);
    }

    @Override
    public void c(k k2, net.minecraft.u.b.b b2) {
        k2.b(1031, b2, 0);
    }

    @Override
    public boolean a(b b2, net.minecraft.q.n n2, net.minecraft.u.b.b b3, ad ad2) {
        return true;
    }

    @Override
    public b a(int n2) {
        return this.v().a(b, (Comparable)((Object)ad.b(n2 & 3))).a(c, Integer.valueOf((n2 & 0xF) >> 2));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(b))).c();
        return n2 |= (Integer)b2.a(c) << 2;
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.c() != this ? b2 : b2.a(b, (Comparable)((Object)bq2.a((ad)((Object)b2.a(b)))));
    }

    @Override
    protected i a() {
        return new i(this, b, c);
    }
}

