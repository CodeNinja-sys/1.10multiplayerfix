/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.j;
import net.minecraft.client.g.i.a.r;
import net.minecraft.client.g.i.b;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.ah;
import net.minecraft.u.bp;
import net.minecraft.w.e.ay;
import net.minecraft.w.e.v;

public class bf
extends b {
    private static final bp k = new bp("textures/entity/skeleton/skeleton.png");
    private static final bp l = new bp("textures/entity/skeleton/wither_skeleton.png");
    private static final bp m = new bp("textures/entity/skeleton/stray.png");

    public bf(f f2) {
        super(f2, new ah(), 0.5f);
        this.a(new j(this));
        this.a(new net.minecraft.client.g.i.r(this, this));
        this.a(new r(this));
    }

    protected void a(ay ay2, float f2) {
        if (ay2.p() == v.b) {
            bd.b(1.2f, 1.2f, 1.2f);
        }
    }

    @Override
    public void a() {
        bd.c(0.09375f, 0.1875f, 0.0f);
    }

    protected bp a(ay ay2) {
        v v2 = ay2.p();
        return v2 == v.b ? l : (v2 == v.c ? m : k);
    }
}

