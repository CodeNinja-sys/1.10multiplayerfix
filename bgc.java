/*
 * Decompiled with CFR 0.150.
 */
public class bgc
extends bjv {
    public bgc(iu iu2) {
        super(iu2);
    }

    public bgc(iu iu2, bga bga2) {
        super(iu2, bga2);
    }

    public bgc(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        bjv.a(cgy2, "ThrowableExpBottle");
    }

    @Override
    protected float n() {
        return 0.07f;
    }

    @Override
    protected void a(auu auu2) {
        if (!this.aQ.C) {
            int n2;
            this.aQ.b(2002, new cmz(this), 0);
            for (int i2 = 3 + this.aQ.p.nextInt(5) + this.aQ.p.nextInt(5); i2 > 0; i2 -= n2) {
                n2 = cvs.c(i2);
                this.aQ.b(new cvs(this.aQ, this.aU, this.aV, this.aW, n2));
            }
            this.ak_();
        }
    }
}

