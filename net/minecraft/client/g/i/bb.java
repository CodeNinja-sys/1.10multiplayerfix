/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.a.t;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.r;
import net.minecraft.u.bp;
import net.minecraft.w.e.c;
import net.minecraft.w.l;

public class bb
extends n {
    private static final bp a = new bp("textures/entity/spider/spider.png");

    public bb(f f2) {
        super(f2, new r(), 1.0f);
        this.a(new t(this));
    }

    protected float b(c c2) {
        return 180.0f;
    }

    protected bp a(c c2) {
        return a;
    }

    @Override
    protected /* synthetic */ float c(l l2) {
        return this.b((c)l2);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((c)n2);
    }
}

