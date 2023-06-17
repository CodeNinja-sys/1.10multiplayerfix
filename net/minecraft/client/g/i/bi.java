/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.az;
import net.minecraft.u.bp;
import net.minecraft.w.e.bn;

public class bi
extends n {
    private static final bp a = new bp("textures/entity/ghast/ghast.png");
    private static final bp b = new bp("textures/entity/ghast/ghast_shooting.png");

    public bi(f f2) {
        super(f2, new az(), 0.5f);
    }

    protected bp a(bn bn2) {
        return bn2.c() ? b : a;
    }

    protected void a(bn bn2, float f2) {
        float f3 = 1.0f;
        float f4 = 4.5f;
        float f5 = 4.5f;
        bd.b(4.5f, 4.5f, 4.5f);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((bn)n2);
    }
}

