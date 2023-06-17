/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.el;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.bi;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.dr;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ag;

public class e
extends am {
    private boolean d;

    public e() {
    }

    public e(int n2, Random random, int n3, int n4) {
        super(n2);
        this.d = true;
        this.a(ag.a.a(random));
        this.a = dr.a;
        this.b = this.i().l() == ae.c ? new dc(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1) : new dc(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1);
    }

    public e(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.d = false;
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
    }

    @Override
    protected void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Source", this.d);
    }

    @Override
    protected void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.d = e2.p("Source");
    }

    @Override
    public void a(r r2, List list, Random random) {
        if (this.d) {
            dq.a(bi.class);
        }
        this.a((ds)r2, list, random, 1, 1);
    }

    public static e a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, -7, 0, 5, 11, 5, ad2);
        return e.a(dc2) && r.a(list, dc2) == null ? new e(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 0, 0, 4, 10, 4, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 1, 7, 0);
        this.a(k2, random, dc2, dr.a, 1, 1, 4);
        this.a(k2, p.bf.v(), 2, 6, 1, dc2);
        this.a(k2, p.bf.v(), 1, 5, 1, dc2);
        this.a(k2, p.U.a(el.a.b()), 1, 6, 1, dc2);
        this.a(k2, p.bf.v(), 1, 5, 2, dc2);
        this.a(k2, p.bf.v(), 1, 4, 3, dc2);
        this.a(k2, p.U.a(el.a.b()), 1, 5, 3, dc2);
        this.a(k2, p.bf.v(), 2, 4, 3, dc2);
        this.a(k2, p.bf.v(), 3, 3, 3, dc2);
        this.a(k2, p.U.a(el.a.b()), 3, 4, 3, dc2);
        this.a(k2, p.bf.v(), 3, 3, 2, dc2);
        this.a(k2, p.bf.v(), 3, 2, 1, dc2);
        this.a(k2, p.U.a(el.a.b()), 3, 3, 1, dc2);
        this.a(k2, p.bf.v(), 2, 2, 1, dc2);
        this.a(k2, p.bf.v(), 1, 1, 1, dc2);
        this.a(k2, p.U.a(el.a.b()), 1, 2, 1, dc2);
        this.a(k2, p.bf.v(), 1, 1, 2, dc2);
        this.a(k2, p.U.a(el.a.b()), 1, 1, 3, dc2);
        return true;
    }
}

