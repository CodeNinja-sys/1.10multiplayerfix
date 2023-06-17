/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import com.a.a.b.cg;
import java.util.List;
import net.minecraft.a.o;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.d.b;
import net.minecraft.d.j;
import net.minecraft.d.m;
import net.minecraft.e.e;
import net.minecraft.m.cu;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.w.a;
import net.minecraft.w.c.c;
import net.minecraft.w.f.ae;
import net.minecraft.w.l;
import net.minecraft.x.a.g;
import net.minecraft.x.a.q;
import org.apache.logging.log4j.d;

public class k
extends c {
    private static final g d = net.minecraft.x.a.o.a(ae.class, q.f);
    private static final d e = org.apache.logging.log4j.c.c();

    public k(net.minecraft.q.k k2) {
        super(k2);
    }

    public k(net.minecraft.q.k k2, l l2, cu cu2) {
        super(k2, l2);
        this.a(cu2);
    }

    public k(net.minecraft.q.k k2, double d2, double d3, double d4, cu cu2) {
        super(k2, d2, d3, d4);
        if (cu2 != null) {
            this.a(cu2);
        }
    }

    @Override
    protected void cb_() {
        this.cc().a(d, cg.f());
    }

    public cu f() {
        cu cu2 = (cu)((cg)this.cc().a(d)).d();
        if (cu2 == null || cu2.a() != w.bH && cu2.a() != w.bI) {
            if (this.aQ != null) {
                e.b("ThrownPotion entity {} has no item?!", this.ca());
            }
            return new cu(w.bH);
        }
        return cu2;
    }

    public void a(cu cu2) {
        this.cc().b(d, cg.c(cu2));
        this.cc().b(d);
    }

    @Override
    protected float a() {
        return 0.05f;
    }

    @Override
    protected void a(net.minecraft.u.b.o o2) {
        if (!this.aQ.C) {
            cu cu2 = this.f();
            b b2 = m.c(cu2);
            List list = m.a(cu2);
            if (o2.a == net.minecraft.u.b.p.b && b2 == o.b && list.isEmpty()) {
                net.minecraft.u.b.b b3 = o2.a().a(o2.b);
                this.a(b3);
                for (ad ad2 : ag.a) {
                    this.a(b3.a(ad2));
                }
                this.aQ.b(2002, new net.minecraft.u.b.b(this), net.minecraft.d.b.a(b2));
                this.aa();
            } else {
                if (!list.isEmpty()) {
                    if (this.g()) {
                        a a2 = new a(this.aQ, this.aU, this.aV, this.aW);
                        a2.a(this.c());
                        a2.a(3.0f);
                        a2.b(-0.5f);
                        a2.e(10);
                        a2.c(-a2.a() / (float)a2.i());
                        a2.a(b2);
                        for (j j2 : m.b(cu2)) {
                            a2.a(new j(j2.a(), j2.b(), j2.c()));
                        }
                        this.aQ.a(a2);
                    } else {
                        net.minecraft.u.b.a a3 = this.cT().b(4.0, 2.0, 4.0);
                        List list2 = this.aQ.a(l.class, a3);
                        if (!list2.isEmpty()) {
                            for (l l2 : list2) {
                                double d2;
                                if (!l2.bY() || !((d2 = this.n(l2)) < 16.0)) continue;
                                double d3 = 1.0 - Math.sqrt(d2) / 4.0;
                                if (l2 == o2.d) {
                                    d3 = 1.0;
                                }
                                for (j j3 : list) {
                                    net.minecraft.d.c c2 = j3.a();
                                    if (c2.a()) {
                                        c2.a(this, this.c(), l2, j3.c(), d3);
                                        continue;
                                    }
                                    int n2 = (int)(d3 * (double)j3.b() + 0.5);
                                    if (n2 <= 20) continue;
                                    l2.c(new j(c2, n2, j3.c()));
                                }
                            }
                        }
                    }
                }
                this.aQ.b(2002, new net.minecraft.u.b.b(this), net.minecraft.d.b.a(b2));
                this.aa();
            }
        }
    }

    private boolean g() {
        return this.f().a() == w.bI;
    }

    private void a(net.minecraft.u.b.b b2) {
        if (this.aQ.n(b2).c() == p.ab) {
            this.aQ.a(b2, p.a.v(), 2);
        }
    }

    public static void a(net.minecraft.u.a.a a2) {
        net.minecraft.w.c.c.a(a2, "ThrownPotion");
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new net.minecraft.u.a.b.d("ThrownPotion", new String[]{"Potion"}));
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        cu cu2 = cu.a(e2.o("Potion"));
        if (cu2 == null) {
            this.aa();
        } else {
            this.a(cu2);
        }
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        cu cu2 = this.f();
        if (cu2 != null) {
            e2.a("Potion", cu2.b(new e()));
        }
    }
}

