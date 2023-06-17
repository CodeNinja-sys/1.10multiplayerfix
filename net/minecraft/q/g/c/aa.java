/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.ap;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.dr;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class aa
extends am {
    private boolean d;
    private boolean e;

    public aa() {
    }

    public aa(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
        this.d = random.nextInt(2) == 0;
        this.e = random.nextInt(2) == 0;
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Left", this.d);
        e2.a("Right", this.e);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.p("Left");
        this.e = e2.p("Right");
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((ds)r2, list, random, 1, 1);
        if (this.d) {
            this.b((ds)r2, list, random, 1, 2);
        }
        if (this.e) {
            this.c((ds)r2, list, random, 1, 2);
        }
    }

    public static aa a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, ad2);
        return aa.a(dc2) && r.a(list, dc2) == null ? new aa(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 0, 0, 4, 4, 6, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 1, 1, 0);
        this.a(k2, random, dc2, dr.a, 1, 1, 6);
        b b2 = p.aa.v().a(ap.a, (Comparable)((Object)ad.f));
        b b3 = p.aa.v().a(ap.a, (Comparable)((Object)ad.e));
        this.a(k2, dc2, random, 0.1f, 1, 2, 1, b2);
        this.a(k2, dc2, random, 0.1f, 3, 2, 1, b3);
        this.a(k2, dc2, random, 0.1f, 1, 2, 5, b2);
        this.a(k2, dc2, random, 0.1f, 3, 2, 5, b3);
        if (this.d) {
            this.a(k2, dc2, 0, 1, 2, 0, 3, 4, p.a.v(), p.a.v(), false);
        }
        if (this.e) {
            this.a(k2, dc2, 4, 1, 2, 4, 3, 4, p.a.v(), p.a.v(), false);
        }
        return true;
    }
}

