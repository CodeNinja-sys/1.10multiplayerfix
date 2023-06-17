/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class asn
extends lp {
    protected static final cxt a = new cxt(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);

    protected asn() {
        super(ahk.l);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return a;
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.o;
    }

    @Override
    protected boolean m(dbk dbk2) {
        return dbk2.t() == blg.m || dbk2.t() == blg.cz || dbk2.t() == blg.cu || dbk2.t() == blg.d;
    }

    @Override
    public boolean a_(bnj bnj2, cmz cmz2) {
        return true;
    }

    @Override
    public int a(Random random) {
        return random.nextInt(3);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.A;
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        if (iu2.C || bhl2 == null || bhl2.a() != hp.bl) {
            super.a(iu2, bdl2, cmz2, dbk2, bql2, bhl2);
        } else {
            bdl2.a(bpv.a(this));
            asn.a(iu2, cmz2, new bhl(blg.I, 1, 0));
        }
    }
}

