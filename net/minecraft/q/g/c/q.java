/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.ep;
import net.minecraft.q.g.c.aj;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;

abstract class q
extends r {
    protected aj a;

    public q() {
    }

    public q(int n2, aj aj2) {
        super(n2);
        this.a = aj2;
    }

    @Override
    protected void a(e e2) {
        e2.a("MST", this.a.ordinal());
    }

    @Override
    protected void b(e e2) {
        this.a = aj.a(e2.h("MST"));
    }

    protected b b() {
        switch (this.a) {
            default: {
                return p.f.v();
            }
            case b: 
        }
        return p.f.v().a(ep.a, (Comparable)((Object)net.minecraft.g.b.f));
    }

    protected b c() {
        switch (this.a) {
            default: {
                return p.aO.v();
            }
            case b: 
        }
        return p.aS.v();
    }

    protected boolean a(k k2, dc dc2, int n2, int n3, int n4, int n5) {
        for (int i2 = n2; i2 <= n3; ++i2) {
            if (this.a(k2, i2, n4 + 1, n5, dc2).d() != h.a) continue;
            return false;
        }
        return true;
    }
}

