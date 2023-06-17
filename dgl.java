/*
 * Decompiled with CFR 0.150.
 */
class dgl
extends ck {
    private final ha a;

    public dgl(ha ha2) {
        this.a = ha2;
        this.a(2);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void e() {
        if (this.a.ar() == null) {
            this.a.ah = this.a.ba = -((float)cmk.b(this.a.aX, this.a.aZ)) * 57.295776f;
        } else {
            bga bga2 = this.a.ar();
            double d2 = 64.0;
            if (bga2.l(this.a) < 4096.0) {
                double d3 = bga2.aU - this.a.aU;
                double d4 = bga2.aW - this.a.aW;
                this.a.ah = this.a.ba = -((float)cmk.b(d3, d4)) * 57.295776f;
            }
        }
    }
}

