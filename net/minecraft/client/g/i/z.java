/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.w.h.u;

public class z
extends n {
    private static final bp a = new bp("textures/entity/cat/black.png");
    private static final bp b = new bp("textures/entity/cat/ocelot.png");
    private static final bp k = new bp("textures/entity/cat/red.png");
    private static final bp l = new bp("textures/entity/cat/siamese.png");

    public z(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
    }

    protected bp a(u u2) {
        switch (u2.p()) {
            default: {
                return b;
            }
            case 1: {
                return a;
            }
            case 2: {
                return k;
            }
            case 3: 
        }
        return l;
    }

    protected void a(u u2, float f2) {
        super.a(u2, f2);
        if (u2.z()) {
            bd.b(0.8f, 0.8f, 0.8f);
        }
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((u)n2);
    }
}

