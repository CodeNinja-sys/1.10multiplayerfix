/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.g.fh;
import net.minecraft.g.gm;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.am;
import net.minecraft.q.b.d;
import net.minecraft.q.b.q;
import net.minecraft.q.g.a.ae;
import net.minecraft.q.g.a.ah;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.g.a.z;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.h.e;

public class n
extends q {
    protected static final ah a = new ah(false, true);
    protected static final ah b = new ah(false, false);
    protected static final z c = new z(false);
    private final d B;

    public n(d d2, ab ab2) {
        super(ab2);
        this.B = d2;
        this.w.A = 10;
        this.w.D = 2;
        if (this.B == net.minecraft.q.b.d.b) {
            this.w.A = 6;
            this.w.C = 100;
            this.w.D = 1;
            this.y.add(new am(net.minecraft.w.h.am.class, 4, 2, 3));
        }
        if (this.B == net.minecraft.q.b.d.a) {
            this.y.add(new am(e.class, 5, 4, 4));
        }
        if (this.B == net.minecraft.q.b.d.d) {
            this.w.A = -999;
        }
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return this.B == net.minecraft.q.b.d.d && random.nextInt(3) > 0 ? c : (this.B != net.minecraft.q.b.d.c && random.nextInt(5) != 0 ? (random.nextInt(10) == 0 ? r : q) : b);
    }

    @Override
    public fh a(Random random, b b2) {
        if (this.B == net.minecraft.q.b.d.b) {
            double d2 = net.minecraft.u.b.n.a((1.0 + o.a((double)b2.cy_() / 48.0, (double)b2.l() / 48.0)) / 2.0, 0.0, 0.9999);
            fh fh2 = fh.values()[(int)(d2 * (double)fh.values().length)];
            return fh2 == fh.c ? fh.b : fh2;
        }
        return super.a(random, b2);
    }

    @Override
    public void a(k k2, Random random, b b2) {
        if (this.B == net.minecraft.q.b.d.d) {
            this.b(k2, random, b2);
        }
        int n2 = random.nextInt(5) - 3;
        if (this.B == net.minecraft.q.b.d.b) {
            n2 += 2;
        }
        this.a(k2, random, b2, n2);
        super.a(k2, random, b2);
    }

    protected void b(k k2, Random random, b b2) {
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                aj aj2;
                int n2 = i2 * 4 + 1 + 8 + random.nextInt(3);
                int n3 = i3 * 4 + 1 + 8 + random.nextInt(3);
                b b3 = k2.k(b2.a(n2, 0, n3));
                if (random.nextInt(20) == 0) {
                    aj2 = new ae();
                    ((ae)aj2).a(k2, random, b3);
                    continue;
                }
                aj2 = this.a(random);
                aj2.a();
                if (!aj2.a(k2, random, b3)) continue;
                ((net.minecraft.q.g.a.q)aj2).b(k2, random, b3);
            }
        }
    }

    protected void a(k k2, Random random, b b2, int n2) {
        block0: for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = random.nextInt(3);
            if (n3 == 0) {
                p.a(gm.b);
            } else if (n3 == 1) {
                p.a(gm.e);
            } else if (n3 == 2) {
                p.a(gm.f);
            }
            for (int i3 = 0; i3 < 5; ++i3) {
                int n4 = random.nextInt(16) + 8;
                int n5 = random.nextInt(16) + 8;
                int n6 = random.nextInt(k2.k(b2.a(n4, 0, n5)).k() + 32);
                if (p.a(k2, random, new b(b2.cy_() + n4, n6, b2.l() + n5))) continue block0;
            }
        }
    }

    @Override
    public Class a() {
        return n.class;
    }

    @Override
    public int a(b b2) {
        int n2 = super.a(b2);
        return this.B == net.minecraft.q.b.d.d ? (n2 & 0xFEFEFE) + 2634762 >> 1 : n2;
    }
}

