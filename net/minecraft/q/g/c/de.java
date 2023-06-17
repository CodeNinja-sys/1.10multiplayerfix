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
import net.minecraft.g.bi;
import net.minecraft.g.c.b;
import net.minecraft.g.fx;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.dr;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class de
extends am {
    private boolean d;

    public de() {
    }

    public de(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Mob", this.d);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.p("Mob");
    }

    @Override
    public void a(r r2, List list, Random random) {
        if (r2 != null) {
            ((ds)r2).e = this;
        }
    }

    public static de a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -4, -1, 0, 11, 8, 16, ad2);
        return de.a(dc2) && r.a(list, dc2) == null ? new de(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        this.a(k2, dc2, 0, 0, 0, 10, 7, 15, false, random, dq.c());
        this.a(k2, random, dc2, dr.c, 4, 1, 0);
        int n3 = 6;
        this.a(k2, dc2, 1, n3, 1, 1, n3, 14, false, random, dq.c());
        this.a(k2, dc2, 9, n3, 1, 9, n3, 14, false, random, dq.c());
        this.a(k2, dc2, 2, n3, 1, 8, n3, 2, false, random, dq.c());
        this.a(k2, dc2, 2, n3, 14, 8, n3, 14, false, random, dq.c());
        this.a(k2, dc2, 1, 1, 1, 2, 1, 4, false, random, dq.c());
        this.a(k2, dc2, 8, 1, 1, 9, 1, 4, false, random, dq.c());
        this.a(k2, dc2, 1, 1, 1, 1, 1, 3, p.k.v(), p.k.v(), false);
        this.a(k2, dc2, 9, 1, 1, 9, 1, 3, p.k.v(), p.k.v(), false);
        this.a(k2, dc2, 3, 1, 8, 7, 1, 12, false, random, dq.c());
        this.a(k2, dc2, 4, 1, 9, 6, 1, 11, p.k.v(), p.k.v(), false);
        for (n2 = 3; n2 < 14; n2 += 2) {
            this.a(k2, dc2, 0, 3, n2, 0, 4, n2, p.bi.v(), p.bi.v(), false);
            this.a(k2, dc2, 10, 3, n2, 10, 4, n2, p.bi.v(), p.bi.v(), false);
        }
        for (n2 = 2; n2 < 9; n2 += 2) {
            this.a(k2, dc2, n2, 3, 15, n2, 4, 15, p.bi.v(), p.bi.v(), false);
        }
        b b2 = p.bv.v().a(bi.a, (Comparable)((Object)ad.c));
        this.a(k2, dc2, 4, 1, 5, 6, 1, 7, false, random, dq.c());
        this.a(k2, dc2, 4, 2, 6, 6, 2, 7, false, random, dq.c());
        this.a(k2, dc2, 4, 3, 7, 6, 3, 7, false, random, dq.c());
        for (int i2 = 4; i2 <= 6; ++i2) {
            this.a(k2, b2, i2, 1, 4, dc2);
            this.a(k2, b2, i2, 2, 5, dc2);
            this.a(k2, b2, i2, 3, 6, dc2);
        }
        b b3 = p.bG.v().a(fx.a, (Comparable)((Object)ad.c));
        b b4 = p.bG.v().a(fx.a, (Comparable)((Object)ad.d));
        b b5 = p.bG.v().a(fx.a, (Comparable)((Object)ad.f));
        b b6 = p.bG.v().a(fx.a, (Comparable)((Object)ad.e));
        boolean bl2 = true;
        boolean[] arrbl = new boolean[12];
        for (int i3 = 0; i3 < arrbl.length; ++i3) {
            arrbl[i3] = random.nextFloat() > 0.9f;
            bl2 &= arrbl[i3];
        }
        this.a(k2, b3.a(fx.b, Boolean.valueOf(arrbl[0])), 4, 3, 8, dc2);
        this.a(k2, b3.a(fx.b, Boolean.valueOf(arrbl[1])), 5, 3, 8, dc2);
        this.a(k2, b3.a(fx.b, Boolean.valueOf(arrbl[2])), 6, 3, 8, dc2);
        this.a(k2, b4.a(fx.b, Boolean.valueOf(arrbl[3])), 4, 3, 12, dc2);
        this.a(k2, b4.a(fx.b, Boolean.valueOf(arrbl[4])), 5, 3, 12, dc2);
        this.a(k2, b4.a(fx.b, Boolean.valueOf(arrbl[5])), 6, 3, 12, dc2);
        this.a(k2, b5.a(fx.b, Boolean.valueOf(arrbl[6])), 3, 3, 9, dc2);
        this.a(k2, b5.a(fx.b, Boolean.valueOf(arrbl[7])), 3, 3, 10, dc2);
        this.a(k2, b5.a(fx.b, Boolean.valueOf(arrbl[8])), 3, 3, 11, dc2);
        this.a(k2, b6.a(fx.b, Boolean.valueOf(arrbl[9])), 7, 3, 9, dc2);
        this.a(k2, b6.a(fx.b, Boolean.valueOf(arrbl[10])), 7, 3, 10, dc2);
        this.a(k2, b6.a(fx.b, Boolean.valueOf(arrbl[11])), 7, 3, 11, dc2);
        if (bl2) {
            b b7 = p.bF.v();
            this.a(k2, b7, 4, 3, 9, dc2);
            this.a(k2, b7, 5, 3, 9, dc2);
            this.a(k2, b7, 6, 3, 9, dc2);
            this.a(k2, b7, 4, 3, 10, dc2);
            this.a(k2, b7, 5, 3, 10, dc2);
            this.a(k2, b7, 6, 3, 10, dc2);
            this.a(k2, b7, 4, 3, 11, dc2);
            this.a(k2, b7, 5, 3, 11, dc2);
            this.a(k2, b7, 6, 3, 11, dc2);
        }
        if (!this.d) {
            n3 = this.a(3);
            net.minecraft.u.b.b b8 = new net.minecraft.u.b.b(this.a(5, 6), n3, this.b(5, 6));
            if (dc2.a(b8)) {
                this.d = true;
                k2.a(b8, p.ac.v(), 2);
                ap ap2 = k2.q(b8);
                if (ap2 instanceof y) {
                    ((y)ap2).b().a("Silverfish");
                }
            }
        }
        return true;
    }
}

