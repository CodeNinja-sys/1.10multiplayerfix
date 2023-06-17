/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.u.bp;
import net.minecraft.w.c.o;
import net.minecraft.w.n;

public class ah
extends aa {
    private static final bp a = new bp("textures/entity/enderdragon/dragon_fireball.png");

    public ah(f f2) {
        super(f2);
    }

    public void a(o o2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        this.e(o2);
        bd.c((float)d2, (float)d3, (float)d4);
        bd.A();
        bd.b(2.0f, 2.0f, 2.0f);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        float f4 = 1.0f;
        float f5 = 0.5f;
        float f6 = 0.25f;
        bd.b(180.0f - this.c.e, 0.0f, 1.0f, 0.0f);
        bd.b((float)(this.c.g.as == 2 ? -1 : 1) * -this.c.f, 1.0f, 0.0f, 0.0f);
        if (this.f) {
            bd.g();
            bd.e(this.c(o2));
        }
        g2.a(7, b.j);
        g2.b(-0.5, -0.25, 0.0).a(0.0, 1.0).c(0.0f, 1.0f, 0.0f).d();
        g2.b(0.5, -0.25, 0.0).a(1.0, 1.0).c(0.0f, 1.0f, 0.0f).d();
        g2.b(0.5, 0.75, 0.0).a(1.0, 0.0).c(0.0f, 1.0f, 0.0f).d();
        g2.b(-0.5, 0.75, 0.0).a(0.0, 0.0).c(0.0f, 1.0f, 0.0f).d();
        ci2.b();
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.B();
        bd.E();
        super.a((n)o2, d2, d3, d4, f2, f3);
    }

    protected bp a(o o2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(n n2) {
        return this.a((o)n2);
    }
}

