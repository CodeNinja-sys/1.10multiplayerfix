/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.d.j;
import net.minecraft.e.q;
import net.minecraft.h.e;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.z;
import net.minecraft.u.a.c;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.ah;
import net.minecraft.w.aj;
import net.minecraft.w.b.ab;
import net.minecraft.w.b.ao;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.at;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bb;
import net.minecraft.w.b.bi;
import net.minecraft.w.b.bj;
import net.minecraft.w.b.h;
import net.minecraft.w.b.u;
import net.minecraft.w.d;
import net.minecraft.w.e.aw;
import net.minecraft.w.f;
import net.minecraft.w.f.ae;
import net.minecraft.w.g;
import net.minecraft.w.g.a;
import net.minecraft.w.h.ag;
import net.minecraft.w.h.an;
import net.minecraft.w.h.i;
import net.minecraft.w.h.k;
import net.minecraft.w.h.o;
import net.minecraft.w.h.v;
import net.minecraft.w.h.x;
import net.minecraft.w.l;
import net.minecraft.w.n;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ak
extends ah
implements aj,
g {
    private static final net.minecraft.x.a.g b = net.minecraft.x.a.o.a(ak.class, net.minecraft.x.a.q.b);
    private int c;
    private boolean d;
    private boolean e;
    net.minecraft.b.g a;
    private b f;
    private net.minecraft.b.d g;
    private int h;
    private boolean i;
    private boolean x;
    private int y;
    private String z;
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private final e E = new e("Items", false, 8);
    private static final x[][][][] F = new x[][][][]{{{{new net.minecraft.w.h.g(net.minecraft.a.w.Q, new o(18, 22)), new net.minecraft.w.h.g(net.minecraft.a.w.cc, new o(15, 19)), new net.minecraft.w.h.g(net.minecraft.a.w.cb, new o(15, 19)), new v(net.minecraft.a.w.R, new o(-4, -2))}, {new net.minecraft.w.h.g(cg.a(net.minecraft.a.p.aU), new o(8, 13)), new v(net.minecraft.a.w.ck, new o(-3, -2))}, {new net.minecraft.w.h.g(cg.a(net.minecraft.a.p.bk), new o(7, 12)), new v(net.minecraft.a.w.e, new o(-5, -7))}, {new v(net.minecraft.a.w.bj, new o(-6, -10)), new v(net.minecraft.a.w.bg, new o(1, 1))}}, {{new net.minecraft.w.h.g(net.minecraft.a.w.H, new o(15, 20)), new net.minecraft.w.h.g(net.minecraft.a.w.j, new o(16, 24)), new k(net.minecraft.a.w.bb, new o(6, 6), net.minecraft.a.w.bc, new o(6, 6))}, {new i(net.minecraft.a.w.aY, new o(7, 8))}}, {{new net.minecraft.w.h.g(cg.a(net.minecraft.a.p.L), new o(16, 22)), new v(net.minecraft.a.w.bl, new o(3, 4))}, {new v(new cu(cg.a(net.minecraft.a.p.L)), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 1), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 2), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 3), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 4), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 5), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 6), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 7), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 8), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 9), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 10), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 11), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 12), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 13), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 14), new o(1, 2)), new v(new cu(cg.a(net.minecraft.a.p.L), 1, 15), new o(1, 2))}}, {{new net.minecraft.w.h.g(net.minecraft.a.w.H, new o(15, 20)), new v(net.minecraft.a.w.g, new o(-12, -8))}, {new v(net.minecraft.a.w.f, new o(2, 3)), new k(cg.a(net.minecraft.a.p.n), new o(10, 10), net.minecraft.a.w.am, new o(6, 10))}}}, {{{new net.minecraft.w.h.g(net.minecraft.a.w.aR, new o(24, 36)), new an()}, {new net.minecraft.w.h.g(net.minecraft.a.w.aS, new o(8, 10)), new v(net.minecraft.a.w.aX, new o(10, 12)), new v(cg.a(net.minecraft.a.p.X), new o(3, 4))}, {new net.minecraft.w.h.g(net.minecraft.a.w.bX, new o(2, 2)), new v(net.minecraft.a.w.aZ, new o(10, 12)), new v(cg.a(net.minecraft.a.p.w), new o(-5, -3))}, {new an()}, {new an()}, {new v(net.minecraft.a.w.cy, new o(20, 22))}}}, {{{new net.minecraft.w.h.g(net.minecraft.a.w.bA, new o(36, 40)), new net.minecraft.w.h.g(net.minecraft.a.w.m, new o(8, 10))}, {new v(net.minecraft.a.w.aE, new o(-4, -1)), new v(new cu(net.minecraft.a.w.bd, 1, cd.l.c()), new o(-2, -1))}, {new v(net.minecraft.a.w.bB, new o(4, 7)), new v(cg.a(net.minecraft.a.p.aX), new o(-3, -1))}, {new v(net.minecraft.a.w.bU, new o(3, 11))}}}, {{{new net.minecraft.w.h.g(net.minecraft.a.w.j, new o(16, 24)), new v(net.minecraft.a.w.aa, new o(4, 6))}, {new net.minecraft.w.h.g(net.minecraft.a.w.l, new o(7, 9)), new v(net.minecraft.a.w.ab, new o(10, 14))}, {new net.minecraft.w.h.g(net.minecraft.a.w.k, new o(3, 4)), new i(net.minecraft.a.w.af, new o(16, 19))}, {new v(net.minecraft.a.w.Z, new o(5, 7)), new v(net.minecraft.a.w.Y, new o(9, 11)), new v(net.minecraft.a.w.W, new o(5, 7)), new v(net.minecraft.a.w.X, new o(11, 15))}}, {{new net.minecraft.w.h.g(net.minecraft.a.w.j, new o(16, 24)), new v(net.minecraft.a.w.c, new o(6, 8))}, {new net.minecraft.w.h.g(net.minecraft.a.w.l, new o(7, 9)), new i(net.minecraft.a.w.n, new o(9, 10))}, {new net.minecraft.w.h.g(net.minecraft.a.w.k, new o(3, 4)), new i(net.minecraft.a.w.w, new o(12, 15)), new i(net.minecraft.a.w.z, new o(9, 12))}}, {{new net.minecraft.w.h.g(net.minecraft.a.w.j, new o(16, 24)), new i(net.minecraft.a.w.a, new o(5, 7))}, {new net.minecraft.w.h.g(net.minecraft.a.w.l, new o(7, 9)), new i(net.minecraft.a.w.b, new o(9, 11))}, {new net.minecraft.w.h.g(net.minecraft.a.w.k, new o(3, 4)), new i(net.minecraft.a.w.y, new o(12, 15))}}}, {{{new net.minecraft.w.h.g(net.minecraft.a.w.an, new o(14, 18)), new net.minecraft.w.h.g(net.minecraft.a.w.br, new o(14, 18))}, {new net.minecraft.w.h.g(net.minecraft.a.w.j, new o(16, 24)), new v(net.minecraft.a.w.ao, new o(-7, -5)), new v(net.minecraft.a.w.bs, new o(-8, -6))}}, {{new net.minecraft.w.h.g(net.minecraft.a.w.aM, new o(9, 12)), new v(net.minecraft.a.w.U, new o(2, 4))}, {new i(net.minecraft.a.w.T, new o(7, 12))}, {new v(net.minecraft.a.w.aC, new o(8, 10))}}}};

    public ak(net.minecraft.q.k k2) {
        this(k2, 0);
    }

    public ak(net.minecraft.q.k k2, int n2) {
        super(k2);
        this.b(n2);
        this.d(0.6f, 1.95f);
        ((net.minecraft.i.a)this.N()).a(true);
        this.f(true);
    }

    @Override
    protected void cA_() {
        this.o.a(0, new av(this));
        this.o.a(1, new bi(this, net.minecraft.w.e.d.class, 8.0f, 0.6, 0.6));
        this.o.a(1, new bb(this));
        this.o.a(1, new bj(this));
        this.o.a(2, new ao(this));
        this.o.a(3, new net.minecraft.w.b.aj(this));
        this.o.a(4, new net.minecraft.w.b.a(this, true));
        this.o.a(5, new net.minecraft.w.b.n(this, 0.6));
        this.o.a(6, new h(this));
        this.o.a(7, new net.minecraft.w.b.x(this));
        this.o.a(9, new u(this, b.class, 3.0f, 1.0f));
        this.o.a(9, new net.minecraft.w.b.c(this));
        this.o.a(9, new az(this, 0.6));
        this.o.a(10, new ap(this, f.class, 8.0f));
    }

    private void dp() {
        if (!this.D) {
            this.D = true;
            if (this.ba()) {
                this.o.a(8, new ab(this, 0.32));
            } else if (this.p() == 0) {
                this.o.a(6, new at(this, 0.6));
            }
        }
    }

    @Override
    protected void cG_() {
        if (this.p() == 0) {
            this.o.a(8, new at(this, 0.6));
        }
        super.cG_();
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.d).a(0.5);
    }

    @Override
    protected void e() {
        if (--this.c <= 0) {
            Object object = new net.minecraft.u.b.b(this);
            this.aQ.U().a((net.minecraft.u.b.b)object);
            this.c = 70 + this.bx.nextInt(50);
            this.a = this.aQ.U().a((net.minecraft.u.b.b)object, 32);
            if (this.a == null) {
                this.dl();
            } else {
                net.minecraft.u.b.b b2 = this.a.a();
                this.a(b2, this.a.b());
                if (this.C) {
                    this.C = false;
                    this.a.b(5);
                }
            }
        }
        if (!this.t() && this.h > 0) {
            --this.h;
            if (this.h <= 0) {
                if (this.i) {
                    for (Object object : this.g) {
                        if (!((net.minecraft.b.b)object).h()) continue;
                        ((net.minecraft.b.b)object).a(this.bx.nextInt(6) + this.bx.nextInt(6) + 2);
                    }
                    this.dq();
                    this.i = false;
                    if (this.a != null && this.z != null) {
                        this.aQ.a((n)this, (byte)14);
                        this.a.a(this.z, 1);
                    }
                }
                this.c(new j(net.minecraft.a.c.j, 200, 0));
            }
        }
        super.e();
    }

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        boolean bl2;
        boolean bl3 = bl2 = cu2 != null && cu2.a() == net.minecraft.a.w.bT;
        if (!bl2 && this.br() && !this.t() && !this.ba()) {
            if (!(this.aQ.C || this.g != null && this.g.isEmpty())) {
                this.a(b2);
                b2.a(this);
            }
            b2.a(net.minecraft.r.o.H);
            return true;
        }
        return super.a(b2, ah2, cu2);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(b, 0);
    }

    public static void a(net.minecraft.u.a.a a2) {
        net.minecraft.w.f.a(a2, "Villager");
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new net.minecraft.u.a.b.e("Villager", new String[]{"Inventory"}));
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new ag());
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Profession", this.p());
        e2.a("Riches", this.y);
        e2.a("Career", this.A);
        e2.a("CareerLevel", this.B);
        e2.a("Willing", this.x);
        if (this.g != null) {
            e2.a("Offers", this.g.a());
        }
        q q2 = new q();
        for (int i2 = 0; i2 < this.E.e(); ++i2) {
            cu cu2 = this.E.a(i2);
            if (cu2 == null) continue;
            q2.a(cu2.b(new net.minecraft.e.e()));
        }
        e2.a("Inventory", q2);
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        net.minecraft.e.a a2;
        super.b(e2);
        this.b(e2.h("Profession"));
        this.y = e2.h("Riches");
        this.A = e2.h("Career");
        this.B = e2.h("CareerLevel");
        this.x = e2.p("Willing");
        if (e2.b("Offers", 10)) {
            a2 = e2.o("Offers");
            this.g = new net.minecraft.b.d((net.minecraft.e.e)a2);
        }
        a2 = e2.c("Inventory", 10);
        for (int i2 = 0; i2 < ((q)a2).e(); ++i2) {
            cu cu2 = cu.a(((q)a2).b(i2));
            if (cu2 == null) continue;
            this.E.a(cu2);
        }
        this.f(true);
        this.dp();
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

    public void b(int n2) {
        this.bE.b(b, n2);
    }

    public int p() {
        return Math.max((Integer)this.bE.a(b) % 5, 0);
    }

    public boolean q() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    public void c(boolean bl2) {
        this.e = bl2;
    }

    public boolean r() {
        return this.e;
    }

    @Override
    public void a(l l2) {
        super.a(l2);
        if (this.a != null && l2 != null) {
            this.a.a(l2);
            if (l2 instanceof b) {
                int n2 = -1;
                if (this.ba()) {
                    n2 = -3;
                }
                this.a.a(l2.X(), n2);
                if (this.br()) {
                    this.aQ.a((n)this, (byte)13);
                }
            }
        }
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        if (this.a != null) {
            n n3 = n2.j();
            if (n3 != null) {
                if (n3 instanceof b) {
                    this.a.a(n3.X(), -2);
                } else if (n3 instanceof aw) {
                    this.a.h();
                }
            } else {
                b b2 = this.aQ.a((n)this, 16.0);
                if (b2 != null) {
                    this.a.h();
                }
            }
        }
        super.a(n2);
    }

    @Override
    public void a(b b2) {
        this.f = b2;
    }

    @Override
    public b s() {
        return this.f;
    }

    public boolean t() {
        return this.f != null;
    }

    public boolean d(boolean bl2) {
        if (!this.x && bl2 && this.y()) {
            boolean bl3 = false;
            for (int i2 = 0; i2 < this.E.e(); ++i2) {
                cu cu2 = this.E.a(i2);
                if (cu2 != null) {
                    if (cu2.a() == net.minecraft.a.w.R && cu2.b >= 3) {
                        bl3 = true;
                        this.E.a(i2, 3);
                    } else if ((cu2.a() == net.minecraft.a.w.cc || cu2.a() == net.minecraft.a.w.cb) && cu2.b >= 12) {
                        bl3 = true;
                        this.E.a(i2, 12);
                    }
                }
                if (!bl3) continue;
                this.aQ.a((n)this, (byte)18);
                this.x = true;
                break;
            }
        }
        return this.x;
    }

    public void e(boolean bl2) {
        this.x = bl2;
    }

    @Override
    public void a(net.minecraft.b.b b2) {
        b2.g();
        this.j = -this.ac();
        this.a(net.minecraft.a.f.gK, this.bE(), this.bF());
        int n2 = 3 + this.bx.nextInt(4);
        if (b2.e() == 1 || this.bx.nextInt(5) == 0) {
            this.h = 40;
            this.i = true;
            this.x = true;
            this.z = this.f != null ? this.f.X() : null;
            n2 += 5;
        }
        if (b2.a().a() == net.minecraft.a.w.bY) {
            this.y += b2.a().b;
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
    public net.minecraft.b.d b(b b2) {
        if (this.g == null) {
            this.dq();
        }
        return this.g;
    }

    private void dq() {
        x[][][] arrx = F[this.p()];
        if (this.A != 0 && this.B != 0) {
            ++this.B;
        } else {
            this.A = this.bx.nextInt(arrx.length) + 1;
            this.B = 1;
        }
        if (this.g == null) {
            this.g = new net.minecraft.b.d();
        }
        int n2 = this.A - 1;
        int n3 = this.B - 1;
        x[][] arrx2 = arrx[n2];
        if (n3 >= 0 && n3 < arrx2.length) {
            x[] arrx3;
            x[] arrx4 = arrx3 = arrx2[n3];
            int n4 = arrx3.length;
            for (int i2 = 0; i2 < n4; ++i2) {
                x x2 = arrx4[i2];
                x2.a(this.g, this.bx);
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
        if (this.g == null) {
            this.dq();
        }
        String string2 = null;
        switch (this.p()) {
            case 0: {
                if (this.A == 1) {
                    string2 = "farmer";
                    break;
                }
                if (this.A == 2) {
                    string2 = "fisherman";
                    break;
                }
                if (this.A == 3) {
                    string2 = "shepherd";
                    break;
                }
                if (this.A != 4) break;
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
                if (this.A == 1) {
                    string2 = "armor";
                    break;
                }
                if (this.A == 2) {
                    string2 = "weapon";
                    break;
                }
                if (this.A != 3) break;
                string2 = "tool";
                break;
            }
            case 4: {
                if (this.A == 1) {
                    string2 = "butcher";
                    break;
                }
                if (this.A != 2) break;
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
        this.b(this.aQ.p.nextInt(5));
        this.dp();
        return ac2;
    }

    public void v() {
        this.C = true;
    }

    public ak a(ah ah2) {
        ak ak2 = new ak(this.aQ);
        ak2.a(this.aQ.C(new net.minecraft.u.b.b(ak2)), null);
        return ak2;
    }

    @Override
    public boolean c(b b2) {
        return false;
    }

    @Override
    public void a(a a2) {
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

    public e w() {
        return this.E;
    }

    @Override
    protected void a(ae ae2) {
        cu cu2 = ae2.c();
        cg cg2 = cu2.a();
        if (this.a(cg2)) {
            cu cu3 = this.E.a(cu2);
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

    public boolean y() {
        return this.f(1);
    }

    public boolean z() {
        return this.f(2);
    }

    public boolean E() {
        boolean bl2;
        boolean bl3 = bl2 = this.p() == 0;
        return bl2 ? !this.f(5) : !this.f(1);
    }

    private boolean f(int n2) {
        boolean bl2 = this.p() == 0;
        for (int i2 = 0; i2 < this.E.e(); ++i2) {
            cu cu2 = this.E.a(i2);
            if (cu2 == null) continue;
            if (cu2.a() == net.minecraft.a.w.R && cu2.b >= 3 * n2 || cu2.a() == net.minecraft.a.w.cc && cu2.b >= 12 * n2 || cu2.a() == net.minecraft.a.w.cb && cu2.b >= 12 * n2 || cu2.a() == net.minecraft.a.w.cV && cu2.b >= 12 * n2) {
                return true;
            }
            if (!bl2 || cu2.a() != net.minecraft.a.w.Q || cu2.b < 9 * n2) continue;
            return true;
        }
        return false;
    }

    public boolean do() {
        for (int i2 = 0; i2 < this.E.e(); ++i2) {
            cu cu2 = this.E.a(i2);
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
        if (n3 >= 0 && n3 < this.E.e()) {
            this.E.a(n3, cu2);
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.a(ah2);
    }
}

