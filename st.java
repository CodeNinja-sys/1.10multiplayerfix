/*
 * Decompiled with CFR 0.150.
 */
import org.lwjgl.a.j;

public abstract class st {
    protected final bxy c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected final int j;
    private int a;
    private int b;
    protected int k;
    protected int l;
    protected boolean m = true;
    protected int n = -2;
    protected float o;
    protected float p;
    protected int q = -1;
    protected long r;
    protected boolean s = true;
    protected boolean t = true;
    protected boolean u;
    protected int v;
    private boolean w = true;

    public st(bxy bxy2, int n2, int n3, int n4, int n5, int n6) {
        this.c = bxy2;
        this.d = n2;
        this.e = n3;
        this.f = n4;
        this.g = n5;
        this.j = n6;
        this.i = 0;
        this.h = n2;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.d = n2;
        this.e = n3;
        this.f = n4;
        this.g = n5;
        this.i = 0;
        this.h = n2;
    }

    public void a(boolean bl2) {
        this.t = bl2;
    }

    protected void a(boolean bl2, int n2) {
        this.u = bl2;
        this.v = n2;
        if (!bl2) {
            this.v = 0;
        }
    }

    protected abstract int a();

    protected abstract void a(int var1, boolean var2, int var3, int var4);

    protected abstract boolean a(int var1);

    protected int e() {
        return this.a() * this.j + this.v;
    }

    protected abstract void b();

    protected void a(int n2, int n3, int n4) {
    }

    protected abstract void a(int var1, int var2, int var3, int var4, int var5, int var6);

    protected void a(int n2, int n3, bha bha2) {
    }

    protected void a(int n2, int n3) {
    }

    protected void b(int n2, int n3) {
    }

    public int c(int n2, int n3) {
        int n4 = this.i + this.d / 2 - this.d() / 2;
        int n5 = this.i + this.d / 2 + this.d() / 2;
        int n6 = n3 - this.f - this.v + (int)this.p - 4;
        int n7 = n6 / this.j;
        if (n2 < this.c() && n2 >= n4 && n2 <= n5 && n7 >= 0 && n6 >= 0 && n7 < this.a()) {
            return n7;
        }
        return -1;
    }

