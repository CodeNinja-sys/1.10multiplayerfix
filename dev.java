/*
 * Decompiled with CFR 0.150.
 */
public class dev
extends alo {
    private static final bpx a = new bpx("textures/gui/achievement/achievement_background.png");
    private final bxy b;
    private int c;
    private int d;
    private String e;
    private String f;
    private box g;
    private long h;
    private final bth i;
    private boolean j;

    public dev(bxy bxy2) {
        this.b = bxy2;
        this.i = bxy2.ae();
    }

    public void a(box box2) {
        this.e = bf.a("achievement.get", new Object[0]);
        this.f = box2.f().i();
        this.h = bxy.K();
        this.g = box2;
        this.j = false;
    }

    public void b(box box2) {
        this.e = box2.f().i();
        this.f = box2.g();
        this.h = bxy.K() + 2500L;
        this.g = box2;
        this.j = true;
    }

    private void c() {
        cja.b(0, 0, this.b.d, this.b.e);
        cja.l(5889);
        cja.C();
        cja.l(5888);
        cja.C();
        this.c = this.b.d;
        this.d = this.b.e;
        cnt cnt2 = new cnt(this.b);
        this.c = cnt2.a();
        this.d = cnt2.b();
        cja.k(256);
        cja.l(5889);
        cja.C();
        cja.a(0.0, this.c, this.d, 0.0, 1000.0, 3000.0);
        cja.l(5888);
        cja.C();
        cja.c(0.0f, 0.0f, -2000.0f);
    }

    public void a() {
        if (this.g == null || this.h == 0L || bxy.B().h == null) {
            return;
        }
        double d2 = (double)(bxy.K() - this.h) / 3000.0;
        if (this.j) {
            if (d2 > 0.5) {
                d2 = 0.5;
            }
        } else if (d2 < 0.0 || d2 > 1.0) {
            this.h = 0L;
            return;
        }
        this.c();
        cja.i();
        cja.a(false);
        double d3 = d2 * 2.0;
        if (d3 > 1.0) {
            d3 = 2.0 - d3;
        }
        d3 *= 4.0;
        if ((d3 = 1.0 - d3) < 0.0) {
            d3 = 0.0;
        }
        d3 *= d3;
        d3 *= d3;
        int n2 = this.c - 160;
        int n3 = 0 - (int)(d3 * 36.0);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.v();
        this.b.P().a(a);
        cja.f();
        this.c(n2, n3, 96, 202, 160, 32);
        if (this.j) {
            this.b.k.a(this.f, n2 + 30, n3 + 7, 120, -1);
        } else {
            this.b.k.a(this.e, n2 + 30, n3 + 7, -256);
            this.b.k.a(this.f, n2 + 30, n3 + 18, -1);
        }
        bjr.c();
        cja.f();
        cja.A();
        cja.g();
        cja.e();
        this.i.b(this.g.d, n2 + 8, n3 + 8);
        cja.f();
        cja.a(true);
        cja.j();
    }

    public void b() {
        this.g = null;
        this.h = 0L;
    }
}

