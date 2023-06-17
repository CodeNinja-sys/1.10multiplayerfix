/*
 * Decompiled with CFR 0.150.
 */
class fi
extends st {
    public int a;
    final /* synthetic */ x b;

    public fi(x x2) {
        this.b = x2;
        super(x2.u, x2.w, x2.x, 80, x2.x - 37, 24);
        this.a = -1;
    }

    private void a(int n2, int n3, azg azg2, int n4) {
        this.e(n2 + 1, n3 + 1);
        cja.A();
        bjr.c();
        this.b.v.a(new bhl(azg2, 1, n4), n2 + 2, n3 + 2);
        bjr.a();
        cja.B();
    }

    private void e(int n2, int n3) {
        this.d(n2, n3, 0, 0);
    }

    private void d(int n2, int n3, int n4, int n5) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c.P().a(alo.o);
        float f2 = 0.0078125f;
        float f3 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b((double)(n2 + 0), (double)(n3 + 18), (double)x.a(this.b)).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        bix2.b((double)(n2 + 18), (double)(n3 + 18), (double)x.b(this.b)).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        bix2.b((double)(n2 + 18), (double)(n3 + 0), (double)x.c(this.b)).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        bix2.b((double)(n2 + 0), (double)(n3 + 0), (double)x.d(this.b)).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        bha2.b();
    }

    @Override
    protected int a() {
        return x.f().size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a = n2;
        this.b.e();
        x.f(this.b).a(((arx)x.f().get((int)x.e((x)this.b).a)).d);
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.a;
    }

    @Override
    protected void b() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        arx arx2 = (arx)x.f().get(n2);
        this.a(n3, n4, arx2.a, arx2.b);
        this.b.B.a(arx2.c, n3 + 18 + 5, n4 + 6, 0xFFFFFF);
    }
}

