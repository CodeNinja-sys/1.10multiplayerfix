/*
 * Decompiled with CFR 0.150.
 */
class dft
extends ux {
    final /* synthetic */ bmj a;

    public dft(bmj bmj2, tb tb2, int n2, int n3, int n4) {
        this.a = bmj2;
        super(tb2, n2, n3, n4);
    }

    @Override
    public boolean a(bhl bhl2) {
        if (bhl2 != null) {
            return bhl2.a() == hp.bY || bhl2.a() == hp.k || bhl2.a() == hp.m || bhl2.a() == hp.l;
        }
        return false;
    }

    @Override
    public int d() {
        return 1;
    }
}

