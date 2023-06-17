/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public abstract class q
extends aj {
    public q(boolean bl2) {
        super(bl2);
    }

    protected boolean a(cn cn2) {
        h h2 = cn2.v().d();
        return h2 == h.a || h2 == h.j || cn2 == p.c || cn2 == p.d || cn2 == p.r || cn2 == p.s || cn2 == p.g || cn2 == p.bn;
    }

    public void b(k k2, Random random, b b2) {
    }

    protected void a(k k2, b b2) {
        if (k2.n(b2).c() != p.d) {
            this.a(k2, b2, p.d.v());
        }
    }
}

