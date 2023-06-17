/*
 * Decompiled with CFR 0.150.
 */
public class bep
implements ds {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private float e;
    private float f;

    public bep() {
    }

    public bep(bvu bvu2) {
        this.a(bvu2.a);
        this.b(bvu2.b);
        this.c(bvu2.c);
        this.d(bvu2.d);
        this.a(bvu2.a());
        this.b(bvu2.b());
    }

    @Override
    public void a(si si2) {
        byte by2 = si2.E();
        this.a((by2 & 1) > 0);
        this.b((by2 & 2) > 0);
        this.c((by2 & 4) > 0);
        this.d((by2 & 8) > 0);
        this.a(si2.O());
        this.b(si2.O());
    }

    @Override
    public void b(si si2) {
        byte by2 = 0;
        if (this.a()) {
            by2 = (byte)(by2 | true ? 1 : 0);
        }
        if (this.b()) {
            by2 = (byte)(by2 | 2);
        }
        if (this.c()) {
            by2 = (byte)(by2 | 4);
        }
        if (this.d()) {
            by2 = (byte)(by2 | 8);
        }
        si2.B(by2);
        si2.a(this.e);
        si2.a(this.f);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public boolean a() {
        return this.a;
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean b() {
        return this.b;
    }

    public void b(boolean bl2) {
        this.b = bl2;
    }

    public boolean c() {
        return this.c;
    }

    public void c(boolean bl2) {
        this.c = bl2;
    }

    public boolean d() {
        return this.d;
    }

    public void d(boolean bl2) {
        this.d = bl2;
    }

    public float e() {
        return this.e;
    }

    public void a(float f2) {
        this.e = f2;
    }

    public float f() {
        return this.f;
    }

    public void b(float f2) {
        this.f = f2;
    }
}

