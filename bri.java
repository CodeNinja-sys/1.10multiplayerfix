/*
 * Decompiled with CFR 0.150.
 */
public class bri
implements wd {
    private String a = "";
    private final bxy b;
    private String c = "";
    private long d = bxy.K();
    private boolean e;
    private final cnt f;
    private final btr g;

    public bri(bxy bxy2) {
        this.b = bxy2;
        this.f = new cnt(bxy2);
        this.g = new btr(bxy2.d, bxy2.e, false);
        this.g.a(9728);
    }

    @Override
    public void b(String string) {
        this.e = false;
        this.d(string);
    }

    @Override
    public void a(String string) {
        this.e = true;
        this.d(string);
    }

    private void d(String string) {
        this.c = string;
        if (!this.b.C) {
            if (this.e) {
                return;
            }
            throw new cbx();
        }
        cja.k(256);
        cja.l(5889);
        cja.C();
        if (cjg.i()) {
            int n2 = this.f.e();
            cja.a(0.0, this.f.a() * n2, this.f.b() * n2, 0.0, 100.0, 300.0);
        } else {
            cnt cnt2 = new cnt(this.b);
            cja.a(0.0, cnt2.c(), cnt2.d(), 0.0, 100.0, 300.0);
        }
        cja.l(5888);
        cja.C();
        cja.c(0.0f, 0.0f, -200.0f);
    }

    @Override
    public void c(String string) {
        if (!this.b.C) {
            if (this.e) {
                return;
            }
            throw new cbx();
        }
        this.d = 0L;
        this.a = string;
        this.a(-1);
        this.d = 0L;
    }

    @Override
    public void a(int n2) {
        if (!this.b.C) {
            if (this.e) {
                return;
            }
            throw new cbx();
        }
        long l2 = bxy.K();
        if (l2 - this.d < 100L) {
            return;
        }
        this.d = l2;
        cnt cnt2 = new cnt(this.b);
        int n3 = cnt2.e();
        int n4 = cnt2.a();
        int n5 = cnt2.b();
        if (cjg.i()) {
            this.g.f();
        } else {
            cja.k(256);
        }
        this.g.a(false);
        cja.l(5889);
        cja.C();
        cja.a(0.0, cnt2.c(), cnt2.d(), 0.0, 100.0, 300.0);
        cja.l(5888);
        cja.C();
        cja.c(0.0f, 0.0f, -200.0f);
        if (!cjg.i()) {
            cja.k(16640);
        }
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        this.b.P().a(alo.n);
        float f2 = 32.0f;
        bix2.a(7, bxb.i);
        bix2.b(0.0, (double)n5, 0.0).a(0.0, (float)n5 / 32.0f).b(64, 64, 64, 255).d();
        bix2.b((double)n4, (double)n5, 0.0).a((float)n4 / 32.0f, (float)n5 / 32.0f).b(64, 64, 64, 255).d();
        bix2.b((double)n4, 0.0, 0.0).a((float)n4 / 32.0f, 0.0).b(64, 64, 64, 255).d();
        bix2.b(0.0, 0.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 255).d();
        bha2.b();
        if (n2 >= 0) {
            int n6 = 100;
            int n7 = 2;
            int n8 = n4 / 2 - 50;
            int n9 = n5 / 2 + 16;
            cja.w();
            bix2.a(7, bxb.f);
            bix2.b((double)n8, (double)n9, 0.0).b(128, 128, 128, 255).d();
            bix2.b((double)n8, (double)(n9 + 2), 0.0).b(128, 128, 128, 255).d();
            bix2.b((double)(n8 + 100), (double)(n9 + 2), 0.0).b(128, 128, 128, 255).d();
            bix2.b((double)(n8 + 100), (double)n9, 0.0).b(128, 128, 128, 255).d();
            bix2.b((double)n8, (double)n9, 0.0).b(128, 255, 128, 255).d();
            bix2.b((double)n8, (double)(n9 + 2), 0.0).b(128, 255, 128, 255).d();
            bix2.b((double)(n8 + n2), (double)(n9 + 2), 0.0).b(128, 255, 128, 255).d();
            bix2.b((double)(n8 + n2), (double)n9, 0.0).b(128, 255, 128, 255).d();
            bha2.b();
            cja.v();
        }
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        this.b.k.a(this.c, (float)((n4 - this.b.k.a(this.c)) / 2), (float)(n5 / 2 - 4 - 16), 0xFFFFFF);
        this.b.k.a(this.a, (float)((n4 - this.b.k.a(this.a)) / 2), (float)(n5 / 2 - 4 + 8), 0xFFFFFF);
        this.g.e();
        if (cjg.i()) {
            this.g.c(n4 * n3, n5 * n3);
        }
        this.b.k();
        try {
            Thread.yield();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void a() {
    }
}

