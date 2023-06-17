/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import java.util.UUID;
import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.m.cb;
import net.minecraft.m.cd;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ah;
import net.minecraft.w.b.aa;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.aq;
import net.minecraft.w.b.av;
import net.minecraft.w.b.ay;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bf;
import net.minecraft.w.b.bg;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.g;
import net.minecraft.w.d;
import net.minecraft.w.e.bi;
import net.minecraft.w.e.bn;
import net.minecraft.w.f;
import net.minecraft.w.h.ai;
import net.minecraft.w.h.al;
import net.minecraft.w.h.m;
import net.minecraft.w.h.y;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class e
extends ai {
    private static final net.minecraft.x.a.g e = net.minecraft.x.a.o.a(e.class, net.minecraft.x.a.q.c);
    private static final net.minecraft.x.a.g f = net.minecraft.x.a.o.a(e.class, net.minecraft.x.a.q.h);
    private static final net.minecraft.x.a.g g = net.minecraft.x.a.o.a(e.class, net.minecraft.x.a.q.b);
    private float h;
    private float i;
    private boolean x;
    private boolean y;
    private float z;
    private float A;

    public e(k k2) {
        super(k2);
        this.d(0.6f, 0.85f);
        this.a(false);
    }

    @Override
    protected void cA_() {
        this.d = new ay(this);
        this.o.a(1, new av(this));
        this.o.a(2, this.d);
        this.o.a(3, new bg(this, 0.4f));
        this.o.a(4, new aa(this, 1.0, true));
        this.o.a(5, new g(this, 1.0, 10.0f, 2.0f));
        this.o.a(6, new net.minecraft.w.b.k(this, 1.0));
        this.o.a(7, new az(this, 1.0));
        this.o.a(8, new net.minecraft.w.b.b(this, 8.0f));
        this.o.a(9, new ap(this, b.class, 8.0f));
        this.o.a(9, new bh(this));
        this.p.a(1, new net.minecraft.w.b.j(this));
        this.p.a(2, new aq(this));
        this.p.a(3, new ba((t)this, true, new Class[0]));
        this.p.a(4, new bf(this, y.class, false, new m(this)));
        this.p.a(5, new net.minecraft.w.b.y((t)this, net.minecraft.w.e.ay.class, false));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.d).a(0.3f);
        if (this.z()) {
            this.a(net.minecraft.w.d.a).a(20.0);
        } else {
            this.a(net.minecraft.w.d.a).a(8.0);
        }
        this.bA().b(net.minecraft.w.d.e).a(2.0);
    }

    @Override
    public void c(l l2) {
        super.c(l2);
        if (l2 == null) {
            this.c(false);
        } else if (!this.z()) {
            this.c(true);
        }
    }

    @Override
    protected void e() {
        this.bE.b(e, Float.valueOf(this.bo()));
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(e, Float.valueOf(this.bo()));
        this.bE.a(f, false);
        this.bE.a(g, cd.o.c());
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.hl, 0.15f, 1.0f);
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Wolf");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Angry", this.r());
        e2.a("CollarColor", (byte)this.s().c());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.c(e2.p("Angry"));
        if (e2.b("CollarColor", 99)) {
            this.a(cd.a(e2.f("CollarColor")));
        }
    }

    @Override
    protected bv j() {
        return this.r() ? net.minecraft.a.f.hg : (this.bx.nextInt(3) == 0 ? (this.z() && ((Float)this.bE.a(e)).floatValue() < 10.0f ? net.minecraft.a.f.hm : net.minecraft.a.f.hj) : net.minecraft.a.f.he);
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.hi;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.hf;
    }

    @Override
    protected float bE() {
        return 0.4f;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.K;
    }

    @Override
    public void n() {
        super.n();
        if (!this.aQ.C && this.x && !this.y && !this.aX() && this.be) {
            this.y = true;
            this.z = 0.0f;
            this.A = 0.0f;
            this.aQ.a((n)this, (byte)8);
        }
        if (!this.aQ.C && this.W() == null && this.r()) {
            this.c(false);
        }
    }

    @Override
    public void cE_() {
        super.cE_();
        this.i = this.h;
        this.h = this.t() ? (this.h += (1.0f - this.h) * 0.4f) : (this.h += (0.0f - this.h) * 0.4f);
        if (this.cl()) {
            this.x = true;
            this.y = false;
            this.z = 0.0f;
            this.A = 0.0f;
        } else if ((this.x || this.y) && this.y) {
            if (this.z == 0.0f) {
                this.a(net.minecraft.a.f.hk, this.bE(), (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            }
            this.A = this.z;
            this.z += 0.05f;
            if (this.A >= 2.0f) {
                this.x = false;
                this.y = false;
                this.A = 0.0f;
                this.z = 0.0f;
            }
            if (this.z > 0.4f) {
                float f2 = (float)this.cT().b;
                int n2 = (int)(net.minecraft.u.b.n.a((this.z - 0.4f) * (float)Math.PI) * 7.0f);
                for (int i2 = 0; i2 < n2; ++i2) {
                    float f3 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl * 0.5f;
                    float f4 = (this.bx.nextFloat() * 2.0f - 1.0f) * this.bl * 0.5f;
                    this.aQ.a(net.minecraft.u.aj.f, this.aU + (double)f3, (double)(f2 + 0.8f), this.aW + (double)f4, this.aX, this.aY, this.aZ, new int[0]);
                }
            }
        }
    }

    public boolean p() {
        return this.x;
    }

    public float q(float f2) {
        return 0.75f + (this.A + (this.z - this.A) * f2) / 2.0f * 0.25f;
    }

    public float h(float f2, float f3) {
        float f4 = (this.A + (this.z - this.A) * f2 + f3) / 1.8f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        return net.minecraft.u.b.n.a(f4 * (float)Math.PI) * net.minecraft.u.b.n.a(f4 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    public float s(float f2) {
        return (this.i + (this.h - this.i) * f2) * 0.15f * (float)Math.PI;
    }

    @Override
    public float ce_() {
        return this.bm * 0.8f;
    }

    @Override
    public int ao() {
        return this.E() ? 20 : super.ao();
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        n n3 = n2.j();
        if (this.d != null) {
            this.d.a(false);
        }
        if (n3 != null && !(n3 instanceof b) && !(n3 instanceof net.minecraft.w.c.f)) {
            f2 = (f2 + 1.0f) / 2.0f;
        }
        return super.a(n2, f2);
    }

    @Override
    public boolean j(n n2) {
        boolean bl2 = n2.a(net.minecraft.u.n.a(this), (float)((int)this.a(net.minecraft.w.d.e).f()));
        if (bl2) {
            this.a((l)this, n2);
        }
        return bl2;
    }

    @Override
    public void a(boolean bl2) {
        super.a(bl2);
        if (bl2) {
            this.a(net.minecraft.w.d.a).a(20.0);
        } else {
            this.a(net.minecraft.w.d.a).a(8.0);
        }
        this.a(net.minecraft.w.d.e).a(4.0);
    }

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (this.z()) {
            if (cu2 != null) {
                cd cd2;
                if (cu2.a() instanceof cb) {
                    cb cb2 = (cb)cu2.a();
                    if (cb2.e() && ((Float)this.bE.a(e)).floatValue() < 20.0f) {
                        if (!b2.J.d) {
                            --cu2.b;
                        }
                        this.a((float)cb2.h(cu2));
                        return true;
                    }
                } else if (cu2.a() == net.minecraft.a.w.bd && (cd2 = cd.a(cu2.h())) != this.s()) {
                    this.a(cd2);
                    if (!b2.J.d) {
                        --cu2.b;
                    }
                    return true;
                }
            }
            if (this.d((l)b2) && !this.aQ.C && !this.a(cu2)) {
                this.d.a(!this.E());
                this.aA = false;
                this.n.m();
                this.c((l)null);
            }
        } else if (cu2 != null && cu2.a() == net.minecraft.a.w.be && !this.r()) {
            if (!b2.J.d) {
                --cu2.b;
            }
            if (!this.aQ.C) {
                if (this.bx.nextInt(3) == 0) {
                    this.a(true);
                    this.n.m();
                    this.c((l)null);
                    this.d.a(true);
                    this.h(20.0f);
                    this.b(b2.cM());
                    this.e(true);
                    this.aQ.a((n)this, (byte)7);
                } else {
                    this.e(false);
                    this.aQ.a((n)this, (byte)6);
                }
            }
            return true;
        }
        return super.a(b2, ah2, cu2);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 8) {
            this.y = true;
            this.z = 0.0f;
            this.A = 0.0f;
        } else {
            super.a(by2);
        }
    }

    public float q() {
        return this.r() ? 1.5393804f : (this.z() ? (0.55f - (this.bw() - ((Float)this.bE.a(e)).floatValue()) * 0.02f) * (float)Math.PI : 0.62831855f);
    }

    @Override
    public boolean a(cu cu2) {
        return cu2 == null ? false : (!(cu2.a() instanceof cb) ? false : ((cb)cu2.a()).e());
    }

    @Override
    public int az() {
        return 8;
    }

    public boolean r() {
        return ((Byte)this.bE.a(b) & 2) != 0;
    }

    public void c(boolean bl2) {
        byte by2 = (Byte)this.bE.a(b);
        if (bl2) {
            this.bE.b(b, (byte)(by2 | 2));
        } else {
            this.bE.b(b, (byte)(by2 & 0xFFFFFFFD));
        }
    }

    public cd s() {
        return cd.a((Integer)this.bE.a(g) & 0xF);
    }

    public void a(cd cd2) {
        this.bE.b(g, cd2.c());
    }

    public e a(ah ah2) {
        e e2 = new e(this.aQ);
        UUID uUID = this.b();
        if (uUID != null) {
            e2.b(uUID);
            e2.a(true);
        }
        return e2;
    }

    public void d(boolean bl2) {
        this.bE.b(f, bl2);
    }

    @Override
    public boolean a(y y2) {
        if (y2 == this) {
            return false;
        }
        if (!this.z()) {
            return false;
        }
        if (!(y2 instanceof e)) {
            return false;
        }
        e e2 = (e)y2;
        return !e2.z() ? false : (e2.E() ? false : this.w() && e2.w());
    }

    public boolean t() {
        return (Boolean)this.bE.a(f);
    }

    @Override
    public boolean a(l l2, l l3) {
        if (!(l2 instanceof bi) && !(l2 instanceof bn)) {
            e e2;
            if (l2 instanceof e && (e2 = (e)l2).z() && e2.do() == l3) {
                return false;
            }
            return l2 instanceof b && l3 instanceof b && !((b)l3).a((b)l2) ? false : !(l2 instanceof al) || !((al)l2).s();
        }
        return false;
    }

    @Override
    public boolean c(b b2) {
        return !this.r() && super.c(b2);
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.a(ah2);
    }
}

