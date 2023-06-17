/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.o;
import net.minecraft.u.bp;
import net.minecraft.w.n;

public class p
extends aa {
    private static final bp a = new bp("textures/entity/lead_knot.png");
    private final o b = new o();

    public p(f f2) {
        super(f2);
    }

    public void a(net.minecraft.w.p p2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        bd.q();
        bd.c((float)d2, (float)d3, (float)d4);
        float f4 = 0.0625f;
        bd.A();
        bd.b(-1.0f, -1.0f, 1.0f);
        bd.d();
        this.e(p2);
        if (this.f) {
            bd.g();
            bd.e(this.c(p2));
        }
        this.b.a(p2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.E();
        super.a((n)p2, d2, d3, d4, f2, f3);
    }

    protected bp a(net.minecraft.w.p p2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(n n2) {
        return this.a((net.minecraft.w.p)n2);
    }
}

