/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c.a;

import java.util.Random;
import net.minecraft.q.g.c.a.a;
import net.minecraft.q.g.c.a.f;
import net.minecraft.q.g.c.a.i;
import net.minecraft.q.k;

public class b
implements f {
    private final float a;
    private final Random b;

    public b(net.minecraft.u.b.b b2, i i2) {
        this.a = i2.d();
        this.b = i2.a(b2);
    }

    @Override
    public a a(k k2, net.minecraft.u.b.b b2, a a2) {
        return this.a < 1.0f && this.b.nextFloat() > this.a ? null : a2;
    }
}

