/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bbr
extends ar {
    protected static final cxt a = new cxt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);

    protected bbr(ahk ahk2) {
        super(ahk2);
        this.a(1.0f);
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new alv();
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return a;
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bqk2 == bqk.a) {
            return super.a(dbk2, bnj2, cmz2, bqk2);
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        if (!cpk2.cp() && !cpk2.cq() && cpk2.aB_() && !iu2.C && cpk2.cD().b(dbk2.c((bnj)iu2, cmz2).a(cmz2))) {
            cpk2.e_(1);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        double d2 = (float)cmz2.a() + random.nextFloat();
        double d3 = (float)cmz2.b() + 0.8f;
        double d4 = (float)cmz2.c() + random.nextFloat();
        double d5 = 0.0;
        double d6 = 0.0;
        double d7 = 0.0;
        iu2.a(lz.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return null;
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.E;
    }
}

