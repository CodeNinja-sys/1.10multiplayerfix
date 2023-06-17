/*
 * Decompiled with CFR 0.150.
 */
public class ji
extends cef {
    private int a = -1;

    public ji(iu iu2) {
        super(iu2);
    }

    public ji(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        cef.b(cgy2, "MinecartTNT");
    }

    @Override
    public cta bd_() {
        return cta.d;
    }

    @Override
    public dbk be_() {
        return blg.W.s();
    }

    @Override
    public void bb_() {
        double d2;
        super.bb_();
        if (this.a > 0) {
            --this.a;
            this.aQ.a(lz.l, this.aU, this.aV + 0.5, this.aW, 0.0, 0.0, 0.0, new int[0]);
        } else if (this.a == 0) {
            this.b(this.aX * this.aX + this.aZ * this.aZ);
        }
        if (this.bf && (d2 = this.aX * this.aX + this.aZ * this.aZ) >= (double)0.01f) {
            this.b(d2);
        }
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        cwt cwt2;
        cpk cpk2 = ahy2.a();
        if (cpk2 instanceof cwt && (cwt2 = (cwt)cpk2).y_()) {
            this.b(cwt2.aX * cwt2.aX + cwt2.aY * cwt2.aY + cwt2.aZ * cwt2.aZ);
        }
        return super.a(ahy2, f2);
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        double d2 = this.aX * this.aX + this.aZ * this.aZ;
        if (!ahy2.e() && this.aQ.F().b("doEntityDrops")) {
            this.a(new bhl(blg.W, 1), 0.0f);
        }
        if (ahy2.o() || ahy2.e() || d2 >= (double)0.01f) {
            this.b(d2);
        }
    }

    protected void b(double d2) {
        if (!this.aQ.C) {
            double d3 = Math.sqrt(d2);
            if (d3 > 5.0) {
                d3 = 5.0;
            }
            this.aQ.a(this, this.aU, this.aV, this.aW, (float)(4.0 + this.bx.nextDouble() * 1.5 * d3), true);
            this.ak_();
        }
    }

    @Override
    public void a(float f2, float f3) {
        if (f2 >= 3.0f) {
            float f4 = f2 / 10.0f;
            this.b((double)(f4 * f4));
        }
        super.a(f2, f3);
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        if (bl2 && this.a < 0) {
            this.j();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 10) {
            this.j();
        } else {
            super.a(by2);
        }
    }

    public void j() {
        this.a = 80;
        if (!this.aQ.C) {
            this.aQ.a((cpk)this, (byte)10);
            if (!this.ce()) {
                this.aQ.a(null, this.aU, this.aV, this.aW, dah.gz, csg.e, 1.0f, 1.0f);
            }
        }
    }

    public int k() {
        return this.a;
    }

    public boolean n() {
        return this.a > -1;
    }

    @Override
    public float a(yk yk2, iu iu2, cmz cmz2, dbk dbk2) {
        if (this.n() && (bxs.m(dbk2) || bxs.c(iu2, cmz2.g()))) {
            return 0.0f;
        }
        return super.a(yk2, iu2, cmz2, dbk2);
    }

    @Override
    public boolean a(yk yk2, iu iu2, cmz cmz2, dbk dbk2, float f2) {
        if (this.n() && (bxs.m(dbk2) || bxs.c(iu2, cmz2.g()))) {
            return false;
        }
        return super.a(yk2, iu2, cmz2, dbk2, f2);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.b("TNTFuse", 99)) {
            this.a = bvp2.h("TNTFuse");
        }
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("TNTFuse", this.a);
    }
}

