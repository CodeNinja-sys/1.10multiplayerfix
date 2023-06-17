/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.j;
import net.minecraft.client.g.i.a.z;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.u.bp;

public class b
extends n {
    private static final bp k = new bp("textures/entity/steve.png");
    protected net.minecraft.client.j.b a;
    protected float b;

    public b(f f2, net.minecraft.client.j.b b2, float f3) {
        this(f2, b2, f3, 1.0f);
        this.a(new j(this));
    }

    public b(f f2, net.minecraft.client.j.b b2, float f3, float f4) {
        super(f2, b2, f3);
        this.a = b2;
        this.b = f4;
        this.a(new z(b2.a));
    }

    protected bp a(net.minecraft.w.f f2) {
        return k;
    }

    @Override
    public void a() {
        bd.c(0.0f, 0.1875f, 0.0f);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((net.minecraft.w.f)n2);
    }
}

