/*
 * Decompiled with CFR 0.150.
 */
public class aul
extends ux {
    private final yo a;
    private final bdl b;
    private int g;

    public aul(bdl bdl2, yo yo2, tb tb2, int n2, int n3, int n4) {
        super(tb2, n2, n3, n4);
        this.b = bdl2;
        this.a = yo2;
    }

    @Override
    public boolean a(bhl bhl2) {
        return false;
    }

    @Override
    public bhl a(int n2) {
        if (this.b()) {
            this.g += Math.min(n2, this.a().b);
        }
        return super.a(n2);
    }

    @Override
    protected void a(bhl bhl2, int n2) {
        this.g += n2;
        this.d(bhl2);
    }

    @Override
    protected void d(bhl bhl2) {
        if (this.g > 0) {
            bhl2.a(this.b.aQ, this.b, this.g);
        }
        this.g = 0;
        if (bhl2.a() == azg.a(blg.ai)) {
            this.b.a((cyd)bpa.h);
        }
        if (bhl2.a() instanceof dax) {
            this.b.a((cyd)bpa.i);
        }
        if (bhl2.a() == azg.a(blg.al)) {
            this.b.a((cyd)bpa.j);
        }
        if (bhl2.a() instanceof axj) {
            this.b.a((cyd)bpa.l);
        }
        if (bhl2.a() == hp.R) {
            this.b.a((cyd)bpa.m);
        }
        if (bhl2.a() == hp.bg) {
            this.b.a((cyd)bpa.n);
        }
        if (bhl2.a() instanceof dax && ((dax)bhl2.a()).f() != avx.a) {
            this.b.a((cyd)bpa.o);
        }
        if (bhl2.a() instanceof bof) {
            this.b.a((cyd)bpa.r);
        }
        if (bhl2.a() == azg.a(blg.bC)) {
            this.b.a((cyd)bpa.E);
        }
        if (bhl2.a() == azg.a(blg.X)) {
            this.b.a((cyd)bpa.G);
        }
    }

    @Override
    public void a(bdl bdl2, bhl bhl2) {
        this.d(bhl2);
        bhl[] arrbhl = gx.a().b(this.a, bdl2.aQ);
        for (int i2 = 0; i2 < arrbhl.length; ++i2) {
            bhl bhl3 = this.a.a(i2);
            bhl bhl4 = arrbhl[i2];
            if (bhl3 != null) {
                this.a.a(i2, 1);
                bhl3 = this.a.a(i2);
            }
            if (bhl4 == null) continue;
            if (bhl3 == null) {
                this.a.a(i2, bhl4);
                continue;
            }
            if (bhl.c(bhl3, bhl4) && bhl.a(bhl3, bhl4)) {
                bhl4.b += bhl3.b;
                this.a.a(i2, bhl4);
                continue;
            }
            if (this.b.n.c(bhl4)) continue;
            this.b.a(bhl4, false);
        }
    }
}

