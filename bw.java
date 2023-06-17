/*
 * Decompiled with CFR 0.150.
 */
public class bw
extends azg {
    private final bfa a;
    private final bfa b;

    public bw(bfa bfa2, bfa bfa3) {
        this.a = bfa2;
        this.b = bfa3;
        this.a(zm.l);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        if (bqk2 != bqk.b || !bdl2.a(cmz2.c(bqk2), bqk2, bhl2) || iu2.n(cmz2).t() != this.b || !iu2.c(cmz2.g())) {
            return cey.c;
        }
        iu2.a(cmz2.g(), this.a.s());
        --bhl2.b;
        return cey.a;
    }
}

