/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import java.util.Random;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.m;
import net.minecraft.w.l;

public class f
implements a {
    private final float a;
    private final float b;

    public f(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    @Override
    public boolean a(Random random, m m2) {
        int n2 = 0;
        if (m2.c() instanceof l) {
            n2 = net.minecraft.o.f.h((l)m2.c());
        }
        return random.nextFloat() < this.a + (float)n2 * this.b;
    }

    static /* synthetic */ float a(f f2) {
        return f2.a;
    }

    static /* synthetic */ float b(f f2) {
        return f2.b;
    }
}

