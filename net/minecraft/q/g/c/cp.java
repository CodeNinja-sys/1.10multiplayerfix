/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.c;
import net.minecraft.q.g.c.cf;
import net.minecraft.q.g.c.do;
import net.minecraft.u.ad;

class cp
implements cf {
    private cp() {
    }

    @Override
    public boolean a(do do_) {
        return !do_.c[ad.e.b()] && !do_.c[ad.f.b()] && !do_.c[ad.c.b()] && !do_.c[ad.d.b()] && !do_.c[ad.b.b()];
    }

    @Override
    public ag a(ad ad2, do do_, Random random) {
        do_.d = true;
        return new c(ad2, do_, random);
    }

    /* synthetic */ cp(cp cp2) {
        this();
    }
}

