/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import java.util.Random;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.t;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.w.f.ae;

public class g
extends aa {
    private final t a;
    private final Random b = new Random();

    public g(f f2, t t2) {
        super(f2);
        this.a = t2;
        this.d = 0.15f;
        this.e = 0.75f;
    }

    private int a(ae ae2, double d2, double d3, double d4, float f2, aq aq2) {
        cu cu2 = ae2.c();
        cg cg2 = cu2.a();
        if (cg2 == null) {
            return 0;
        }
        boolean bl2 = aq2.b();
        int n2 = this.a(cu2);
        float f3 = 0.25f;
        float f4 = n.a(((float)ae2.i() + f2) / 10.0f + ae2.a) * 0.1f + 0.1f;
        float f5 = aq2.e().b((ao)ao.h).d.b;
        bd.c((float)d2, (float)d3 + f4 + 0.25f * f5, (float)d4);
        if (bl2 || this.c.g != null) {
            float f6 = (((float)ae2.i() + f2) / 20.0f + ae2.a) * 57.295776f;
            bd.b(f6, 0.0f, 1.0f, 0.0f);
        }
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        return n2;
    }

    private int a(cu cu2) {
        int n2 = 1;
        if (cu2.b > 48) {
            n2 = 5;
        } else if (cu2.b > 32) {
            n2 = 4;
        } else if (cu2.b > 16) {
            n2 = 3;
        } else if (cu2.b > 1) {
            n2 = 2;
        }
        return n2;
    }

    public void a(ae ae2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        float f5;
        cu cu2 = ae2.c();
        int n2 = cu2 != null && cu2.a() != null ? cg.a(cu2.a()) + cu2.h() : 187;
        this.b.setSeed(n2);
        boolean bl2 = false;
        if (this.e(ae2)) {
            this.c.a.b(this.a(ae2)).b(false, false);
            bl2 = true;
        }
        bd.A();
        bd.a(516, 0.1f);
        bd.l();
        am.b();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.D();
        aq aq2 = this.a.a(cu2, ae2.aQ, null);
        int n3 = this.a(ae2, d2, d3, d4, f3, aq2);
        float f6 = aq2.e().q.d.a;
        float f7 = aq2.e().q.d.b;
        float f8 = aq2.e().q.d.c;
        boolean bl3 = aq2.b();
        if (!bl3) {
            float f9 = -0.0f * (float)(n3 - 1) * 0.5f * f6;
            f5 = -0.0f * (float)(n3 - 1) * 0.5f * f7;
            f4 = -0.09375f * (float)(n3 - 1) * 0.5f * f8;
            bd.c(f9, f5, f4);
        }
        if (this.f) {
            bd.g();
            bd.e(this.c(ae2));
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            if (bl3) {
                bd.D();
                if (i2 > 0) {
                    f5 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    f4 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    float f10 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    bd.c(f5, f4, f10);
                }
                aq2.e().a(ao.h);
                this.a.a(cu2, aq2);
                bd.E();
                continue;
            }
            bd.D();
            if (i2 > 0) {
                f5 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f;
                f4 = (this.b.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f;
                bd.c(f5, f4, 0.0f);
            }
            aq2.e().a(ao.h);
            this.a.a(cu2, aq2);
            bd.E();
            bd.c(0.0f * f6, 0.0f * f7, 0.09375f * f8);
        }
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.E();
        bd.B();
        bd.k();
        this.e(ae2);
        if (bl2) {
            this.c.a.b(this.a(ae2)).d();
        }
        super.a((net.minecraft.w.n)ae2, d2, d3, d4, f2, f3);
    }

    protected bp a(ae ae2) {
        return net.minecraft.client.g.a.f.b;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((ae)n2);
    }
}

