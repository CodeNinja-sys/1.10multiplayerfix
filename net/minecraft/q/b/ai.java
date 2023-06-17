/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bp;
import net.minecraft.g.dc;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.al;
import net.minecraft.q.b.q;
import net.minecraft.q.f.e;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.g.a.v;
import net.minecraft.q.g.a.y;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class ai
extends q {
    private final aj a = new y(net.minecraft.a.p.be.v().a(dc.a, (Comparable)((Object)bp.a)), 9);
    private final v b = new v(false);
    private final al c;

    protected ai(al al2, ab ab2) {
        super(ab2);
        if (al2 == al.b) {
            this.w.A = 3;
        }
        this.c = al2;
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return random.nextInt(3) > 0 ? this.b : super.a(random);
    }

    @Override
    public void a(k k2, Random random, b b2) {
        int n2;
        int n3;
        int n4;
        super.a(k2, random, b2);
        int n5 = 3 + random.nextInt(6);
        for (n4 = 0; n4 < n5; ++n4) {
            int n6;
            n3 = random.nextInt(16);
            b b3 = b2.a(n3, n2 = random.nextInt(28) + 4, n6 = random.nextInt(16));
            if (k2.n(b3).c() != net.minecraft.a.p.b) continue;
            k2.a(b3, net.minecraft.a.p.bP.v(), 2);
        }
        for (n5 = 0; n5 < 7; ++n5) {
            n4 = random.nextInt(16);
            n3 = random.nextInt(64);
            n2 = random.nextInt(16);
            this.a.a(k2, random, b2.a(n4, n3, n2));
        }
    }

    @Override
    public void a(k k2, Random random, e e2, int n2, int n3, double d2) {
        this.u = net.minecraft.a.p.c.v();
        this.v = net.minecraft.a.p.d.v();
        if ((d2 < -1.0 || d2 > 2.0) && this.c == al.c) {
            this.u = net.minecraft.a.p.n.v();
            this.v = net.minecraft.a.p.n.v();
        } else if (d2 > 1.0 && this.c != al.b) {
            this.u = net.minecraft.a.p.b.v();
            this.v = net.minecraft.a.p.b.v();
        }
        this.b(k2, random, e2, n2, n3, d2);
    }
}

