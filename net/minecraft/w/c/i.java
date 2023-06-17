/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import com.a.a.d.aad;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.minecraft.a.o;
import net.minecraft.a.w;
import net.minecraft.d.b;
import net.minecraft.d.j;
import net.minecraft.d.m;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.w.c.f;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.g;

public class i
extends f {
    private static final g f = net.minecraft.x.a.o.a(i.class, net.minecraft.x.a.q.b);
    private b g = o.a;
    private final Set h = aad.a();

    public i(k k2) {
        super(k2);
    }

    public i(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public i(k k2, l l2) {
        super(k2, l2);
    }

    public void a(cu cu2) {
        if (cu2.a() == w.i) {
            this.g = m.c(cu2.o());
            List list = m.b(cu2);
            if (!list.isEmpty()) {
                for (j j2 : list) {
                    this.h.add(new j(j2));
                }
            }
            this.bE.b(f, m.a(m.a(this.g, (Collection)list)));
        } else if (cu2.a() == w.g) {
            this.g = o.a;
            this.h.clear();
            this.bE.b(f, 0);
        }
    }

    public void a(j j2) {
        this.h.add(j2);
        this.cc().b(f, m.a(m.a(this.g, (Collection)this.h)));
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(f, 0);
    }

    @Override
    public void cE_() {
        super.cE_();
        if (this.aQ.C) {
            if (this.a) {
                if (this.b % 5 == 0) {
                    this.c(1);
                }
            } else {
                this.c(2);
            }
        } else if (this.a && this.b != 0 && !this.h.isEmpty() && this.b >= 600) {
            this.aQ.a((n)this, (byte)0);
            this.g = o.a;
            this.h.clear();
            this.bE.b(f, 0);
        }
    }

    private void c(int n2) {
        int n3 = this.g();
        if (n3 != 0 && n2 > 0) {
            double d2 = (double)(n3 >> 16 & 0xFF) / 255.0;
            double d3 = (double)(n3 >> 8 & 0xFF) / 255.0;
            double d4 = (double)(n3 >> 0 & 0xFF) / 255.0;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.aQ.a(aj.p, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, d2, d3, d4, new int[0]);
            }
        }
    }

    public int g() {
        return (Integer)this.bE.a(f);
    }

    public static void b(a a2) {
        net.minecraft.w.c.f.a(a2, "TippedArrow");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        if (this.g != o.a && this.g != null) {
            e2.a("Potion", ((bp)net.minecraft.d.b.a.b(this.g)).toString());
        }
        if (!this.h.isEmpty()) {
            q q2 = new q();
            for (j j2 : this.h) {
                q2.a(j2.a(new e()));
            }
            e2.a("CustomPotionEffects", q2);
        }
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        if (e2.b("Potion", 8)) {
            this.g = m.c(e2);
        }
        for (j j2 : m.b(e2)) {
            this.a(j2);
        }
        if (this.g != o.a || !this.h.isEmpty()) {
            this.bE.b(f, m.a(m.a(this.g, (Collection)this.h)));
        }
    }

    @Override
    protected void a(l l2) {
        super.a(l2);
        for (j j2 : this.g.a()) {
            l2.c(new j(j2.a(), j2.b() / 8, j2.c(), j2.d(), j2.e()));
        }
        if (!this.h.isEmpty()) {
            for (j j2 : this.h) {
                l2.c(j2);
            }
        }
    }

    @Override
    protected cu a() {
        if (this.h.isEmpty() && this.g == o.a) {
            return new cu(w.g);
        }
        cu cu2 = new cu(w.i);
        m.a(cu2, this.g);
        m.a(cu2, (Collection)this.h);
        return cu2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 0) {
            int n2 = this.g();
            if (n2 > 0) {
                double d2 = (double)(n2 >> 16 & 0xFF) / 255.0;
                double d3 = (double)(n2 >> 8 & 0xFF) / 255.0;
                double d4 = (double)(n2 >> 0 & 0xFF) / 255.0;
                for (int i2 = 0; i2 < 20; ++i2) {
                    this.aQ.a(aj.p, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, d2, d3, d4, new int[0]);
                }
            }
        } else {
            super.a(by2);
        }
    }
}

