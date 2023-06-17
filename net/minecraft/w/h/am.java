/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.g.ex;
import net.minecraft.i.i;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.b.q;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.ah;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.d;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.h.ae;
import net.minecraft.w.h.e;
import net.minecraft.w.h.h;
import net.minecraft.w.h.j;
import net.minecraft.w.h.s;
import net.minecraft.w.h.y;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class am
extends y {
    private static final g b = net.minecraft.x.a.o.a(am.class, net.minecraft.x.a.q.b);
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;

    public am(net.minecraft.q.k k2) {
        super(k2);
        this.d(0.4f, 0.5f);
        this.m = new ae(this, this);
        this.l = new net.minecraft.w.h.n(this);
        this.c(0.0);
    }

    @Override
    protected void cA_() {
        this.o.a(1, new av(this));
        this.o.a(1, new net.minecraft.w.h.t(this, 2.2));
        this.o.a(2, new net.minecraft.w.b.k(this, 0.8));
        this.o.a(3, new net.minecraft.w.b.e((t)this, 1.0, net.minecraft.a.w.cb, false));
        this.o.a(3, new net.minecraft.w.b.e((t)this, 1.0, net.minecraft.a.w.cg, false));
        this.o.a(3, new net.minecraft.w.b.e((t)this, 1.0, cg.a(net.minecraft.a.p.N), false));
        this.o.a(4, new s(this, b.class, 8.0f, 2.2, 2.2));
        this.o.a(4, new s(this, e.class, 10.0f, 2.2, 2.2));
        this.o.a(4, new s(this, k.class, 4.0f, 2.2, 2.2));
        this.o.a(5, new h(this));
        this.o.a(6, new az(this, 0.6));
        this.o.a(11, new ap(this, b.class, 10.0f));
    }

    @Override
    protected float bG() {
        if (!(this.bf || this.l.a() && !(this.l.e() <= this.aV + 0.5))) {
            i i2 = this.n.j();
            if (i2 != null && i2.e() < i2.d()) {
                net.minecraft.u.b.s s2 = i2.a(this);
                if (s2.c > this.aV) {
                    return 0.5f;
                }
            }
            return this.l.b() <= 0.6 ? 0.2f : 0.3f;
        }
        return 0.5f;
    }

    @Override
    protected void aj() {
        double d2;
        super.aj();
        double d3 = this.l.b();
        if (d3 > 0.0 && (d2 = this.aX * this.aX + this.aZ * this.aZ) < 0.010000000000000002) {
            this.a(0.0f, 1.0f, 0.1f, false);
        }
        if (!this.aQ.C) {
            this.aQ.a((n)this, (byte)1);
        }
    }

    public float q(float f2) {
        return this.d == 0 ? 0.0f : ((float)this.c + f2) / (float)this.d;
    }

    public void c(double d2) {
        this.N().a(d2);
        this.l.a(this.l.d(), this.l.e(), this.l.f(), d2);
    }

    @Override
    public void i(boolean bl2) {
        super.i(bl2);
        if (bl2) {
            this.a(this.q(), this.bE(), ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
    }

    public void p() {
        this.i(true);
        this.d = 10;
        this.c = 0;
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(b, 0);
    }

    @Override
    public void e() {
        if (this.f > 0) {
            --this.f;
        }
        if (this.g > 0) {
            this.g -= this.bx.nextInt(3);
            if (this.g < 0) {
                this.g = 0;
            }
        }
        if (this.be) {
            Object object;
            if (!this.e) {
                this.i(false);
                this.do();
            }
            if (this.r() == 99 && this.f == 0 && (object = this.W()) != null && this.n((n)object) < 16.0) {
                this.a(((l)object).aU, ((l)object).aW);
                this.l.a(((l)object).aU, ((l)object).aV, ((l)object).aW, this.l.b());
                this.p();
                this.e = true;
            }
            if (!((ae)(object = (ae)this.m)).c()) {
                if (this.l.a() && this.f == 0) {
                    i i2 = this.n.j();
                    net.minecraft.u.b.s s2 = new net.minecraft.u.b.s(this.l.d(), this.l.e(), this.l.f());
                    if (i2 != null && i2.e() < i2.d()) {
                        s2 = i2.a(this);
                    }
                    this.a(s2.b, s2.d);
                    this.p();
                }
            } else if (!((ae)object).d()) {
                this.t();
            }
        }
        this.e = this.be;
    }

    @Override
    public void co() {
    }

    private void a(double d2, double d3) {
        this.ba = (float)(net.minecraft.u.b.n.b(d3 - this.aW, d2 - this.aU) * 57.29577951308232) - 90.0f;
    }

    private void t() {
        ((ae)this.m).a(true);
    }

    private void z() {
        ((ae)this.m).a(false);
    }

    private void E() {
        this.f = this.l.b() < 2.2 ? 10 : 1;
    }

    private void do() {
        this.E();
        this.z();
    }

    @Override
    public void n() {
        super.n();
        if (this.c != this.d) {
            ++this.c;
        } else if (this.d != 0) {
            this.c = 0;
            this.d = 0;
            this.i(false);
        }
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(3.0);
        this.a(net.minecraft.w.d.d).a(0.3f);
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Rabbit");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("RabbitType", this.r());
        e2.a("MoreCarrotTicks", this.g);
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.b(e2.h("RabbitType"));
        this.g = e2.h("MoreCarrotTicks");
    }

    protected bv q() {
        return net.minecraft.a.f.eE;
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.eA;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.eD;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.eC;
    }

    @Override
    public boolean j(n n2) {
        if (this.r() == 99) {
            this.a(net.minecraft.a.f.eB, 1.0f, (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            return n2.a(net.minecraft.u.n.a(this), 8.0f);
        }
        return n2.a(net.minecraft.u.n.a(this), 3.0f);
    }

    @Override
    public bu S() {
        return this.r() == 99 ? net.minecraft.u.bu.f : net.minecraft.u.bu.g;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        return this.b(n2) ? false : super.a(n2, f2);
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.B;
    }

    private boolean a(cg cg2) {
        return cg2 == net.minecraft.a.w.cb || cg2 == net.minecraft.a.w.cg || cg2 == cg.a(net.minecraft.a.p.N);
    }

    public am a(ah ah2) {
        am am2 = new am(this.aQ);
        int n2 = this.dp();
        if (this.bx.nextInt(20) != 0) {
            n2 = ah2 instanceof am && this.bx.nextBoolean() ? ((am)ah2).r() : this.r();
        }
        am2.b(n2);
        return am2;
    }

    @Override
    public boolean a(cu cu2) {
        return cu2 != null && this.a(cu2.a());
    }

    public int r() {
        return (Integer)this.bE.a(b);
    }

    public void b(int n2) {
        if (n2 == 99) {
            this.a(net.minecraft.w.d.g).a(8.0);
            this.o.a(4, new j(this));
            this.p.a(1, new ba((t)this, false, new Class[0]));
            this.p.a(2, new net.minecraft.w.b.y((t)this, b.class, true));
            this.p.a(2, new net.minecraft.w.b.y((t)this, e.class, true));
            if (!this.bO_()) {
                this.g(net.minecraft.u.d.b.a.a("entity.KillerBunny.name"));
            }
        }
        this.bE.b(b, n2);
    }

    @Override
    public ac a(z z2, ac ac2) {
        ac2 = super.a(z2, ac2);
        int n2 = this.dp();
        boolean bl2 = false;
        if (ac2 instanceof net.minecraft.w.h.d) {
            n2 = ((net.minecraft.w.h.d)ac2).a;
            bl2 = true;
        } else {
            ac2 = new net.minecraft.w.h.d(n2);
        }
        this.b(n2);
        if (bl2) {
            this.e(-24000);
        }
        return ac2;
    }

    private int dp() {
        q q2 = this.aQ.a(new net.minecraft.u.b.b(this));
        int n2 = this.bx.nextInt(100);
        return q2.p() ? (n2 < 80 ? 1 : 3) : (q2 instanceof net.minecraft.q.b.j ? 4 : (n2 < 50 ? 0 : (n2 < 90 ? 5 : 2)));
    }

    private boolean dq() {
        return this.g == 0;
    }

    protected void s() {
        ex ex2 = (ex)net.minecraft.a.p.cb;
        net.minecraft.g.c.b b2 = ex2.b(ex2.e());
        this.aQ.a(net.minecraft.u.aj.M, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, 0.0, 0.0, 0.0, cn.p(b2));
        this.g = 40;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 1) {
            this.cp();
            this.d = 10;
            this.c = 0;
        } else {
            super.a(by2);
        }
    }

    @Override
    public void a(g g2) {
        super.a(g2);
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.a(ah2);
    }

    static /* synthetic */ boolean a(am am2) {
        return am2.dq();
    }

    static /* synthetic */ boolean b(am am2) {
        return am2.aA;
    }

    static /* synthetic */ net.minecraft.w.b.t c(am am2) {
        return am2.m;
    }
}

