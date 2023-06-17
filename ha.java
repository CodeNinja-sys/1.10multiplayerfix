/*
 * Decompiled with CFR 0.150.
 */
public class ha
extends cgq
implements cso {
    private static final bcz a = bwm.a(ha.class, cbf.h);
    private int b = 1;

    public ha(iu iu2) {
        super(iu2);
        this.a_(4.0f, 4.0f);
        this.bD = true;
        this.i = 5;
        this.j = new aen(this);
    }

    @Override
    protected void n() {
        this.m.a(5, new chy(this));
        this.m.a(7, new dgl(this));
        this.m.a(7, new cir(this));
        this.n.a(1, new cqs(this));
    }

    public boolean w() {
        return (Boolean)this.bE.a(a);
    }

    public void a(boolean bl2) {
        this.bE.b(a, bl2);
    }

    public int x() {
        return this.b;
    }

    @Override
    public void bb_() {
        super.bb_();
        if (!this.aQ.C && this.aQ.Q() == ct.a) {
            this.ak_();
        }
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if ("fireball".equals(ahy2.p()) && ahy2.b() instanceof bdl) {
            super.a(ahy2, 1000.0f);
            ((bdl)ahy2.b()).a((cyd)bpa.z);
            return true;
        }
        return super.a(ahy2, f2);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, false);
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(10.0);
        this.a(cgz.b).a(100.0);
    }

    @Override
    public csg y() {
        return csg.f;
    }

    @Override
    protected bi q() {
        return dah.bL;
    }

    @Override
    protected bi r() {
        return dah.bN;
    }

    @Override
    protected bi s() {
        return dah.bM;
    }

    @Override
    protected bpx u() {
        return bvm.ag;
    }

    @Override
    protected float t() {
        return 10.0f;
    }

    @Override
    public boolean h() {
        return this.bx.nextInt(20) == 0 && super.h() && this.aQ.Q() != ct.a;
    }

    @Override
    public int z() {
        return 1;
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Ghast");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("ExplosionPower", this.b);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.b("ExplosionPower", 99)) {
            this.b = bvp2.h("ExplosionPower");
        }
    }

    @Override
    public float A() {
        return 2.6f;
    }
}

