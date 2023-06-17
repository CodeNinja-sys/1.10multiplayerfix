/*
 * Decompiled with CFR 0.150.
 */
public class ux {
    private final int a;
    public final tb c;
    public int d;
    public int e;
    public int f;

    public ux(tb tb2, int n2, int n3, int n4) {
        this.c = tb2;
        this.a = n2;
        this.e = n3;
        this.f = n4;
    }

    public void a(bhl bhl2, bhl bhl3) {
        if (bhl2 == null || bhl3 == null) {
            return;
        }
        if (bhl2.a() != bhl3.a()) {
            return;
        }
        int n2 = bhl3.b - bhl2.b;
        if (n2 > 0) {
            this.a(bhl2, n2);
        }
    }

    protected void a(bhl bhl2, int n2) {
    }

    protected void d(bhl bhl2) {
    }

    public void a(bdl bdl2, bhl bhl2) {
        this.c();
    }

    public boolean a(bhl bhl2) {
        return true;
    }

    public bhl a() {
        return this.c.a(this.a);
    }

    public boolean b() {
        return this.a() != null;
    }

    public void b(bhl bhl2) {
        this.c.a(this.a, bhl2);
        this.c();
    }

    public void c() {
        this.c.c_();
    }

    public int d() {
        return this.c.d();
    }

    public int c(bhl bhl2) {
        return this.d();
    }

    public String e() {
        return null;
    }

    public bhl a(int n2) {
        return this.c.a(this.a, n2);
    }

    public boolean a(tb tb2, int n2) {
        return tb2 == this.c && n2 == this.a;
    }

    public boolean a(bdl bdl2) {
        return true;
    }

    public boolean f() {
        return true;
    }
}

