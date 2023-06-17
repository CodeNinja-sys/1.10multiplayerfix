/*
 * Decompiled with CFR 0.150.
 */
public abstract class bfh
extends ck {
    private final cfl c;
    private final double d;
    protected int a;
    private int e;
    private int f;
    protected cmz b = cmz.e;
    private boolean g;
    private final int h;

    public bfh(cfl cfl2, double d2, int n2) {
        this.c = cfl2;
        this.d = d2;
        this.h = n2;
        this.a(5);
    }

    @Override
    public boolean b() {
        if (this.a > 0) {
            --this.a;
            return false;
        }
        this.a = 200 + this.c.aW().nextInt(200);
        return this.i();
    }

    @Override
    public boolean a() {
        return this.e >= -this.f && this.e <= 1200 && this.a(this.c.aQ, this.b);
    }

    @Override
    public void c() {
        this.c.ap().a((double)this.b.a() + 0.5, this.b.b() + 1, (double)this.b.c() + 0.5, this.d);
        this.e = 0;
        this.f = this.c.aW().nextInt(this.c.aW().nextInt(1200) + 1200) + 1200;
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
        if (this.c.f(this.b.g()) > 1.0) {
            this.g = false;
            ++this.e;
            if (this.e % 40 == 0) {
                this.c.ap().a((double)this.b.a() + 0.5, this.b.b() + 1, (double)this.b.c() + 0.5, this.d);
            }
        } else {
            this.g = true;
            --this.e;
        }
    }

    protected boolean f() {
        return this.g;
    }

    private boolean i() {
        int n2 = this.h;
        boolean bl2 = true;
        cmz cmz2 = new cmz(this.c);
        int n3 = 0;
        while (n3 <= 1) {
            for (int i2 = 0; i2 < n2; ++i2) {
                int n4 = 0;
                while (n4 <= i2) {
                    int n5;
                    int n6 = n5 = n4 < i2 && n4 > -i2 ? i2 : 0;
                    while (n5 <= i2) {
                        cmz cmz3 = cmz2.e(n4, n3 - 1, n5);
                        if (this.c.d(cmz3) && this.a(this.c.aQ, cmz3)) {
                            this.b = cmz3;
                            return true;
                        }
                        n5 = n5 > 0 ? -n5 : 1 - n5;
                    }
                    n4 = n4 > 0 ? -n4 : 1 - n4;
                }
            }
            n3 = n3 > 0 ? -n3 : 1 - n3;
        }
        return false;
    }

    protected abstract boolean a(iu var1, cmz var2);
}

