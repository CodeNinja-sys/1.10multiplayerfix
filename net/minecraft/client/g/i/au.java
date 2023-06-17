/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.a.d;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.h.w;

public class au
extends n {
    private static final bp a = new bp("textures/entity/cow/mooshroom.png");

    public au(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
        this.a(new d(this));
    }

    protected bp a(w w2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((w)n2);
    }
}

