/*
 * Decompiled with CFR 0.150.
 */
class ie
extends st {
    public int a;
    final /* synthetic */ dae b;

    public ie(dae dae2) {
        this.b = dae2;
        super(dae2.u, dae2.w, dae2.x, 43, dae2.x - 60, 24);
        this.a = -1;
    }

    private void a(int n2, int n3, bhl bhl2) {
        this.e(n2 + 1, n3 + 1);
        cja.A();
        if (bhl2 != null && bhl2.a() != null) {
            bjr.c();
            this.b.v.a(bhl2, n2 + 2, n3 + 2);
            bjr.a();
        }
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
        bix2.b((double)(n2 + 0), (double)(n3 + 18), (double)dae.a(this.b)).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        bix2.b((double)(n2 + 18), (double)(n3 + 18), (double)dae.b(this.b)).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        bix2.b((double)(n2 + 18), (double)(n3 + 0), (double)dae.c(this.b)).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        bix2.b((double)(n2 + 0), (double)(n3 + 0), (double)dae.d(this.b)).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        bha2.b();
    }

    @Override
    protected int a() {
        return dae.e(this.b).c().size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a = n2;
        this.b.h();
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
        String string;
        pb pb2 = (pb)dae.e(this.b).c().get(dae.e(this.b).c().size() - n2 - 1);
        dbk dbk2 = pb2.b();
        bfa bfa2 = dbk2.t();
        azg azg2 = azg.a(bfa2);
        bhl bhl2 = bfa2 == blg.a || azg2 == null ? null : new bhl(azg2, 1, bfa2.e(dbk2));
        String string2 = string = bhl2 == null ? bf.a("createWorld.customize.flat.air", new Object[0]) : azg2.c(bhl2);
        if (azg2 == null) {
            if (bfa2 == blg.j || bfa2 == blg.i) {
                azg2 = hp.az;
            } else if (bfa2 == blg.l || bfa2 == blg.k) {
                azg2 = hp.aA;
            }
            if (azg2 != null) {
                bhl2 = new bhl(azg2, 1, bfa2.e(dbk2));
                string = bfa2.az_();
            }
        }
        this.a(n3, n4, bhl2);
        this.b.B.a(string, n3 + 18 + 5, n4 + 3, 0xFFFFFF);
        String string3 = n2 == 0 ? bf.a("createWorld.customize.flat.layer.top", pb2.a()) : (n2 == dae.e(this.b).c().size() - 1 ? bf.a("createWorld.customize.flat.layer.bottom", pb2.a()) : bf.a("createWorld.customize.flat.layer", pb2.a()));
        this.b.B.a(string3, n3 + 2 + 213 - this.b.B.a(string3), n4 + 3, 0xFFFFFF);
    }

    @Override
    protected int c() {
        return this.d - 70;
    }
}

