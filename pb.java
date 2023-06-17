/*
 * Decompiled with CFR 0.150.
 */
public class pb {
    private final int a;
    private dbk b;
    private int c = 1;
    private int d;

    public pb(int n2, bfa bfa2) {
        this(3, n2, bfa2);
    }

    public pb(int n2, int n3, bfa bfa2) {
        this.a = n2;
        this.c = n3;
        this.b = bfa2.s();
    }

    public pb(int n2, int n3, bfa bfa2, int n4) {
        this(n2, n3, bfa2);
        this.b = bfa2.a(n4);
    }

    public int a() {
        return this.c;
    }

    public dbk b() {
        return this.b;
    }

    private bfa d() {
        return this.b.t();
    }

    private int e() {
        return this.b.t().e(this.b);
    }

    public int c() {
        return this.d;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public String toString() {
        String string;
        if (this.a >= 3) {
            bpx bpx2 = (bpx)bfa.v.b(this.d());
            String string2 = string = bpx2 == null ? "null" : bpx2.toString();
            if (this.c > 1) {
                string = this.c + "*" + string;
            }
        } else {
            string = Integer.toString(bfa.c(this.d()));
            if (this.c > 1) {
                string = this.c + "x" + string;
            }
        }
        int n2 = this.e();
        if (n2 > 0) {
            string = string + ":" + n2;
        }
        return string;
    }
}

