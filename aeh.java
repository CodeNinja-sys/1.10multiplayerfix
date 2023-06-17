/*
 * Decompiled with CFR 0.150.
 */
public class aeh
extends ux {
    private final bdl a;
    private int b;

    public aeh(bdl bdl2, tb tb2, int n2, int n3, int n4) {
        super(tb2, n2, n3, n4);
        this.a = bdl2;
    }

    @Override
    public boolean a(bhl bhl2) {
        return false;
    }

    @Override
    public bhl a(int n2) {
        if (this.b()) {
            this.b += Math.min(n2, this.a().b);
        }
        return super.a(n2);
    }

    @Override
    public void a(bdl bdl2, bhl bhl2) {
        this.d(bhl2);
        super.a(bdl2, bhl2);
    }

    @Override
    protected void a(bhl bhl2, int n2) {
        this.b += n2;
        this.d(bhl2);
    }

    @Override
    protected void d(bhl bhl2) {
        bhl2.a(this.a.aQ, this.a, this.b);
        if (!this.a.aQ.C) {
            int n2;
            int n3 = this.b;
            float f2 = gu.a().b(bhl2);
            if (f2 == 0.0f) {
                n3 = 0;
            } else if (f2 < 1.0f) {
                n2 = cmk.d((float)n3 * f2);
                if (n2 < cmk.f((float)n3 * f2) && Math.random() < (double)((float)n3 * f2 - (float)n2)) {
                    ++n2;
                }
                n3 = n2;
            }
            while (n3 > 0) {
                n2 = cvs.c(n3);
                n3 -= n2;
                this.a.aQ.b(new cvs(this.a.aQ, this.a.aU, this.a.aV + 0.5, this.a.aW + 0.5, n2));
            }
        }
        this.b = 0;
        if (bhl2.a() == hp.l) {
            this.a.a((cyd)bpa.k);
        }
        if (bhl2.a() == hp.bc) {
            this.a.a((cyd)bpa.p);
        }
    }
}

