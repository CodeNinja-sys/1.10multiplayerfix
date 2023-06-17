/*
 * Decompiled with CFR 0.150.
 */
public class akw
extends dad {
    public akw(bkl bkl2, dfm ... arrdfm) {
        super(bkl2, mo.c, arrdfm);
        this.b("waterWalker");
    }

    @Override
    public int a(int n2) {
        return n2 * 10;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(dad dad2) {
        return super.a(dad2) && dad2 != bbh.j;
    }
}

