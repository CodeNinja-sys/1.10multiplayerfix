/*
 * Decompiled with CFR 0.150.
 */
public class clw
extends akr {
    public clw(iu iu2) {
        super(iu2);
        this.bD = true;
    }

    public static void c(cgy cgy2) {
        xy.a(cgy2, "LavaSlime");
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.d).a(0.2f);
    }

    @Override
    public boolean h() {
        return this.aQ.Q() != ct.a;
    }

    @Override
    public boolean i() {
        return this.aQ.a(this.cD(), (cpk)this) && this.aQ.a((cpk)this, this.cD()).isEmpty() && !this.aQ.e(this.cD());
    }

    @Override
    protected void d(int n2) {
        super.d(n2);
        this.a(cgz.g).a((double)(n2 * 3));
    }

    @Override
    public int b(float f2) {
        return 0xF000F0;
    }

    @Override
    public float a(float f2) {
        return 1.0f;
    }

    @Override
    protected lz F() {
        return lz.A;
    }

    @Override
    protected akr Q() {
        return new clw(this.aQ);
    }

    @Override
    protected bpx u() {
        return this.D() ? bvm.a : bvm.af;
    }

    @Override
    public boolean y_() {
        return false;
    }

    @Override
    protected int M() {
        return super.M() * 4;
    }

    @Override
    protected void L() {
        this.a *= 0.9f;
    }

    @Override
    protected void ad_() {
        this.aY = 0.42f + (float)this.B() * 0.1f;
        this.bO = true;
    }

    @Override
    protected void bw() {
        this.aY = 0.22f + (float)this.B() * 0.05f;
        this.bO = true;
    }

    @Override
    public void a(float f2, float f3) {
    }

    @Override
    protected boolean T() {
        return true;
    }

    @Override
    protected int Y() {
        return super.Y() + 2;
    }

    @Override
    protected bi r() {
        if (this.D()) {
            return dah.fM;
        }
        return dah.dq;
    }

    @Override
    protected bi s() {
        if (this.D()) {
            return dah.fL;
        }
        return dah.dp;
    }

    @Override
    protected bi Z() {
        if (this.D()) {
            return dah.fN;
        }
        return dah.ds;
    }

    @Override
    protected bi ae() {
        return dah.dr;
    }
}

