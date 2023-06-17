/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.a.g;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.h.l;

public class j
extends n {
    private static final bp a = new bp("textures/entity/pig/pig.png");

    public j(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
        this.a(new g(this));
    }

    protected bp a(l l2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((l)n2);
    }
}

