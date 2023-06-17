/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.j;
import net.minecraft.client.r;
import net.minecraft.g.c.b;
import net.minecraft.q.k;
import net.minecraft.u.ac;
import net.minecraft.u.bp;
import net.minecraft.w.f.n;

public class be
extends aa {
    public be(f f2) {
        super(f2);
        this.d = 0.5f;
    }

    public void a(n n2, double d2, double d3, double d4, float f2, float f3) {
        k k2;
        b b2;
        if (n2.f() != null && (b2 = n2.f()).l() == ac.d && b2 != (k2 = n2.c()).n(new net.minecraft.u.b.b(n2)) && b2.l() != ac.a) {
            this.a(net.minecraft.client.g.a.f.b);
            bd.D();
            bd.f();
            ci ci2 = ci.a();
            g g2 = ci2.c();
            if (this.f) {
                bd.g();
                bd.e(this.c(n2));
            }
            g2.a(7, net.minecraft.client.g.d.b.a);
            net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(n2.aU, n2.cT().e, n2.aW);
            bd.c((float)(d2 - (double)b3.cy_() - 0.5), (float)(d3 - (double)b3.k()), (float)(d4 - (double)b3.l() - 0.5));
            j j2 = r.z().aa();
            j2.b().a(k2, j2.a(b2), b2, b3, g2, false, net.minecraft.u.b.n.a(n2.a()));
            ci2.b();
            if (this.f) {
                bd.m();
                bd.h();
            }
            bd.e();
            bd.E();
            super.a((net.minecraft.w.n)n2, d2, d3, d4, f2, f3);
        }
    }

    protected bp a(n n2) {
        return net.minecraft.client.g.a.f.b;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((n)n2);
    }
}

