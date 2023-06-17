/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.u;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.h.e;
import net.minecraft.w.l;

public class ag
extends n {
    private static final bp a = new bp("textures/entity/wolf/wolf.png");
    private static final bp b = new bp("textures/entity/wolf/wolf_tame.png");
    private static final bp k = new bp("textures/entity/wolf/wolf_angry.png");

    public ag(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
        this.a(new u(this));
    }

    protected float a(e e2, float f2) {
        return e2.q();
    }

    public void a(e e2, double d2, double d3, double d4, float f2, float f3) {
        if (e2.p()) {
            float f4 = e2.n(f3) * e2.q(f3);
            bd.d(f4, f4, f4);
        }
        super.a(e2, d2, d3, d4, f2, f3);
    }

    protected bp a(e e2) {
        return e2.z() ? b : (e2.r() ? k : a);
    }

    @Override
    protected /* synthetic */ float b(l l2, float f2) {
        return this.a((e)l2, f2);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((e)n2);
    }
}

