/*
 * Decompiled with CFR 0.150.
 */
public class abn
extends bql
implements avf {
    public float a;
    public float b;
    public int c;
    private int d;

    @Override
    public void a() {
        double d2;
        if (++this.d % 20 * 4 == 0) {
            this.k.c(this.l, blg.bQ, 1, this.c);
        }
        this.b = this.a;
        int n2 = this.l.a();
        int n3 = this.l.b();
        int n4 = this.l.c();
        float f2 = 0.1f;
        if (this.c > 0 && this.a == 0.0f) {
            double d3 = (double)n2 + 0.5;
            d2 = (double)n4 + 0.5;
            this.k.a(null, d3, (double)n3 + 0.5, d2, dah.aN, csg.e, 0.5f, this.k.p.nextFloat() * 0.1f + 0.9f);
        }
        if (this.c == 0 && this.a > 0.0f || this.c > 0 && this.a < 1.0f) {
            float f3 = this.a;
            this.a = this.c > 0 ? (this.a += 0.1f) : (this.a -= 0.1f);
            if (this.a > 1.0f) {
                this.a = 1.0f;
            }
            float f4 = 0.5f;
            if (this.a < 0.5f && f3 >= 0.5f) {
                d2 = (double)n2 + 0.5;
                double d4 = (double)n4 + 0.5;
                this.k.a(null, d2, (double)n3 + 0.5, d4, dah.aM, csg.e, 0.5f, this.k.p.nextFloat() * 0.1f + 0.9f);
            }
            if (this.a < 0.0f) {
                this.a = 0.0f;
            }
        }
    }

    @Override
    public boolean a_(int n2, int n3) {
        if (n2 == 1) {
            this.c = n3;
            return true;
        }
        return super.a_(n2, n3);
    }

    @Override
    public void e_() {
        this.g_();
        super.e_();
    }

    public void f() {
        ++this.c;
        this.k.c(this.l, blg.bQ, 1, this.c);
    }

    public void g() {
        --this.c;
        this.k.c(this.l, blg.bQ, 1, this.c);
    }

    public boolean a(bdl bdl2) {
        if (this.k.q(this.l) != this) {
            return false;
        }
        return !(bdl2.i((double)this.l.a() + 0.5, (double)this.l.b() + 0.5, (double)this.l.c() + 0.5) > 64.0);
    }
}

