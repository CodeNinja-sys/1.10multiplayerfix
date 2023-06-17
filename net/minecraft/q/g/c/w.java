/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.cf;
import net.minecraft.q.g.c.do;
import net.minecraft.q.g.c.z;
import net.minecraft.u.ad;

class w
implements cf {
    private w() {
    }

    @Override
    public boolean a(do do_) {
        if (do_.c[ad.c.b()] && !do_.b[ad.c.b()].d && do_.c[ad.b.b()] && !do_.b[ad.b.b()].d) {
            do do_2 = do_.b[ad.c.b()];
            return do_2.c[ad.b.b()] && !do_2.b[ad.b.b()].d;
        }
        return false;
    }

    @Override
    public ag a(ad ad2, do do_, Random random) {
        do_.d = true;
        do_.b[ad.c.b()].d = true;
        do_.b[ad.b.b()].d = true;
        do_.b[ad.c.b()].b[ad.b.b()].d = true;
        return new z(ad2, do_, random);
    }

    /* synthetic */ w(w w2) {
        this();
    }
}

