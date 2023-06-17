/*
 * Decompiled with CFR 0.150.
 */
public class cwv
extends alo {
    protected static final bpx d = new bpx("textures/gui/widgets.png");
    protected int e = 200;
    protected int f = 20;
    public int g;
    public int h;
    public String i;
    public int j;
    public boolean k = true;
    public boolean l = true;
    protected boolean m;

    public cwv(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, 200, 20, string);
    }

    public cwv(int n2, int n3, int n4, int n5, int n6, String string) {
        this.j = n2;
        this.g = n3;
        this.h = n4;
        this.e = n5;
        this.f = n6;
        this.i = string;
    }

    protected int a(boolean bl2) {
        int n2 = 1;
        if (!this.k) {
            n2 = 0;
        } else if (bl2) {
            n2 = 2;
        }
        return n2;
    }

    public void c(bxy bxy2, int n2, int n3) {
        if (!this.l) {
            return;
        }
        deb deb2 = bxy2.k;
        bxy2.P().a(d);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.m = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
        int n4 = this.a(this.m);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.a(bjt.l, afi.j);
        this.c(this.g, this.h, 0, 46 + n4 * 20, this.e / 2, this.f);
        this.c(this.g + this.e / 2, this.h, 200 - this.e / 2, 46 + n4 * 20, this.e / 2, this.f);
        this.a(bxy2, n2, n3);
        int n5 = 0xE0E0E0;
        if (!this.k) {
            n5 = 0xA0A0A0;
        } else if (this.m) {
            n5 = 0xFFFFA0;
        }
        this.a(deb2, this.i, this.g + this.e / 2, this.h + (this.f - 8) / 2, n5);
    }

    protected void a(bxy bxy2, int n2, int n3) {
    }

    public void a(int n2, int n3) {
    }

    public boolean b(bxy bxy2, int n2, int n3) {
        return this.k && this.l && n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
    }

    public boolean g() {
        return this.m;
    }

    public void b(int n2, int n3) {
    }

    public void a(bro bro2) {
        bro2.a(ol.a(dah.gE, 1.0f));
    }

    public int c() {
        return this.e;
    }

    public void a(int n2) {
        this.e = n2;
    }
}

