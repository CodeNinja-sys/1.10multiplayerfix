/*
 * Decompiled with CFR 0.150.
 */
public class aei {
    private final int a;
    private int b;
    private int c;
    private final jl d;
    private ama e;
    private ama f;

    public aei(int n2, boolean bl2) {
        this.a = n2;
        this.d = new jl();
        this.e = new ama();
        if (bl2) {
            this.f = new ama();
        }
    }

    public dbk a(int n2, int n3, int n4) {
        return this.d.a(n2, n3, n4);
    }

    public void a(int n2, int n3, int n4, dbk dbk2) {
        dbk dbk3 = this.a(n2, n3, n4);
        bfa bfa2 = dbk3.t();
        bfa bfa3 = dbk2.t();
        if (bfa2 != blg.a) {
            --this.b;
            if (bfa2.k()) {
                --this.c;
            }
        }
        if (bfa3 != blg.a) {
            ++this.b;
            if (bfa3.k()) {
                ++this.c;
            }
        }
        this.d.a(n2, n3, n4, dbk2);
    }

    public boolean a() {
        return this.b == 0;
    }

    public boolean b() {
        return this.c > 0;
    }

    public int c() {
        return this.a;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.f.a(n2, n3, n4, n5);
    }

    public int b(int n2, int n3, int n4) {
        return this.f.a(n2, n3, n4);
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.e.a(n2, n3, n4, n5);
    }

    public int c(int n2, int n3, int n4) {
        return this.e.a(n2, n3, n4);
    }

    public void d() {
        this.b = 0;
        this.c = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    bfa bfa2 = this.a(i2, i3, i4).t();
                    if (bfa2 == blg.a) continue;
                    ++this.b;
                    if (!bfa2.k()) continue;
                    ++this.c;
                }
            }
        }
    }

    public jl e() {
        return this.d;
    }

    public ama f() {
        return this.e;
    }

    public ama g() {
        return this.f;
    }

    public void a(ama ama2) {
        this.e = ama2;
    }

    public void b(ama ama2) {
        this.f = ama2;
    }
}

