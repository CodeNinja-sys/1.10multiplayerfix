/*
 * Decompiled with CFR 0.150.
 */
public class dbi
implements ds {
    private String a;
    private String b;
    private bmb c;
    private int d;

    public dbi() {
    }

    public dbi(bhi bhi2, int n2) {
        this.a = bhi2.b();
        this.b = bhi2.d();
        this.c = bhi2.c().c();
        this.d = n2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(16);
        this.d = si2.E();
        if (this.d == 0 || this.d == 2) {
            this.b = si2.e(32);
            this.c = bmb.a(si2.e(16));
        }
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.B(this.d);
        if (this.d == 0 || this.d == 2) {
            si2.a(this.b);
            si2.a(this.c.a());
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public bmb d() {
        return this.c;
    }
}

