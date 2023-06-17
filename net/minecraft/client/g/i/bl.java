/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.j;
import net.minecraft.client.g.i.bn;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.e.be;

public class bl
extends n {
    private static final bp a = new bp("textures/entity/zombie/zombie.png");
    private final float b;

    public bl(f f2, ap ap2, float f3, float f4) {
        super(f2, ap2, f3 * f4);
        this.b = f4;
        this.a(new j(this));
        this.a(new bn(this, this));
    }

    @Override
    public void a() {
        bd.c(0.0f, 0.1875f, 0.0f);
    }

    protected void a(be be2, float f2) {
        bd.b(this.b, this.b, this.b);
    }

    protected bp a(be be2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((be)n2);
    }
}

