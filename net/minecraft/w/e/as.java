/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import com.a.a.b.cg;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.co;
import net.minecraft.g.id;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.d;
import net.minecraft.w.e.a;
import net.minecraft.w.e.ab;
import net.minecraft.w.e.ah;
import net.minecraft.w.e.aw;
import net.minecraft.w.e.j;
import net.minecraft.w.e.x;
import net.minecraft.w.e.z;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.o;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.q;

public class as
extends x
implements aw {
    private static final UUID d = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
    private static final h e = new h(d, "Covered armor bonus", 20.0, 0).a(false);
    protected static final g a = net.minecraft.x.a.o.a(as.class, net.minecraft.x.a.q.l);
    protected static final g b = net.minecraft.x.a.o.a(as.class, net.minecraft.x.a.q.k);
    protected static final g c = net.minecraft.x.a.o.a(as.class, net.minecraft.x.a.q.a);
    private float f;
    private float g;
    private net.minecraft.u.b.b h;
    private int i;

    public as(k k2) {
        super(k2);
        this.d(1.0f, 1.0f);
        this.al = 180.0f;
        this.ak = 180.0f;
        this.bD = true;
        this.h = null;
        this.k = 5;
    }

    @Override
    public ac a(net.minecraft.q.z z2, ac ac2) {
        this.ak = 180.0f;
        this.al = 180.0f;
        this.ba = 180.0f;
        this.bc = 180.0f;
        this.am = 180.0f;
        this.an = 180.0f;
        return super.a(z2, ac2);
    }

    @Override
    protected void cA_() {
        this.o.a(1, new ap(this, b.class, 8.0f));
        this.o.a(4, new z(this));
        this.o.a(7, new ah(this, null));
        this.o.a(8, new bh(this));
        this.p.a(1, new ba((t)this, true, new Class[0]));
        this.p.a(2, new a(this, this));
        this.p.a(3, new j(this));
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    public bu S() {
        return net.minecraft.u.bu.f;
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.ff;
    }

    @Override
    public void ad() {
        if (!this.y()) {
            super.ad();
        }
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.fj;
    }

    @Override
    protected bv cc_() {
        return this.y() ? net.minecraft.a.f.fl : net.minecraft.a.f.fk;
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, net.minecraft.u.ad.a);
        this.bE.a(b, cg.f());
        this.bE.a(c, (byte)0);
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(30.0);
    }

    @Override
    protected o F() {
        return new ab(this, this);
    }

    public static void a(net.minecraft.u.a.a a2) {
        net.minecraft.w.f.a(a2, "Shulker");
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.bE.b(a, net.minecraft.u.ad.a(e2.f("AttachFace")));
        this.bE.b(c, e2.f("Peek"));
        if (e2.e("APX")) {
            int n2 = e2.h("APX");
            int n3 = e2.h("APY");
            int n4 = e2.h("APZ");
            this.bE.b(b, cg.b(new net.minecraft.u.b.b(n2, n3, n4)));
        } else {
            this.bE.b(b, cg.f());
        }
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("AttachFace", (byte)((ad)this.bE.a(a)).b());
        e2.a("Peek", (Byte)this.bE.a(c));
        net.minecraft.u.b.b b2 = this.q();
        if (b2 != null) {
            e2.a("APX", b2.cy_());
            e2.a("APY", b2.k());
            e2.a("APZ", b2.l());
        }
    }

    @Override
    public void cE_() {
        float f2;
        super.cE_();
        net.minecraft.u.b.b b2 = (net.minecraft.u.b.b)((cg)this.bE.a(b)).d();
        if (b2 == null && !this.aQ.C) {
            b2 = new net.minecraft.u.b.b(this);
            this.bE.b(b, cg.b(b2));
        }
        if (this.cz()) {
            b2 = null;
            this.ba = f2 = this.df().ba;
            this.ak = f2;
            this.al = f2;
            this.i = 0;
        } else if (!this.aQ.C) {
            net.minecraft.u.b.b b3;
            Object object;
            net.minecraft.g.c.b b4 = this.aQ.n(b2);
            if (b4.d() != net.minecraft.g.a.h.a) {
                if (b4.c() == net.minecraft.a.p.M) {
                    object = (ad)((Object)b4.a(id.o));
                    b2 = b2.a((ad)object);
                    this.bE.b(b, cg.b(b2));
                } else if (b4.c() == net.minecraft.a.p.K) {
                    object = (ad)((Object)b4.a(co.o));
                    b2 = b2.a((ad)object);
                    this.bE.b(b, cg.b(b2));
                } else {
                    this.c();
                }
            }
            if (!this.aQ.d((net.minecraft.u.b.b)(object = b2.a(this.p())), false)) {
                boolean bl2 = false;
                for (ad ad2 : net.minecraft.u.ad.values()) {
                    object = b2.a(ad2);
                    if (!this.aQ.d((net.minecraft.u.b.b)object, false)) continue;
                    this.bE.b(a, ad2);
                    bl2 = true;
                    break;
                }
                if (!bl2) {
                    this.c();
                }
            }
            if (this.aQ.d(b3 = b2.a(this.p().e()), false)) {
                this.c();
            }
        }
        f2 = (float)this.r() * 0.01f;
        this.f = this.g;
        if (this.g > f2) {
            this.g = net.minecraft.u.b.n.a(this.g - 0.05f, f2, 1.0f);
        } else if (this.g < f2) {
            this.g = net.minecraft.u.b.n.a(this.g + 0.05f, 0.0f, f2);
        }
        if (b2 != null) {
            List list;
            if (this.aQ.C) {
                if (this.i > 0 && this.h != null) {
                    --this.i;
                } else {
                    this.h = b2;
                }
            }
            this.aU = (double)b2.cy_() + 0.5;
            this.aV = b2.k();
            this.aW = (double)b2.l() + 0.5;
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            this.br = this.aU;
            this.bs = this.aV;
            this.bt = this.aW;
            double d2 = 0.5 - (double)net.minecraft.u.b.n.a((0.5f + this.g) * (float)Math.PI) * 0.5;
            double d3 = 0.5 - (double)net.minecraft.u.b.n.a((0.5f + this.f) * (float)Math.PI) * 0.5;
            double d4 = d2 - d3;
            double d5 = 0.0;
            double d6 = 0.0;
            double d7 = 0.0;
            ad ad3 = this.p();
            switch (ad3) {
                case a: {
                    this.a(new net.minecraft.u.b.a(this.aU - 0.5, this.aV, this.aW - 0.5, this.aU + 0.5, this.aV + 1.0 + d2, this.aW + 0.5));
                    d6 = d4;
                    break;
                }
                case b: {
                    this.a(new net.minecraft.u.b.a(this.aU - 0.5, this.aV - d2, this.aW - 0.5, this.aU + 0.5, this.aV + 1.0, this.aW + 0.5));
                    d6 = -d4;
                    break;
                }
                case c: {
                    this.a(new net.minecraft.u.b.a(this.aU - 0.5, this.aV, this.aW - 0.5, this.aU + 0.5, this.aV + 1.0, this.aW + 0.5 + d2));
                    d7 = d4;
                    break;
                }
                case d: {
                    this.a(new net.minecraft.u.b.a(this.aU - 0.5, this.aV, this.aW - 0.5 - d2, this.aU + 0.5, this.aV + 1.0, this.aW + 0.5));
                    d7 = -d4;
                    break;
                }
                case e: {
                    this.a(new net.minecraft.u.b.a(this.aU - 0.5, this.aV, this.aW - 0.5, this.aU + 0.5 + d2, this.aV + 1.0, this.aW + 0.5));
                    d5 = d4;
                    break;
                }
                case f: {
                    this.a(new net.minecraft.u.b.a(this.aU - 0.5 - d2, this.aV, this.aW - 0.5, this.aU + 0.5, this.aV + 1.0, this.aW + 0.5));
                    d5 = -d4;
                }
            }
            if (d4 > 0.0 && !(list = this.aQ.b((n)this, this.cT())).isEmpty()) {
                for (n n2 : list) {
                    if (n2 instanceof as || n2.bv) continue;
                    n2.b(d5, d6, d7);
                }
            }
        }
    }

    @Override
    public void e(double d2, double d3, double d4) {
        super.e(d2, d3, d4);
        if (this.bE != null && this.by != 0) {
            cg cg2 = (cg)this.bE.a(b);
            cg cg3 = cg.b(new net.minecraft.u.b.b(d2, d3, d4));
            if (!cg3.equals(cg2)) {
                this.bE.b(b, cg3);
                this.bE.b(c, (byte)0);
                this.bO = true;
            }
        }
    }

    protected boolean c() {
        if (!this.aT() && this.br()) {
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this);
            for (int i2 = 0; i2 < 5; ++i2) {
                net.minecraft.u.b.b b3 = b2.a(8 - this.bx.nextInt(17), 8 - this.bx.nextInt(17), 8 - this.bx.nextInt(17));
                if (b3.k() <= 0 || !this.aQ.c(b3) || !this.aQ.a(this.aQ.V(), (n)this) || !this.aQ.a((n)this, new net.minecraft.u.b.a(b3)).isEmpty()) continue;
                boolean bl2 = false;
                for (ad ad2 : net.minecraft.u.ad.values()) {
                    if (!this.aQ.d(b3.a(ad2), false)) continue;
                    this.bE.b(a, ad2);
                    bl2 = true;
                    break;
                }
                if (!bl2) continue;
                this.a(net.minecraft.a.f.fo, 1.0f, 1.0f);
                this.bE.b(b, cg.b(b3));
                this.bE.b(c, (byte)0);
                this.c((l)null);
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public void n() {
        super.n();
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.al = 180.0f;
        this.ak = 180.0f;
        this.ba = 180.0f;
    }

    @Override
    public void a(g g2) {
        net.minecraft.u.b.b b2;
        if (b.equals(g2) && this.aQ.C && !this.cz() && (b2 = this.q()) != null) {
            if (this.h == null) {
                this.h = b2;
            } else {
                this.i = 6;
            }
            this.aU = (double)b2.cy_() + 0.5;
            this.aV = b2.k();
            this.aW = (double)b2.l() + 0.5;
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            this.br = this.aU;
            this.bs = this.aV;
            this.bt = this.aW;
        }
        super.a(g2);
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.aE = 0;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        n n3;
        if (this.y() && (n3 = n2.i()) instanceof net.minecraft.w.c.f) {
            return false;
        }
        if (super.a(n2, f2)) {
            if ((double)this.bo() < (double)this.bw() * 0.5 && this.bx.nextInt(4) == 0) {
                this.c();
            }
            return true;
        }
        return false;
    }

    private boolean y() {
        return this.r() == 0;
    }

    @Override
    public net.minecraft.u.b.a cj() {
        return this.br() ? this.cT() : null;
    }

    public ad p() {
        return (ad)this.bE.a(a);
    }

    public net.minecraft.u.b.b q() {
        return (net.minecraft.u.b.b)((cg)this.bE.a(b)).d();
    }

    public void g(net.minecraft.u.b.b b2) {
        this.bE.b(b, cg.c(b2));
    }

    public int r() {
        return ((Byte)this.bE.a(c)).byteValue();
    }

    public void b(int n2) {
        if (!this.aQ.C) {
            this.a(net.minecraft.w.d.g).c(e);
            if (n2 == 0) {
                this.a(net.minecraft.w.d.g).b(e);
                this.a(net.minecraft.a.f.fi, 1.0f, 1.0f);
            } else {
                this.a(net.minecraft.a.f.fm, 1.0f, 1.0f);
            }
        }
        this.bE.b(c, (byte)n2);
    }

    public float q(float f2) {
        return this.f + (this.g - this.f) * f2;
    }

    public int s() {
        return this.i;
    }

    public net.minecraft.u.b.b t() {
        return this.h;
    }

    @Override
    public float ce_() {
        return 0.5f;
    }

    @Override
    public int ao() {
        return 180;
    }

    @Override
    public int ap() {
        return 180;
    }

    @Override
    public void d(n n2) {
    }

    @Override
    public float cu() {
        return 0.0f;
    }

    public boolean v() {
        return this.h != null && this.q() != null;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.y;
    }

    static /* synthetic */ Random a(as as2) {
        return as2.bx;
    }
}

