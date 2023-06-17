/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.am;
import net.minecraft.q.b.q;
import net.minecraft.q.g.a.al;
import net.minecraft.q.g.a.au;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class j
extends q {
    public j(ab ab2) {
        super(ab2);
        this.y.clear();
        this.u = net.minecraft.a.p.m.v();
        this.v = net.minecraft.a.p.m.v();
        this.w.A = -999;
        this.w.E = 2;
        this.w.G = 50;
        this.w.H = 10;
        this.y.clear();
        this.y.add(new am(net.minecraft.w.h.am.class, 4, 2, 3));
    }

    @Override
    public void a(k k2, Random random, b b2) {
        super.a(k2, random, b2);
        if (random.nextInt(1000) == 0) {
            int n2 = random.nextInt(16) + 8;
            int n3 = random.nextInt(16) + 8;
            b b3 = k2.k(b2.a(n2, 0, n3)).b();
            new au().a(k2, random, b3);
        }
        if (random.nextInt(64) == 0) {
            new al().a(k2, random, b2);
        }
    }
}

