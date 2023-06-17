/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class anh
implements azv {
    private anh() {
    }

    @Override
    public boolean a(cgd cgd2) {
        if (cgd2.c[bqk.c.b()] && !cgd2.b[bqk.c.b()].d && cgd2.c[bqk.b.b()] && !cgd2.b[bqk.b.b()].d) {
            cgd cgd3 = cgd2.b[bqk.c.b()];
            return cgd3.c[bqk.b.b()] && !cgd3.b[bqk.b.b()].d;
        }
        return false;
    }

    @Override
    public ic a(bqk bqk2, cgd cgd2, Random random) {
        cgd2.d = true;
        cgd2.b[bqk.c.b()].d = true;
        cgd2.b[bqk.b.b()].d = true;
        cgd2.b[bqk.c.b()].b[bqk.b.b()].d = true;
        return new cog(bqk2, cgd2, random);
    }

    /* synthetic */ anh(bvl bvl2) {
        this();
    }
}

