/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.cc;
import net.minecraft.q.g.c.d;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;

public class du
extends d {
    private boolean a;

    public du() {
    }

    public du(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
        this.a = random.nextInt(3) == 0;
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.a = e2.p("Chest");
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Chest", this.a);
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.b((cc)r2, list, random, 0, 1, true);
    }

    public static du a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, ad2);
        return du.a(dc2) && r.a(list, dc2) == null ? new du(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        this.a(k2, dc2, 0, 0, 0, 4, 1, 4, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 0, 4, 5, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 4, 2, 0, 4, 5, 4, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 4, 3, 1, 4, 4, 1, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 4, 3, 3, 4, 4, 3, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 0, 2, 0, 0, 5, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 4, 3, 5, 4, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 3, 4, 1, 4, 4, p.bz.v(), p.by.v(), false);
        this.a(k2, dc2, 3, 3, 4, 3, 4, 4, p.bz.v(), p.by.v(), false);
        if (this.a && dc2.a(new b(this.a(3, 3), this.a(2), this.b(3, 3)))) {
            this.a = false;
            this.a(k2, dc2, random, 3, 2, 3, j.g);
        }
        this.a(k2, dc2, 0, 6, 0, 4, 6, 4, p.by.v(), p.by.v(), false);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(k2, p.by.v(), i2, -1, i3, dc2);
            }
        }
        return true;
    }
}

