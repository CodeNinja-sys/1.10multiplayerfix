/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.e.e;
import net.minecraft.g.cn;
import net.minecraft.q.a.a.j;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ae;
import net.minecraft.w.b.aa;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.y;
import net.minecraft.w.d;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.n;
import net.minecraft.w.t;

public class q
extends k {
    private int a;
    private boolean b;

    public q(net.minecraft.q.k k2) {
        super(k2);
        this.k = 3;
        this.d(0.4f, 0.3f);
    }

    @Override
    protected void cA_() {
        this.o.a(1, new av(this));
        this.o.a(2, new aa(this, 1.0, false));
        this.o.a(3, new az(this, 1.0));
        this.o.a(7, new ap(this, b.class, 8.0f));
        this.o.a(8, new bh(this));
        this.p.a(1, new ba((t)this, true, new Class[0]));
        this.p.a(2, new y((t)this, b.class, true));
    }

    @Override
    public float ce_() {
        return 0.1f;
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.a).a(8.0);
        this.a(d.d).a(0.25);
        this.a(d.e).a(2.0);
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.bc;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.be;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.bd;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.bf, 0.15f, 1.0f);
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.ai;
    }

    public static void a(a a2) {
        f.a(a2, "Endermite");
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.a = e2.h("Lifetime");
        this.b = e2.p("PlayerSpawned");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("Lifetime", this.a);
        e2.a("PlayerSpawned", this.b);
    }

    @Override
    public void cE_() {
        this.ak = this.ba;
        super.cE_();
    }

    @Override
    public double Y() {
        return 0.3;
    }

    public boolean c() {
        return this.b;
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }

    @Override
    public void n() {
        super.n();
        if (this.aQ.C) {
            for (int i2 = 0; i2 < 2; ++i2) {
                this.aQ.a(net.minecraft.u.aj.y, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, (this.bx.nextDouble() - 0.5) * 2.0, -this.bx.nextDouble(), (this.bx.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        } else {
            if (!this.aM()) {
                ++this.a;
            }
            if (this.a >= 2400) {
                this.aa();
            }
        }
    }

    @Override
    protected boolean cB_() {
        return true;
    }

    @Override
    public boolean aq() {
        if (super.aq()) {
            b b2 = this.aQ.a((n)this, 5.0);
            return b2 == null;
        }
        return false;
    }

    @Override
    public ae bB() {
        return net.minecraft.w.ae.c;
    }
}

