/*
 * Decompiled with CFR 0.150.
 */
class od
implements adj {
    final /* synthetic */ ib a;

    od(ib ib2) {
        this.a = ib2;
    }

    @Override
    public void a(ajw ajw2, double d2) {
        this.a.U().a(d2);
    }

    @Override
    public void a(ajw ajw2, double d2, double d3, long l2) {
        this.a.U().a(d2, d3, l2);
    }

    @Override
    public void a(ajw ajw2, double d2, double d3) {
        this.a.U().b(d2, d3);
    }

    @Override
    public void a(ajw ajw2, int n2) {
        this.a.U().b(n2);
    }

    @Override
    public void b(ajw ajw2, int n2) {
        this.a.U().c(n2);
    }

    @Override
    public void b(ajw ajw2, double d2) {
        this.a.U().c(d2);
    }

    @Override
    public void c(ajw ajw2, double d2) {
        this.a.U().b(d2);
    }
}

