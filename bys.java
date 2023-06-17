/*
 * Decompiled with CFR 0.150.
 */
public class bys
extends yi {
    public bys(iu iu2) {
        super(iu2);
        this.a_(0.7f, 0.5f);
    }

    public static void d(cgy cgy2) {
        xy.a(cgy2, "CaveSpider");
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(12.0);
    }

    @Override
    public boolean a(cpk cpk2) {
        if (super.a(cpk2)) {
            if (cpk2 instanceof bga) {
                int n2 = 0;
                if (this.aQ.Q() == ct.c) {
                    n2 = 7;
                } else if (this.aQ.Q() == ct.d) {
                    n2 = 15;
                }
                if (n2 > 0) {
                    ((bga)cpk2).b(new cko(ake.s, n2 * 20, 0));
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        return aql2;
    }

    @Override
    public float A() {
        return 0.45f;
    }

    @Override
    protected bpx u() {
        return bvm.s;
    }
}

