/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.e;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.q;
import net.minecraft.u.bp;
import net.minecraft.w.e.u;

public class az
extends n {
    private static final bp a = new bp("textures/entity/witch.png");

    public az(f f2) {
        super(f2, new q(0.0f), 0.5f);
        this.a(new e(this));
    }

    public void a(u u2, double d2, double d3, double d4, float f2, float f3) {
        ((q)this.g).a = u2.bC() != null;
        super.a(u2, d2, d3, d4, f2, f3);
    }

    protected bp a(u u2) {
        return a;
    }

    @Override
    public void a() {
        bd.c(0.0f, 0.1875f, 0.0f);
    }

    protected void a(u u2, float f2) {
        float f3 = 0.9375f;
        bd.b(0.9375f, 0.9375f, 0.9375f);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((u)n2);
    }
}

