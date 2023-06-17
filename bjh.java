/*
 * Decompiled with CFR 0.150.
 */
public class bjh
extends dad {
    public bjh(bkl bkl2, dfm ... arrdfm) {
        super(bkl2, mo.k, arrdfm);
        this.b("arrowDamage");
    }

    @Override
    public int a(int n2) {
        return 1 + (n2 - 1) * 10;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    @Override
    public int a() {
        return 5;
    }
}

