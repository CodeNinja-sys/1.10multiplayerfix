/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.bi;
import net.minecraft.u.bp;
import net.minecraft.w.e.aj;
import net.minecraft.w.l;

public class bh
extends n {
    private static final bp a = new bp("textures/entity/silverfish.png");

    public bh(f f2) {
        super(f2, new bi(), 0.3f);
    }

    protected float a(aj aj2) {
        return 180.0f;
    }

    protected bp b(aj aj2) {
        return a;
    }

    @Override
    protected /* synthetic */ float c(l l2) {
        return this.a((aj)l2);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.b((aj)n2);
    }
}

