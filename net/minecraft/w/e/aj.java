/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.q.a.a.j;
import net.minecraft.u.a.a;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ae;
import net.minecraft.w.b.aa;
import net.minecraft.w.b.av;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.y;
import net.minecraft.w.d;
import net.minecraft.w.e.am;
import net.minecraft.w.e.bp;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.n;
import net.minecraft.w.t;

public class aj
extends k {
    private am a;

    public aj(net.minecraft.q.k k2) {
        super(k2);
        this.d(0.4f, 0.3f);
    }

    public static void a(a a2) {
        f.a(a2, "Silverfish");
    }

    @Override
    protected void cA_() {
        this.a = new am(this);
        this.o.a(1, new av(this));
        this.o.a(3, this.a);
        this.o.a(4, new aa(this, 1.0, false));
        this.o.a(5, new bp(this));
        this.p.a(1, new ba((t)this, true, new Class[0]));
        this.p.a(2, new y((t)this, b.class, true));
    }

    @Override
    public double Y() {
        return 0.2;
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
        this.a(d.e).a(1.0);
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.fp;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.fr;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.fq;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.fs, 0.15f, 1.0f);
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if ((n2 instanceof net.minecraft.u.p || n2 == net.minecraft.u.n.n) && this.a != null) {
            this.a.f();
        }
        return super.a(n2, f2);
    }

    @Override
    protected net.minecraft.u.bp ai() {
        return net.minecraft.q.a.a.j.u;
    }

    @Override
    public void cE_() {
        this.ak = this.ba;
        super.cE_();
    }

    @Override
    public float a(net.minecraft.u.b.b b2) {
        return this.aQ.n(b2.c()).c() == net.minecraft.a.p.b ? 10.0f : super.a(b2);
    }

    @Override
    protected boolean cB_() {
        return true;
    }

    @Override
    public boolean aq() {
        if (super.aq()) {
            b b2 = this.aQ.b((n)this, 5.0);
            return b2 == null;
        }
        return false;
    }

    @Override
    public ae bB() {
        return net.minecraft.w.ae.c;
    }
}

