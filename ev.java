/*
 * Decompiled with CFR 0.150.
 */
public abstract class ev
extends xy
implements cjl {
    public ev(iu iu2) {
        super(iu2);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean i() {
        return this.aQ.a(this.cD(), (cpk)this);
    }

    @Override
    public int j() {
        return 120;
    }

    @Override
    protected boolean k() {
        return true;
    }

    @Override
    protected int c_(bdl bdl2) {
        return 1 + this.aQ.p.nextInt(3);
    }

    @Override
    public void w_() {
        int n2 = this.cu();
        super.w_();
        if (this.bj() && !this.V_()) {
            this.o(--n2);
            if (this.cu() == -20) {
                this.o(0);
                this.a(ahy.g, 2.0f);
            }
        } else {
            this.o(300);
        }
    }

    @Override
    public boolean A_() {
        return false;
    }
}

