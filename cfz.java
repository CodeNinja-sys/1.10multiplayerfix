/*
 * Decompiled with CFR 0.150.
 */
class cfz
extends eu {
    final /* synthetic */ cmg h;

    public cfz(cmg cmg2) {
        this.h = cmg2;
        super(cmg2, 1.25, true);
    }

    @Override
    protected void a(bga bga2, double d2) {
        double d3 = this.a(bga2);
        if (d2 <= d3 && this.c <= 0) {
            this.c = 20;
            this.b.a(bga2);
            this.h.d(false);
        } else if (d2 <= d3 * 2.0) {
            if (this.c <= 0) {
                this.h.d(false);
                this.c = 20;
            }
            if (this.c <= 10) {
                this.h.d(true);
                this.h.T();
            }
        } else {
            this.c = 20;
            this.h.d(false);
        }
    }

    @Override
    public void d() {
        this.h.d(false);
        super.d();
    }

    @Override
    protected double a(bga bga2) {
        return 4.0f + bga2.bl;
    }
}

