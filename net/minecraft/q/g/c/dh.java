/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.cf;
import net.minecraft.q.g.c.cg;
import net.minecraft.q.g.c.do;
import net.minecraft.u.ad;

class dh
implements cf {
    private dh() {
    }

    @Override
    public boolean a(do do_) {
        return do_.c[ad.c.b()] && !do_.b[ad.c.b()].d;
    }

    @Override
    public ag a(ad ad2, do do_, Random random) {
        do do_2 = do_;
        if (!do_.c[ad.c.b()] || do_.b[ad.c.b()].d) {
            do_2 = do_.b[ad.d.b()];
        }
        do_2.d = true;
        do_2.b[ad.c.b()].d = true;
        return new cg(ad2, do_2, random);
    }

    /* synthetic */ dh(dh dh2) {
        this();
    }
}

