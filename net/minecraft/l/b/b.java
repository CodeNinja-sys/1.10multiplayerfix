/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.client.r;
import net.minecraft.d.j;
import net.minecraft.e.q;
import net.minecraft.l.b.a;
import net.minecraft.l.b.c;
import net.minecraft.l.b.d;
import net.minecraft.l.b.e;
import net.minecraft.l.b.f;
import net.minecraft.l.b.g;
import net.minecraft.l.b.h;
import net.minecraft.l.i;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.z;
import net.minecraft.u.bv;
import net.minecraft.w.ac;
import net.minecraft.w.ah;
import net.minecraft.w.aj;
import net.minecraft.w.b.ao;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bi;
import net.minecraft.w.b.u;
import net.minecraft.w.e.aw;
import net.minecraft.w.f.ae;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b
extends ah
implements aj,
net.minecraft.w.g {
    public static boolean a = false;
    private static final net.minecraft.x.a.g x = net.minecraft.x.a.o.a(b.class, net.minecraft.x.a.q.b);
    private int y;
    private boolean z;
    private boolean A;
    net.minecraft.b.g b;
    private net.minecraft.w.a.b B;
    private net.minecraft.b.d C;
    private int D;
    private boolean E;
    private boolean F;
    private int G;
    private String H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private final net.minecraft.h.e M = new net.minecraft.h.e("Items", false, 8);
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public static final int f = 300;
    public boolean g = true;
    public boolean h = false;
    public float i = 1.0f;
    private static final g[][][][] N = new g[][][][]{{{{new h(net.minecraft.a.w.Q, new d(18, 22)), new h(net.minecraft.a.w.cc, new d(15, 19)), new h(net.minecraft.a.w.cb, new d(15, 19)), new c(net.minecraft.a.w.R, new d(-4, -2))}, {new h(cg.a(net.minecraft.a.p.aU), new d(8, 13)), new c(net.minecraft.a.w.ck, new d(-3, -2))}, {new h(cg.a(net.minecraft.a.p.bk), new d(7, 12)), new c(net.minecraft.a.w.e, new d(-5, -7))}, {new c(net.minecraft.a.w.bj, new d(-6, -10)), new c(net.minecraft.a.w.bg, new d(1, 1))}}, {{new h(net.minecraft.a.w.H, new d(15, 20)), new h(net.minecraft.a.w.j, new d(16, 24)), new f(net.minecraft.a.w.bb, new d(6, 6), net.minecraft.a.w.bc, new d(6, 6))}, {new a(net.minecraft.a.w.aY, new d(7, 8))}}, {{new h(cg.a(net.minecraft.a.p.L), new d(16, 22)), new c(net.minecraft.a.w.bl, new d(3, 4))}, {new c(new cu(cg.a(net.minecraft.a.p.L)), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 1), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 2), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 3), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 4), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 5), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 6), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 7), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 8), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 9), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 10), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 11), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 12), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 13), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 14), new d(1, 2)), new c(new cu(cg.a(net.minecraft.a.p.L), 1, 15), new d(1, 2))}}, {{new h(net.minecraft.a.w.H, new d(15, 20)), new c(net.minecraft.a.w.g, new d(-12, -8))}, {new c(net.minecraft.a.w.f, new d(2, 3)), new f(cg.a(net.minecraft.a.p.n), new d(10, 10), net.minecraft.a.w.am, new d(6, 10))}}}, {{{new h(net.minecraft.a.w.aR, new d(24, 36)), new net.minecraft.l.b.i()}, {new h(net.minecraft.a.w.aS, new d(8, 10)), new c(net.minecraft.a.w.aX, new d(10, 12)), new c(cg.a(net.minecraft.a.p.X), new d(3, 4))}, {new h(net.minecraft.a.w.bX, new d(2, 2)), new c(net.minecraft.a.w.aZ, new d(10, 12)), new c(cg.a(net.minecraft.a.p.w), new d(-5, -3))}, {new net.minecraft.l.b.i()}, {new net.minecraft.l.b.i()}, {new c(net.minecraft.a.w.cy, new d(20, 22))}}}, {{{new h(net.minecraft.a.w.bA, new d(36, 40)), new h(net.minecraft.a.w.m, new d(8, 10))}, {new c(net.minecraft.a.w.aE, new d(-4, -1)), new c(new cu(net.minecraft.a.w.bd, 1, cd.l.c()), new d(-2, -1))}, {new c(net.minecraft.a.w.bB, new d(4, 7)), new c(cg.a(net.minecraft.a.p.aX), new d(-3, -1))}, {new c(net.minecraft.a.w.bU, new d(3, 11))}}}, {{{new h(net.minecraft.a.w.j, new d(16, 24)), new c(net.minecraft.a.w.aa, new d(4, 6))}, {new h(net.minecraft.a.w.l, new d(7, 9)), new c(net.minecraft.a.w.ab, new d(10, 14))}, {new h(net.minecraft.a.w.k, new d(3, 4)), new a(net.minecraft.a.w.af, new d(16, 19))}, {new c(net.minecraft.a.w.Z, new d(5, 7)), new c(net.minecraft.a.w.Y, new d(9, 11)), new c(net.minecraft.a.w.W, new d(5, 7)), new c(net.minecraft.a.w.X, new d(11, 15))}}, {{new h(net.minecraft.a.w.j, new d(16, 24)), new c(net.minecraft.a.w.c, new d(6, 8))}, {new h(net.minecraft.a.w.l, new d(7, 9)), new a(net.minecraft.a.w.n, new d(9, 10))}, {new h(net.minecraft.a.w.k, new d(3, 4)), new a(net.minecraft.a.w.w, new d(12, 15)), new a(net.minecraft.a.w.z, new d(9, 12))}}, {{new h(net.minecraft.a.w.j, new d(16, 24)), new a(net.minecraft.a.w.a, new d(5, 7))}, {new h(net.minecraft.a.w.l, new d(7, 9)), new a(net.minecraft.a.w.b, new d(9, 11))}, {new h(net.minecraft.a.w.k, new d(3, 4)), new a(net.minecraft.a.w.y, new d(12, 15))}}}, {{{new h(net.minecraft.a.w.an, new d(14, 18)), new h(net.minecraft.a.w.br, new d(14, 18))}, {new h(net.minecraft.a.w.j, new d(16, 24)), new c(net.minecraft.a.w.ao, new d(-7, -5)), new c(net.minecraft.a.w.bs, new d(-8, -6))}}, {{new h(net.minecraft.a.w.aM, new d(9, 12)), new c(net.minecraft.a.w.U, new d(2, 4))}, {new a(net.minecraft.a.w.T, new d(7, 12))}, {new c(net.minecraft.a.w.aC, new d(8, 10))}}}};

    public b(k k2) {
        this(k2, 0);
    }

    public b(k k2, boolean bl2) {
        this(k2, 0);
        this.h = bl2;
    }

    public b(k k2, int n2) {
        super(k2);
        this.d(0.6f, 1.95f);
        ((net.minecraft.i.a)this.N()).a(true);
        this.f(true);
        this.e = 300;
        this.cA_();
    }

    @Override
    protected void cA_() {
        this.o.a(0, new av(this));
        this.o.a(1, new bi(this, net.minecraft.w.e.d.class, 8.0f, 0.6, 0.6));
        this.o.a(2, new ao(this));
        this.o.a(3, new net.minecraft.w.b.aj(this));
        this.o.a(4, new net.minecraft.w.b.a(this, true));
        if (!this.h) {
            this.o.a(5, new net.minecraft.w.b.n(this, 0.6));
        }
        this.o.a(9, new u(this, net.minecraft.w.a.b.class, 3.0f, 1.0f));
        this.o.a(9, new az(this, 0.6));
        this.o.a(10, new ap(this, net.minecraft.w.f.class, 8.0f));
    }

    private void do() {
    }

    @Override
    protected void cG_() {
        super.cG_();
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.d).a(0.5);
    }

    @Override
    protected void e() {
        if (--this.y <= 0) {
            Object object = new net.minecraft.u.b.b(this);
            this.aQ.U().a((net.minecraft.u.b.b)object);
            this.y = 70 + this.bx.nextInt(50);
            this.b = this.aQ.U().a((net.minecraft.u.b.b)object, 32);
            if (this.b == null) {
                this.dl();
            } else {
                net.minecraft.u.b.b b2 = this.b.a();
                this.a(b2, this.b.b());
                if (this.K) {
                    this.K = false;
                    this.b.b(5);
                }
            }
        }
        if (!this.t() && this.D > 0) {
            --this.D;
            if (this.D <= 0) {
                if (this.E) {
                    for (Object object : this.C) {
                        if (!((net.minecraft.b.b)object).h()) continue;
                        ((net.minecraft.b.b)object).a(this.bx.nextInt(6) + this.bx.nextInt(6) + 2);
                    }
                    this.dp();
                    this.E = false;
                    if (this.b != null && this.H != null) {
                        this.aQ.a((n)this, (byte)14);
                        this.b.a(this.H, 1);
                    }
                }
                this.c(new j(net.minecraft.a.c.j, 200, 0));
            }
        }
        super.e();
        this.f();
        this.g();
        if (net.minecraft.client.r.I != null && !net.minecraft.client.r.I.s && !a) {
            this.aa();
        }
    }

    public void f() {
        if (net.minecraft.client.r.I.l != null && this.V().a(net.minecraft.client.r.I.l)) {
            this.I().a(net.minecraft.client.r.I.l.aU, net.minecraft.client.r.I.l.aV + (double)net.minecraft.client.r.I.l.ce_(), net.minecraft.client.r.I.l.aW, this.ap(), this.ao());
            ++this.c;
        } else if (this.c <= 100) {
            this.c = 0;
        }
        if (this.h) {
            return;
        }
        if (this.g && net.minecraft.client.r.I.l != null && net.minecraft.client.r.I.v == null && this.V().a(net.minecraft.client.r.I.l) && this.n(net.minecraft.client.r.I.l) < 8.0) {
            net.minecraft.client.r.I.v = new net.minecraft.l.b(this, net.minecraft.client.r.I.j);
            this.k(0.0, 0.0, 0.0);
        }
        if (net.minecraft.client.r.I.l != null && this.c > 100 && net.minecraft.client.r.I.v == null) {
            this.N().a(net.minecraft.client.r.I.l.aU, net.minecraft.client.r.I.l.aV, net.minecraft.client.r.I.l.aW, this.i);
        }
    }

    public void g() {
        if (this.d >= this.e) {
            if (net.minecraft.client.r.I.l != null && net.minecraft.client.r.I.l.m(this) < 32.0f) {
                int n2 = 1 + new Random().nextInt(3);
                net.minecraft.l.i.b(n2);
                net.minecraft.l.i.a(n2);
            }
            this.e = 300 + new Random().nextInt(100) - 50;
            this.d = 0;
        }
        ++this.d;
    }

    @Override
    public boolean a(net.minecraft.w.a.b b2, net.minecraft.u.ah ah2, cu cu2) {
        return false;
    }

    @Override
    protected void cb_() {
        super.cb_();
    }

    public static void a(net.minecraft.u.a.a a2) {
        net.minecraft.w.f.a(a2, "Villager");
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new net.minecraft.u.a.b.e("Villager", new String[]{"Inventory"}));
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new e());
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Profession", this.p());
        e2.a("Riches", this.G);
        e2.a("Career", this.I);
        e2.a("CareerLevel", this.J);
        e2.a("Willing", this.F);
        if (this.C != null) {
            e2.a("Offers", this.C.a());
        }
        q q2 = new q();
        for (int i2 = 0; i2 < this.M.e(); ++i2) {
            cu cu2 = this.M.a(i2);
            if (cu2 == null) continue;
            q2.a(cu2.b(new net.minecraft.e.e()));
        }
        e2.a("Inventory", q2);
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        net.minecraft.e.a a2;
        super.b(e2);
        this.a(e2.h("Profession"));
        this.G = e2.h("Riches");
        this.I = e2.h("Career");
        this.J = e2.h("CareerLevel");
        this.F = e2.p("Willing");
        if (e2.b("Offers", 10)) {
            a2 = e2.o("Offers");
            this.C = new net.minecraft.b.d((net.minecraft.e.e)a2);
        }
        a2 = e2.c("Inventory", 10);
        for (int i2 = 0; i2 < ((q)a2).e(); ++i2) {
            cu cu2 = cu.a(((q)a2).b(i2));
            if (cu2 == null) continue;
            this.M.a(cu2);
        }
        this.f(true);
        this.do();
    }

    @Override
    protected boolean i() {
        return false;
    }

    @Override
    protected bv j() {
        return this.t() ? net.minecraft.a.f.gJ : net.minecraft.a.f.gF;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.gH;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.gG;
    }

    public void a(int n2) {
        this.bE.b(x, n2);
    }

    public int p() {
        return Math.max((Integer)this.bE.a(x) % 5, 0);
    }

    public boolean q() {
        return this.z;
    }

    public void a(boolean bl2) {
        this.z = bl2;
    }

    public void c(boolean bl2) {
        this.A = bl2;
    }

    public boolean r() {
        return this.A;
    }

    @Override
    public void a(l l2) {
        super.a(l2);
        if (this.b != null && l2 != null) {
            this.b.a(l2);
            if (l2 instanceof net.minecraft.w.a.b) {
                int n2 = -1;
                if (this.ba()) {
                    n2 = -3;
                }
                this.b.a(l2.X(), n2);
                if (this.br()) {
                    this.aQ.a((n)this, (byte)13);
                }
            }
        }
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        if (this.b != null) {
            n n3 = n2.j();
            if (n3 != null) {
                if (n3 instanceof net.minecraft.w.a.b) {
                    this.b.a(n3.X(), -2);
                } else if (n3 instanceof aw) {
                    this.b.h();
                }
            } else {
                net.minecraft.w.a.b b2 = this.aQ.a((n)this, 16.0);
                if (b2 != null) {
                    this.b.h();
                }
            }
        }
        super.a(n2);
    }

    @Override
    public void a(net.minecraft.w.a.b b2) {
        this.B = b2;
    }

    @Override
    public net.minecraft.w.a.b s() {
        return this.B;
    }

    public boolean t() {
        return this.B != null;
    }

    public boolean d(boolean bl2) {
        if (!this.F && bl2 && this.x()) {
            boolean bl3 = false;
            for (int i2 = 0; i2 < this.M.e(); ++i2) {
                cu cu2 = this.M.a(i2);
                if (cu2 != null) {
                    if (cu2.a() == net.minecraft.a.w.R && cu2.b >= 3) {
                        bl3 = true;
                        this.M.a(i2, 3);
                    } else if ((cu2.a() == net.minecraft.a.w.cc || cu2.a() == net.minecraft.a.w.cb) && cu2.b >= 12) {
                        bl3 = true;
                        this.M.a(i2, 12);
                    }
                }
                if (!bl3) continue;
                this.aQ.a((n)this, (byte)18);
                this.F = true;
                break;
            }
        }
        return this.F;
    }

    public void e(boolean bl2) {
        this.F = bl2;
    }

    @Override
    public void a(net.minecraft.b.b b2) {
        b2.g();
        this.j = -this.ac();
        this.a(net.minecraft.a.f.gK, this.bE(), this.bF());
        int n2 = 3 + this.bx.nextInt(4);
        if (b2.e() == 1 || this.bx.nextInt(5) == 0) {
            this.D = 40;
            this.E = true;
            this.F = true;
            this.H = this.B != null ? this.B.X() : null;
            n2 += 5;
        }
        if (b2.a().a() == net.minecraft.a.w.bY) {
            this.G += b2.a().b;
        }
        if (b2.j()) {
            this.aQ.a(new net.minecraft.w.f.e(this.aQ, this.aU, this.aV + 0.5, this.aW, n2));
        }
    }

    @Override
    public void a(cu cu2) {
        if (!this.aQ.C && this.j > -this.ac() + 20) {
            this.j = -this.ac();
            if (cu2 != null) {
                this.a(net.minecraft.a.f.gK, this.bE(), this.bF());
            } else {
                this.a(net.minecraft.a.f.gI, this.bE(), this.bF());
            }
        }
    }

    @Override
    public net.minecraft.b.d b(net.minecraft.w.a.b b2) {
        if (this.C == null) {
            this.dp();
        }
        return this.C;
    }

    private void dp() {
        g[][][] arrg = N[this.p()];
        if (this.I != 0 && this.J != 0) {
            ++this.J;
        } else {
            this.I = this.bx.nextInt(arrg.length) + 1;
            this.J = 1;
        }
        if (this.C == null) {
            this.C = new net.minecraft.b.d();
        }
        int n2 = this.I - 1;
        int n3 = this.J - 1;
        g[][] arrg2 = arrg[n2];
        if (n3 >= 0 && n3 < arrg2.length) {
            g[] arrg3;
            g[] arrg4 = arrg3 = arrg2[n3];
            int n4 = arrg3.length;
            for (int i2 = 0; i2 < n4; ++i2) {
                g g2 = arrg4[i2];
                g2.a(this.C, this.bx);
            }
        }
    }

    @Override
    public void a(net.minecraft.b.d d2) {
    }

    @Override
    public net.minecraft.u.d.a aK() {
        net.minecraft.j.i i2 = this.aA();
        String string = this.cP();
        if (string != null && !string.isEmpty()) {
            net.minecraft.u.d.k k2 = new net.minecraft.u.d.k(net.minecraft.j.d.a(i2, string));
            k2.a().a(this.cS());
            k2.a().a(this.cN());
            return k2;
        }
        if (this.C == null) {
            this.dp();
        }
        String string2 = null;
        switch (this.p()) {
            case 0: {
                if (this.I == 1) {
                    string2 = "farmer";
                    break;
                }
                if (this.I == 2) {
                    string2 = "fisherman";
                    break;
                }
                if (this.I == 3) {
                    string2 = "shepherd";
                    break;
                }
                if (this.I != 4) break;
                string2 = "fletcher";
                break;
            }
            case 1: {
                string2 = "librarian";
                break;
            }
            case 2: {
                string2 = "cleric";
                break;
            }
            case 3: {
                if (this.I == 1) {
                    string2 = "armor";
                    break;
                }
                if (this.I == 2) {
                    string2 = "weapon";
                    break;
                }
                if (this.I != 3) break;
                string2 = "tool";
                break;
            }
            case 4: {
                if (this.I == 1) {
                    string2 = "butcher";
                    break;
                }
                if (this.I != 2) break;
                string2 = "leather";
            }
        }
        if (string2 != null) {
            net.minecraft.u.d.l l2 = new net.minecraft.u.d.l("entity.Villager." + string2, new Object[0]);
            l2.a().a(this.cS());
            l2.a().a(this.cN());
            if (i2 != null) {
                l2.a().a(i2.l());
            }
            return l2;
        }
        return super.aK();
    }

    @Override
    public float ce_() {
        return this.ba() ? 0.81f : 1.62f;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 12) {
            this.a(net.minecraft.u.aj.I);
        } else if (by2 == 13) {
            this.a(net.minecraft.u.aj.u);
        } else if (by2 == 14) {
            this.a(net.minecraft.u.aj.v);
        } else {
            super.a(by2);
        }
    }

    private void a(net.minecraft.u.aj aj2) {
        for (int i2 = 0; i2 < 5; ++i2) {
            double d2 = this.bx.nextGaussian() * 0.02;
            double d3 = this.bx.nextGaussian() * 0.02;
            double d4 = this.bx.nextGaussian() * 0.02;
            this.aQ.a(aj2, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 1.0 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public ac a(z z2, ac ac2) {
        ac2 = super.a(z2, ac2);
        this.do();
        return ac2;
    }

    public void v() {
        this.K = true;
    }

    public b a(ah ah2) {
        b b2 = new b(this.aQ);
        b2.a(this.aQ.C(new net.minecraft.u.b.b(b2)), null);
        return b2;
    }

    @Override
    public boolean c(net.minecraft.w.a.b b2) {
        return false;
    }

    @Override
    public void a(net.minecraft.w.g.a a2) {
        if (!this.aQ.C && !this.bk) {
            net.minecraft.w.e.u u2 = new net.minecraft.w.e.u(this.aQ);
            u2.b(this.aU, this.aV, this.aW, this.ba, this.bb);
            u2.a(this.aQ.C(new net.minecraft.u.b.b(u2)), null);
            u2.g(this.aT());
            if (this.bO_()) {
                u2.g(this.cP());
                u2.q(this.cQ());
            }
            this.aQ.a(u2);
            this.aa();
        }
    }

    public net.minecraft.h.e w() {
        return this.M;
    }

    @Override
    protected void a(ae ae2) {
        cu cu2 = ae2.c();
        cg cg2 = cu2.a();
        if (this.a(cg2)) {
            cu cu3 = this.M.a(cu2);
            if (cu3 == null) {
                ae2.aa();
            } else {
                cu2.b = cu3.b;
            }
        }
    }

    private boolean a(cg cg2) {
        return cg2 == net.minecraft.a.w.R || cg2 == net.minecraft.a.w.cc || cg2 == net.minecraft.a.w.cb || cg2 == net.minecraft.a.w.Q || cg2 == net.minecraft.a.w.P || cg2 == net.minecraft.a.w.cV || cg2 == net.minecraft.a.w.cU;
    }

    public boolean x() {
        return this.b(1);
    }

    public boolean y() {
        return this.b(2);
    }

    public boolean z() {
        boolean bl2;
        boolean bl3 = bl2 = this.p() == 0;
        return bl2 ? !this.b(5) : !this.b(1);
    }

    private boolean b(int n2) {
        boolean bl2 = this.p() == 0;
        for (int i2 = 0; i2 < this.M.e(); ++i2) {
            cu cu2 = this.M.a(i2);
            if (cu2 == null) continue;
            if (cu2.a() == net.minecraft.a.w.R && cu2.b >= 3 * n2 || cu2.a() == net.minecraft.a.w.cc && cu2.b >= 12 * n2 || cu2.a() == net.minecraft.a.w.cb && cu2.b >= 12 * n2 || cu2.a() == net.minecraft.a.w.cV && cu2.b >= 12 * n2) {
                return true;
            }
            if (!bl2 || cu2.a() != net.minecraft.a.w.Q || cu2.b < 9 * n2) continue;
            return true;
        }
        return false;
    }

    public boolean E() {
        for (int i2 = 0; i2 < this.M.e(); ++i2) {
            cu cu2 = this.M.a(i2);
            if (cu2 == null || cu2.a() != net.minecraft.a.w.P && cu2.a() != net.minecraft.a.w.cc && cu2.a() != net.minecraft.a.w.cb && cu2.a() != net.minecraft.a.w.cU) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a_(int n2, cu cu2) {
        if (super.a_(n2, cu2)) {
            return true;
        }
        int n3 = n2 - 300;
        if (n3 >= 0 && n3 < this.M.e()) {
            this.M.a(n3, cu2);
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.a(ah2);
    }
}

