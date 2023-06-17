/*
 * Decompiled with CFR 0.150.
 */
public class cnc
implements ds {
    private int a;
    private String b;

    public cnc() {
    }

    public cnc(int n2, bhi bhi2) {
        this.a = n2;
        this.b = bhi2 == null ? "" : bhi2.b();
    }

    @Override
    public void a(si si2) {
        this.a = si2.E();
        this.b = si2.e(16);
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.a(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

