/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.a.j;
import net.minecraft.client.g.i.ai;
import net.minecraft.client.g.i.b;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.c;
import net.minecraft.u.bp;
import net.minecraft.w.e.ao;

public class ar
extends b {
    private static final bp k = new bp("textures/entity/zombie_pigman.png");

    public ar(f f2) {
        super(f2, new c(), 0.5f, 1.0f);
        this.a(new j(this));
        this.a(new ai(this, this));
    }

    protected bp a(ao ao2) {
        return k;
    }
}

