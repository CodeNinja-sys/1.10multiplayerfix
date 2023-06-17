/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.a.w;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.r;
import net.minecraft.u.bp;
import net.minecraft.w.c.q;
import net.minecraft.w.n;

public class av
extends aa {
    private final float a;

    public av(f f2, float f3) {
        super(f2);
        this.a = f3;
    }

    public void a(q q2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        this.e(q2);
        bd.c((float)d2, (float)d3, (float)d4);
        bd.A();
        bd.b(this.a, this.a, this.a);
        d d5 = r.z().ac().a().a(w.bV);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        float f4 = d5.e();
        float f5 = d5.f();
        float f6 = d5.g();
        float f7 = d5.h();
        float f8 = 1.0f;
        float f9 = 0.5f;
        float f10 = 0.25f;
        bd.b(180.0f - this.c.e, 0.0f, 1.0f, 0.0f);
        bd.b((float)(this.c.g.as == 2 ? -1 : 1) * -this.c.f, 1.0f, 0.0f, 0.0f);
        if (this.f) {
            bd.g();
            bd.e(this.c(q2));
        }
        g2.a(7, b.j);
        g2.b(-0.5, -0.25, 0.0).a(f4, f7).c(0.0f, 1.0f, 0.0f).d();
        g2.b(0.5, -0.25, 0.0).a(f5, f7).c(0.0f, 1.0f, 0.0f).d();
        g2.b(0.5, 0.75, 0.0).a(f5, f6).c(0.0f, 1.0f, 0.0f).d();
        g2.b(-0.5, 0.75, 0.0).a(f4, f6).c(0.0f, 1.0f, 0.0f).d();
        ci2.b();
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.B();
        bd.E();
        super.a((n)q2, d2, d3, d4, f2, f3);
    }

    protected bp a(q q2) {
        return net.minecraft.client.g.a.f.b;
    }

    @Override
    protected /* synthetic */ bp a(n n2) {
        return this.a((q)n2);
    }
}

