/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.c.cb;

class dm
extends cb {
    private dm() {
    }

    @Override
    public void a(Random random, int n2, int n3, int n4, boolean bl2) {
        this.a = random.nextFloat() < 0.4f ? p.e.v() : p.Y.v();
    }

    /* synthetic */ dm(dm dm2) {
        this();
    }
}

