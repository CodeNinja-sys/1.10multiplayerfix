/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.f.y;
import net.minecraft.q.g.c.d;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;

public class f
extends d {
    private boolean a;

    public f() {
    }

    public f(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.a = e2.p("Mob");
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Mob", this.a);
    }

    public static f a(List list, Random random, int n2, int n3, int n4, int n5, ad ad2) {
        dc dc2 = dc.a(n2, n3, n4, -2, 0, 0, 7, 8, 9, ad2);
        return f.a(dc2) && r.a(list, dc2) == null ? new f(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        b b2;
        this.a(k2, dc2, 0, 2, 0, 6, 7, 7, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 1, 0, 0, 5, 1, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 2, 1, 5, 2, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 3, 2, 5, 3, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 4, 3, 5, 4, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 2, 0, 1, 4, 2, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 5, 2, 0, 5, 4, 2, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 5, 2, 1, 5, 3, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 5, 5, 2, 5, 5, 3, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 5, 3, 0, 5, 8, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 5, 3, 6, 5, 8, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 5, 8, 5, 5, 8, p.by.v(), p.by.v(), false);
        this.a(k2, p.bz.v(), 1, 6, 3, dc2);
        this.a(k2, p.bz.v(), 5, 6, 3, dc2);
        this.a(k2, dc2, 0, 6, 3, 0, 6, 8, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 6, 6, 3, 6, 6, 8, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 1, 6, 8, 5, 7, 8, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 2, 8, 8, 4, 8, 8, p.bz.v(), p.bz.v(), false);
        if (!this.a && dc2.a(b2 = new b(this.a(3, 5), this.a(5), this.b(3, 5)))) {
            this.a = true;
            k2.a(b2, p.ac.v(), 2);
            ap ap2 = k2.q(b2);
            if (ap2 instanceof y) {
                ((y)ap2).b().a("Blaze");
            }
        }
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(k2, p.by.v(), i2, -1, i3, dc2);
            }
        }
        return true;
    }
}

