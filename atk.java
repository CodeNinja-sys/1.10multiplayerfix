/*
 * Decompiled with CFR 0.150.
 */
public class atk
implements ds {
    private int a;
    private int b;

    public atk() {
    }

    public atk(cpk cpk2, int n2) {
        this.a = cpk2.bW();
        this.b = n2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.F();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.B(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}

