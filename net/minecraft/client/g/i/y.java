/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.u.bp;
import net.minecraft.w.e.bh;

public class y
extends n {
    private static final bp a = new bp("textures/entity/slime/magmacube.png");

    public y(f f2) {
        super(f2, new net.minecraft.client.j.bh(), 0.25f);
    }

    protected bp a(bh bh2) {
        return a;
    }

    protected void a(bh bh2, float f2) {
        int n2 = bh2.c();
        float f3 = (bh2.c + (bh2.b - bh2.c) * f2) / ((float)n2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        bd.b(f4 * (float)n2, 1.0f / f4 * (float)n2, f4 * (float)n2);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((bh)n2);
    }
}

