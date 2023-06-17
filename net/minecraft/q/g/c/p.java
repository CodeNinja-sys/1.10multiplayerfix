/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.f.u;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.a.h;
import net.minecraft.q.g.c.a.i;
import net.minecraft.q.g.c.ai;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dt;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.bp;
import net.minecraft.u.bq;
import net.minecraft.w.e.as;
import net.minecraft.w.f.l;

public class p
extends ai {
    private String f;
    private bq g;
    private boolean h;

    public p() {
    }

    public p(String string, b b2, bq bq2, boolean bl2) {
        super(0);
        this.f = string;
        this.g = bq2;
        this.h = bl2;
        this.a(b2);
    }

    private void a(b b2) {
        h h2 = dt.a.a(null, new bp("endcity/" + this.f));
        i i2 = this.h ? dt.h().a().a(this.g) : dt.i().a().a(this.g);
        this.a(h2, b2, i2);
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Template", this.f);
        e2.a("Rot", this.g.name());
        e2.a("OW", this.h);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.f = e2.l("Template");
        this.g = bq.valueOf(e2.l("Rot"));
        this.h = e2.p("OW");
        this.a(this.e);
    }

    @Override
    protected void a(String string, b b2, k k2, Random random, dc dc2) {
        if (string.startsWith("Chest")) {
            ap ap2;
            b b3 = b2.c();
            if (dc2.a(b3) && (ap2 = k2.q(b3)) instanceof u) {
                ((u)ap2).a(j.c, random.nextLong());
            }
        } else if (string.startsWith("Sentry")) {
            as as2 = new as(k2);
            as2.e((double)b2.cy_() + 0.5, (double)b2.k() + 0.5, (double)b2.l() + 0.5);
            as2.g(b2);
            k2.a(as2);
        } else if (string.startsWith("Elytra")) {
            l l2 = new l(k2, b2, this.g.a(ad.d));
            l2.a(new cu(w.cR));
            k2.a(l2);
        }
    }
}

