/*
 * Decompiled with CFR 0.150.
 */
class ac
extends cyx {
    private final bgv a;
    private bdl j;
    private int k;
    private int l;

    public ac(bgv bgv2) {
        super((cfl)bgv2, bdl.class, false);
        this.a = bgv2;
    }

    @Override
    public boolean b() {
        double d2 = this.aK_();
        this.j = this.a.aQ.a(this.a.aU, this.a.aV, this.a.aW, d2, d2, null, new xs(this));
        return this.j != null;
    }

    @Override
    public void c() {
        this.k = 5;
        this.l = 0;
    }

    @Override
    public void d() {
        this.j = null;
        super.d();
    }

    @Override
    public boolean a() {
        if (this.j != null) {
            if (!bgv.a(this.a, this.j)) {
                return false;
            }
            this.a.a((cpk)this.j, 10.0f, 10.0f);
            return true;
        }
        if (this.i != null && ((bdl)this.i).bj()) {
            return true;
        }
        return super.a();
    }

    @Override
    public void e() {
        if (this.j != null) {
            if (--this.k <= 0) {
                this.i = this.j;
                this.j = null;
                super.c();
            }
        } else {
            if (this.i != null) {
                if (bgv.a(this.a, (bdl)this.i)) {
                    if (((bdl)this.i).l(this.a) < 16.0) {
                        this.a.Z();
                    }
                    this.l = 0;
                } else if (((bdl)this.i).l(this.a) > 256.0 && this.l++ >= 30 && this.a.f(this.i)) {
                    this.l = 0;
                }
            }
            super.e();
        }
    }

    static /* synthetic */ bgv a(ac ac2) {
        return ac2.a;
    }
}

