/*
 * Decompiled with CFR 0.150.
 */
public class bgn
extends cyg {
    public bgn() {
        this.g = true;
    }

    public bgn(double d2, double d3, double d4, boolean bl2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.f = bl2;
        this.g = true;
    }

    @Override
    public void a(si si2) {
        this.a = si2.P();
        this.b = si2.P();
        this.c = si2.P();
        super.a(si2);
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
        si2.a(this.c);
        super.b(si2);
    }
}

