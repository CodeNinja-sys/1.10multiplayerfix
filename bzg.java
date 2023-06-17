/*
 * Decompiled with CFR 0.150.
 */
public class bzg
extends cyg {
    public bzg() {
        this.g = true;
        this.h = true;
    }

    public bzg(double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = f2;
        this.e = f3;
        this.f = bl2;
        this.h = true;
        this.g = true;
    }

    @Override
    public void a(si si2) {
        this.a = si2.P();
        this.b = si2.P();
        this.c = si2.P();
        this.d = si2.O();
        this.e = si2.O();
        super.a(si2);
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
        si2.a(this.c);
        si2.a(this.d);
        si2.a(this.e);
        super.b(si2);
    }
}

