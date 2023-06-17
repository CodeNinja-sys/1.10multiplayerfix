/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ae;
import net.minecraft.u.ag;
import net.minecraft.u.b.g;

abstract class di
extends r {
    protected int a;
    protected int d;
    protected int e;
    protected int f = -1;

    public di() {
    }

    protected di(Random random, int n2, int n3, int n4, int n5, int n6, int n7) {
        super(0);
        this.a = n5;
        this.d = n6;
        this.e = n7;
        this.a(ag.a.a(random));
        this.b = this.i().l() == ae.c ? new dc(n2, n3, n4, n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1) : new dc(n2, n3, n4, n2 + n7 - 1, n3 + n6 - 1, n4 + n5 - 1);
    }

    @Override
    protected void a(e e2) {
        e2.a("Width", this.a);
        e2.a("Height", this.d);
        e2.a("Depth", this.e);
        e2.a("HPos", this.f);
    }

    @Override
    protected void b(e e2) {
        this.a = e2.h("Width");
        this.d = e2.h("Height");
        this.e = e2.h("Depth");
        this.f = e2.h("HPos");
    }

    protected boolean a(k k2, dc dc2, int n2) {
        if (this.f >= 0) {
            return true;
        }
        int n3 = 0;
        int n4 = 0;
        g g2 = new g();
        for (int i2 = this.b.c; i2 <= this.b.f; ++i2) {
            for (int i3 = this.b.a; i3 <= this.b.d; ++i3) {
                g2.b(i3, 64, i2);
                if (!dc2.a(g2)) continue;
                n3 += Math.max(k2.p(g2).k(), k2.q.j());
                ++n4;
            }
        }
        if (n4 == 0) {
            return false;
        }
        this.f = n3 / n4;
        this.b.a(0, this.f - this.b.b + n2, 0);
        return true;
    }
}

