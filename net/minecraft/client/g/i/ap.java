/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.k;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.u.bp;
import net.minecraft.w.e.bj;
import net.minecraft.w.l;

public class ap
extends n {
    private static final bp a = new bp("textures/entity/iron_golem.png");

    public ap(f f2) {
        super(f2, new net.minecraft.client.j.k(), 0.5f);
        this.a(new k(this));
    }

    protected bp a(bj bj2) {
        return a;
    }

    protected void a(bj bj2, float f2, float f3, float f4) {
        super.a((l)bj2, f2, f3, f4);
        if ((double)bj2.ad >= 0.01) {
            float f5 = 13.0f;
            float f6 = bj2.ae - bj2.ad * (1.0f - f4) + 6.0f;
            float f7 = (Math.abs(f6 % 13.0f - 6.5f) - 3.25f) / 3.25f;
            bd.b(6.5f * f7, 0.0f, 0.0f, 1.0f);
        }
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((bj)n2);
    }
}

