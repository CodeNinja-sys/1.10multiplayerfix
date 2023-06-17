/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.h.ac;
import net.minecraft.w.l;

public class aq
extends n {
    private static final bp a = new bp("textures/entity/squid.png");

    public aq(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
    }

    protected bp a(ac ac2) {
        return a;
    }

    protected void a(ac ac2, float f2, float f3, float f4) {
        float f5 = ac2.b + (ac2.a - ac2.b) * f4;
        float f6 = ac2.d + (ac2.c - ac2.d) * f4;
        bd.c(0.0f, 0.5f, 0.0f);
        bd.b(180.0f - f3, 0.0f, 1.0f, 0.0f);
        bd.b(f5, 1.0f, 0.0f, 0.0f);
        bd.b(f6, 0.0f, 1.0f, 0.0f);
        bd.c(0.0f, -1.2f, 0.0f);
    }

    protected float a(ac ac2, float f2) {
        return ac2.h + (ac2.g - ac2.h) * f2;
    }

    @Override
    protected /* synthetic */ float b(l l2, float f2) {
        return this.a((ac)l2, f2);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((ac)n2);
    }
}

