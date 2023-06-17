/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;

public class abi
extends cpk {
    private static final bcz b = bwm.a(abi.class, cbf.k);
    private static final bcz c = bwm.a(abi.class, cbf.h);
    public int a;

    public abi(iu iu2) {
        super(iu2);
        this.aN = true;
        this.a_(2.0f, 2.0f);
        this.a = this.bx.nextInt(100000);
    }

    public abi(iu iu2, double d2, double d3, double d4) {
        this(iu2);
        this.d(d2, d3, d4);
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected void a() {
        this.bY().a(b, cg.f());
        this.bY().a(c, true);
    }

    @Override
    public void bb_() {
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        ++this.a;
        if (!this.aQ.C) {
            cmz cmz2 = new cmz(this);
            if (this.aQ.q instanceof cup && this.aQ.n(cmz2).t() != blg.ab) {
                this.aQ.a(cmz2, blg.ab.s());
            }
        }
    }

    @Override
    protected void a(bvp bvp2) {
        if (this.n() != null) {
            bvp2.a("BeamTarget", ayj.a(this.n()));
        }
        bvp2.a("ShowBottom", this.p());
    }

    @Override
    protected void b(bvp bvp2) {
        if (bvp2.b("BeamTarget", 10)) {
            this.a(ayj.c(bvp2.o("BeamTarget")));
        }
        if (bvp2.b("ShowBottom", 1)) {
            this.a(bvp2.p("ShowBottom"));
        }
    }

    @Override
    public boolean bc_() {
        return true;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if (ahy2.b() instanceof brd) {
            return false;
        }
        if (!this.bk && !this.aQ.C) {
            this.ak_();
            if (!this.aQ.C) {
                this.aQ.a(null, this.aU, this.aV, this.aW, 6.0f, true);
                this.a(ahy2);
            }
        }
        return true;
    }

    @Override
    public void v_() {
        this.a(ahy.m);
        super.v_();
    }

    private void a(ahy ahy2) {
        cup cup2;
        cmd cmd2;
        if (this.aQ.q instanceof cup && (cmd2 = (cup2 = (cup)this.aQ.q).s()) != null) {
            cmd2.a(this, ahy2);
        }
    }

    public void a(cmz cmz2) {
        this.bY().b(b, cg.c(cmz2));
    }

    public cmz n() {
        return (cmz)((cg)this.bY().a(b)).d();
    }

    public void a(boolean bl2) {
        this.bY().b(c, bl2);
    }

    public boolean p() {
        return (Boolean)this.bY().a(c);
    }

    @Override
    public boolean a(double d2) {
        return super.a(d2) || this.n() != null;
    }
}

