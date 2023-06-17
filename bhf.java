/*
 * Decompiled with CFR 0.150.
 */
public class bhf
extends aeu {
    private final bfa b;
    private final bfa c;

    public bhf(int n2, float f2, bfa bfa2, bfa bfa3) {
        super(n2, f2, false);
        this.b = bfa2;
        this.c = bfa3;
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        if (bqk2 != bqk.b || !bdl2.a(cmz2.c(bqk2), bqk2, bhl2) || iu2.n(cmz2).t() != this.c || !iu2.c(cmz2.g())) {
            return cey.c;
        }
        iu2.a(cmz2.g(), this.b.s(), 11);
        --bhl2.b;
        return cey.a;
    }
}

