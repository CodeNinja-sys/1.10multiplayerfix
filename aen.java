/*
 * Decompiled with CFR 0.150.
 */
class aen
extends cel {
    private final ha i;
    private int j;

    public aen(ha ha2) {
        super(ha2);
        this.i = ha2;
    }

    @Override
    public void a() {
        if (this.h != azu.b) {
            return;
        }
        double d2 = this.b - this.i.aU;
        double d3 = this.c - this.i.aV;
        double d4 = this.d - this.i.aW;
        double d5 = d2 * d2 + d3 * d3 + d4 * d4;
        if (this.j-- <= 0) {
            this.j += this.i.aW().nextInt(5) + 2;
            if (this.b(this.b, this.c, this.d, d5 = (double)cmk.a(d5))) {
                this.i.aX += d2 / d5 * 0.1;
                this.i.aY += d3 / d5 * 0.1;
                this.i.aZ += d4 / d5 * 0.1;
            } else {
                this.h = azu.a;
            }
        }
    }

    private boolean b(double d2, double d3, double d4, double d5) {
        double d6 = (d2 - this.i.aU) / d5;
        double d7 = (d3 - this.i.aV) / d5;
        double d8 = (d4 - this.i.aW) / d5;
        cxt cxt2 = this.i.cD();
        int n2 = 1;
        while ((double)n2 < d5) {
            if (!this.i.aQ.a((cpk)this.i, cxt2 = cxt2.c(d6, d7, d8)).isEmpty()) {
                return false;
            }
            ++n2;
        }
        return true;
    }
}

