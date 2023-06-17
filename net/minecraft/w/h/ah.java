/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.i.h;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bc;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.e;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.h.y;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;

public class ah
extends y {
    private static final Set i = aad.a(net.minecraft.a.w.P, net.minecraft.a.w.bo, net.minecraft.a.w.bn, net.minecraft.a.w.cU);
    public float b;
    public float c;
    public float d;
    public float e;
    public float f = 1.0f;
    public int g;
    public boolean h;

    public ah(k k2) {
        super(k2);
        this.d(0.4f, 0.7f);
        this.g = this.bx.nextInt(6000) + 6000;
        this.a(net.minecraft.i.h.g, 0.0f);
    }

    @Override
    protected void cA_() {
        this.o.a(0, new av(this));
        this.o.a(1, new net.minecraft.w.b.ah(this, 1.4));
        this.o.a(2, new net.minecraft.w.b.k(this, 1.0));
        this.o.a(3, new e((t)this, 1.0, false, i));
        this.o.a(4, new bc(this, 1.1));
        this.o.a(5, new az(this, 1.0));
        this.o.a(6, new ap(this, b.class, 6.0f));
        this.o.a(7, new bh(this));
    }

    @Override
    public float ce_() {
        return this.bm;
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(4.0);
        this.a(net.minecraft.w.d.d).a(0.25);
    }

    @Override
    public void n() {
        super.n();
        this.e = this.b;
        this.d = this.c;
        this.c = (float)((double)this.c + (double)(this.be ? -1 : 4) * 0.3);
        this.c = net.minecraft.u.b.n.a(this.c, 0.0f, 1.0f);
        if (!this.be && this.f < 1.0f) {
            this.f = 1.0f;
        }
        this.f = (float)((double)this.f * 0.9);
        if (!this.be && this.aY < 0.0) {
            this.aY *= 0.6;
        }
        this.b += this.f * 2.0f;
        if (!(this.aQ.C || this.ba() || this.p() || --this.g > 0)) {
            this.a(net.minecraft.a.f.aa, 1.0f, (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            this.a(net.minecraft.a.w.aW, 1);
            this.g = this.bx.nextInt(6000) + 6000;
        }
    }

    @Override
    public void c(float f2, float f3) {
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.Y;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.ab;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.Z;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.ac, 0.15f, 1.0f);
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.C;
    }

    public ah a(net.minecraft.w.ah ah2) {
        return new ah(this.aQ);
    }

    @Override
    public boolean a(cu cu2) {
        return cu2 != null && i.contains(cu2.a());
    }

    @Override
    protected int b_(b b2) {
        return this.p() ? 10 : super.b_(b2);
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Chicken");
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.h = e2.p("IsChickenJockey");
        if (e2.e("EggLayTime")) {
            this.g = e2.h("EggLayTime");
        }
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("IsChickenJockey", this.h);
        e2.a("EggLayTime", this.g);
    }

    @Override
    protected boolean i() {
        return this.p() && !this.cA();
    }

    @Override
    public void p(n n2) {
        super.p(n2);
        float f2 = net.minecraft.u.b.n.a(this.ak * ((float)Math.PI / 180));
        float f3 = net.minecraft.u.b.n.b(this.ak * ((float)Math.PI / 180));
        float f4 = 0.1f;
        float f5 = 0.0f;
        n2.e(this.aU + (double)(0.1f * f2), this.aV + (double)(this.bm * 0.5f) + n2.Y() + 0.0, this.aW - (double)(0.1f * f3));
        if (n2 instanceof l) {
            ((l)n2).ak = this.ak;
        }
    }

    public boolean p() {
        return this.h;
    }

    public void a(boolean bl2) {
        this.h = bl2;
    }

    @Override
    public /* synthetic */ net.minecraft.w.ah b(net.minecraft.w.ah ah2) {
        return this.a(ah2);
    }
}

