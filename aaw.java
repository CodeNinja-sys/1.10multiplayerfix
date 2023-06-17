/*
 * Decompiled with CFR 0.150.
 */
public class aaw
implements ds {
    private int a;
    private cmz b;
    private int c;

    public aaw() {
    }

    public aaw(int n2, cmz cmz2, int n3) {
        this.a = n2;
        this.b = cmz2;
        this.c = n3;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.c();
        this.c = si2.F();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.B(this.c);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public cmz b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }
}

