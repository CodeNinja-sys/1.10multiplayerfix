/*
 * Decompiled with CFR 0.150.
 */
class cge
extends st {
    final /* synthetic */ bjs a;

    public cge(bjs bjs2, bxy bxy2) {
        this.a = bjs2;
        super(bxy2, bjs2.w, bjs2.x, 32, bjs2.x - 64, 10);
        this.a(false);
    }

    @Override
    protected int a() {
        return bpv.c.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected int e() {
        return this.a() * 10;
    }

    @Override
    protected void b() {
        this.a.aH_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        cyd cyd2 = (cyd)bpv.c.get(n2);
        this.a.b(bjs.a(this.a), cyd2.f().i(), n3 + 2, n4 + 1, n2 % 2 == 0 ? 0xFFFFFF : 0x909090);
        String string = cyd2.a(bjs.b(this.a).a(cyd2));
        this.a.b(bjs.c(this.a), string, n3 + 2 + 213 - bjs.d(this.a).a(string), n4 + 1, n2 % 2 == 0 ? 0xFFFFFF : 0x909090);
    }
}

