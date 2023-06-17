/*
 * Decompiled with CFR 0.150.
 */
public class bjk
extends bfv {
    protected final double b;

    protected bjk(boolean bl2, int n2, double d2) {
        super(bl2, n2);
        this.b = d2;
    }

    @Override
    public double a(int n2, cs cs2) {
        return this.b * (double)(n2 + 1);
    }
}

