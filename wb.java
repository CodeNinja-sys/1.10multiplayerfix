/*
 * Decompiled with CFR 0.150.
 */
class wb
implements cbd {
    private final int a;
    private final boolean b;

    public wb(int n2, boolean bl2) {
        this.a = n2;
        this.b = bl2;
    }

    @Override
    public void a(bou bou2) {
        bou.a(bou2, this.a);
    }

    @Override
    public cbg a() {
        if (this.a < 0) {
            return new aym("Previous Page");
        }
        return new aym("Next Page");
    }

    @Override
    public void a(float f2, int n2) {
        bxy.B().P().a(czg.a);
        if (this.a < 0) {
            alo.a(0, 0, 144.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        } else {
            alo.a(0, 0, 160.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }
    }

    @Override
    public boolean b() {
        return this.b;
    }
}

