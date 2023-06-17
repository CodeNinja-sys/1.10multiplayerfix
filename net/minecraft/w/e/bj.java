/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.b.g;
import net.minecraft.e.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.b.aa;
import net.minecraft.w.b.ai;
import net.minecraft.w.b.ak;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.p;
import net.minecraft.w.b.y;
import net.minecraft.w.d;
import net.minecraft.w.e.aw;
import net.minecraft.w.e.bi;
import net.minecraft.w.e.bl;
import net.minecraft.w.e.x;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class bj
extends x {
    protected static final net.minecraft.x.a.g a = net.minecraft.x.a.o.a(bj.class, net.minecraft.x.a.q.a);
    private int c;
    g b;
    private int d;
    private int e;

    public bj(k k2) {
        super(k2);
        this.d(1.4f, 2.7f);
    }

    @Override
    protected void cA_() {
        this.o.a(1, new aa(this, 1.0, true));
        this.o.a(2, new ak(this, 0.9, 32.0f));
        this.o.a(3, new p(this, 0.6, true));
        this.o.a(4, new net.minecraft.w.b.n(this, 1.0));
        this.o.a(5, new net.minecraft.w.b.bl(this));
        this.o.a(6, new az(this, 0.6));
        this.o.a(7, new ap(this, net.minecraft.w.a.b.class, 6.0f));
        this.o.a(8, new bh(this));
        this.p.a(1, new ai(this));
        this.p.a(2, new ba((t)this, false, new Class[0]));
        this.p.a(3, new y(this, f.class, 10, false, true, new bl(this)));
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, (byte)0);
    }

    @Override
    protected void e() {
        if (--this.c <= 0) {
            this.c = 70 + this.bx.nextInt(50);
            this.b = this.aQ.U().a(new net.minecraft.u.b.b(this), 32);
            if (this.b == null) {
                this.dl();
            } else {
                net.minecraft.u.b.b b2 = this.b.a();
                this.a(b2, (int)((float)this.b.b() * 0.6f));
            }
        }
        super.e();
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(100.0);
        this.a(net.minecraft.w.d.d).a(0.25);
        this.a(net.minecraft.w.d.c).a(1.0);
    }

    @Override
    protected int h(int n2) {
        return n2;
    }

    @Override
    protected void k(n n2) {
        if (n2 instanceof aw && !(n2 instanceof bi) && this.bd().nextInt(20) == 0) {
            this.c((l)n2);
        }
        super.k(n2);
    }

    @Override
    public void n() {
        int n2;
        int n3;
        int n4;
        b b2;
        super.n();
        if (this.d > 0) {
            --this.d;
        }
        if (this.e > 0) {
            --this.e;
        }
        if (this.aX * this.aX + this.aZ * this.aZ > 2.500000277905201E-7 && this.bx.nextInt(5) == 0 && (b2 = this.aQ.n(new net.minecraft.u.b.b(n4 = net.minecraft.u.b.n.c(this.aU), n3 = net.minecraft.u.b.n.c(this.aV - (double)0.2f), n2 = net.minecraft.u.b.n.c(this.aW)))).d() != h.a) {
            this.aQ.a(net.minecraft.u.aj.L, this.aU + ((double)this.bx.nextFloat() - 0.5) * (double)this.bl, this.cT().b + 0.1, this.aW + ((double)this.bx.nextFloat() - 0.5) * (double)this.bl, 4.0 * ((double)this.bx.nextFloat() - 0.5), 0.5, ((double)this.bx.nextFloat() - 0.5) * 4.0, cn.p(b2));
        }
    }

    @Override
    public boolean a(Class class_) {
        return this.r() && net.minecraft.w.a.b.class.isAssignableFrom(class_) ? false : (class_ == bi.class ? false : super.a(class_));
    }

    public static void a(a a2) {
        f.a(a2, "VillagerGolem");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("PlayerCreated", this.r());
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.c(e2.p("PlayerCreated"));
    }

    @Override
    public boolean j(n n2) {
        this.d = 10;
        this.aQ.a((n)this, (byte)4);
        boolean bl2 = n2.a(net.minecraft.u.n.a(this), (float)(7 + this.bx.nextInt(15)));
        if (bl2) {
            n2.aY += (double)0.4f;
            this.a(this, n2);
        }
        this.a(net.minecraft.a.f.cM, 1.0f, 1.0f);
        return bl2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 4) {
            this.d = 10;
            this.a(net.minecraft.a.f.cM, 1.0f, 1.0f);
        } else if (by2 == 11) {
            this.e = 400;
        } else {
            super.a(by2);
        }
    }

    public g c() {
        return this.b;
    }

    public int p() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.e = bl2 ? 400 : 0;
        this.aQ.a((n)this, (byte)11);
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.cO;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.cN;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.cP, 1.0f, 1.0f);
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.z;
    }

    public int q() {
        return this.e;
    }

    public boolean r() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public void c(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 1));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        if (!this.r() && this.ap != null && this.b != null) {
            this.b.a(this.ap.X(), -5);
        }
        super.a(n2);
    }
}

