/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.z;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.aw;
import net.minecraft.l.b.b;
import net.minecraft.u.bp;

public class ay
extends n {
    private static final bp a = new bp("textures/entity/villager/farmer.png");

    public ay(f f2) {
        super(f2, new aw(0.0f), 0.5f);
        this.a(new z(this.e().b));
    }

    public aw e() {
        return (aw)super.f();
    }

    protected bp a(ay ay2) {
        return a;
    }

    protected void a(ay ay2, float f2) {
        float f3 = 0.9375f;
        this.d = 0.5f;
        bd.b(f3, f3, f3);
    }

    protected bp a(b b2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((b)n2);
    }

    @Override
    public /* synthetic */ ap f() {
        return this.e();
    }
}

