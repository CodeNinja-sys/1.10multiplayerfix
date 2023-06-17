/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.a.b;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.h.ad;

public class ba
extends n {
    private static final bp a = new bp("textures/entity/sheep/sheep.png");

    public ba(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
        this.a(new b(this));
    }

    protected bp a(ad ad2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((ad)n2);
    }
}

