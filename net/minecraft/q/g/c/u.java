/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.cf;
import net.minecraft.q.g.c.cn;
import net.minecraft.q.g.c.do;
import net.minecraft.u.ad;

class u
implements cf {
    private u() {
    }

    @Override
    public boolean a(do do_) {
        return do_.c[ad.f.b()] && !do_.b[ad.f.b()].d;
    }

    @Override
    public ag a(ad ad2, do do_, Random random) {
        do_.d = true;
        do_.b[ad.f.b()].d = true;
        return new cn(ad2, do_, random);
    }

    /* synthetic */ u(u u2) {
        this();
    }
}

