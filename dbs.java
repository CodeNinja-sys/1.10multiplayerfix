/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class dbs
extends ar {
    public static final yc e = cli.j;
    public static final qf f = qf.a("rotation", 0, 15);
    protected static final cxt g = new cxt(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);

    protected dbs() {
        super(ahk.d);
    }

    @Override
    public String az_() {
        return caf.a("item.banner.white.name");
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
        return new cwd();
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.cO;
    }

    private bhl e(iu iu2, cmz cmz2, dbk dbk2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof cwd) {
            bhl bhl2 = new bhl(hp.cO, 1, ((cwd)bql2).f());
            bvp bvp2 = bql2.b(new bvp());
            bvp2.q("x");
            bvp2.q("y");
            bvp2.q("z");
            bvp2.q("id");
            bhl2.a("BlockEntityTag", bvp2);
            return bhl2;
        }
        return null;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        bhl bhl2 = this.e(iu2, cmz2, dbk2);
        return bhl2 != null ? bhl2 : new bhl(hp.cO);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        bhl bhl2 = this.e(iu2, cmz2, dbk2);
        if (bhl2 != null) {
            dbs.a(iu2, cmz2, bhl2);
        } else {
            super.a(iu2, cmz2, dbk2, f2, n2);
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return !this.b(iu2, cmz2) && super.a(iu2, cmz2);
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        if (bql2 instanceof cwd) {
            cwd cwd2 = (cwd)bql2;
            bhl bhl3 = new bhl(hp.cO, 1, ((cwd)bql2).f());
            bvp bvp2 = new bvp();
            cwd.a(bvp2, cwd2.f(), cwd2.h());
            bhl3.a("BlockEntityTag", bvp2);
            dbs.a(iu2, cmz2, bhl3);
        } else {
            super.a(iu2, bdl2, cmz2, dbk2, null, bhl2);
        }
    }
}

