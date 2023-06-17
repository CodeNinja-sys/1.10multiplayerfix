/*
 * Decompiled with CFR 0.150.
 */
public class xl
extends bla {
    public xl() {
        this.h = true;
    }

    public xl(int n2, byte by2, byte by3, boolean bl2) {
        super(n2);
        this.e = by2;
        this.f = by3;
        this.h = true;
        this.g = bl2;
    }

    @Override
    public void a(si si2) {
        super.a(si2);
        this.e = si2.E();
        this.f = si2.E();
        this.g = si2.D();
    }

    @Override
    public void b(si si2) {
        super.b(si2);
        si2.B(this.e);
        si2.B(this.f);
        si2.a(this.g);
    }
}

