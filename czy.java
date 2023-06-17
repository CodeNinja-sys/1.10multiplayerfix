/*
 * Decompiled with CFR 0.150.
 */
class czy
extends cel {
    private final amq i;
    private double j;

    public czy(amq amq2) {
        super(amq2);
        this.i = amq2;
    }

    @Override
    public void a() {
        if (this.i.be && !amq.a(this.i) && !((cqy)amq.b(this.i)).c()) {
            this.i.b(0.0);
        } else if (this.b()) {
            this.i.b(this.j);
        }
        super.a();
    }

    @Override
    public void a(double d2, double d3, double d4, double d5) {
        if (this.i.V_()) {
            d5 = 1.5;
        }
        super.a(d2, d3, d4, d5);
        if (d5 > 0.0) {
            this.j = d5;
        }
    }
}

