/*
 * Decompiled with CFR 0.150.
 */
public class kt
implements ds {
    private int a;
    private boolean b;
    private bvh c;
    private int d;
    private ct e;
    private int f;
    private aaf g;
    private boolean h;

    public kt() {
    }

    public kt(int n2, bvh bvh2, boolean bl2, int n3, ct ct2, int n4, aaf aaf2, boolean bl3) {
        this.a = n2;
        this.d = n3;
        this.e = ct2;
        this.c = bvh2;
        this.f = n4;
        this.b = bl2;
        this.g = aaf2;
        this.h = bl3;
    }

    @Override
    public void a(si si2) {
        this.a = si2.K();
        int n2 = si2.F();
        this.b = (n2 & 8) == 8;
        this.c = bvh.a(n2 &= 0xFFFFFFF7);
        this.d = si2.K();
        this.e = ct.a(si2.F());
        this.f = si2.F();
        this.g = aaf.a(si2.e(16));
        if (this.g == null) {
            this.g = aaf.b;
        }
        this.h = si2.D();
    }

    @Override
    public void b(si si2) {
        si2.E(this.a);
        int n2 = this.c.a();
        if (this.b) {
            n2 |= 8;
        }
        si2.B(n2);
        si2.E(this.d);
        si2.B(this.e.a());
        si2.B(this.f);
        si2.a(this.g.a());
        si2.a(this.h);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public bvh c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public ct e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public aaf g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }
}

