/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.a.q;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.aq;
import net.minecraft.u.bp;
import net.minecraft.w.e.bb;

public class bd
extends n {
    private static final bp a = new bp("textures/entity/snowman.png");

    public bd(f f2) {
        super(f2, new aq(), 0.5f);
        this.a(new q(this));
    }

    protected bp a(bb bb2) {
        return a;
    }

    public aq e() {
        return (aq)super.f();
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((bb)n2);
    }

    @Override
    public /* synthetic */ ap f() {
        return this.e();
    }
}

