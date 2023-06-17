/*
 * Decompiled with CFR 0.150.
 */
public class azi
extends azg {
    public azi() {
        this.a(zm.i);
    }

    @Override
    public boolean a(bhl bhl2, bdl bdl2, bga bga2, bqp bqp2) {
        if (!bhl2.s()) {
            return false;
        }
        if (bga2 instanceof xy) {
            xy xy2 = (xy)bga2;
            xy2.g(bhl2.q());
            xy2.aC();
            --bhl2.b;
            return true;
        }
        return super.a(bhl2, bdl2, bga2, bqp2);
    }
}

