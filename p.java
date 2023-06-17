/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;

public class p
extends cpk {
    private static final bcz a = bwm.a(p.class, cbf.f);
    private int b;
    private int c;

    public p(iu iu2) {
        super(iu2);
        this.a_(0.25f, 0.25f);
    }

    @Override
    protected void a() {
        this.bE.a(a, cg.f());
    }

    @Override
    public boolean a(double d2) {
        return d2 < 4096.0;
    }

    public p(iu iu2, double d2, double d3, double d4, bhl bhl2) {
        super(iu2);
        this.b = 0;
        this.a_(0.25f, 0.25f);
        this.d(d2, d3, d4);
        int n2 = 1;
        if (bhl2 != null && bhl2.n()) {
            this.bE.b(a, cg.b(bhl2));
            bvp bvp2 = bhl2.o();
            bvp bvp3 = bvp2.o("Fireworks");
            n2 += bvp3.f("Flight");
        }
        this.aX = this.bx.nextGaussian() * 0.001;
        this.aZ = this.bx.nextGaussian() * 0.001;
        this.aY = 0.05;
        this.c = 10 * n2 + this.bx.nextInt(6) + this.bx.nextInt(7);
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.aX = d2;
        this.aY = d3;
        this.aZ = d4;
        if (this.bd == 0.0f && this.bc == 0.0f) {
            float f2 = cmk.a(d2 * d2 + d4 * d4);
            this.ba = (float)(cmk.b(d2, d4) * 57.2957763671875);
            this.bb = (float)(cmk.b(d3, (double)f2) * 57.2957763671875);
            this.bc = this.ba;
            this.bd = this.bb;
        }
    }

    @Override
    public void bb_() {
        this.br = this.aU;
        this.bs = this.aV;
        this.bt = this.aW;
        super.bb_();
        this.aX *= 1.15;
        this.aZ *= 1.15;
        this.aY += 0.04;
        this.b(this.aX, this.aY, this.aZ);
        float f2 = cmk.a(this.aX * this.aX + this.aZ * this.aZ);
        this.ba = (float)(cmk.b(this.aX, this.aZ) * 57.2957763671875);
        this.bb = (float)(cmk.b(this.aY, (double)f2) * 57.2957763671875);
        while (this.bb - this.bd < -180.0f) {
            this.bd -= 360.0f;
        }
        while (this.bb - this.bd >= 180.0f) {
            this.bd += 360.0f;
        }
        while (this.ba - this.bc < -180.0f) {
            this.bc -= 360.0f;
        }
        while (this.ba - this.bc >= 180.0f) {
            this.bc += 360.0f;
        }
        this.bb = this.bd + (this.bb - this.bd) * 0.2f;
        this.ba = this.bc + (this.ba - this.bc) * 0.2f;
        if (this.b == 0 && !this.ce()) {
            this.aQ.a(null, this.aU, this.aV, this.aW, dah.bs, csg.i, 3.0f, 1.0f);
        }
        ++this.b;
        if (this.aQ.C && this.b % 2 < 2) {
            this.aQ.a(lz.d, this.aU, this.aV - 0.3, this.aW, this.bx.nextGaussian() * 0.05, -this.aY * 0.5, this.bx.nextGaussian() * 0.05, new int[0]);
        }
        if (!this.aQ.C && this.b > this.c) {
            this.aQ.a((cpk)this, (byte)17);
            this.ak_();
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 17 && this.aQ.C) {
            bhl bhl2 = (bhl)((cg)this.bE.a(a)).d();
            bvp bvp2 = null;
            if (bhl2 != null && bhl2.n()) {
                bvp2 = bhl2.o().o("Fireworks");
            }
            this.aQ.a(this.aU, this.aV, this.aW, this.aX, this.aY, this.aZ, bvp2);
        }
        super.a(by2);
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.e, (cui)new amo("FireworksRocketEntity", new String[]{"FireworksItem"}));
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("Life", this.b);
        bvp2.a("LifeTime", this.c);
        bhl bhl2 = (bhl)((cg)this.bE.a(a)).d();
        if (bhl2 != null) {
            bvp2.a("FireworksItem", bhl2.b(new bvp()));
        }
    }

    @Override
    public void b(bvp bvp2) {
        bhl bhl2;
        this.b = bvp2.h("Life");
        this.c = bvp2.h("LifeTime");
        bvp bvp3 = bvp2.o("FireworksItem");
        if (bvp3 != null && (bhl2 = bhl.a(bvp3)) != null) {
            this.bE.b(a, cg.b(bhl2));
        }
    }

    @Override
    public float a(float f2) {
        return super.a(f2);
    }

    @Override
    public int b(float f2) {
        return super.b(f2);
    }

    @Override
    public boolean c() {
        return false;
    }
}

