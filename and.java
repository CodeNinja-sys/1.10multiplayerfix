/*
 * Decompiled with CFR 0.150.
 */
public class and
implements ds {
    private int a;
    private int b;

    public and() {
    }

    public and(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.e();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.d(this.b);
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

