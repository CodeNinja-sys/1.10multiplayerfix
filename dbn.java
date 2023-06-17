/*
 * Decompiled with CFR 0.150.
 */
public class dbn {
    private final aqn[] a;
    private aqn[] b = new aqn[0];
    private aqn[] c = new aqn[0];
    private aqn d;
    private int e;
    private int f;

    public dbn(aqn[] arraqn) {
        this.a = arraqn;
        this.f = arraqn.length;
    }

    public void a() {
        ++this.e;
    }

    public boolean b() {
        return this.e >= this.f;
    }

    public aqn c() {
        if (this.f > 0) {
            return this.a[this.f - 1];
        }
        return null;
    }

    public aqn a(int n2) {
        return this.a[n2];
    }

    public void a(int n2, aqn aqn2) {
        this.a[n2] = aqn2;
    }

    public int d() {
        return this.f;
    }

    public void b(int n2) {
        this.f = n2;
    }

    public int e() {
        return this.e;
    }

    public void c(int n2) {
        this.e = n2;
    }

    public amj a(cpk cpk2, int n2) {
        double d2 = (double)this.a[n2].a + (double)((int)(cpk2.bl + 1.0f)) * 0.5;
        double d3 = this.a[n2].b;
        double d4 = (double)this.a[n2].c + (double)((int)(cpk2.bl + 1.0f)) * 0.5;
        return new amj(d2, d3, d4);
    }

    public amj a(cpk cpk2) {
        return this.a(cpk2, this.e);
    }

    public amj f() {
        aqn aqn2 = this.a[this.e];
        return new amj(aqn2.a, aqn2.b, aqn2.c);
    }

    public boolean a(dbn dbn2) {
        if (dbn2 == null) {
            return false;
        }
        if (dbn2.a.length != this.a.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2].a == dbn2.a[i2].a && this.a[i2].b == dbn2.a[i2].b && this.a[i2].c == dbn2.a[i2].c) continue;
            return false;
        }
        return true;
    }

    public aqn[] g() {
        return this.b;
    }

    public aqn[] h() {
        return this.c;
    }

    public aqn i() {
        return this.d;
    }

    public static dbn a(si si2) {
        int n2 = si2.K();
        aqn aqn2 = aqn.a(si2);
        aqn[] arraqn = new aqn[si2.K()];
        for (int i2 = 0; i2 < arraqn.length; ++i2) {
            arraqn[i2] = aqn.a(si2);
        }
        aqn[] arraqn2 = new aqn[si2.K()];
        for (int i3 = 0; i3 < arraqn2.length; ++i3) {
            arraqn2[i3] = aqn.a(si2);
        }
        aqn[] arraqn3 = new aqn[si2.K()];
        for (int i4 = 0; i4 < arraqn3.length; ++i4) {
            arraqn3[i4] = aqn.a(si2);
        }
        dbn dbn2 = new dbn(arraqn);
        dbn2.b = arraqn2;
        dbn2.c = arraqn3;
        dbn2.d = aqn2;
        dbn2.e = n2;
        return dbn2;
    }
}

