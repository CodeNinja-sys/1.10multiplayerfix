/*
 * Decompiled with CFR 0.150.
 */
public class rl
extends azg {
    private final Class a;

    public rl(Class class_) {
        this.a = class_;
        this.a(zm.c);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        cmz cmz3 = cmz2.c(bqk2);
        if (bqk2 == bqk.a || bqk2 == bqk.b || !bdl2.a(cmz3, bqk2, bhl2)) {
            return cey.c;
        }
        gj gj2 = this.a(iu2, cmz3, bqk2);
        if (gj2 != null && gj2.h()) {
            if (!iu2.C) {
                gj2.n();
                iu2.b(gj2);
            }
            --bhl2.b;
        }
        return cey.a;
    }

    private gj a(iu iu2, cmz cmz2, bqk bqk2) {
        if (this.a == cbk.class) {
            return new cbk(iu2, cmz2, bqk2);
        }
        if (this.a == cvr.class) {
            return new cvr(iu2, cmz2, bqk2);
        }
        return null;
    }
}

