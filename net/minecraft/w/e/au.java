/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import com.a.a.b.cg;
import com.a.a.d.aad;
import java.util.Set;
import java.util.UUID;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;
import net.minecraft.w.b.aa;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.y;
import net.minecraft.w.d;
import net.minecraft.w.e.ai;
import net.minecraft.w.e.al;
import net.minecraft.w.e.b;
import net.minecraft.w.e.bm;
import net.minecraft.w.e.k;
import net.minecraft.w.e.q;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;

public class au
extends k {
    private static final UUID a = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
    private static final h b = new h(a, "Attacking speed boost", 0.15f, 0).a(false);
    private static final Set c = aad.e();
    private static final g d = net.minecraft.x.a.o.a(au.class, net.minecraft.x.a.q.g);
    private static final g e = net.minecraft.x.a.o.a(au.class, net.minecraft.x.a.q.h);
    private int f;
    private int g;

    static {
        c.add(net.minecraft.a.p.c);
        c.add(net.minecraft.a.p.d);
        c.add(net.minecraft.a.p.m);
        c.add(net.minecraft.a.p.n);
        c.add(net.minecraft.a.p.N);
        c.add(net.minecraft.a.p.O);
        c.add(net.minecraft.a.p.P);
        c.add(net.minecraft.a.p.Q);
        c.add(net.minecraft.a.p.W);
        c.add(net.minecraft.a.p.aK);
        c.add(net.minecraft.a.p.aL);
        c.add(net.minecraft.a.p.aU);
        c.add(net.minecraft.a.p.bk);
        c.add(net.minecraft.a.p.bw);
        c.add(net.minecraft.a.p.aV);
    }

    public au(net.minecraft.q.k k2) {
        super(k2);
        this.d(0.6f, 2.9f);
        this.bu = 1.0f;
        this.a(net.minecraft.i.h.g, -1.0f);
    }

    @Override
    protected void cA_() {
        this.o.a(0, new av(this));
        this.o.a(2, new aa(this, 1.0, false));
        this.o.a(7, new az(this, 1.0));
        this.o.a(8, new ap(this, net.minecraft.w.a.b.class, 8.0f));
        this.o.a(8, new bh(this));
        this.o.a(10, new al(this));
        this.o.a(11, new ai(this));
        this.p.a(1, new b(this));
        this.p.a(2, new ba((t)this, false, new Class[0]));
        this.p.a(3, new y(this, q.class, 10, true, false, new bm(this)));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(40.0);
        this.a(net.minecraft.w.d.d).a(0.3f);
        this.a(net.minecraft.w.d.e).a(7.0);
        this.a(net.minecraft.w.d.b).a(64.0);
    }

    @Override
    public void c(l l2) {
        super.c(l2);
        i i2 = this.a(net.minecraft.w.d.d);
        if (l2 == null) {
            this.g = 0;
            this.bE.b(e, false);
            i2.c(b);
        } else {
            this.g = this.by;
            this.bE.b(e, true);
            if (!i2.a(b)) {
                i2.b(b);
            }
        }
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(d, cg.f());
        this.bE.a(e, false);
    }

    public void c() {
        if (this.by >= this.f + 400) {
            this.f = this.by;
            if (!this.ch()) {
                this.aQ.a(this.aU, this.aV + (double)this.ce_(), this.aW, net.minecraft.a.f.ba, this.S(), 2.5f, 1.0f, false);
            }
        }
    }

    @Override
    public void a(g g2) {
        if (e.equals(g2) && this.r() && this.aQ.C) {
            this.c();
        }
        super.a(g2);
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Enderman");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        net.minecraft.g.c.b b2 = this.q();
        if (b2 != null) {
            e2.a("carried", (short)cn.c(b2.c()));
            e2.a("carriedData", (short)b2.c().b(b2));
        }
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        net.minecraft.g.c.b b2 = e2.b("carried", 8) ? cn.a(e2.l("carried")).a(e2.g("carriedData") & 0xFFFF) : cn.d(e2.g("carried")).a(e2.g("carriedData") & 0xFFFF);
        if (b2 == null || b2.c() == null || b2.d() == net.minecraft.g.a.h.a) {
            b2 = null;
        }
        this.a(b2);
    }

    private boolean a(net.minecraft.w.a.b b2) {
        cu cu2 = b2.q.b[3];
        if (cu2 != null && cu2.a() == net.minecraft.m.cg.a(net.minecraft.a.p.aU)) {
            return false;
        }
        s s2 = b2.i(1.0f).a();
        s s3 = new s(this.aU - b2.aU, this.cT().b + (double)this.ce_() - (b2.aV + (double)b2.ce_()), this.aW - b2.aW);
        double d2 = s3.b();
        double d3 = s2.b(s3 = s3.a());
        return d3 > 1.0 - 0.025 / d2 ? b2.l(this) : false;
    }

    @Override
    public float ce_() {
        return 2.55f;
    }

    @Override
    public void n() {
        if (this.aQ.C) {
            for (int i2 = 0; i2 < 2; ++i2) {
                this.aQ.a(net.minecraft.u.aj.y, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm - 0.25, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, (this.bx.nextDouble() - 0.5) * 2.0, -this.bx.nextDouble(), (this.bx.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        }
        this.aA = false;
        super.n();
    }

    @Override
    protected void e() {
        float f2;
        if (this.cl()) {
            this.a(net.minecraft.u.n.g, 1.0f);
        }
        if (this.aQ.n() && this.by >= this.g + 600 && (f2 = this.n(1.0f)) > 0.5f && this.aQ.g(new net.minecraft.u.b.b(this)) && this.bx.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f) {
            this.c((l)null);
            this.p();
        }
        super.e();
    }

    protected boolean p() {
        double d2 = this.aU + (this.bx.nextDouble() - 0.5) * 64.0;
        double d3 = this.aV + (double)(this.bx.nextInt(64) - 32);
        double d4 = this.aW + (this.bx.nextDouble() - 0.5) * 64.0;
        return this.l(d2, d3, d4);
    }

    protected boolean b(n n2) {
        s s2 = new s(this.aU - n2.aU, this.cT().b + (double)(this.bm / 2.0f) - n2.aV + (double)n2.ce_(), this.aW - n2.aW);
        s2 = s2.a();
        double d2 = 16.0;
        double d3 = this.aU + (this.bx.nextDouble() - 0.5) * 8.0 - s2.b * 16.0;
        double d4 = this.aV + (double)(this.bx.nextInt(16) - 8) - s2.c * 16.0;
        double d5 = this.aW + (this.bx.nextDouble() - 0.5) * 8.0 - s2.d * 16.0;
        return this.l(d3, d4, d5);
    }

    private boolean l(double d2, double d3, double d4) {
        boolean bl2 = this.f(d2, d3, d4);
        if (bl2) {
            this.aQ.a(null, this.aR, this.aS, this.aT, net.minecraft.a.f.bb, this.S(), 1.0f, 1.0f);
            this.a(net.minecraft.a.f.bb, 1.0f, 1.0f);
        }
        return bl2;
    }

    @Override
    protected bv j() {
        return this.r() ? net.minecraft.a.f.aZ : net.minecraft.a.f.aW;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.aY;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.aX;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        net.minecraft.m.cg cg2;
        super.b(bl2, n2);
        net.minecraft.g.c.b b2 = this.q();
        if (b2 != null && (cg2 = net.minecraft.m.cg.a(b2.c())) != null) {
            int n3 = cg2.j() ? b2.c().b(b2) : 0;
            this.a(new cu(cg2, 1, n3), 0.0f);
        }
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.v;
    }

    public void a(net.minecraft.g.c.b b2) {
        this.bE.b(d, cg.c(b2));
    }

    public net.minecraft.g.c.b q() {
        return (net.minecraft.g.c.b)((cg)this.bE.a(d)).d();
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (n2 instanceof net.minecraft.u.q) {
            for (int i2 = 0; i2 < 64; ++i2) {
                if (!this.p()) continue;
                return true;
            }
            return false;
        }
        boolean bl2 = super.a(n2, f2);
        if (n2.e() && this.bx.nextInt(10) != 0) {
            this.p();
        }
        return bl2;
    }

    public boolean r() {
        return (Boolean)this.bE.a(e);
    }

    static /* synthetic */ boolean a(au au2, net.minecraft.w.a.b b2) {
        return au2.a(b2);
    }

    static /* synthetic */ Set s() {
        return c;
    }
}

