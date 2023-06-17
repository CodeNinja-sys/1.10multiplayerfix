/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bj
extends bfa {
    protected static final cxt a = new cxt(0.0, 0.0, 0.0, 1.0, 0.9375, 1.0);

    protected bj() {
        super(ahk.c);
        this.h(255);
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        switch (bqk2) {
            case b: {
                return true;
            }
            case c: 
            case d: 
            case e: 
            case f: {
                dbk dbk3 = bnj2.n(cmz2.c(bqk2));
                bfa bfa2 = dbk3.t();
                return !dbk3.p() && bfa2 != blg.ak && bfa2 != blg.da;
            }
        }
        return super.a(dbk2, bnj2, cmz2, bqk2);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return a;
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
    public azg a(dbk dbk2, Random random, int n2) {
        return blg.d.a(blg.d.s().a(bwt.a, (Comparable)((Object)dgu.a)), random, n2);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        super.a(dbk2, iu2, cmz2, bfa2);
        if (iu2.n(cmz2.g()).a().a()) {
            iu2.a(cmz2, blg.d.s());
        }
    }
}

