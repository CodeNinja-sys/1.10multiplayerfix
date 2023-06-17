/*
 * Decompiled with CFR 0.150.
 */
public class sa
extends dad {
    protected sa(bkl bkl2, mo mo2, dfm ... arrdfm) {
        super(bkl2, mo2, arrdfm);
        this.b("fishingSpeed");
    }

    @Override
    public int a(int n2) {
        return 15 + (n2 - 1) * 9;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 3;
    }
}

