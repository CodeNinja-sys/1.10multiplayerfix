/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.g.fh;
import net.minecraft.g.gm;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.am;
import net.minecraft.q.b.q;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.h.al;

public class aq
extends q {
    protected boolean a;

    protected aq(boolean bl2, ab ab2) {
        super(ab2);
        this.a = bl2;
        this.y.add(new am(al.class, 5, 2, 6));
        this.w.A = 0;
        this.w.B = 0.05f;
        this.w.C = 4;
        this.w.D = 10;
    }

    @Override
    public fh a(Random random, b b2) {
        double d2 = o.a((double)b2.cy_() / 200.0, (double)b2.l() / 200.0);
        if (d2 < -0.8) {
            int n2 = random.nextInt(4);
            switch (n2) {
                case 0: {
                    return fh.g;
                }
                case 1: {
                    return fh.f;
                }
                case 2: {
                    return fh.i;
                }
            }
            return fh.h;
        }
        if (random.nextInt(3) > 0) {
            int n3 = random.nextInt(3);
            return n3 == 0 ? fh.b : (n3 == 1 ? fh.e : fh.j);
        }
        return fh.a;
    }

    @Override
    public void a(k k2, Random random, b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        double d2 = o.a((double)(b2.cy_() + 8) / 200.0, (double)(b2.l() + 8) / 200.0);
        if (d2 < -0.8) {
            this.w.C = 15;
            this.w.D = 5;
        } else {
            this.w.C = 4;
            this.w.D = 10;
            p.a(gm.c);
            for (n5 = 0; n5 < 7; ++n5) {
                n4 = random.nextInt(16) + 8;
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(k2.k(b2.a(n4, 0, n3)).k() + 32);
                p.a(k2, random, b2.a(n4, n2, n3));
            }
        }
        if (this.a) {
            p.a(gm.a);
            for (n5 = 0; n5 < 10; ++n5) {
                n4 = random.nextInt(16) + 8;
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(k2.k(b2.a(n4, 0, n3)).k() + 32);
                p.a(k2, random, b2.a(n4, n2, n3));
            }
        }
        super.a(k2, random, b2);
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return random.nextInt(3) == 0 ? r : q;
    }
}

