/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ah;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bc;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.e;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.h.y;
import net.minecraft.w.t;

public class ab
extends y {
    public ab(k k2) {
        super(k2);
        this.d(0.9f, 1.4f);
    }

    public static void c(a a2) {
        f.a(a2, "Cow");
    }

    @Override
    protected void cA_() {
        this.o.a(0, new av(this));
        this.o.a(1, new net.minecraft.w.b.ah(this, 2.0));
        this.o.a(2, new net.minecraft.w.b.k(this, 1.0));
        this.o.a(3, new e((t)this, 1.25, net.minecraft.a.w.Q, false));
        this.o.a(4, new bc(this, 1.25));
        this.o.a(5, new az(this, 1.0));
        this.o.a(6, new ap(this, b.class, 6.0f));
        this.o.a(7, new bh(this));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.a).a(10.0);
        this.a(d.d).a(0.2f);
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.am;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.ao;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.an;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.aq, 0.15f, 1.0f);
    }

    @Override
    protected float bE() {
        return 0.4f;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.I;
    }

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (cu2 != null && cu2.a() == net.minecraft.a.w.ay && !b2.J.d && !this.ba()) {
            b2.a(net.minecraft.a.f.ap, 1.0f, 1.0f);
            if (--cu2.b == 0) {
                b2.a(ah2, new cu(net.minecraft.a.w.aN));
            } else if (!b2.q.c(new cu(net.minecraft.a.w.aN))) {
                b2.a(new cu(net.minecraft.a.w.aN), false);
            }
            return true;
        }
        return super.a(b2, ah2, cu2);
    }

    public ab c(ah ah2) {
        return new ab(this.aQ);
    }

    @Override
    public float ce_() {
        return this.ba() ? this.bm : 1.3f;
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.c(ah2);
    }
}

