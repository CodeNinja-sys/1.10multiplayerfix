/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.h.ah;
import net.minecraft.w.l;

public class q
extends n {
    private static final bp a = new bp("textures/entity/chicken.png");

    public q(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
    }

    protected bp a(ah ah2) {
        return a;
    }

    protected float a(ah ah2, float f2) {
        float f3 = ah2.e + (ah2.b - ah2.e) * f2;
        float f4 = ah2.d + (ah2.c - ah2.d) * f2;
        return (net.minecraft.u.b.n.a(f3) + 1.0f) * f4;
    }

    @Override
    protected /* synthetic */ float b(l l2, float f2) {
        return this.a((ah)l2, f2);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((ah)n2);
    }
}

