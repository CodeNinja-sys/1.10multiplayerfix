/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.b.cg;
import net.minecraft.a.f;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.a.b.d;
import net.minecraft.u.a.c;
import net.minecraft.u.a.e;
import net.minecraft.u.aj;
import net.minecraft.u.bu;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class h
extends n {
    private static final g a = o.a(h.class, q.f);
    private int b;
    private int c;

    public h(k k2) {
        super(k2);
        this.d(0.25f, 0.25f);
    }

    @Override
    protected void cb_() {
        this.bE.a(a, cg.f());
    }

    @Override
    public boolean a(double d2) {
        return d2 < 4096.0;
    }

    public h(k k2, double d2, double d3, double d4, cu cu2) {
        super(k2);
        this.b = 0;
        this.d(0.25f, 0.25f);
        this.e(d2, d3, d4);
        int n2 = 1;
        if (cu2 != null && cu2.n()) {
            this.bE.b(a, cg.b(cu2));
            net.minecraft.e.e e2 = cu2.o();
            net.minecraft.e.e e3 = e2.o("Fireworks");
            n2 += e3.f("Flight");
        }
        this.aX = this.bx.nextGaussian() * 0.001;
        this.aZ = this.bx.nextGaussian() * 0.001;
        this.aY = 0.05;
        this.c = 10 * n2 + this.bx.nextInt(6) + this.bx.nextInt(7);
    }

    @Override
    public void k(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        if (this.bd == 0.0f && this.bc == 0.0f) {
            float f2 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
            this.ba = (float)(net.minecraft.u.b.n.b(d2, d4) * 57.29577951308232);
            this.bb = (float)(net.minecraft.u.b.n.b(d3, (double)f2) * 57.29577951308232);
            this.bc = this.ba;
            this.bd = this.bb;
        }
    }

    @Override
    public void cE_() {
        this.br = this.aU;
        this.bs = this.aV;
        this.bt = this.aW;
        super.cE_();
        this.aX *= 1.15;
        this.aZ *= 1.15;
        this.aY += 0.04;
        this.b(this.aX, this.aY, this.aZ);
        float f2 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ);
        this.ba = (float)(net.minecraft.u.b.n.b(this.aX, this.aZ) * 57.29577951308232);
        this.bb = (float)(net.minecraft.u.b.n.b(this.aY, (double)f2) * 57.29577951308232);
        while (this.bb - this.bd < -180.0f) {
            this.bd -= 360.0f;
        }
        while (this.bb - this.bd >= 180.0f) {
            this.bd += 360.0f;
        }
        while (this.ba - this.bc < -180.0f) {
            this.bc -= 360.0f;
        }
        while (this.ba - this.bc >= 180.0f) {
            this.bc += 360.0f;
        }
        this.bb = this.bd + (this.bb - this.bd) * 0.2f;
        this.ba = this.bc + (this.ba - this.bc) * 0.2f;
        if (this.b == 0 && !this.ch()) {
            this.aQ.a(null, this.aU, this.aV, this.aW, f.bs, net.minecraft.u.bu.i, 3.0f, 1.0f);
        }
        ++this.b;
        if (this.aQ.C && this.b % 2 < 2) {
            this.aQ.a(aj.d, this.aU, this.aV - 0.3, this.aW, this.bx.nextGaussian() * 0.05, -this.aY * 0.5, this.bx.nextGaussian() * 0.05, new int[0]);
        }
        if (!this.aQ.C && this.b > this.c) {
            this.aQ.a((n)this, (byte)17);
            this.aa();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 17 && this.aQ.C) {
            cu cu2 = (cu)((cg)this.bE.a(a)).d();
            net.minecraft.e.e e2 = null;
            if (cu2 != null && cu2.n()) {
                e2 = cu2.o().o("Fireworks");
            }
            this.aQ.a(this.aU, this.aV, this.aW, this.aX, this.aY, this.aZ, e2);
        }
        super.a(by2);
    }

    public static void a(a a2) {
        a2.a(net.minecraft.u.a.c.e, (e)new d("FireworksRocketEntity", new String[]{"FireworksItem"}));
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        e2.a("Life", this.b);
        e2.a("LifeTime", this.c);
        cu cu2 = (cu)((cg)this.bE.a(a)).d();
        if (cu2 != null) {
            e2.a("FireworksItem", cu2.b(new net.minecraft.e.e()));
        }
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        cu cu2;
        this.b = e2.h("Life");
        this.c = e2.h("LifeTime");
        net.minecraft.e.e e3 = e2.o("FireworksItem");
        if (e3 != null && (cu2 = cu.a(e3)) != null) {
            this.bE.b(a, cg.b(cu2));
        }
    }

    @Override
    public float n(float f2) {
        return super.n(f2);
    }

    @Override
    public int m(float f2) {
        return super.m(f2);
    }

    @Override
    public boolean cG() {
        return false;
    }
}

