/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class er
extends cpk {
    private static final d b = org.apache.logging.log4j.c.c();
    private static final bcz c = bwm.a(er.class, cbf.f);
    private int d;
    private int e;
    private int f = 5;
    private String g;
    private String h;
    public float a = (float)(Math.random() * Math.PI * 2.0);

    public er(iu iu2, double d2, double d3, double d4) {
        super(iu2);
        this.a_(0.25f, 0.25f);
        this.d(d2, d3, d4);
        this.ba = (float)(Math.random() * 360.0);
        this.aX = (float)(Math.random() * (double)0.2f - (double)0.1f);
        this.aY = 0.2f;
        this.aZ = (float)(Math.random() * (double)0.2f - (double)0.1f);
    }

    public er(iu iu2, double d2, double d3, double d4, bhl bhl2) {
        this(iu2, d2, d3, d4);
        this.a(bhl2);
    }

    @Override
    protected boolean e() {
        return false;
    }

    public er(iu iu2) {
        super(iu2);
        this.a_(0.25f, 0.25f);
        this.a(new bhl(blg.a, 0));
    }

    @Override
    protected void a() {
        this.bY().a(c, cg.f());
    }

    @Override
    public void bb_() {
        boolean bl2;
        if (this.h() == null) {
            this.ak_();
            return;
        }
        super.bb_();
        if (this.e > 0 && this.e != 32767) {
            --this.e;
        }
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (!this.cf()) {
            this.aY -= (double)0.04f;
        }
        this.bv = this.e(this.aU, (this.cD().b + this.cD().e) / 2.0, this.aW);
        this.b(this.aX, this.aY, this.aZ);
        boolean bl3 = bl2 = (int)this.aR != (int)this.aU || (int)this.aS != (int)this.aV || (int)this.aT != (int)this.aW;
        if (bl2 || this.by % 25 == 0) {
            if (this.aQ.n(new cmz(this)).a() == ahk.i) {
                this.aY = 0.2f;
                this.aX = (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f;
                this.aZ = (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f;
                this.a(dah.bB, 0.4f, 2.0f + this.bx.nextFloat() * 0.4f);
            }
            if (!this.aQ.C) {
                this.w();
            }
        }
        float f2 = 0.98f;
        if (this.be) {
            f2 = this.aQ.n((cmz)new cmz((int)cmk.c((double)this.aU), (int)(cmk.c((double)this.cD().b) - 1), (int)cmk.c((double)this.aW))).t().N * 0.98f;
        }
        this.aX *= (double)f2;
        this.aY *= (double)0.98f;
        this.aZ *= (double)f2;
        if (this.be) {
            this.aY *= -0.5;
        }
        if (this.d != -32768) {
            ++this.d;
        }
        this.bf_();
        if (!this.aQ.C && this.d >= 6000) {
            this.ak_();
        }
    }

    private void w() {
        for (er er2 : this.aQ.a(er.class, this.cD().b(0.5, 0.0, 0.5))) {
            this.a(er2);
        }
    }

    private boolean a(er er2) {
        if (er2 == this) {
            return false;
        }
        if (!er2.bj() || !this.bj()) {
            return false;
        }
        bhl bhl2 = this.h();
        bhl bhl3 = er2.h();
        if (this.e == 32767 || er2.e == 32767) {
            return false;
        }
        if (this.d == -32768 || er2.d == -32768) {
            return false;
        }
        if (bhl3.a() != bhl2.a()) {
            return false;
        }
        if (bhl3.n() ^ bhl2.n()) {
            return false;
        }
        if (bhl3.n() && !bhl3.o().equals(bhl2.o())) {
            return false;
        }
        if (bhl3.a() == null) {
            return false;
        }
        if (bhl3.a().j() && bhl3.h() != bhl2.h()) {
            return false;
        }
        if (bhl3.b < bhl2.b) {
            return er2.a(this);
        }
        if (bhl3.b + bhl2.b > bhl3.b()) {
            return false;
        }
        bhl3.b += bhl2.b;
        er2.e = Math.max(er2.e, this.e);
        er2.d = Math.min(er2.d, this.d);
        er2.a(bhl3);
        this.ak_();
        return true;
    }

    public void f() {
        this.d = 4800;
    }

    @Override
    public boolean bf_() {
        if (this.aQ.a(this.cD(), ahk.h, (cpk)this)) {
            if (!this.bA && !this.bC) {
                this.J_();
            }
            this.bA = true;
        } else {
            this.bA = false;
        }
        return this.bA;
    }

    @Override
    protected void f_(int n2) {
        this.a(ahy.a, (float)n2);
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if (this.h() != null && this.h().a() == hp.cj && ahy2.e()) {
            return false;
        }
        this.bz();
        this.f = (int)((float)this.f - f2);
        if (this.f <= 0) {
            this.ak_();
        }
        return false;
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.e, (cui)new amo("Item", new String[]{"Item"}));
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("Health", (short)this.f);
        bvp2.a("Age", (short)this.d);
        bvp2.a("PickupDelay", (short)this.e);
        if (this.j() != null) {
            bvp2.a("Thrower", this.g);
        }
        if (this.i() != null) {
            bvp2.a("Owner", this.h);
        }
        if (this.h() != null) {
            bvp2.a("Item", this.h().b(new bvp()));
        }
    }

    @Override
    public void b(bvp bvp2) {
        this.f = bvp2.g("Health");
        this.d = bvp2.g("Age");
        if (bvp2.e("PickupDelay")) {
            this.e = bvp2.g("PickupDelay");
        }
        if (bvp2.e("Owner")) {
            this.h = bvp2.l("Owner");
        }
        if (bvp2.e("Thrower")) {
            this.g = bvp2.l("Thrower");
        }
        bvp bvp3 = bvp2.o("Item");
        this.a(bhl.a(bvp3));
        if (this.h() == null) {
            this.ak_();
        }
    }

    @Override
    public void b_(bdl bdl2) {
        if (this.aQ.C) {
            return;
        }
        bhl bhl2 = this.h();
        int n2 = bhl2.b;
        if (this.e == 0 && (this.h == null || 6000 - this.d <= 200 || this.h.equals(bdl2.i_())) && bdl2.n.c(bhl2)) {
            bdl bdl3;
            if (bhl2.a() == azg.a(blg.r)) {
                bdl2.a((cyd)bpa.g);
            }
            if (bhl2.a() == azg.a(blg.s)) {
                bdl2.a((cyd)bpa.g);
            }
            if (bhl2.a() == hp.aM) {
                bdl2.a((cyd)bpa.t);
            }
            if (bhl2.a() == hp.k) {
                bdl2.a((cyd)bpa.w);
            }
            if (bhl2.a() == hp.bC) {
                bdl2.a((cyd)bpa.A);
            }
            if (bhl2.a() == hp.k && this.j() != null && (bdl3 = this.aQ.a(this.j())) != null && bdl3 != bdl2) {
                bdl3.a((cyd)bpa.x);
            }
            if (!this.ce()) {
                this.aQ.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.da, csg.h, 0.2f, ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            bdl2.b(this, n2);
            if (bhl2.b <= 0) {
                this.ak_();
            }
            bdl2.a(bpv.d(bhl2.a()), n2);
        }
    }

    @Override
    public String i_() {
        if (this.j_()) {
            return this.cA();
        }
        return caf.a("item." + this.h().k());
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public cpk e_(int n2) {
        cpk cpk2 = super.e_(n2);
        if (!this.aQ.C && cpk2 instanceof er) {
            ((er)cpk2).w();
        }
        return cpk2;
    }

    public bhl h() {
        bhl bhl2 = (bhl)((cg)this.bY().a(c)).d();
        if (bhl2 == null) {
            if (this.aQ != null) {
                b.b("Item entity {} has no item?!", this.bW());
            }
            return new bhl(blg.b);
        }
        return bhl2;
    }

    public void a(bhl bhl2) {
        this.bY().b(c, cg.c(bhl2));
        this.bY().b(c);
    }

    public String i() {
        return this.h;
    }

    public void a(String string) {
        this.h = string;
    }

    public String j() {
        return this.g;
    }

    public void b(String string) {
        this.g = string;
    }

    public int k() {
        return this.d;
    }

    public void l() {
        this.e = 10;
    }

    public void m() {
        this.e = 0;
    }

    public void n() {
        this.e = 32767;
    }

    public void c(int n2) {
        this.e = n2;
    }

    public boolean o() {
        return this.e > 0;
    }

    public void p() {
        this.d = -6000;
    }

    public void q() {
        this.n();
        this.d = 5999;
    }
}

