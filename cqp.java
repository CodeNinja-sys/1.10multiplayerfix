/*
 * Decompiled with CFR 0.150.
 */
public class cqp
implements ye {
    private final bxy a = bxy.B();
    private final alo b;
    private final alo c;
    private alo d;

    public cqp(alo alo2, alo alo3) {
        this.b = alo2;
        this.c = alo3;
    }

    public alo a() {
        return this.b;
    }

    public alo b() {
        return this.c;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        this.a(this.b, n4, n7, n8, false);
        this.a(this.c, n4, n7, n8, false);
    }

    private void a(alo alo2, int n2, int n3, int n4, boolean bl2) {
        if (alo2 == null) {
            return;
        }
        if (alo2 instanceof cwv) {
            this.a((cwv)alo2, n2, n3, n4, bl2);
        } else if (alo2 instanceof cld) {
            this.a((cld)alo2, n2, bl2);
        } else if (alo2 instanceof arw) {
            this.a((arw)alo2, n2, n3, n4, bl2);
        }
    }

    private void a(cwv cwv2, int n2, int n3, int n4, boolean bl2) {
        cwv2.h = n2;
        if (!bl2) {
            cwv2.c(this.a, n3, n4);
        }
    }

    private void a(cld cld2, int n2, boolean bl2) {
        cld2.b = n2;
        if (!bl2) {
            cld2.g();
        }
    }

    private void a(arw arw2, int n2, int n3, int n4, boolean bl2) {
        arw2.d = n2;
        if (!bl2) {
            arw2.a(this.a, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        this.a(this.b, n4, 0, 0, true);
        this.a(this.c, n4, 0, 0, true);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2 = this.a(this.b, n3, n4, n5);
        boolean bl3 = this.a(this.c, n3, n4, n5);
        return bl2 || bl3;
    }

    private boolean a(alo alo2, int n2, int n3, int n4) {
        if (alo2 == null) {
            return false;
        }
        if (alo2 instanceof cwv) {
            return this.a((cwv)alo2, n2, n3, n4);
        }
        if (alo2 instanceof cld) {
            this.a((cld)alo2, n2, n3, n4);
        }
        return false;
    }

    private boolean a(cwv cwv2, int n2, int n3, int n4) {
        boolean bl2 = cwv2.b(this.a, n2, n3);
        if (bl2) {
            this.d = cwv2;
        }
        return bl2;
    }

    private void a(cld cld2, int n2, int n3, int n4) {
        cld2.a(n2, n3, n4);
        if (cld2.k()) {
            this.d = cld2;
        }
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.b(this.b, n3, n4, n5);
        this.b(this.c, n3, n4, n5);
    }

    private void b(alo alo2, int n2, int n3, int n4) {
        if (alo2 == null) {
            return;
        }
        if (alo2 instanceof cwv) {
            this.b((cwv)alo2, n2, n3, n4);
        }
    }

    private void b(cwv cwv2, int n2, int n3, int n4) {
        cwv2.a(n2, n3);
    }

    static /* synthetic */ alo a(cqp cqp2) {
        return cqp2.b;
    }

    static /* synthetic */ alo b(cqp cqp2) {
        return cqp2.c;
    }

    static /* synthetic */ alo c(cqp cqp2) {
        return cqp2.d;
    }
}

