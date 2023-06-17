/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.z;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.n;

public class x
extends dn {
    private cn a;
    private cn d;
    private cn e;
    private cn f;

    public x() {
    }

    public x(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
        this.a = this.a(random);
        this.d = this.a(random);
        this.e = this.a(random);
        this.f = this.a(random);
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("CA", cn.v.d(this.a));
        e2.a("CB", cn.v.d(this.d));
        e2.a("CC", cn.v.d(this.e));
        e2.a("CD", cn.v.d(this.f));
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.a = cn.d(e2.h("CA"));
        this.d = cn.d(e2.h("CB"));
        this.e = cn.d(e2.h("CC"));
        this.f = cn.d(e2.h("CD"));
        if (!(this.a instanceof z)) {
            this.a = p.aj;
        }
        if (!(this.d instanceof z)) {
            this.d = p.cb;
        }
        if (!(this.e instanceof z)) {
            this.e = p.cc;
        }
        if (!(this.f instanceof z)) {
            this.f = p.cZ;
        }
    }

    private cn a(Random random) {
        switch (random.nextInt(10)) {
            case 0: 
            case 1: {
                return p.cb;
            }
            case 2: 
            case 3: {
                return p.cc;
            }
            case 4: {
                return p.cZ;
            }
        }
        return p.aj;
    }

    public static x a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 13, 4, 9, ad2);
        return x.a(dc2) && r.a(list, dc2) == null ? new x(ak2, n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        if (this.i < 0) {
            this.i = this.b(k2, dc2);
            if (this.i < 0) {
                return true;
            }
            this.b.a(0, this.i - this.b.e + 4 - 1, 0);
        }
        b b2 = this.a(p.r.v());
        this.a(k2, dc2, 0, 1, 0, 12, 4, 8, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 1, 0, 1, 2, 0, 7, p.ak.v(), p.ak.v(), false);
        this.a(k2, dc2, 4, 0, 1, 5, 0, 7, p.ak.v(), p.ak.v(), false);
        this.a(k2, dc2, 7, 0, 1, 8, 0, 7, p.ak.v(), p.ak.v(), false);
        this.a(k2, dc2, 10, 0, 1, 11, 0, 7, p.ak.v(), p.ak.v(), false);
        this.a(k2, dc2, 0, 0, 0, 0, 0, 8, b2, b2, false);
        this.a(k2, dc2, 6, 0, 0, 6, 0, 8, b2, b2, false);
        this.a(k2, dc2, 12, 0, 0, 12, 0, 8, b2, b2, false);
        this.a(k2, dc2, 1, 0, 0, 11, 0, 0, b2, b2, false);
        this.a(k2, dc2, 1, 0, 8, 11, 0, 8, b2, b2, false);
        this.a(k2, dc2, 3, 0, 1, 3, 0, 7, p.j.v(), p.j.v(), false);
        this.a(k2, dc2, 9, 0, 1, 9, 0, 7, p.j.v(), p.j.v(), false);
        for (n3 = 1; n3 <= 7; ++n3) {
            n2 = ((z)this.a).e();
            int n4 = n2 / 3;
            this.a(k2, this.a.a(n.a(random, n4, n2)), 1, 1, n3, dc2);
            this.a(k2, this.a.a(n.a(random, n4, n2)), 2, 1, n3, dc2);
            int n5 = ((z)this.d).e();
            int n6 = n5 / 3;
            this.a(k2, this.d.a(n.a(random, n6, n5)), 4, 1, n3, dc2);
            this.a(k2, this.d.a(n.a(random, n6, n5)), 5, 1, n3, dc2);
            int n7 = ((z)this.e).e();
            int n8 = n7 / 3;
            this.a(k2, this.e.a(n.a(random, n8, n7)), 7, 1, n3, dc2);
            this.a(k2, this.e.a(n.a(random, n8, n7)), 8, 1, n3, dc2);
            int n9 = ((z)this.f).e();
            int n10 = n9 / 3;
            this.a(k2, this.f.a(n.a(random, n10, n9)), 10, 1, n3, dc2);
            this.a(k2, this.f.a(n.a(random, n10, n9)), 11, 1, n3, dc2);
        }
        for (n3 = 0; n3 < 9; ++n3) {
            for (n2 = 0; n2 < 13; ++n2) {
                this.c(k2, n2, 4, n3, dc2);
                this.b(k2, p.d.v(), n2, -1, n3, dc2);
            }
        }
        return true;
    }
}

