/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.g.cn;
import net.minecraft.i.j;
import net.minecraft.i.m;
import net.minecraft.q.l;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.ae;
import net.minecraft.w.b.av;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bg;
import net.minecraft.w.b.bh;
import net.minecraft.w.d;
import net.minecraft.w.e.ap;
import net.minecraft.w.e.ay;
import net.minecraft.w.e.az;
import net.minecraft.w.e.bj;
import net.minecraft.w.e.h;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class c
extends k {
    private static final g a = net.minecraft.x.a.o.a(c.class, net.minecraft.x.a.q.a);

    public c(net.minecraft.q.k k2) {
        super(k2);
        this.d(1.4f, 0.9f);
    }

    public static void a(a a2) {
        f.a(a2, "Spider");
    }

    @Override
    protected void cA_() {
        this.o.a(1, new av(this));
        this.o.a(3, new bg(this, 0.4f));
        this.o.a(4, new h(this));
        this.o.a(5, new net.minecraft.w.b.az(this, 0.8));
        this.o.a(6, new net.minecraft.w.b.ap(this, b.class, 8.0f));
        this.o.a(6, new bh(this));
        this.p.a(1, new ba((t)this, false, new Class[0]));
        this.p.a(2, new az(this, b.class));
        this.p.a(3, new az(this, bj.class));
    }

    @Override
    public double cs() {
        return this.bm * 0.5f;
    }

    @Override
    protected j a(net.minecraft.q.k k2) {
        return new m(this, k2);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, (byte)0);
    }

    @Override
    public void cE_() {
        super.cE_();
        if (!this.aQ.C) {
            this.a(this.bf);
        }
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.a).a(16.0);
        this.a(d.d).a(0.3f);
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.gc;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.ge;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.gd;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.gf, 0.15f, 1.0f);
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.r;
    }

    @Override
    public boolean bq() {
        return this.c();
    }

    @Override
    public void am() {
    }

    @Override
    public ae bB() {
        return net.minecraft.w.ae.c;
    }

    @Override
    public boolean d(net.minecraft.d.j j2) {
        return j2.a() == net.minecraft.a.c.s ? false : super.d(j2);
    }

    public boolean c() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        by2 = bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE);
        this.bE.b(a, by2);
    }

    @Override
    public ac a(z z2, ac ac2) {
        Object object;
        ac2 = super.a(z2, ac2);
        if (this.aQ.p.nextInt(100) == 0) {
            object = new ay(this.aQ);
            ((n)object).b(this.aU, this.aV, this.aW, this.ba, 0.0f);
            ((ay)object).a(z2, null);
            this.aQ.a((n)object);
            ((n)object).r(this);
        }
        if (ac2 == null) {
            ac2 = new ap();
            if (this.aQ.R() == net.minecraft.q.l.d && this.aQ.p.nextFloat() < 0.1f * z2.c()) {
                ((ap)ac2).a(this.aQ.p);
            }
        }
        if (ac2 instanceof ap && (object = ((ap)ac2).a) != null) {
            this.c(new net.minecraft.d.j((net.minecraft.d.c)object, Integer.MAX_VALUE));
        }
        return ac2;
    }

    @Override
    public float ce_() {
        return 0.65f;
    }
}

