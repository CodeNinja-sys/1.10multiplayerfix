/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class bjz
implements azv {
    private bjz() {
    }

    @Override
    public boolean a(cgd cgd2) {
        return cgd2.c[bqk.f.b()] && !cgd2.b[bqk.f.b()].d;
    }

    @Override
    public ic a(bqk bqk2, cgd cgd2, Random random) {
        cgd2.d = true;
        cgd2.b[bqk.f.b()].d = true;
        return new bss(bqk2, cgd2, random);
    }

    /* synthetic */ bjz(bvl bvl2) {
        this();
    }
}

