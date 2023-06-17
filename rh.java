/*
 * Decompiled with CFR 0.150.
 */
public class rh {
    private aqn[] a = new aqn[128];
    private int b;

    public aqn a(aqn aqn2) {
        if (aqn2.d >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.b == this.a.length) {
            aqn[] arraqn = new aqn[this.b << 1];
            System.arraycopy(this.a, 0, arraqn, 0, this.b);
            this.a = arraqn;
        }
        this.a[this.b] = aqn2;
        aqn2.d = this.b;
        this.a(this.b++);
        return aqn2;
    }

    public void a() {
        this.b = 0;
    }

    public aqn b() {
        aqn aqn2 = this.a[0];
        this.a[0] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > 0) {
            this.b(0);
        }
        aqn2.d = -1;
        return aqn2;
    }

    public void a(aqn aqn2, float f2) {
        float f3 = aqn2.g;
        aqn2.g = f2;
        if (f2 < f3) {
            this.a(aqn2.d);
        } else {
            this.b(aqn2.d);
        }
    }

    private void a(int n2) {
        aqn aqn2 = this.a[n2];
        float f2 = aqn2.g;
        while (n2 > 0) {
            int n3 = n2 - 1 >> 1;
            aqn aqn3 = this.a[n3];
            if (!(f2 < aqn3.g)) break;
            this.a[n2] = aqn3;
            aqn3.d = n2;
            n2 = n3;
        }
        this.a[n2] = aqn2;
        aqn2.d = n2;
    }

    private void b(int n2) {
        aqn aqn2 = this.a[n2];
        float f2 = aqn2.g;
        while (true) {
            float f3;
            aqn aqn3;
            int n3 = 1 + (n2 << 1);
            int n4 = n3 + 1;
            if (n3 >= this.b) break;
            aqn aqn4 = this.a[n3];
            float f4 = aqn4.g;
            if (n4 >= this.b) {
                aqn3 = null;
                f3 = Float.POSITIVE_INFINITY;
            } else {
                aqn3 = this.a[n4];
                f3 = aqn3.g;
            }
            if (f4 < f3) {
                if (!(f4 < f2)) break;
                this.a[n2] = aqn4;
                aqn4.d = n2;
                n2 = n3;
                continue;
            }
            if (!(f3 < f2)) break;
            this.a[n2] = aqn3;
            aqn3.d = n2;
            n2 = n4;
        }
        this.a[n2] = aqn2;
        aqn2.d = n2;
    }

    public boolean c() {
        return this.b == 0;
    }
}

