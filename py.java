/*
 * Decompiled with CFR 0.150.
 */
class py
extends ux {
    final /* synthetic */ dfm a;
    final /* synthetic */ bgg b;

    py(bgg bgg2, tb tb2, int n2, int n3, int n4, dfm dfm2) {
        this.b = bgg2;
        this.a = dfm2;
        super(tb2, n2, n3, n4);
    }

    @Override
    public int d() {
        return 1;
    }

    @Override
    public boolean a(bhl bhl2) {
        if (bhl2 == null) {
            return false;
        }
        dfm dfm2 = xy.c(bhl2);
        return dfm2 == this.a;
    }

    @Override
    public String e() {
        return uh.a[this.a.b()];
    }
}

