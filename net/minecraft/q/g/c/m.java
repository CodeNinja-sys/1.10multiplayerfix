/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.aw;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ag;

public class m
extends dn {
    public m() {
    }

    public m(ak ak2, int n2, Random random, int n3, int n4) {
        super(ak2, n2);
        this.a(ag.a.a(random));
        this.b = this.i().l() == ae.c ? new dc(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1) : new dc(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
    }

    @Override
    public void a(r r2, List list, Random random) {
        aw.a((ak)r2, list, random, this.b.a - 1, this.b.e - 4, this.b.c + 1, ad.e, this.g());
        aw.a((ak)r2, list, random, this.b.d + 1, this.b.e - 4, this.b.c + 1, ad.f, this.g());
        aw.a((ak)r2, list, random, this.b.a + 1, this.b.e - 4, this.b.c - 1, ad.c, this.g());
        aw.a((ak)r2, list, random, this.b.a + 1, this.b.e - 4, this.b.f + 1, ad.d, this.g());
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.i < 0) {
            this.i = this.b(k2, dc2);
            if (this.i < 0) {
                return true;
            }
            this.b.a(0, this.i - this.b.e + 3, 0);
        }
        b b2 = this.a(p.e.v());
        b b3 = this.a(p.aO.v());
        this.a(k2, dc2, 1, 0, 1, 4, 12, 4, b2, p.i.v(), false);
        this.a(k2, p.a.v(), 2, 12, 2, dc2);
        this.a(k2, p.a.v(), 3, 12, 2, dc2);
        this.a(k2, p.a.v(), 2, 12, 3, dc2);
        this.a(k2, p.a.v(), 3, 12, 3, dc2);
        this.a(k2, b3, 1, 13, 1, dc2);
        this.a(k2, b3, 1, 14, 1, dc2);
        this.a(k2, b3, 4, 13, 1, dc2);
        this.a(k2, b3, 4, 14, 1, dc2);
        this.a(k2, b3, 1, 13, 4, dc2);
        this.a(k2, b3, 1, 14, 4, dc2);
        this.a(k2, b3, 4, 13, 4, dc2);
        this.a(k2, b3, 4, 14, 4, dc2);
        this.a(k2, dc2, 1, 15, 1, 4, 15, 4, b2, b2, false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (int i3 = 0; i3 <= 5; ++i3) {
                if (i3 != 0 && i3 != 5 && i2 != 0 && i2 != 5) continue;
                this.a(k2, p.e.v(), i3, 11, i2, dc2);
                this.c(k2, i3, 12, i2, dc2);
            }
        }
        return true;
    }
}

