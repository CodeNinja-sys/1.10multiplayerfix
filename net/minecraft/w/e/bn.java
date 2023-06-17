/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.e.e;
import net.minecraft.q.a.a.j;
import net.minecraft.r.k;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.u.n;
import net.minecraft.w.a.b;
import net.minecraft.w.d;
import net.minecraft.w.e.ae;
import net.minecraft.w.e.ag;
import net.minecraft.w.e.aw;
import net.minecraft.w.e.l;
import net.minecraft.w.e.o;
import net.minecraft.w.f;
import net.minecraft.w.r;
import net.minecraft.x.a.g;
import net.minecraft.x.a.q;

public class bn
extends r
implements aw {
    private static final g a = net.minecraft.x.a.o.a(bn.class, net.minecraft.x.a.q.h);
    private int b = 1;

    public bn(net.minecraft.q.k k2) {
        super(k2);
        this.d(4.0f, 4.0f);
        this.bD = true;
        this.k = 5;
        this.l = new l(this);
    }

    @Override
    protected void cA_() {
        this.o.a(5, new ag(this));
        this.o.a(7, new o(this));
        this.o.a(7, new ae(this));
        this.p.a(1, new net.minecraft.w.b.ag(this));
    }

    public boolean c() {
        return (Boolean)this.bE.a(a);
    }

    public void a(boolean bl2) {
        this.bE.b(a, bl2);
    }

    public int p() {
        return this.b;
    }

    @Override
    public void cE_() {
        super.cE_();
        if (!this.aQ.C && this.aQ.R() == net.minecraft.q.l.a) {
            this.aa();
        }
    }

    @Override
    public boolean a(n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if ("fireball".equals(n2.p()) && n2.j() instanceof b) {
            super.a(n2, 1000.0f);
            ((b)n2.j()).a((k)net.minecraft.r.j.z);
            return true;
        }
        return super.a(n2, f2);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, false);
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.a).a(10.0);
        this.a(d.b).a(100.0);
    }

    @Override
    public bu S() {
        return net.minecraft.u.bu.f;
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.bL;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.bN;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.bM;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.ag;
    }

    @Override
    protected float bE() {
        return 10.0f;
    }

    @Override
    public boolean aq() {
        return this.bx.nextInt(20) == 0 && super.aq() && this.aQ.R() != net.minecraft.q.l.a;
    }

    @Override
    public int az() {
        return 1;
    }

    public static void a(a a2) {
        f.a(a2, "Ghast");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("ExplosionPower", this.b);
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        if (e2.b("ExplosionPower", 99)) {
            this.b = e2.h("ExplosionPower");
        }
    }

    @Override
    public float ce_() {
        return 2.6f;
    }
}

