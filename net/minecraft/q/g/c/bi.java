/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.ap;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class bi
extends am {
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public bi() {
    }

    public bi(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
        this.d = random.nextBoolean();
        this.e = random.nextBoolean();
        this.f = random.nextBoolean();
        this.g = random.nextInt(3) > 0;
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("leftLow", this.d);
        e2.a("leftHigh", this.e);
        e2.a("rightLow", this.f);
        e2.a("rightHigh", this.g);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.p("leftLow");
        this.e = e2.p("leftHigh");
        this.f = e2.p("rightLow");
        this.g = e2.p("rightHigh");
    }

    @Override
    public void a(r r2, List list, Random random) {
        int n2 = 3;
        int n3 = 5;
        ad ad2 = this.i();
        if (ad2 == ad.e || ad2 == ad.c) {
            n2 = 8 - n2;
            n3 = 8 - n3;
        }
        this.a((ds)r2, list, random, 5, 1);
        if (this.d) {
            this.b((ds)r2, list, random, n2, 1);
        }
        if (this.e) {
            this.b((ds)r2, list, random, n3, 7);
        }
        if (this.f) {
            this.c((ds)r2, list, random, n2, 1);
        }
        if (this.g) {
            this.c((ds)r2, list, random, n3, 7);
        }
    }

    public static bi a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -4, -3, 0, 10, 9, 11, ad2);
        return bi.a(dc2) && r.a(list, dc2) == null ? new bi(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 0, 0, 9, 8, 10, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 4, 3, 0);
        if (this.d) {
            this.a(k2, dc2, 0, 3, 1, 0, 5, 3, p.a.v(), p.a.v(), false);
        }
        if (this.f) {
            this.a(k2, dc2, 9, 3, 1, 9, 5, 3, p.a.v(), p.a.v(), false);
        }
        if (this.e) {
            this.a(k2, dc2, 0, 5, 7, 0, 7, 9, p.a.v(), p.a.v(), false);
        }
        if (this.g) {
            this.a(k2, dc2, 9, 5, 7, 9, 7, 9, p.a.v(), p.a.v(), false);
        }
        this.a(k2, dc2, 5, 1, 10, 7, 3, 10, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 1, 2, 1, 8, 2, 6, false, random, dq.c());
        this.a(k2, dc2, 4, 1, 5, 4, 4, 9, false, random, dq.c());
        this.a(k2, dc2, 8, 1, 5, 8, 4, 9, false, random, dq.c());
        this.a(k2, dc2, 1, 4, 7, 3, 4, 9, false, random, dq.c());
        this.a(k2, dc2, 1, 3, 5, 3, 3, 6, false, random, dq.c());
        this.a(k2, dc2, 1, 3, 4, 3, 3, 4, p.U.v(), p.U.v(), false);
        this.a(k2, dc2, 1, 4, 6, 3, 4, 6, p.U.v(), p.U.v(), false);
        this.a(k2, dc2, 5, 1, 7, 7, 1, 8, false, random, dq.c());
        this.a(k2, dc2, 5, 1, 9, 7, 1, 9, p.U.v(), p.U.v(), false);
        this.a(k2, dc2, 5, 2, 7, 7, 2, 7, p.U.v(), p.U.v(), false);
        this.a(k2, dc2, 4, 5, 7, 4, 5, 9, p.U.v(), p.U.v(), false);
        this.a(k2, dc2, 8, 5, 7, 8, 5, 9, p.U.v(), p.U.v(), false);
        this.a(k2, dc2, 5, 5, 7, 7, 5, 9, p.T.v(), p.T.v(), false);
        this.a(k2, p.aa.v().a(ap.a, (Comparable)((Object)ad.d)), 6, 5, 6, dc2);
        return true;
    }
}

