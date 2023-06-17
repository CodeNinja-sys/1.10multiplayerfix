/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.b.aa;
import net.minecraft.w.b.al;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.y;
import net.minecraft.w.d;
import net.minecraft.w.e.ay;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.g.a;
import net.minecraft.w.h.u;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class bi
extends k {
    private static final g a = net.minecraft.x.a.o.a(bi.class, net.minecraft.x.a.q.b);
    private static final g b = net.minecraft.x.a.o.a(bi.class, net.minecraft.x.a.q.h);
    private static final g c = net.minecraft.x.a.o.a(bi.class, net.minecraft.x.a.q.h);
    private int d;
    private int e;
    private int f = 30;
    private int g = 3;
    private int h;

    public bi(net.minecraft.q.k k2) {
        super(k2);
        this.d(0.6f, 1.7f);
    }

    @Override
    protected void cA_() {
        this.o.a(1, new av(this));
        this.o.a(2, new al(this));
        this.o.a(3, new net.minecraft.w.b.bi(this, u.class, 6.0f, 1.0, 1.2));
        this.o.a(4, new aa(this, 1.0, false));
        this.o.a(5, new az(this, 0.8));
        this.o.a(6, new ap(this, b.class, 8.0f));
        this.o.a(6, new bh(this));
        this.p.a(1, new y((t)this, b.class, true));
        this.p.a(2, new ba((t)this, false, new Class[0]));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.d).a(0.25);
    }

    @Override
    public int ck_() {
        return this.W() == null ? 3 : 3 + (int)(this.bo() - 1.0f);
    }

    @Override
    public void c(float f2, float f3) {
        super.c(f2, f3);
        this.e = (int)((float)this.e + f2 * 1.5f);
        if (this.e > this.f - 5) {
            this.e = this.f - 5;
        }
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, -1);
        this.bE.a(b, false);
        this.bE.a(c, false);
    }

    public static void a(net.minecraft.u.a.a a2) {
        net.minecraft.w.f.a(a2, "Creeper");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        if (((Boolean)this.bE.a(b)).booleanValue()) {
            e2.a("powered", true);
        }
        e2.a("Fuse", (short)this.f);
        e2.a("ExplosionRadius", (byte)this.g);
        e2.a("ignited", this.q());
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.bE.b(b, e2.p("powered"));
        if (e2.b("Fuse", 99)) {
            this.f = e2.g("Fuse");
        }
        if (e2.b("ExplosionRadius", 99)) {
            this.g = e2.f("ExplosionRadius");
        }
        if (e2.p("ignited")) {
            this.r();
        }
    }

    @Override
    public void cE_() {
        if (this.br()) {
            int n2;
            this.d = this.e;
            if (this.q()) {
                this.b(1);
            }
            if ((n2 = this.p()) > 0 && this.e == 0) {
                this.a(net.minecraft.a.f.at, 1.0f, 0.5f);
            }
            this.e += n2;
            if (this.e < 0) {
                this.e = 0;
            }
            if (this.e >= this.f) {
                this.e = this.f;
                this.w();
            }
        }
        super.cE_();
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.as;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.ar;
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        super.a(n2);
        if (this.aQ.G().b("doMobLoot")) {
            if (n2.j() instanceof ay) {
                int n3 = cg.a(w.cA);
                int n4 = cg.a(w.cL);
                int n5 = n3 + this.bx.nextInt(n4 - n3 + 1);
                this.a(cg.c(n5), 1);
            } else if (n2.j() instanceof bi && n2.j() != this && ((bi)n2.j()).c() && ((bi)n2.j()).s()) {
                ((bi)n2.j()).t();
                this.a(new cu(w.ch, 1, 4), 0.0f);
            }
        }
    }

    @Override
    public boolean j(n n2) {
        return true;
    }

    public boolean c() {
        return (Boolean)this.bE.a(b);
    }

    public float q(float f2) {
        return ((float)this.d + (float)(this.e - this.d) * f2) / (float)(this.f - 2);
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.q;
    }

    public int p() {
        return (Integer)this.bE.a(a);
    }

    public void b(int n2) {
        this.bE.b(a, n2);
    }

    @Override
    public void a(a a2) {
        super.a(a2);
        this.bE.b(b, true);
    }

    @Override
    protected boolean a(b b2, ah ah2, cu cu2) {
        if (cu2 != null && cu2.a() == w.d) {
            this.aQ.a(b2, this.aU, this.aV, this.aW, net.minecraft.a.f.by, this.S(), 1.0f, this.bx.nextFloat() * 0.4f + 0.8f);
            b2.a(ah2);
            if (!this.aQ.C) {
                this.r();
                cu2.a(1, (l)b2);
                return true;
            }
        }
        return super.a(b2, ah2, cu2);
    }

    private void w() {
        if (!this.aQ.C) {
            boolean bl2 = this.aQ.G().b("mobGriefing");
            float f2 = this.c() ? 2.0f : 1.0f;
            this.ar = true;
            this.aQ.a(this, this.aU, this.aV, this.aW, (float)this.g * f2, bl2);
            this.aa();
        }
    }

    public boolean q() {
        return (Boolean)this.bE.a(c);
    }

    public void r() {
        this.bE.b(c, true);
    }

    public boolean s() {
        return this.h < 1 && this.aQ.G().b("doMobLoot");
    }

    public void t() {
        ++this.h;
    }
}

