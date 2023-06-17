/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class aep
implements azv {
    private aep() {
    }

    @Override
    public boolean a(cgd cgd2) {
        return cgd2.c[bqk.b.b()] && !cgd2.b[bqk.b.b()].d;
    }

    @Override
    public ic a(bqk bqk2, cgd cgd2, Random random) {
        cgd2.d = true;
        cgd2.b[bqk.b.b()].d = true;
        return new cvb(bqk2, cgd2, random);
    }

    /* synthetic */ aep(bvl bvl2) {
        this();
    }
}

