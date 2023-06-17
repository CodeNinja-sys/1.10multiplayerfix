/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bsu
extends ar {
    protected static final cxt f = new cxt(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);

    protected bsu() {
        super(ahk.d);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return f;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(bnj bnj2, cmz cmz2) {
        return true;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean m() {
        return true;
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new bxr();
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.ar;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.ar);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof bxr) {
            return ((bxr)bql2).b(bdl2);
        }
        return false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return !this.b(iu2, cmz2) && super.a(iu2, cmz2);
    }
}

