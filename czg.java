/*
 * Decompiled with CFR 0.150.
 */
public class czg
extends alo
implements aye {
    private static final bpx b = new bpx("textures/gui/widgets.png");
    public static final bpx a = new bpx("textures/gui/spectator_widgets.png");
    private final bxy c;
    private long d;
    private bou e;

    public czg(bxy bxy2) {
        this.c = bxy2;
    }

    public void a(int n2) {
        this.d = bxy.K();
        if (this.e != null) {
            this.e.b(n2);
        } else {
            this.e = new bou(this);
        }
    }

    private float c() {
        long l2 = this.d - bxy.K() + 5000L;
        return cmk.a((float)l2 / 2000.0f, 0.0f, 1.0f);
    }

    public void a(cnt cnt2, float f2) {
        if (this.e == null) {
            return;
        }
        float f3 = this.c();
        if (f3 <= 0.0f) {
            this.e.d();
            return;
        }
        int n2 = cnt2.a() / 2;
        float f4 = this.q;
        this.q = -90.0f;
        float f5 = (float)cnt2.b() - 22.0f * f3;
        bvq bvq2 = this.e.f();
        this.a(cnt2, f3, n2, f5, bvq2);
        this.q = f4;
    }

    protected void a(cnt cnt2, float f2, int n2, float f3, bvq bvq2) {
        cja.A();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.c(1.0f, 1.0f, 1.0f, f2);
        this.c.P().a(b);
        this.a(n2 - 91, f3, 0, 0, 182, 22);
        if (bvq2.a() >= 0) {
            this.a(n2 - 91 - 1 + bvq2.a() * 20, f3 - 1.0f, 0, 22, 24, 22);
        }
        bjr.c();
        for (int i2 = 0; i2 < 9; ++i2) {
            this.a(i2, cnt2.a() / 2 - 90 + i2 * 20 + 2, f3 + 3.0f, f2, bvq2.a(i2));
        }
        bjr.a();
        cja.B();
        cja.k();
    }

    private void a(int n2, int n3, float f2, float f3, cbd cbd2) {
        this.c.P().a(a);
        if (cbd2 != bou.a) {
            int n4 = (int)(f3 * 255.0f);
            cja.D();
            cja.c((float)n3, f2, 0.0f);
            float f4 = cbd2.b() ? 1.0f : 0.25f;
            cja.c(f4, f4, f4, f3);
            cbd2.a(f4, n4);
            cja.E();
            String string = String.valueOf(cmx.a(this.c.u.an[n2].j()));
            if (n4 > 3 && cbd2.b()) {
                this.c.k.a(string, (float)(n3 + 19 - 2 - this.c.k.a(string)), f2 + 6.0f + 3.0f, 0xFFFFFF + (n4 << 24));
            }
        }
    }

    public void a(cnt cnt2) {
        int n2 = (int)(this.c() * 255.0f);
        if (n2 > 3 && this.e != null) {
            String string;
            cbd cbd2 = this.e.b();
            String string2 = string = cbd2 == bou.a ? this.e.c().d().j() : cbd2.a().j();
            if (string != null) {
                int n3 = (cnt2.a() - this.c.k.a(string)) / 2;
                int n4 = cnt2.b() - 35;
                cja.D();
                cja.l();
                cja.a(bjt.l, afi.j, bjt.e, afi.n);
                this.c.k.a(string, (float)n3, (float)n4, 0xFFFFFF + (n2 << 24));
                cja.k();
                cja.E();
            }
        }
    }

    @Override
    public void a(bou bou2) {
        this.e = null;
        this.d = 0L;
    }

    public boolean a() {
        return this.e != null;
    }

    public void b(int n2) {
        int n3;
        for (n3 = this.e.e() + n2; !(n3 < 0 || n3 > 8 || this.e.a(n3) != bou.a && this.e.a(n3).b()); n3 += n2) {
        }
        if (n3 >= 0 && n3 <= 8) {
            this.e.b(n3);
            this.d = bxy.K();
        }
    }

    public void b() {
        this.d = bxy.K();
        if (this.a()) {
            int n2 = this.e.e();
            if (n2 != -1) {
                this.e.b(n2);
            }
        } else {
            this.e = new bou(this);
        }
    }
}

