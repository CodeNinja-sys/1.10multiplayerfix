/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import java.util.Random;
import net.minecraft.u.bz;

class o
extends bz {
    public o(int n2, int n3) {
        super(n2, n3);
    }

    public int a(Random random) {
        return (Integer)this.a() >= (Integer)this.b() ? (Integer)this.a() : (Integer)this.a() + random.nextInt((Integer)this.b() - (Integer)this.a() + 1);
    }
}

