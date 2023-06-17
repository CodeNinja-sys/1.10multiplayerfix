/*
 * Decompiled with CFR 0.150.
 */
public class cw
extends bt {
    public cw(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, 176, 8, -5.0E-4f);
        this.i = d5;
        this.j = d6;
        this.k = d7;
        this.x *= 0.75f;
        this.w = 60 + this.q.nextInt(12);
        this.b(15916745);
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
    }
}

