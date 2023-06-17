/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.el;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.dr;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;

public class h
extends am {
    private boolean d;

    public h() {
    }

    public h(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Chest", this.d);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.p("Chest");
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((ds)r2, list, random, 1, 1);
    }

    public static h a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, -1, 0, 5, 5, 7, ad2);
        return h.a(dc2) && r.a(list, dc2) == null ? new h(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 0, 0, 4, 4, 6, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 1, 1, 0);
        this.a(k2, random, dc2, dr.a, 1, 1, 6);
        this.a(k2, dc2, 3, 1, 2, 3, 1, 4, p.bf.v(), p.bf.v(), false);
        this.a(k2, p.U.a(el.f.b()), 3, 1, 1, dc2);
        this.a(k2, p.U.a(el.f.b()), 3, 1, 5, dc2);
        this.a(k2, p.U.a(el.f.b()), 3, 2, 2, dc2);
        this.a(k2, p.U.a(el.f.b()), 3, 2, 4, dc2);
        for (int i2 = 2; i2 <= 4; ++i2) {
            this.a(k2, p.U.a(el.f.b()), 2, 1, i2, dc2);
        }
        if (!this.d && dc2.a(new b(this.a(3, 3), this.a(2), this.b(3, 3)))) {
            this.d = true;
            this.a(k2, dc2, random, 3, 2, 3, j.j);
        }
        return true;
    }
}

