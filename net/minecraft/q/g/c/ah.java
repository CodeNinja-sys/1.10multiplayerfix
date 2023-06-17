/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class ah
extends am {
    public ah() {
    }

    public ah(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        ad ad2 = this.i();
        if (ad2 != ad.c && ad2 != ad.f) {
            this.c((ds)r2, list, random, 1, 1);
        } else {
            this.b((ds)r2, list, random, 1, 1);
        }
    }

    public static ah a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, -1, 0, 5, 5, 5, ad2);
        return ah.a(dc2) && r.a(list, dc2) == null ? new ah(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 0, 0, 4, 4, 4, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 1, 1, 0);
        ad ad2 = this.i();
        if (ad2 != ad.c && ad2 != ad.f) {
            this.a(k2, dc2, 4, 1, 1, 4, 3, 3, p.a.v(), p.a.v(), false);
        } else {
            this.a(k2, dc2, 0, 1, 1, 0, 3, 3, p.a.v(), p.a.v(), false);
        }
        return true;
    }
}

