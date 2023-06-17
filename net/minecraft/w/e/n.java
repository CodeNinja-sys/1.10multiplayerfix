/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.e.e;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.q.z;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.ah;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bc;
import net.minecraft.w.b.bh;
import net.minecraft.w.d;
import net.minecraft.w.e.ak;
import net.minecraft.w.e.f;
import net.minecraft.w.e.i;
import net.minecraft.w.e.w;
import net.minecraft.w.e.y;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class n
extends net.minecraft.w.h.y {
    private static final g b = net.minecraft.x.a.o.a(n.class, net.minecraft.x.a.q.h);
    private float c;
    private float d;
    private int e;

    public n(k k2) {
        super(k2);
        this.d(1.3f, 1.4f);
    }

    @Override
    public ah b(ah ah2) {
        return new n(this.aQ);
    }

    @Override
    public boolean a(cu cu2) {
        return false;
    }

    @Override
    protected void cA_() {
        super.cA_();
        this.o.a(0, new av(this));
        this.o.a(1, new f(this));
        this.o.a(1, new i(this));
        this.o.a(4, new bc(this, 1.25));
        this.o.a(5, new az(this, 1.0));
        this.o.a(6, new ap(this, b.class, 6.0f));
        this.o.a(7, new bh(this));
        this.p.a(1, new y(this));
        this.p.a(2, new ak(this));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(30.0);
        this.a(net.minecraft.w.d.b).a(20.0);
        this.a(net.minecraft.w.d.d).a(0.25);
        this.bA().b(net.minecraft.w.d.e);
        this.a(net.minecraft.w.d.e).a(6.0);
    }

    @Override
    protected bv j() {
        return this.ba() ? net.minecraft.a.f.es : net.minecraft.a.f.er;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.eu;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.et;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.ev, 0.15f, 1.0f);
    }

    protected void p() {
        if (this.e <= 0) {
            this.a(net.minecraft.a.f.ew, 1.0f, 1.0f);
            this.e = 40;
        }
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.E;
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(b, false);
    }

    @Override
    public void b(e e2) {
        super.b(e2);
    }

    @Override
    public void a(e e2) {
        super.a(e2);
    }

    @Override
    public void cE_() {
        super.cE_();
        if (this.aQ.C) {
            this.c = this.d;
            this.d = this.q() ? net.minecraft.u.b.n.a(this.d + 1.0f, 0.0f, 6.0f) : net.minecraft.u.b.n.a(this.d - 1.0f, 0.0f, 6.0f);
        }
        if (this.e > 0) {
            --this.e;
        }
    }

    @Override
    public boolean j(net.minecraft.w.n n2) {
        boolean bl2 = n2.a(net.minecraft.u.n.a(this), (float)((int)this.a(net.minecraft.w.d.e).f()));
        if (bl2) {
            this.a(this, n2);
        }
        return bl2;
    }

    public boolean q() {
        return (Boolean)this.bE.a(b);
    }

    public void a(boolean bl2) {
        this.bE.b(b, bl2);
    }

    public float q(float f2) {
        return (this.c + (this.d - this.c) * f2) / 6.0f;
    }

    @Override
    protected float bJ() {
        return 0.98f;
    }

    @Override
    public ac a(z z2, ac ac2) {
        if (ac2 instanceof w) {
            if (((w)ac2).a) {
                this.e(-24000);
            }
        } else {
            w w2 = new w(null);
            w2.a = true;
            ac2 = w2;
        }
        return ac2;
    }
}

