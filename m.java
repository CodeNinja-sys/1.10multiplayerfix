/*
 * Decompiled with CFR 0.150.
 */
class m
extends eu {
    public m(yi yi2) {
        super(yi2, 1.0, true);
    }

    @Override
    public boolean a() {
        float f2 = this.b.a(1.0f);
        if (f2 >= 0.5f && this.b.aW().nextInt(100) == 0) {
            this.b.b((bga)null);
            return false;
        }
        return super.a();
    }

    @Override
    protected double a(bga bga2) {
        return 4.0f + bga2.bl;
    }
}

