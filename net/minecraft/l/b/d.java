/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l.b;

import java.util.Random;
import net.minecraft.u.bz;

class d
extends bz {
    public d(int n2, int n3) {
        super(n2, n3);
    }

    public int a(Random random) {
        return (Integer)this.a() >= (Integer)this.b() ? (Integer)this.a() : (Integer)this.a() + random.nextInt((Integer)this.b() - (Integer)this.a() + 1);
    }
}

