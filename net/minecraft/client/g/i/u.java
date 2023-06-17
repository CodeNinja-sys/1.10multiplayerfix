/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.a.p;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.j;
import net.minecraft.client.r;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.w.f.af;

public class u
extends aa {
    public u(f f2) {
        super(f2);
        this.d = 0.5f;
    }

    public void a(af af2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        j j2 = r.z().aa();
        bd.D();
        bd.c((float)d2, (float)d3 + 0.5f, (float)d4);
        if ((float)af2.f() - f3 + 1.0f < 10.0f) {
            f4 = 1.0f - ((float)af2.f() - f3 + 1.0f) / 10.0f;
            f4 = n.a(f4, 0.0f, 1.0f);
            f4 *= f4;
            f4 *= f4;
            float f5 = 1.0f + f4 * 0.3f;
            bd.b(f5, f5, f5);
        }
        f4 = (1.0f - ((float)af2.f() - f3 + 1.0f) / 100.0f) * 0.8f;
        this.e(af2);
        bd.b(-90.0f, 0.0f, 1.0f, 0.0f);
        bd.c(-0.5f, -0.5f, 0.5f);
        j2.a(p.W.v(), af2.n(f3));
        bd.c(0.0f, 0.0f, 1.0f);
        if (this.f) {
            bd.g();
            bd.e(this.c(af2));
            j2.a(p.W.v(), 1.0f);
            bd.m();
            bd.h();
        } else if (af2.f() / 5 % 2 == 0) {
            bd.w();
            bd.f();
            bd.l();
            bd.a(ad.l, bc.c);
            bd.c(1.0f, 1.0f, 1.0f, f4);
            bd.a(-3.0f, -3.0f);
            bd.r();
            j2.a(p.W.v(), 1.0f);
            bd.a(0.0f, 0.0f);
            bd.s();
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.k();
            bd.e();
            bd.v();
        }
        bd.E();
        super.a((net.minecraft.w.n)af2, d2, d3, d4, f2, f3);
    }

    protected bp a(af af2) {
        return net.minecraft.client.g.a.f.b;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((af)n2);
    }
}

