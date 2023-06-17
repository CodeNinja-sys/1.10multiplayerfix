/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.ax;
import net.minecraft.g.bi;
import net.minecraft.g.ht;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.di;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.w.e.u;

public class b
extends di {
    private boolean g;

    public b() {
    }

    public b(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 7, 7, 9);
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Witch", this.g);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.g = e2.p("Witch");
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        int n4;
        if (!this.a(k2, dc2, 0)) {
            return false;
        }
        this.a(k2, dc2, 1, 1, 1, 5, 1, 7, p.f.a(net.minecraft.g.b.b.b()), p.f.a(net.minecraft.g.b.b.b()), false);
        this.a(k2, dc2, 1, 4, 2, 5, 4, 7, p.f.a(net.minecraft.g.b.b.b()), p.f.a(net.minecraft.g.b.b.b()), false);
        this.a(k2, dc2, 2, 1, 0, 4, 1, 0, p.f.a(net.minecraft.g.b.b.b()), p.f.a(net.minecraft.g.b.b.b()), false);
        this.a(k2, dc2, 2, 2, 2, 3, 3, 2, p.f.a(net.minecraft.g.b.b.b()), p.f.a(net.minecraft.g.b.b.b()), false);
        this.a(k2, dc2, 1, 2, 3, 1, 3, 6, p.f.a(net.minecraft.g.b.b.b()), p.f.a(net.minecraft.g.b.b.b()), false);
        this.a(k2, dc2, 5, 2, 3, 5, 3, 6, p.f.a(net.minecraft.g.b.b.b()), p.f.a(net.minecraft.g.b.b.b()), false);
        this.a(k2, dc2, 2, 2, 7, 4, 3, 7, p.f.a(net.minecraft.g.b.b.b()), p.f.a(net.minecraft.g.b.b.b()), false);
        this.a(k2, dc2, 1, 0, 2, 1, 3, 2, p.r.v(), p.r.v(), false);
        this.a(k2, dc2, 5, 0, 2, 5, 3, 2, p.r.v(), p.r.v(), false);
        this.a(k2, dc2, 1, 0, 7, 1, 3, 7, p.r.v(), p.r.v(), false);
        this.a(k2, dc2, 5, 0, 7, 5, 3, 7, p.r.v(), p.r.v(), false);
        this.a(k2, p.aO.v(), 2, 3, 2, dc2);
        this.a(k2, p.aO.v(), 3, 3, 7, dc2);
        this.a(k2, p.a.v(), 1, 3, 4, dc2);
        this.a(k2, p.a.v(), 5, 3, 4, dc2);
        this.a(k2, p.a.v(), 5, 3, 5, dc2);
        this.a(k2, p.ca.v().a(ax.b, (Comparable)((Object)ht.r)), 1, 3, 5, dc2);
        this.a(k2, p.ai.v(), 3, 2, 6, dc2);
        this.a(k2, p.bE.v(), 4, 2, 6, dc2);
        this.a(k2, p.aO.v(), 1, 2, 1, dc2);
        this.a(k2, p.aO.v(), 5, 2, 1, dc2);
        net.minecraft.g.c.b b2 = p.bU.v().a(bi.a, (Comparable)((Object)ad.c));
        net.minecraft.g.c.b b3 = p.bU.v().a(bi.a, (Comparable)((Object)ad.f));
        net.minecraft.g.c.b b4 = p.bU.v().a(bi.a, (Comparable)((Object)ad.e));
        net.minecraft.g.c.b b5 = p.bU.v().a(bi.a, (Comparable)((Object)ad.d));
        this.a(k2, dc2, 0, 4, 1, 6, 4, 1, b2, b2, false);
        this.a(k2, dc2, 0, 4, 2, 0, 4, 7, b3, b3, false);
        this.a(k2, dc2, 6, 4, 2, 6, 4, 7, b4, b4, false);
        this.a(k2, dc2, 0, 4, 8, 6, 4, 8, b5, b5, false);
        for (n4 = 2; n4 <= 7; n4 += 5) {
            for (n3 = 1; n3 <= 5; n3 += 4) {
                this.b(k2, p.r.v(), n3, -1, n4, dc2);
            }
        }
        if (!this.g && dc2.a(new net.minecraft.u.b.b(n4 = this.a(2, 5), n3 = this.a(2), n2 = this.b(2, 5)))) {
            this.g = true;
            u u2 = new u(k2);
            u2.b((double)n4 + 0.5, n3, (double)n2 + 0.5, 0.0f, 0.0f);
            u2.a(k2.C(new net.minecraft.u.b.b(n4, n3, n2)), null);
            k2.a(u2);
        }
        return true;
    }
}

