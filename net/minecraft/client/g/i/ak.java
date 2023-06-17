/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;

public class ak
extends n {
    private static final bp a = new bp("textures/entity/bear/polarbear.png");

    public ak(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
    }

    protected bp a(net.minecraft.w.e.n n2) {
        return a;
    }

    public void a(net.minecraft.w.e.n n2, double d2, double d3, double d4, float f2, float f3) {
        super.a(n2, d2, d3, d4, f2, f3);
    }

    protected void a(net.minecraft.w.e.n n2, float f2) {
        bd.b(1.2f, 1.2f, 1.2f);
        super.a(n2, f2);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((net.minecraft.w.e.n)n2);
    }
}

