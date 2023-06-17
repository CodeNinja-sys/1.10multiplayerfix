/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.bf;
import net.minecraft.w.h.aj;
import net.minecraft.w.l;

public class bp
extends n {
    private static final net.minecraft.u.bp a = new net.minecraft.u.bp("textures/entity/bat.png");

    public bp(f f2) {
        super(f2, new bf(), 0.25f);
    }

    protected net.minecraft.u.bp a(aj aj2) {
        return a;
    }

    protected void a(aj aj2, float f2) {
        bd.b(0.35f, 0.35f, 0.35f);
    }

    protected void a(aj aj2, float f2, float f3, float f4) {
        if (aj2.c()) {
            bd.c(0.0f, -0.1f, 0.0f);
        } else {
            bd.c(0.0f, net.minecraft.u.b.n.b(f2 * 0.3f) * 0.1f, 0.0f);
        }
        super.a((l)aj2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ net.minecraft.u.bp a(net.minecraft.w.n n2) {
        return this.a((aj)n2);
    }
}

