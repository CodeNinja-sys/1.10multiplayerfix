/*
 * Decompiled with CFR 0.150.
 */
public class css
extends bla {
    public css() {
        this.h = true;
    }

    public css(int n2, long l2, long l3, long l4, byte by2, byte by3, boolean bl2) {
        super(n2);
        this.b = (int)l2;
        this.c = (int)l3;
        this.d = (int)l4;
        this.e = by2;
        this.f = by3;
        this.g = bl2;
        this.h = true;
    }

    @Override
    public void a(si si2) {
        super.a(si2);
        this.b = si2.G();
        this.c = si2.G();
        this.d = si2.G();
        this.e = si2.E();
        this.f = si2.E();
        this.g = si2.D();
    }

    @Override
    public void b(si si2) {
        super.b(si2);
        si2.C(this.b);
        si2.C(this.c);
        si2.C(this.d);
        si2.B(this.e);
        si2.B(this.f);
        si2.a(this.g);
    }
}

