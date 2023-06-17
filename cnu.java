/*
 * Decompiled with CFR 0.150.
 */
public class cnu
implements ds {
    private lz a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;
    private boolean j;
    private int[] k;

    public cnu() {
    }

    public cnu(lz lz2, boolean bl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2, int ... arrn) {
        this.a = lz2;
        this.j = bl2;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = n2;
        this.k = arrn;
    }

    @Override
    public void a(si si2) {
        this.a = lz.a(si2.K());
        if (this.a == null) {
            this.a = lz.J;
        }
        this.j = si2.D();
        this.b = si2.O();
        this.c = si2.O();
        this.d = si2.O();
        this.e = si2.O();
        this.f = si2.O();
        this.g = si2.O();
        this.h = si2.O();
        this.i = si2.K();
        int n2 = this.a.d();
        this.k = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.k[i2] = si2.e();
        }
    }

    @Override
    public void b(si si2) {
        si2.E(this.a.c());
        si2.a(this.j);
        si2.a(this.b);
        si2.a(this.c);
        si2.a(this.d);
        si2.a(this.e);
        si2.a(this.f);
        si2.a(this.g);
        si2.a(this.h);
        si2.E(this.i);
        int n2 = this.a.d();
        for (int i2 = 0; i2 < n2; ++i2) {
            si2.d(this.k[i2]);
        }
    }

    public lz a() {
        return this.a;
    }

    public boolean b() {
        return this.j;
    }

    public double c() {
        return this.b;
    }

    public double d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    public float f() {
        return this.e;
    }

    public float g() {
        return this.f;
    }

    public float h() {
        return this.g;
    }

    public float i() {
        return this.h;
    }

    public int j() {
        return this.i;
    }

    public int[] k() {
        return this.k;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }
}

