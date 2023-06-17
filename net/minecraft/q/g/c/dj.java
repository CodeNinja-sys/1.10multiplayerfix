/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.ar;
import net.minecraft.q.g.c.cf;
import net.minecraft.q.g.c.do;
import net.minecraft.u.ad;

class dj
implements cf {
    private dj() {
    }

    @Override
    public boolean a(do do_) {
        if (do_.c[ad.f.b()] && !do_.b[ad.f.b()].d && do_.c[ad.b.b()] && !do_.b[ad.b.b()].d) {
            do do_2 = do_.b[ad.f.b()];
            return do_2.c[ad.b.b()] && !do_2.b[ad.b.b()].d;
        }
        return false;
    }

    @Override
    public ag a(ad ad2, do do_, Random random) {
        do_.d = true;
        do_.b[ad.f.b()].d = true;
        do_.b[ad.b.b()].d = true;
        do_.b[ad.f.b()].b[ad.b.b()].d = true;
        return new ar(ad2, do_, random);
    }

    /* synthetic */ dj(dj dj2) {
        this();
    }
}