    public void d(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    protected void f() {
        this.p = cmk.a(this.p, 0.0f, (float)this.g());
    }

    public int g() {
        return Math.max(0, this.e() - (this.g - this.f - 4));
    }

    public int h() {
        return (int)this.p;
    }

    public boolean d(int n2) {
        return n2 >= this.f && n2 <= this.g && this.k >= this.i && this.k <= this.h;
    }

    public void e(int n2) {
        this.p += (float)n2;
        this.f();
        this.n = -2;
    }

    public void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == this.a) {
            this.p -= (float)(this.j * 2 / 3);
            this.n = -2;
            this.f();
        } else if (cwv2.j == this.b) {
            this.p += (float)(this.j * 2 / 3);
            this.n = -2;
            this.f();
        }
    }

    public void a(int n2, int n3, float f2) {
        if (!this.s) {
            return;
        }
        this.k = n2;
        this.l = n3;
        this.b();
        int n4 = this.c();
        int n5 = n4 + 6;
        this.f();
        cja.f();
        cja.o();
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        this.c.P().a(alo.n);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        float f3 = 32.0f;
        bix2.a(7, bxb.i);
        bix2.b((double)this.i, (double)this.g, 0.0).a((float)this.i / 32.0f, (float)(this.g + (int)this.p) / 32.0f).b(32, 32, 32, 255).d();
        bix2.b((double)this.h, (double)this.g, 0.0).a((float)this.h / 32.0f, (float)(this.g + (int)this.p) / 32.0f).b(32, 32, 32, 255).d();
        bix2.b((double)this.h, (double)this.f, 0.0).a((float)this.h / 32.0f, (float)(this.f + (int)this.p) / 32.0f).b(32, 32, 32, 255).d();
        bix2.b((double)this.i, (double)this.f, 0.0).a((float)this.i / 32.0f, (float)(this.f + (int)this.p) / 32.0f).b(32, 32, 32, 255).d();
        bha2.b();
        int n6 = this.i + this.d / 2 - this.d() / 2 + 2;
        int n7 = this.f + 4 - (int)this.p;
        if (this.u) {
            this.a(n6, n7, bha2);
        }
        this.b(n6, n7, n2, n3);
        cja.i();
        this.c(0, this.f, 255, 255);
        this.c(this.g, this.e, 255, 255);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.o, afi.e);
        cja.c();
        cja.j(7425);
        cja.w();
        int n8 = 4;
        bix2.a(7, bxb.i);
        bix2.b((double)this.i, (double)(this.f + 4), 0.0).a(0.0, 1.0).b(0, 0, 0, 0).d();
        bix2.b((double)this.h, (double)(this.f + 4), 0.0).a(1.0, 1.0).b(0, 0, 0, 0).d();
        bix2.b((double)this.h, (double)this.f, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
        bix2.b((double)this.i, (double)this.f, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
        bha2.b();
        bix2.a(7, bxb.i);
        bix2.b((double)this.i, (double)this.g, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
        bix2.b((double)this.h, (double)this.g, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
        bix2.b((double)this.h, (double)(this.g - 4), 0.0).a(1.0, 0.0).b(0, 0, 0, 0).d();
        bix2.b((double)this.i, (double)(this.g - 4), 0.0).a(0.0, 0.0).b(0, 0, 0, 0).d();
        bha2.b();
        int n9 = this.g();
        if (n9 > 0) {
            int n10 = (this.g - this.f) * (this.g - this.f) / this.e();
            int n11 = (int)this.p * (this.g - this.f - (n10 = cmk.a(n10, 32, this.g - this.f - 8))) / n9 + this.f;
            if (n11 < this.f) {
                n11 = this.f;
            }
            bix2.a(7, bxb.i);
            bix2.b((double)n4, (double)this.g, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b((double)n5, (double)this.g, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b((double)n5, (double)this.f, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
            bix2.b((double)n4, (double)this.f, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
            bha2.b();
            bix2.a(7, bxb.i);
            bix2.b((double)n4, (double)(n11 + n10), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
            bix2.b((double)n5, (double)(n11 + n10), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
            bix2.b((double)n5, (double)n11, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
            bix2.b((double)n4, (double)n11, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
            bha2.b();
            bix2.a(7, bxb.i);
            bix2.b((double)n4, (double)(n11 + n10 - 1), 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
            bix2.b((double)(n5 - 1), (double)(n11 + n10 - 1), 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
            bix2.b((double)(n5 - 1), (double)n11, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
            bix2.b((double)n4, (double)n11, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
            bha2.b();
        }
        this.b(n2, n3);
        cja.v();
        cja.j(7424);
        cja.d();
        cja.k();
    }

    public void i() {
        int n2;
        int n3;
        int n4;
        int n5;
        if (!this.d(this.l)) {
            return;
        }
        if (org.lwjgl.a.j.i() == 0 && org.lwjgl.a.j.j() && this.l >= this.f && this.l <= this.g) {
            n5 = (this.d - this.d()) / 2;
            n4 = (this.d + this.d()) / 2;
            n3 = this.l - this.f - this.v + (int)this.p - 4;
            n2 = n3 / this.j;
            if (n2 < this.a() && this.k >= n5 && this.k <= n4 && n2 >= 0 && n3 >= 0) {
                this.a(n2, false, this.k, this.l);
                this.q = n2;
            } else if (this.k >= n5 && this.k <= n4 && n3 < 0) {
                this.a(this.k - n5, this.l - this.f + (int)this.p - 4);
            }
        }
        if (org.lwjgl.a.j.a(0) && this.j()) {
            if (this.n == -1) {
                n5 = 1;
                if (this.l >= this.f && this.l <= this.g) {
                    int n6;
                    n4 = (this.d - this.d()) / 2;
                    n3 = (this.d + this.d()) / 2;
                    n2 = this.l - this.f - this.v + (int)this.p - 4;
                    int n7 = n2 / this.j;
                    if (n7 < this.a() && this.k >= n4 && this.k <= n3 && n7 >= 0 && n2 >= 0) {
                        n6 = n7 == this.q && bxy.K() - this.r < 250L ? 1 : 0;
                        this.a(n7, n6 != 0, this.k, this.l);
                        this.q = n7;
                        this.r = bxy.K();
                    } else if (this.k >= n4 && this.k <= n3 && n2 < 0) {
                        this.a(this.k - n4, this.l - this.f + (int)this.p - 4);
                        n5 = 0;
                    }
                    n6 = this.c();
                    int n8 = n6 + 6;
                    if (this.k >= n6 && this.k <= n8) {
                        this.o = -1.0f;
                        int n9 = this.g();
                        if (n9 < 1) {
                            n9 = 1;
                        }
                        int n10 = (int)((float)((this.g - this.f) * (this.g - this.f)) / (float)this.e());
                        n10 = cmk.a(n10, 32, this.g - this.f - 8);
                        this.o /= (float)(this.g - this.f - n10) / (float)n9;
                    } else {
                        this.o = 1.0f;
                    }
                    this.n = n5 != 0 ? this.l : -2;
                } else {
                    this.n = -2;
                }
            } else if (this.n >= 0) {
                this.p -= (float)(this.l - this.n) * this.o;
                this.n = this.l;
            }
        } else {
            this.n = -1;
        }
        n5 = org.lwjgl.a.j.o();
        if (n5 != 0) {
            if (n5 > 0) {
                n5 = -1;
            } else if (n5 < 0) {
                n5 = 1;
            }
            this.p += (float)(n5 * this.j / 2);
        }
    }

    public void b(boolean bl2) {
        this.w = bl2;
    }

    public boolean j() {
        return this.w;
    }

    public int d() {
        return 220;
    }

    protected void b(int n2, int n3, int n4, int n5) {
        int n6 = this.a();
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = n3 + i2 * this.j + this.v;
            int n8 = this.j - 4;
            if (n7 > this.g || n7 + n8 < this.f) {
                this.a(i2, n2, n7);
            }
            if (this.t && this.a(i2)) {
                int n9 = this.i + (this.d / 2 - this.d() / 2);
                int n10 = this.i + this.d / 2 + this.d() / 2;
                cja.c(1.0f, 1.0f, 1.0f, 1.0f);
                cja.w();
                bix2.a(7, bxb.i);
                bix2.b((double)n9, (double)(n7 + n8 + 2), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
                bix2.b((double)n10, (double)(n7 + n8 + 2), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
                bix2.b((double)n10, (double)(n7 - 2), 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
                bix2.b((double)n9, (double)(n7 - 2), 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
                bix2.b((double)(n9 + 1), (double)(n7 + n8 + 1), 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
                bix2.b((double)(n10 - 1), (double)(n7 + n8 + 1), 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
                bix2.b((double)(n10 - 1), (double)(n7 - 1), 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
                bix2.b((double)(n9 + 1), (double)(n7 - 1), 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
                bha2.b();
                cja.v();
            }
            this.a(i2, n2, n7, n8, n4, n5);
        }
    }

    protected int c() {
        return this.d / 2 + 124;
    }

    protected void c(int n2, int n3, int n4, int n5) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        this.c.P().a(alo.n);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        float f2 = 32.0f;
        bix2.a(7, bxb.i);
        bix2.b((double)this.i, (double)n3, 0.0).a(0.0, (float)n3 / 32.0f).b(64, 64, 64, n5).d();
        bix2.b((double)(this.i + this.d), (double)n3, 0.0).a((float)this.d / 32.0f, (float)n3 / 32.0f).b(64, 64, 64, n5).d();
        bix2.b((double)(this.i + this.d), (double)n2, 0.0).a((float)this.d / 32.0f, (float)n2 / 32.0f).b(64, 64, 64, n4).d();
        bix2.b((double)this.i, (double)n2, 0.0).a(0.0, (float)n2 / 32.0f).b(64, 64, 64, n4).d();
        bha2.b();
    }

    public void f(int n2) {
        this.i = n2;
        this.h = n2 + this.d;
    }

    public int k() {
        return this.j;
    }
}

