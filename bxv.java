/*
 * Decompiled with CFR 0.150.
 */
public class bxv
extends dad {
    protected bxv(bkl bkl2, dfm ... arrdfm) {
        super(bkl2, mo.h, arrdfm);
        this.b("digging");
    }

    @Override
    public int a(int n2) {
        return 1 + 10 * (n2 - 1);
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public boolean a(bhl bhl2) {
        if (bhl2.a() == hp.bl) {
            return true;
        }
        return super.a(bhl2);
    }
}

