/*
 * Decompiled with CFR 0.150.
 */
public class nm
extends chw {
    private static final bcz e = bwm.a(nm.class, cbf.h);

    public nm(iu iu2) {
        super(iu2);
        this.a_(0.3125f, 0.3125f);
    }

    public nm(iu iu2, bga bga2, double d2, double d3, double d4) {
        super(iu2, bga2, d2, d3, d4);
        this.a_(0.3125f, 0.3125f);
    }

    public static void a(cgy cgy2) {
        chw.a(cgy2, "WitherSkull");
    }

    @Override
    protected float h() {
        return this.k() ? 0.73f : super.h();
    }

    public nm(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.a_(0.3125f, 0.3125f);
    }

    @Override
    public boolean y_() {
        return false;
    }

    @Override
    public float a(yk yk2, iu iu2, cmz cmz2, dbk dbk2) {
        float f2 = super.a(yk2, iu2, cmz2, dbk2);
        bfa bfa2 = dbk2.t();
        if (this.k() && dga.a(bfa2)) {
            f2 = Math.min(0.8f, f2);
        }
        return f2;
    }

    @Override
    protected void a(auu auu2) {
        if (!this.aQ.C) {
            if (auu2.d != null) {
                if (this.a != null) {
                    if (auu2.d.a(ahy.b(this.a), 8.0f)) {
                        if (auu2.d.bj()) {
                            this.a(this.a, auu2.d);
                        } else {
                            this.a.b_(5.0f);
                        }
                    }
                } else {
                    auu2.d.a(ahy.n, 5.0f);
                }
                if (auu2.d instanceof bga) {
                    int n2 = 0;
                    if (this.aQ.Q() == ct.c) {
                        n2 = 10;
                    } else if (this.aQ.Q() == ct.d) {
                        n2 = 40;
                    }
                    if (n2 > 0) {
                        ((bga)auu2.d).b(new cko(ake.t, 20 * n2, 1));
                    }
                }
            }
            this.aQ.a(this, this.aU, this.aV, this.aW, 1.0f, false, this.aQ.F().b("mobGriefing"));
            this.ak_();
        }
    }

    @Override
    public boolean bc_() {
        return false;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        return false;
    }

    @Override
    protected void a() {
        this.bE.a(e, false);
    }

    public boolean k() {
        return (Boolean)this.bE.a(e);
    }

    public void a(boolean bl2) {
        this.bE.b(e, bl2);
    }

    @Override
    protected boolean n() {
        return false;
    }
}

