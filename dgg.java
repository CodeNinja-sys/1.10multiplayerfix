/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class dgg
implements azv {
    private dgg() {
    }

    @Override
    public boolean a(cgd cgd2) {
        return cgd2.c[bqk.c.b()] && !cgd2.b[bqk.c.b()].d;
    }

    @Override
    public ic a(bqk bqk2, cgd cgd2, Random random) {
        cgd cgd3 = cgd2;
        if (!cgd2.c[bqk.c.b()] || cgd2.b[bqk.c.b()].d) {
            cgd3 = cgd2.b[bqk.d.b()];
        }
        cgd3.d = true;
        cgd3.b[bqk.c.b()].d = true;
        return new ap(bqk2, cgd3, random);
    }

    /* synthetic */ dgg(bvl bvl2) {
        this();
    }
}

