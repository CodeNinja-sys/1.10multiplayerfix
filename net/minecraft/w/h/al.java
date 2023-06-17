/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import com.a.a.b.cg;
import com.a.a.b.cm;
import java.util.UUID;
import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.g.fk;
import net.minecraft.h.e;
import net.minecraft.h.o;
import net.minecraft.h.q;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.ac;
import net.minecraft.w.ae;
import net.minecraft.w.ah;
import net.minecraft.w.b.a.c;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.am;
import net.minecraft.w.b.an;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bc;
import net.minecraft.w.b.bh;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.h.b;
import net.minecraft.w.h.p;
import net.minecraft.w.h.r;
import net.minecraft.w.h.y;
import net.minecraft.w.h.z;
import net.minecraft.w.i;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.g;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class al
extends y
implements o,
i {
    private static final cm g = new b();
    private static final net.minecraft.w.b.a.f h = new c(null, "horse.jumpStrength", 0.7, 0.0, 2.0).a("Jump Strength").a(true);
    private static final UUID i = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
    private static final g x = net.minecraft.x.a.o.a(al.class, net.minecraft.x.a.q.a);
    private static final g y = net.minecraft.x.a.o.a(al.class, net.minecraft.x.a.q.b);
    private static final g z = net.minecraft.x.a.o.a(al.class, net.minecraft.x.a.q.b);
    private static final g A = net.minecraft.x.a.o.a(al.class, net.minecraft.x.a.q.m);
    private static final g B = net.minecraft.x.a.o.a(al.class, net.minecraft.x.a.q.b);
    private static final String[] C = new String[]{"textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png"};
    private static final String[] D = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
    private static final String[] E;
    private static final String[] F;
    private final an G = new an(this);
    private int H;
    private int I;
    private int J;
    public int b;
    public int c;
    protected boolean d;
    private q K;
    private boolean L;
    protected int e;
    protected float f;
    private boolean M;
    private boolean N;
    private int O;
    private float P;
    private float bZ;
    private float ca;
    private float cb;
    private float cc;
    private float cd;
    private int ce;
    private String cf;
    private final String[] cg = new String[3];
    private boolean ch;

    static {
        String[] arrstring = new String[5];
        arrstring[1] = "textures/entity/horse/horse_markings_white.png";
        arrstring[2] = "textures/entity/horse/horse_markings_whitefield.png";
        arrstring[3] = "textures/entity/horse/horse_markings_whitedots.png";
        arrstring[4] = "textures/entity/horse/horse_markings_blackdots.png";
        E = arrstring;
        F = new String[]{"", "wo_", "wmo", "wdo", "bdo"};
    }

    public al(k k2) {
        super(k2);
        this.d(1.3964844f, 1.6f);
        this.bD = false;
        this.e(false);
        this.bu = 1.0f;
        this.dL();
    }

    @Override
    protected void cA_() {
        this.o.a(0, new av(this));
        this.o.a(1, new net.minecraft.w.b.ah(this, 1.2));
        this.o.a(1, new am(this, 1.2));
        this.o.a(2, new net.minecraft.w.b.k(this, 1.0));
        this.o.a(4, new bc(this, 1.0));
        this.o.a(6, new az(this, 0.7));
        this.o.a(7, new ap(this, net.minecraft.w.a.b.class, 6.0f));
        this.o.a(8, new bh(this));
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(x, (byte)0);
        this.bE.a(y, net.minecraft.w.h.p.a.k());
        this.bE.a(z, 0);
        this.bE.a(A, com.a.a.b.cg.f());
        this.bE.a(B, net.minecraft.w.h.z.a.a());
    }

    public void a(p p2) {
        this.bE.b(y, p2.k());
        this.dN();
    }

    public p p() {
        return net.minecraft.w.h.p.a((Integer)this.bE.a(y));
    }

    public void f(int n2) {
        this.bE.b(z, n2);
        this.dN();
    }

    public int q() {
        return (Integer)this.bE.a(z);
    }

    @Override
    public String X() {
        return this.bO_() ? this.cP() : this.p().d().c();
    }

    private boolean p(int n2) {
        return ((Byte)this.bE.a(x) & n2) != 0;
    }

    private void c(int n2, boolean bl2) {
        byte by2 = (Byte)this.bE.a(x);
        if (bl2) {
            this.bE.b(x, (byte)(by2 | n2));
        } else {
            this.bE.b(x, (byte)(by2 & ~n2));
        }
    }

    public boolean r() {
        return !this.ba();
    }

    public boolean s() {
        return this.p(2);
    }

    public boolean t() {
        return this.r();
    }

    public UUID z() {
        return (UUID)((cg)this.bE.a(A)).d();
    }

    public void b(UUID uUID) {
        this.bE.b(A, com.a.a.b.cg.c(uUID));
    }

    public float E() {
        return 0.5f;
    }

    @Override
    public void s(boolean bl2) {
        if (bl2) {
            this.r(this.E());
        } else {
            this.r(1.0f);
        }
    }

    public boolean do() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.c(2, bl2);
    }

    public void c(boolean bl2) {
        this.d = bl2;
    }

    @Override
    public boolean c(net.minecraft.w.a.b b2) {
        return !this.p().h() && super.c(b2);
    }

    @Override
    protected void p(float f2) {
        if (f2 > 6.0f && this.dr()) {
            this.v(false);
        }
    }

    public boolean dp() {
        return this.p().f() && this.p(8);
    }

    public z dq() {
        return net.minecraft.w.h.z.a((Integer)this.bE.a(B));
    }

    public boolean dr() {
        return this.p(32);
    }

    public boolean ds() {
        return this.p(64);
    }

    public boolean dt() {
        return this.p(16);
    }

    public boolean du() {
        return this.L;
    }

    public void f(cu cu2) {
        z z2 = net.minecraft.w.h.z.a(cu2);
        this.bE.b(B, z2.a());
        this.dN();
        if (!this.aQ.C) {
            this.a(net.minecraft.w.d.g).b(i);
            int n2 = z2.c();
            if (n2 != 0) {
                this.a(net.minecraft.w.d.g).b(new h(i, "Horse armor bonus", n2, 0).a(false));
            }
        }
    }

    public void d(boolean bl2) {
        this.c(16, bl2);
    }

    public void e(boolean bl2) {
        this.c(8, bl2);
    }

    public void t(boolean bl2) {
        this.L = bl2;
    }

    public void u(boolean bl2) {
        this.c(4, bl2);
    }

    public int dv() {
        return this.e;
    }

    public void g(int n2) {
        this.e = n2;
    }

    public int o(int n2) {
        int n3 = net.minecraft.u.b.n.a(this.dv() + n2, 0, this.dB());
        this.g(n3);
        return n3;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        n n3 = n2.j();
        return this.cA() && n3 != null && this.C(n3) ? false : super.a(n2, f2);
    }

    @Override
    public boolean bM() {
        return !this.cA();
    }

    public boolean dw() {
        int n2 = net.minecraft.u.b.n.c(this.aU);
        int n3 = net.minecraft.u.b.n.c(this.aW);
        this.aQ.a(new net.minecraft.u.b.b(n2, 0, n3));
        return true;
    }

    public void dx() {
        if (!this.aQ.C && this.dp()) {
            this.a(net.minecraft.m.cg.a(net.minecraft.a.p.ae), 1);
            this.e(false);
        }
    }

    private void dJ() {
        this.dQ();
        if (!this.ch()) {
            this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.cu, this.S(), 1.0f, 1.0f + (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f);
        }
    }

    @Override
    public void c(float f2, float f3) {
        int n2;
        if (f2 > 1.0f) {
            this.a(net.minecraft.a.f.cy, 0.4f, 1.0f);
        }
        if ((n2 = net.minecraft.u.b.n.f((f2 * 0.5f - 3.0f) * f3)) > 0) {
            Object object2;
            this.a(net.minecraft.u.n.j, (float)n2);
            if (this.cA()) {
                for (Object object2 : this.dc()) {
                    ((n)object2).a(net.minecraft.u.n.j, (float)n2);
                }
            }
            object2 = this.aQ.n(new net.minecraft.u.b.b(this.aU, this.aV - 0.2 - (double)this.bc, this.aW));
            cn cn2 = object2.c();
            if (object2.d() != net.minecraft.g.a.h.a && !this.ch()) {
                fk fk2 = cn2.w();
                this.aQ.a(null, this.aU, this.aV, this.aW, fk2.d(), this.S(), fk2.a() * 0.5f, fk2.b() * 0.75f);
            }
        }
    }

    private int dK() {
        p p2 = this.p();
        return this.dp() && p2.f() ? 17 : 2;
    }

    private void dL() {
        q q2 = this.K;
        this.K = new q("HorseChest", this.dK());
        this.K.a(this.X());
        if (q2 != null) {
            q2.b(this);
            int n2 = Math.min(q2.e(), this.K.e());
            for (int i2 = 0; i2 < n2; ++i2) {
                cu cu2 = q2.a(i2);
                if (cu2 == null) continue;
                this.K.a(i2, cu2.j());
            }
        }
        this.K.a(this);
        this.dM();
    }

    private void dM() {
        if (!this.aQ.C) {
            this.u(this.K.a(0) != null);
            if (this.p().j()) {
                this.f(this.K.a(1));
            }
        }
    }

    @Override
    public void a(e e2) {
        z z2 = this.dq();
        boolean bl2 = this.dz();
        this.dM();
        if (this.by > 20) {
            if (z2 == net.minecraft.w.h.z.a && z2 != this.dq()) {
                this.a(net.minecraft.a.f.cr, 0.5f, 1.0f);
            } else if (z2 != this.dq()) {
                this.a(net.minecraft.a.f.cr, 0.5f, 1.0f);
            }
            if (!bl2 && this.dz()) {
                this.a(net.minecraft.a.f.cz, 0.5f, 1.0f);
            }
        }
    }

    @Override
    public boolean aq() {
        this.dw();
        return super.aq();
    }

    protected al a(n n2, double d2) {
        double d3 = Double.MAX_VALUE;
        n n3 = null;
        for (n n4 : this.aQ.a(n2, n2.cT().a(d2, d2, d2), g)) {
            double d4 = n4.h(n2.aU, n2.aV, n2.aW);
            if (!(d4 < d3)) continue;
            n3 = n4;
            d3 = d4;
        }
        return (al)n3;
    }

    public double dy() {
        return this.a(h).f();
    }

    @Override
    protected bv cd_() {
        this.dQ();
        return this.p().c();
    }

    @Override
    protected bv cc_() {
        this.dQ();
        if (this.bx.nextInt(3) == 0) {
            this.dS();
        }
        return this.p().b();
    }

    public boolean dz() {
        return this.p(4);
    }

    @Override
    protected bv j() {
        this.dQ();
        if (this.bx.nextInt(10) == 0 && !this.T()) {
            this.dS();
        }
        return this.p().a();
    }

    protected bv dA() {
        this.dQ();
        this.dS();
        p p2 = this.p();
        return p2.h() ? null : (p2.g() ? net.minecraft.a.f.ay : net.minecraft.a.f.cq);
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        fk fk2 = cn2.w();
        if (this.aQ.n(b2.b()).c() == net.minecraft.a.p.aH) {
            fk2 = net.minecraft.a.p.aH.w();
        }
        if (!cn2.v().d().d()) {
            p p2 = this.p();
            if (this.cA() && !p2.g()) {
                ++this.ce;
                if (this.ce > 5 && this.ce % 3 == 0) {
                    this.a(net.minecraft.a.f.cv, fk2.a() * 0.15f, fk2.b());
                    if (p2 == net.minecraft.w.h.p.a && this.bx.nextInt(10) == 0) {
                        this.a(net.minecraft.a.f.cs, fk2.a() * 0.6f, fk2.b());
                    }
                } else if (this.ce <= 5) {
                    this.a(net.minecraft.a.f.cB, fk2.a() * 0.15f, fk2.b());
                }
            } else if (fk2 == fk.a) {
                this.a(net.minecraft.a.f.cB, fk2.a() * 0.15f, fk2.b());
            } else {
                this.a(net.minecraft.a.f.cA, fk2.a() * 0.15f, fk2.b());
            }
        }
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.bA().b(h);
        this.a(net.minecraft.w.d.a).a(53.0);
        this.a(net.minecraft.w.d.d).a(0.225f);
    }

    @Override
    public int az() {
        return 6;
    }

    public int dB() {
        return 100;
    }

    @Override
    protected float bE() {
        return 0.8f;
    }

    @Override
    public int ac() {
        return 400;
    }

    public boolean dC() {
        return this.p() == net.minecraft.w.h.p.a || this.dq() != net.minecraft.w.h.z.a;
    }

    private void dN() {
        this.cf = null;
    }

    public boolean dD() {
        return this.ch;
    }

    private void dO() {
        this.cf = "horse/";
        this.cg[0] = null;
        this.cg[1] = null;
        this.cg[2] = null;
        p p2 = this.p();
        int n2 = this.q();
        if (p2 == net.minecraft.w.h.p.a) {
            int n3 = n2 & 0xFF;
            int n4 = (n2 & 0xFF00) >> 8;
            if (n3 >= C.length) {
                this.ch = false;
                return;
            }
            this.cg[0] = C[n3];
            this.cf = String.valueOf(this.cf) + D[n3];
            if (n4 >= E.length) {
                this.ch = false;
                return;
            }
            this.cg[1] = E[n4];
            this.cf = String.valueOf(this.cf) + F[n4];
        } else {
            this.cg[0] = "";
            this.cf = String.valueOf(this.cf) + "_" + (Object)((Object)p2) + "_";
        }
        z z2 = this.dq();
        this.cg[2] = z2.d();
        this.cf = String.valueOf(this.cf) + z2.b();
        this.ch = true;
    }

    public String dE() {
        if (this.cf == null) {
            this.dO();
        }
        return this.cf;
    }

    public String[] dF() {
        if (this.cf == null) {
            this.dO();
        }
        return this.cg;
    }

    public void e(net.minecraft.w.a.b b2) {
        if (!this.aQ.C && (!this.cA() || this.A(b2)) && this.s()) {
            this.K.a(this.X());
            b2.a(this, this.K);
        }
    }

    @Override
    public boolean a(net.minecraft.w.a.b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (cu2 != null && cu2.a() == net.minecraft.a.w.bT) {
            return super.a(b2, ah2, cu2);
        }
        if (!this.s() && this.p().h()) {
            return false;
        }
        if (this.s() && this.r() && b2.G()) {
            this.e(b2);
            return true;
        }
        if (this.t() && this.cA()) {
            return super.a(b2, ah2, cu2);
        }
        if (cu2 != null) {
            z z2;
            if (this.p().j() && (z2 = net.minecraft.w.h.z.a(cu2)) != net.minecraft.w.h.z.a) {
                if (!this.s()) {
                    this.dG();
                    return true;
                }
                this.e(b2);
                return true;
            }
            boolean bl2 = false;
            if (!this.p().h()) {
                float f2 = 0.0f;
                int n2 = 0;
                int n3 = 0;
                if (cu2.a() == net.minecraft.a.w.Q) {
                    f2 = 2.0f;
                    n2 = 20;
                    n3 = 3;
                } else if (cu2.a() == net.minecraft.a.w.bf) {
                    f2 = 1.0f;
                    n2 = 30;
                    n3 = 3;
                } else if (cn.a(cu2.a()) == net.minecraft.a.p.cx) {
                    f2 = 20.0f;
                    n2 = 180;
                } else if (cu2.a() == net.minecraft.a.w.e) {
                    f2 = 3.0f;
                    n2 = 60;
                    n3 = 3;
                } else if (cu2.a() == net.minecraft.a.w.cg) {
                    f2 = 4.0f;
                    n2 = 60;
                    n3 = 5;
                    if (this.s() && this.dn() == 0) {
                        bl2 = true;
                        this.a(b2);
                    }
                } else if (cu2.a() == net.minecraft.a.w.aq) {
                    f2 = 10.0f;
                    n2 = 240;
                    n3 = 10;
                    if (this.s() && this.dn() == 0 && !this.w()) {
                        bl2 = true;
                        this.a(b2);
                    }
                }
                if (this.bo() < this.bw() && f2 > 0.0f) {
                    this.a(f2);
                    bl2 = true;
                }
                if (!this.r() && n2 > 0) {
                    if (!this.aQ.C) {
                        this.c(n2);
                    }
                    bl2 = true;
                }
                if (n3 > 0 && (bl2 || !this.s()) && this.dv() < this.dB()) {
                    bl2 = true;
                    if (!this.aQ.C) {
                        this.o(n3);
                    }
                }
                if (bl2) {
                    this.dJ();
                }
            }
            if (!this.s() && !bl2) {
                if (cu2.a(b2, (l)this, ah2)) {
                    return true;
                }
                this.dG();
                return true;
            }
            if (!bl2 && this.p().f() && !this.dp() && cu2.a() == net.minecraft.m.cg.a(net.minecraft.a.p.ae)) {
                this.e(true);
                this.a(net.minecraft.a.f.az, 1.0f, (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
                bl2 = true;
                this.dL();
            }
            if (!bl2 && this.t() && !this.dz() && cu2.a() == net.minecraft.a.w.aC) {
                this.e(b2);
                return true;
            }
            if (bl2) {
                if (!b2.J.d) {
                    --cu2.b;
                }
                return true;
            }
        }
        if (this.t() && !this.cA()) {
            if (cu2 != null && cu2.a(b2, (l)this, ah2)) {
                return true;
            }
            this.g(b2);
            return true;
        }
        return super.a(b2, ah2, cu2);
    }

    private void g(net.minecraft.w.a.b b2) {
        b2.ba = this.ba;
        b2.bb = this.bb;
        this.v(false);
        this.w(false);
        if (!this.aQ.C) {
            b2.r(this);
        }
    }

    @Override
    protected boolean T() {
        return this.cA() && this.dz() ? true : this.dr() || this.ds();
    }

    @Override
    public boolean a(cu cu2) {
        return false;
    }

    private void dP() {
        this.b = 1;
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        super.a(n2);
        if (!this.aQ.C) {
            this.dH();
        }
    }

    @Override
    public void n() {
        if (this.bx.nextInt(200) == 0) {
            this.dP();
        }
        super.n();
        if (!this.aQ.C) {
            al al2;
            if (this.bx.nextInt(900) == 0 && this.Y == 0) {
                this.a(1.0f);
            }
            if (!this.dr() && !this.cA() && this.bx.nextInt(300) == 0 && this.aQ.n(new net.minecraft.u.b.b(net.minecraft.u.b.n.c(this.aU), net.minecraft.u.b.n.c(this.aV) - 1, net.minecraft.u.b.n.c(this.aW))).c() == net.minecraft.a.p.c) {
                this.v(true);
            }
            if (this.dr() && ++this.H > 50) {
                this.H = 0;
                this.v(false);
            }
            if (this.dt() && !this.r() && !this.dr() && (al2 = this.a((n)this, 16.0)) != null && this.n(al2) > 4.0) {
                this.n.a(al2);
            }
            if (this.dI() && this.O++ >= 18000) {
                this.aa();
            }
        }
    }

    @Override
    public void cE_() {
        super.cE_();
        if (this.aQ.C && this.bE.a()) {
            this.bE.e();
            this.dN();
        }
        if (this.I > 0 && ++this.I > 30) {
            this.I = 0;
            this.c(128, false);
        }
        if (this.de() && this.J > 0 && ++this.J > 20) {
            this.J = 0;
            this.w(false);
        }
        if (this.b > 0 && ++this.b > 8) {
            this.b = 0;
        }
        if (this.c > 0) {
            ++this.c;
            if (this.c > 300) {
                this.c = 0;
            }
        }
        this.bZ = this.P;
        if (this.dr()) {
            this.P += (1.0f - this.P) * 0.4f + 0.05f;
            if (this.P > 1.0f) {
                this.P = 1.0f;
            }
        } else {
            this.P += (0.0f - this.P) * 0.4f - 0.05f;
            if (this.P < 0.0f) {
                this.P = 0.0f;
            }
        }
        this.cb = this.ca;
        if (this.ds()) {
            this.bZ = this.P = 0.0f;
            this.ca += (1.0f - this.ca) * 0.4f + 0.05f;
            if (this.ca > 1.0f) {
                this.ca = 1.0f;
            }
        } else {
            this.M = false;
            this.ca += (0.8f * this.ca * this.ca * this.ca - this.ca) * 0.6f - 0.05f;
            if (this.ca < 0.0f) {
                this.ca = 0.0f;
            }
        }
        this.cd = this.cc;
        if (this.p(128)) {
            this.cc += (1.0f - this.cc) * 0.7f + 0.05f;
            if (this.cc > 1.0f) {
                this.cc = 1.0f;
            }
        } else {
            this.cc += (0.0f - this.cc) * 0.7f - 0.05f;
            if (this.cc < 0.0f) {
                this.cc = 0.0f;
            }
        }
    }

    private void dQ() {
        if (!this.aQ.C) {
            this.I = 1;
            this.c(128, true);
        }
    }

    private boolean dR() {
        return !this.cA() && !this.cz() && this.s() && this.r() && this.p().i() && this.bo() >= this.bw() && this.w();
    }

    public void v(boolean bl2) {
        this.c(32, bl2);
    }

    public void w(boolean bl2) {
        if (bl2) {
            this.v(false);
        }
        this.c(64, bl2);
    }

    private void dS() {
        if (this.de()) {
            this.J = 1;
            this.w(true);
        }
    }

    public void dG() {
        this.dS();
        bv bv2 = this.dA();
        if (bv2 != null) {
            this.a(bv2, this.bE(), this.bF());
        }
    }

    public void dH() {
        this.a((n)this, this.K);
        this.dx();
    }

    private void a(n n2, q q2) {
        if (q2 != null && !this.aQ.C) {
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                cu cu2 = q2.a(i2);
                if (cu2 == null) continue;
                this.a(cu2, 0.0f);
            }
        }
    }

    public boolean f(net.minecraft.w.a.b b2) {
        this.b(b2.cM());
        this.a(true);
        return true;
    }

    @Override
    public void b(float f2, float f3) {
        if (this.cA() && this.aI() && this.dz()) {
            l l2 = (l)this.da();
            this.bc = this.ba = l2.ba;
            this.bb = l2.bb * 0.5f;
            this.e(this.ba, this.bb);
            this.am = this.ak = this.ba;
            f2 = l2.aB * 0.5f;
            f3 = l2.aC;
            if (f3 <= 0.0f) {
                f3 *= 0.25f;
                this.ce = 0;
            }
            if (this.be && this.f == 0.0f && this.ds() && !this.M) {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (this.f > 0.0f && !this.do() && this.be) {
                this.aY = this.dy() * (double)this.f;
                if (this.b(net.minecraft.a.c.h)) {
                    this.aY += (double)((float)(this.c(net.minecraft.a.c.h).c() + 1) * 0.1f);
                }
                this.c(true);
                this.bO = true;
                if (f3 > 0.0f) {
                    float f4 = net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180));
                    float f5 = net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180));
                    this.aX += (double)(-0.4f * f4 * this.f);
                    this.aZ += (double)(0.4f * f5 * this.f);
                    this.a(net.minecraft.a.f.cx, 0.4f, 1.0f);
                }
                this.f = 0.0f;
            }
            this.ao = this.ak() * 0.1f;
            if (this.de()) {
                this.e_((float)this.a(net.minecraft.w.d.d).f());
                super.b(f2, f3);
            } else if (l2 instanceof net.minecraft.w.a.b) {
                this.aX = 0.0;
                this.aY = 0.0;
                this.aZ = 0.0;
            }
            if (this.be) {
                this.f = 0.0f;
                this.c(false);
            }
            this.ac = this.ad;
            double d2 = this.aU - this.aR;
            double d3 = this.aW - this.aT;
            float f6 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3) * 4.0f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            this.ad += (f6 - this.ad) * 0.4f;
            this.ae += this.ad;
        } else {
            this.ao = 0.02f;
            super.b(f2, f3);
        }
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "EntityHorse");
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new net.minecraft.u.a.b.e("EntityHorse", new String[]{"Items"}));
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new net.minecraft.u.a.b.d("EntityHorse", "ArmorItem", "SaddleItem"));
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("EatingHaystack", this.dr());
        e2.a("ChestedHorse", this.dp());
        e2.a("HasReproduced", this.du());
        e2.a("Bred", this.dt());
        e2.a("Type", this.p().k());
        e2.a("Variant", this.q());
        e2.a("Temper", this.dv());
        e2.a("Tame", this.s());
        e2.a("SkeletonTrap", this.dI());
        e2.a("SkeletonTrapTime", this.O);
        if (this.z() != null) {
            e2.a("OwnerUUID", this.z().toString());
        }
        if (this.dp()) {
            net.minecraft.e.q q2 = new net.minecraft.e.q();
            for (int i2 = 2; i2 < this.K.e(); ++i2) {
                cu cu2 = this.K.a(i2);
                if (cu2 == null) continue;
                net.minecraft.e.e e3 = new net.minecraft.e.e();
                e3.a("Slot", (byte)i2);
                cu2.b(e3);
                q2.a(e3);
            }
            e2.a("Items", q2);
        }
        if (this.K.a(1) != null) {
            e2.a("ArmorItem", this.K.a(1).b(new net.minecraft.e.e()));
        }
        if (this.K.a(0) != null) {
            e2.a("SaddleItem", this.K.a(0).b(new net.minecraft.e.e()));
        }
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        Object object;
        Object object2;
        String string;
        super.b(e2);
        this.v(e2.p("EatingHaystack"));
        this.d(e2.p("Bred"));
        this.e(e2.p("ChestedHorse"));
        this.t(e2.p("HasReproduced"));
        this.a(net.minecraft.w.h.p.a(e2.h("Type")));
        this.f(e2.h("Variant"));
        this.g(e2.h("Temper"));
        this.a(e2.p("Tame"));
        this.y(e2.p("SkeletonTrap"));
        this.O = e2.h("SkeletonTrapTime");
        if (e2.b("OwnerUUID", 8)) {
            string = e2.l("OwnerUUID");
        } else {
            object2 = e2.l("Owner");
            string = net.minecraft.c.b.d.a(this.aS(), (String)object2);
        }
        if (!string.isEmpty()) {
            this.b(UUID.fromString(string));
        }
        if ((object2 = this.bA().a("Speed")) != null) {
            this.a(net.minecraft.w.d.d).a(object2.b() * 0.25);
        }
        if (this.dp()) {
            object = e2.c("Items", 10);
            this.dL();
            for (int i2 = 0; i2 < ((net.minecraft.e.q)object).e(); ++i2) {
                net.minecraft.e.e e3 = ((net.minecraft.e.q)object).b(i2);
                int n2 = e3.f("Slot") & 0xFF;
                if (n2 < 2 || n2 >= this.K.e()) continue;
                this.K.a(n2, cu.a(e3));
            }
        }
        if (e2.b("ArmorItem", 10) && (object = cu.a(e2.o("ArmorItem"))) != null && net.minecraft.w.h.z.b(((cu)object).a())) {
            this.K.a(1, (cu)object);
        }
        if (e2.b("SaddleItem", 10) && (object = cu.a(e2.o("SaddleItem"))) != null && ((cu)object).a() == net.minecraft.a.w.aC) {
            this.K.a(0, (cu)object);
        }
        this.dM();
    }

    @Override
    public boolean a(y y2) {
        if (y2 == this) {
            return false;
        }
        if (y2.getClass() != this.getClass()) {
            return false;
        }
        al al2 = (al)y2;
        if (this.dR() && al2.dR()) {
            p p2;
            p p3 = this.p();
            return p3 == (p2 = al2.p()) || p3 == net.minecraft.w.h.p.a && p2 == net.minecraft.w.h.p.b || p3 == net.minecraft.w.h.p.b && p2 == net.minecraft.w.h.p.a;
        }
        return false;
    }

    @Override
    public ah b(ah ah2) {
        al al2 = (al)ah2;
        al al3 = new al(this.aQ);
        p p2 = this.p();
        p p3 = al2.p();
        p p4 = net.minecraft.w.h.p.a;
        if (p2 == p3) {
            p4 = p2;
        } else if (p2 == net.minecraft.w.h.p.a && p3 == net.minecraft.w.h.p.b || p2 == net.minecraft.w.h.p.b && p3 == net.minecraft.w.h.p.a) {
            p4 = net.minecraft.w.h.p.c;
        }
        if (p4 == net.minecraft.w.h.p.a) {
            int n2 = this.bx.nextInt(9);
            int n3 = n2 < 4 ? this.q() & 0xFF : (n2 < 8 ? al2.q() & 0xFF : this.bx.nextInt(7));
            int n4 = this.bx.nextInt(5);
            n3 = n4 < 2 ? (n3 |= this.q() & 0xFF00) : (n4 < 4 ? (n3 |= al2.q() & 0xFF00) : (n3 |= this.bx.nextInt(5) << 8 & 0xFF00));
            al3.f(n3);
        }
        al3.a(p4);
        double d2 = this.a(net.minecraft.w.d.a).b() + ah2.a(net.minecraft.w.d.a).b() + (double)this.dT();
        al3.a(net.minecraft.w.d.a).a(d2 / 3.0);
        double d3 = this.a(h).b() + ah2.a(h).b() + this.dU();
        al3.a(h).a(d3 / 3.0);
        double d4 = this.a(net.minecraft.w.d.d).b() + ah2.a(net.minecraft.w.d.d).b() + this.dV();
        al3.a(net.minecraft.w.d.d).a(d4 / 3.0);
        return al3;
    }

    @Override
    public ac a(net.minecraft.q.z z2, ac ac2) {
        p p2;
        ac2 = super.a(z2, ac2);
        int n2 = 0;
        if (ac2 instanceof r) {
            p2 = ((r)ac2).a;
            n2 = ((r)ac2).b & 0xFF | this.bx.nextInt(5) << 8;
        } else {
            if (this.bx.nextInt(10) == 0) {
                p2 = net.minecraft.w.h.p.b;
            } else {
                int n3 = this.bx.nextInt(7);
                int n4 = this.bx.nextInt(5);
                p2 = net.minecraft.w.h.p.a;
                n2 = n3 | n4 << 8;
            }
            ac2 = new r(p2, n2);
        }
        this.a(p2);
        this.f(n2);
        if (this.bx.nextInt(5) == 0) {
            this.e(-24000);
        }
        if (p2.h()) {
            this.a(net.minecraft.w.d.a).a(15.0);
            this.a(net.minecraft.w.d.d).a(0.2f);
        } else {
            this.a(net.minecraft.w.d.a).a(this.dT());
            if (p2 == net.minecraft.w.h.p.a) {
                this.a(net.minecraft.w.d.d).a(this.dV());
            } else {
                this.a(net.minecraft.w.d.d).a(0.175f);
            }
        }
        if (p2.g()) {
            this.a(h).a(0.5);
        } else {
            this.a(h).a(this.dU());
        }
        this.h(this.bw());
        return ac2;
    }

    @Override
    public boolean aI() {
        n n2 = this.da();
        return n2 instanceof l;
    }

    public float q(float f2) {
        return this.bZ + (this.P - this.bZ) * f2;
    }

    public float s(float f2) {
        return this.cb + (this.ca - this.cb) * f2;
    }

    public float t(float f2) {
        return this.cd + (this.cc - this.cd) * f2;
    }

    @Override
    public void a(int n2) {
        if (this.dz()) {
            if (n2 < 0) {
                n2 = 0;
            } else {
                this.M = true;
                this.dS();
            }
            this.f = n2 >= 90 ? 1.0f : 0.4f + 0.4f * (float)n2 / 90.0f;
        }
    }

    @Override
    public boolean b() {
        return this.dz();
    }

    @Override
    public void b(int n2) {
        this.M = true;
        this.dS();
    }

    @Override
    public void c() {
    }

    protected void x(boolean bl2) {
        aj aj2 = bl2 ? net.minecraft.u.aj.I : net.minecraft.u.aj.l;
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = this.bx.nextGaussian() * 0.02;
            double d3 = this.bx.nextGaussian() * 0.02;
            double d4 = this.bx.nextGaussian() * 0.02;
            this.aQ.a(aj2, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 7) {
            this.x(true);
        } else if (by2 == 6) {
            this.x(false);
        } else {
            super.a(by2);
        }
    }

    @Override
    public void p(n n2) {
        super.p(n2);
        if (n2 instanceof f) {
            f f2 = (f)n2;
            this.ak = f2.ak;
        }
        if (this.cb > 0.0f) {
            float f3 = net.minecraft.u.b.n.a(this.ak * ((float)Math.PI / 180));
            float f4 = net.minecraft.u.b.n.b(this.ak * ((float)Math.PI / 180));
            float f5 = 0.7f * this.cb;
            float f6 = 0.15f * this.cb;
            n2.e(this.aU + (double)(f5 * f3), this.aV + this.cs() + n2.Y() + (double)f6, this.aW - (double)(f5 * f4));
            if (n2 instanceof l) {
                ((l)n2).ak = this.ak;
            }
        }
    }

    @Override
    public double cs() {
        double d2 = super.cs();
        if (this.p() == net.minecraft.w.h.p.e) {
            d2 -= 0.1875;
        } else if (this.p() == net.minecraft.w.h.p.b) {
            d2 -= 0.25;
        }
        return d2;
    }

    private float dT() {
        return 15.0f + (float)this.bx.nextInt(8) + (float)this.bx.nextInt(9);
    }

    private double dU() {
        return (double)0.4f + this.bx.nextDouble() * 0.2 + this.bx.nextDouble() * 0.2 + this.bx.nextDouble() * 0.2;
    }

    private double dV() {
        return ((double)0.45f + this.bx.nextDouble() * 0.3 + this.bx.nextDouble() * 0.3 + this.bx.nextDouble() * 0.3) * 0.25;
    }

    public boolean dI() {
        return this.N;
    }

    public void y(boolean bl2) {
        if (bl2 != this.N) {
            this.N = bl2;
            if (bl2) {
                this.o.a(1, this.G);
            } else {
                this.o.a(this.G);
            }
        }
    }

    @Override
    public boolean bq() {
        return false;
    }

    @Override
    public float ce_() {
        return this.bm;
    }

    @Override
    public boolean a_(int n2, cu cu2) {
        int n3;
        if (n2 == 499 && this.p().f()) {
            if (cu2 == null && this.dp()) {
                this.e(false);
                this.dL();
                return true;
            }
            if (cu2 != null && cu2.a() == net.minecraft.m.cg.a(net.minecraft.a.p.ae) && !this.dp()) {
                this.e(true);
                this.dL();
                return true;
            }
        }
        if ((n3 = n2 - 400) >= 0 && n3 < 2 && n3 < this.K.e()) {
            if (n3 == 0 && cu2 != null && cu2.a() != net.minecraft.a.w.aC) {
                return false;
            }
            if (n3 != 1 || (cu2 == null || net.minecraft.w.h.z.b(cu2.a())) && this.p().j()) {
                this.K.a(n3, cu2);
                this.dM();
                return true;
            }
            return false;
        }
        int n4 = n2 - 500 + 2;
        if (n4 >= 2 && n4 < this.K.e()) {
            this.K.a(n4, cu2);
            return true;
        }
        return false;
    }

    @Override
    public n da() {
        return this.db().isEmpty() ? null : (n)this.db().get(0);
    }

    @Override
    public ae bB() {
        return this.p().h() ? net.minecraft.w.ae.b : net.minecraft.w.ae.a;
    }

    @Override
    protected bp ai() {
        return this.p().l();
    }
}

