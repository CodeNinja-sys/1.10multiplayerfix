/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.bn;
import net.minecraft.q.g.c.cf;
import net.minecraft.q.g.c.do;
import net.minecraft.u.ad;

class bj
implements cf {
    private bj() {
    }

    @Override
    public boolean a(do do_) {
        return do_.c[ad.b.b()] && !do_.b[ad.b.b()].d;
    }

    @Override
    public ag a(ad ad2, do do_, Random random) {
        do_.d = true;
        do_.b[ad.b.b()].d = true;
        return new bn(ad2, do_, random);
    }

    /* synthetic */ bj(bj bj2) {
        this();
    }
}

