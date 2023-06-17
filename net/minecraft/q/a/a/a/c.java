/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import java.util.Random;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.m;

public class c
implements a {
    private final float a;

    public c(float f2) {
        this.a = f2;
    }

    @Override
    public boolean a(Random random, m m2) {
        return random.nextFloat() < this.a;
    }

    static /* synthetic */ float a(c c2) {
        return c2.a;
    }
}

