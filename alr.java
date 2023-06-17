/*
 * Decompiled with CFR 0.150.
 */
public class alr
implements ye {
    private final cuz c;
    protected final bxy a;
    protected final mg b;
    private long d;

    protected alr(cuz cuz2, mg mg2) {
        this.c = cuz2;
        this.b = mg2;
        this.a = bxy.B();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        this.a.k.a(bf.a("lanServer.title", new Object[0]), n3 + 32 + 3, n4 + 1, 0xFFFFFF);
        this.a.k.a(this.b.a(), n3 + 32 + 3, n4 + 12, 0x808080);
        if (this.a.u.x) {
            this.a.k.a(bf.a("selectServer.hiddenAddress", new Object[0]), n3 + 32 + 3, n4 + 12 + 11, 0x303030);
        } else {
            this.a.k.a(this.b.b(), n3 + 32 + 3, n4 + 12 + 11, 0x303030);
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.c.b(n2);
        if (bxy.K() - this.d < 250L) {
            this.c.h();
        }
        this.d = bxy.K();
        return false;
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public mg a() {
        return this.b;
    }
}

