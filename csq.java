/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public class csq
extends oe {
    private static final UUID b = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final cs c = new cs(b, "Attacking speed boost", 0.05, 0).a(false);
    private int d;
    private int e;
    private UUID f;

    public csq(iu iu2) {
        super(iu2);
        this.bD = true;
    }

    @Override
    public void d(bga bga2) {
        super.d(bga2);
        if (bga2 != null) {
            this.f = bga2.cx();
        }
    }

    @Override
    protected void x() {
        this.n.a(1, new bbm(this));
        this.n.a(2, new bzh(this));
    }

    @Override
    protected void p() {
        super.p();
        this.a(a).a(0.0);
        this.a(cgz.d).a(0.23f);
        this.a(cgz.e).a(5.0);
    }

    @Override
    public void bb_() {
        super.bb_();
    }

    @Override
    protected void o() {
        cp cp2 = this.a(cgz.d);
        if (this.aL()) {
            if (!this.R_() && !cp2.a(c)) {
                cp2.b(c);
            }
            --this.d;
        } else if (cp2.a(c)) {
            cp2.c(c);
        }
        if (this.e > 0 && --this.e == 0) {
            this.a(dah.hL, this.t() * 2.0f, ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f) * 1.8f);
        }
        if (this.d > 0 && this.f != null && this.aX() == null) {
            bdl bdl2 = this.aQ.a(this.f);
            this.d(bdl2);
            this.am = bdl2;
            this.an = this.aY();
        }
        super.o();
    }

    @Override
    public boolean h() {
        return this.aQ.Q() != ct.a;
    }

    @Override
    public boolean i() {
        return this.aQ.a(this.cD(), (cpk)this) && this.aQ.a((cpk)this, this.cD()).isEmpty() && !this.aQ.e(this.cD());
    }

    public static void d(cgy cgy2) {
        xy.a(cgy2, "PigZombie");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Anger", (short)this.d);
        if (this.f != null) {
            bvp2.a("HurtBy", this.f.toString());
        } else {
            bvp2.a("HurtBy", "");
        }
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.d = bvp2.g("Anger");
        String string = bvp2.l("HurtBy");
        if (!string.isEmpty()) {
            this.f = UUID.fromString(string);
            bdl bdl2 = this.aQ.a(this.f);
            this.d(bdl2);
            if (bdl2 != null) {
                this.am = bdl2;
                this.an = this.aY();
            }
        }
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        cpk cpk2 = ahy2.b();
        if (cpk2 instanceof bdl) {
            this.u(cpk2);
        }
        return super.a(ahy2, f2);
    }

    private void u(cpk cpk2) {
        this.d = 400 + this.bx.nextInt(400);
        this.e = this.bx.nextInt(40);
        if (cpk2 instanceof bga) {
            this.d((bga)cpk2);
        }
    }

    public boolean aL() {
        return this.d > 0;
    }

    @Override
    protected bi q() {
        return dah.hK;
    }

    @Override
    protected bi r() {
        return dah.hN;
    }

    @Override
    protected bi s() {
        return dah.hM;
    }

    @Override
    protected bpx u() {
        return bvm.ak;
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        return false;
    }

    @Override
    protected void a(bgp bgp2) {
        this.a(dfm.a, new bhl(hp.D));
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        super.a(bgp2, aql2);
        this.a(cnf.a);
        return aql2;
    }

    static /* synthetic */ void a(csq csq2, cpk cpk2) {
        csq2.u(cpk2);
    }
}

