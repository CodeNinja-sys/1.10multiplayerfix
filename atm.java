/*
 * Decompiled with CFR 0.150.
 */
public class atm
implements ds {
    private int a;
    private String b;
    private int c;
    private dfj d;

    public atm() {
    }

    public atm(int n2, String string, int n3, dfj dfj2) {
        this.a = n2;
        this.b = string;
        this.c = n3;
        this.d = dfj2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.e(255);
        this.c = si2.H();
        this.d = dfj.a(si2.e());
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.C(this.c);
        si2.d(this.d.a());
    }

    public void a(cax cax2) {
        cax2.a(this);
    }

    public dfj a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }
}

