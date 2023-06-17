/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.m.cd;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class i
extends dn {
    public i() {
    }

    public i(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
    }

    public static dc a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 3, 4, 2, ad2);
        return r.a(list, dc2) != null ? null : dc2;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.i < 0) {
            this.i = this.b(k2, dc2);
            if (this.i < 0) {
                return true;
            }
            this.b.a(0, this.i - this.b.e + 4 - 1, 0);
        }
        b b2 = this.a(p.aO.v());
        this.a(k2, dc2, 0, 0, 0, 2, 3, 1, p.a.v(), p.a.v(), false);
        this.a(k2, b2, 1, 0, 0, dc2);
        this.a(k2, b2, 1, 1, 0, dc2);
        this.a(k2, b2, 1, 2, 0, dc2);
        this.a(k2, p.L.a(cd.a.c()), 1, 3, 0, dc2);
        this.a(k2, ad.f, 2, 3, 0, dc2);
        this.a(k2, ad.c, 1, 3, 1, dc2);
        this.a(k2, ad.e, 0, 3, 0, dc2);
        this.a(k2, ad.d, 1, 3, -1, dc2);
        return true;
    }
}

