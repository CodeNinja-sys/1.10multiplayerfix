/*
 * Decompiled with CFR 0.150.
 */
public class cgg
extends cpk {
    private static final bcz a = bwm.a(cgg.class, cbf.b);
    private bga b;
    private int c = 80;

    public cgg(iu iu2) {
        super(iu2);
        this.aN = true;
        this.a_(0.98f, 0.98f);
    }

    public cgg(iu iu2, double d2, double d3, double d4, bga bga2) {
        this(iu2);
        this.d(d2, d3, d4);
        float f2 = (float)(Math.random() * 6.2831854820251465);
        this.aX = -((float)Math.sin(f2)) * 0.02f;
        this.aY = 0.2f;
        this.aZ = -((float)Math.cos(f2)) * 0.02f;
        this.c(80);
        this.aR = d2;
        this.aS = d3;
        this.aT = d4;
        this.b = bga2;
    }

    @Override
    protected void a() {
        this.bE.a(a, 80);
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    public boolean bc_() {
        return !this.bk;
    }

    @Override
    public void bb_() {
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (!this.cf()) {
            this.aY -= (double)0.04f;
        }
        this.b(this.aX, this.aY, this.aZ);
        this.aX *= (double)0.98f;
        this.aY *= (double)0.98f;
        this.aZ *= (double)0.98f;
        if (this.be) {
            this.aX *= (double)0.7f;
            this.aZ *= (double)0.7f;
            this.aY *= -0.5;
        }
        --this.c;
        if (this.c <= 0) {
            this.ak_();
            if (!this.aQ.C) {
                this.B();
            }
        } else {
            this.bf_();
            this.aQ.a(lz.l, this.aU, this.aV + 0.5, this.aW, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    private void B() {
        float f2 = 4.0f;
        this.aQ.a(this, this.aU, this.aV + (double)(this.bm / 16.0f), this.aW, 4.0f, true);
    }

    @Override
    protected void a(bvp bvp2) {
        bvp2.a("Fuse", (short)this.w());
    }

    @Override
    protected void b(bvp bvp2) {
        this.c(bvp2.g("Fuse"));
    }

    public bga n() {
        return this.b;
    }

    @Override
    public float A() {
        return 0.0f;
    }

    public void c(int n2) {
        this.bE.b(a, n2);
        this.c = n2;
    }

    @Override
    public void a(bcz bcz2) {
        if (a.equals(bcz2)) {
            this.c = this.p();
        }
    }

    public int p() {
        return (Integer)this.bE.a(a);
    }

    public int w() {
        return this.c;
    }
}

