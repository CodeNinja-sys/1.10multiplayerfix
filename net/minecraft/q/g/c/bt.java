/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bp;
import net.minecraft.g.gj;
import net.minecraft.q.g.c.cb;

class bt
extends cb {
    private bt() {
    }

    @Override
    public void a(Random random, int n2, int n3, int n4, boolean bl2) {
        float f2;
        this.a = bl2 ? ((f2 = random.nextFloat()) < 0.2f ? p.bf.a(gj.d) : (f2 < 0.5f ? p.bf.a(gj.c) : (f2 < 0.55f ? p.be.a(bp.c.c()) : p.bf.v()))) : p.a.v();
    }

    /* synthetic */ bt(bt bt2) {
        this();
    }
}

