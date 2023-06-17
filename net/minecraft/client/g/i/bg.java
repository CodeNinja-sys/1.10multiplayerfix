/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ao;
import net.minecraft.u.bp;
import net.minecraft.w.e.q;
import net.minecraft.w.l;

public class bg
extends n {
    private static final bp a = new bp("textures/entity/endermite.png");

    public bg(f f2) {
        super(f2, new ao(), 0.3f);
    }

    protected float a(q q2) {
        return 180.0f;
    }

    protected bp b(q q2) {
        return a;
    }

    @Override
    protected /* synthetic */ float c(l l2) {
        return this.a((q)l2);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.b((q)n2);
    }
}

