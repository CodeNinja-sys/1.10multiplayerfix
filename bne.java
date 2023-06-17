/*
 * Decompiled with CFR 0.150.
 */
class bne
extends st {
    public int a;
    final /* synthetic */ blk b;

    public bne(blk blk2) {
        this.b = blk2;
        super(blk2.u, blk2.w, blk2.x, 80, blk2.x - 32, 38);
        this.a = -1;
    }

    @Override
    protected int a() {
        return blk.h().size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a = n2;
        this.b.f();
        blk.b(this.b).a(((kr)blk.h().get((int)blk.a((blk)this.b).a)).c.toString());
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.a;
    }

    @Override
    protected void b() {
    }

    private void a(int n2, int n3, bpx bpx2) {
        int n4 = n2 + 5;
        int n5 = n3;
        blk.a(this.b, n4 - 1, n4 + 32, n5 - 1, -2039584);
        blk.b(this.b, n4 - 1, n4 + 32, n5 + 32, -6250336);
        blk.c(this.b, n4 - 1, n5 - 1, n5 + 32, -2039584);
        blk.d(this.b, n4 + 32, n5 - 1, n5 + 32, -6250336);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c.P().a(bpx2);
        int n6 = 32;
        int n7 = 32;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b((double)(n4 + 0), (double)(n5 + 32), 0.0).a(0.0, 1.0).d();
        bix2.b((double)(n4 + 32), (double)(n5 + 32), 0.0).a(1.0, 1.0).d();
        bix2.b((double)(n4 + 32), (double)(n5 + 0), 0.0).a(1.0, 0.0).d();
        bix2.b((double)(n4 + 0), (double)(n5 + 0), 0.0).a(0.0, 0.0).d();
        bha2.b();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        kr kr2 = (kr)blk.h().get(n2);
        this.a(n3, n4, kr2.b);
        this.b.B.a(kr2.a, n3 + 32 + 10, n4 + 14, 0xFFFFFF);
    }
}

