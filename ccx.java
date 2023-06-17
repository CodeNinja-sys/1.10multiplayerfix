/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.s.r;

public class ccx
extends st {
    private final r a;

    public ccx(r r2, int n2, int n3, int n4, int n5, int n6) {
        super(bxy.B(), n2, n3, n4, n5, n6);
        this.a = r2;
    }

    @Override
    protected int a() {
        return this.a.a();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a.a(n2, bl2, n3, n4);
    }

    @Override
    protected boolean a(int n2) {
        return this.a.a(n2);
    }

    @Override
    protected void b() {
        this.a.c();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a(n2, n3, n4, n5, n6, n7);
    }

    public int l() {
        return this.d;
    }

    public int m() {
        return this.l;
    }

    public int n() {
        return this.k;
    }

    @Override
    protected int e() {
        return this.a.b();
    }

    @Override
    protected int c() {
        return this.a.g();
    }

    @Override
    public void i() {
        super.i();
    }

    @Override
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
        int n8 = this.g();
        if (n8 > 0) {
            int n9 = (this.g - this.f) * (this.g - this.f) / this.e();
            int n10 = (int)this.p * (this.g - this.f - (n9 = cmk.a(n9, 32, this.g - this.f - 8))) / n8 + this.f;
            if (n10 < this.f) {
                n10 = this.f;
            }
            bix2.a(7, bxb.i);
            bix2.b((double)n4, (double)this.g, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b((double)n5, (double)this.g, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
            bix2.b((double)n5, (double)this.f, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
            bix2.b((double)n4, (double)this.f, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
            bha2.b();
            bix2.a(7, bxb.i);
            bix2.b((double)n4, (double)(n10 + n9), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
            bix2.b((double)n5, (double)(n10 + n9), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
            bix2.b((double)n5, (double)n10, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
            bix2.b((double)n4, (double)n10, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
            bha2.b();
            bix2.a(7, bxb.i);
            bix2.b((double)n4, (double)(n10 + n9 - 1), 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
            bix2.b((double)(n5 - 1), (double)(n10 + n9 - 1), 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
            bix2.b((double)(n5 - 1), (double)n10, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
            bix2.b((double)n4, (double)n10, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
            bha2.b();
        }
        this.b(n2, n3);
        cja.v();
        cja.j(7424);
        cja.d();
        cja.k();
    }
}

