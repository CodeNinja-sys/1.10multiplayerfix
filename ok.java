/*
 * Decompiled with CFR 0.150.
 */
public class ok
implements ds {
    private azg a;
    private int b;

    public ok() {
    }

    public ok(azg azg2, int n2) {
        this.a = azg2;
        this.b = n2;
    }

    @Override
    public void a(si si2) {
        this.a = azg.c(si2.e());
        this.b = si2.e();
    }

    @Override
    public void b(si si2) {
        si2.d(azg.a(this.a));
        si2.d(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public azg a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}

