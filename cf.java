/*
 * Decompiled with CFR 0.150.
 */
public class cf
extends dad {
    protected cf(bkl bkl2, dfm ... arrdfm) {
        super(bkl2, mo.g, arrdfm);
        this.b("fire");
    }

    @Override
    public int a(int n2) {
        return 10 + 20 * (n2 - 1);
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 2;
    }
}

