/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.af;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.cf;
import net.minecraft.q.g.c.do;
import net.minecraft.u.ad;

class dl
implements cf {
    private dl() {
    }

    @Override
    public boolean a(do do_) {
        return true;
    }

    @Override
    public ag a(ad ad2, do do_, Random random) {
        do_.d = true;
        return new af(ad2, do_, random);
    }

    /* synthetic */ dl(dl dl2) {
        this();
    }
}

