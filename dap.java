/*
 * Decompiled with CFR 0.150.
 */
public class dap {
    private final cmz a;
    private final cmz b;
    private final bqk c;
    private int d;
    private boolean e;
    private int f;

    public dap(cmz cmz2, int n2, int n3, int n4) {
        this(cmz2, dap.a(n2, n3), n4);
    }

    private static bqk a(int n2, int n3) {
        if (n2 < 0) {
            return bqk.e;
        }
        if (n2 > 0) {
            return bqk.f;
        }
        if (n3 < 0) {
            return bqk.c;
        }
        return bqk.d;
    }

    public dap(cmz cmz2, bqk bqk2, int n2) {
        this.a = cmz2;
        this.c = bqk2;
        this.b = cmz2.c(bqk2, 2);
        this.d = n2;
    }

    public int a(int n2, int n3, int n4) {
        return (int)this.a.d((double)n2, (double)n3, (double)n4);
    }

    public int a(cmz cmz2) {
        return (int)cmz2.f(this.d());
    }

    public int b(cmz cmz2) {
        return (int)this.b.f(cmz2);
    }

    public boolean c(cmz cmz2) {
        int n2 = cmz2.a() - this.a.a();
        int n3 = cmz2.c() - this.a.b();
        return n2 * this.c.h() + n3 * this.c.j() >= 0;
    }

    public void a() {
        this.f = 0;
    }

    public void b() {
        ++this.f;
    }

    public int c() {
        return this.f;
    }

    public cmz d() {
        return this.a;
    }

    public cmz e() {
        return this.b;
    }

    public int f() {
        return this.c.h() * 2;
    }

    public int g() {
        return this.c.j() * 2;
    }

    public int h() {
        return this.d;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public boolean i() {
        return this.e;
    }

    public void a(boolean bl2) {
        this.e = bl2;
    }

    public bqk j() {
        return this.c;
    }
}

