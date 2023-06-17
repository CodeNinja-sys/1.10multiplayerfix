/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bkg
extends bfa {
    public static final ddi a = ddi.b("north");
    public static final ddi b = ddi.b("east");
    public static final ddi c = ddi.b("south");
    public static final ddi d = ddi.b("west");
    public static final ddi e = ddi.b("up");
    public static final ddi f = ddi.b("down");

    protected bkg() {
        super(ahk.k);
        this.a(zm.c);
        this.D(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        bfa bfa2 = bnj2.n(cmz2.h()).t();
        bfa bfa3 = bnj2.n(cmz2.g()).t();
        bfa bfa4 = bnj2.n(cmz2.i()).t();
        bfa bfa5 = bnj2.n(cmz2.l()).t();
        bfa bfa6 = bnj2.n(cmz2.j()).t();
        bfa bfa7 = bnj2.n(cmz2.k()).t();
        return dbk2.a(f, Boolean.valueOf(bfa2 == this || bfa2 == blg.cS || bfa2 == blg.bH)).a(e, Boolean.valueOf(bfa3 == this || bfa3 == blg.cS)).a(a, Boolean.valueOf(bfa4 == this || bfa4 == blg.cS)).a(b, Boolean.valueOf(bfa5 == this || bfa5 == blg.cS)).a(c, Boolean.valueOf(bfa6 == this || bfa6 == blg.cS)).a(d, Boolean.valueOf(bfa7 == this || bfa7 == blg.cS));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk2 = dbk2.b(bnj2, cmz2);
        float f2 = 0.1875f;
        float f3 = (Boolean)dbk2.b(d) != false ? 0.0f : 0.1875f;
        float f4 = (Boolean)dbk2.b(f) != false ? 0.0f : 0.1875f;
        float f5 = (Boolean)dbk2.b(a) != false ? 0.0f : 0.1875f;
        float f6 = (Boolean)dbk2.b(b) != false ? 1.0f : 0.8125f;
        float f7 = (Boolean)dbk2.b(e) != false ? 1.0f : 0.8125f;
        float f8 = (Boolean)dbk2.b(c) != false ? 1.0f : 0.8125f;
        return new cxt(f3, f4, f5, f6, f7, f8);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        dbk2 = dbk2.b((bnj)iu2, cmz2);
        float f2 = 0.1875f;
        float f3 = 0.8125f;
        bkg.a(cmz2, cxt2, list, new cxt(0.1875, 0.1875, 0.1875, 0.8125, 0.8125, 0.8125));
        if (((Boolean)dbk2.b(d)).booleanValue()) {
            bkg.a(cmz2, cxt2, list, new cxt(0.0, 0.1875, 0.1875, 0.1875, 0.8125, 0.8125));
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            bkg.a(cmz2, cxt2, list, new cxt(0.8125, 0.1875, 0.1875, 1.0, 0.8125, 0.8125));
        }
        if (((Boolean)dbk2.b(e)).booleanValue()) {
            bkg.a(cmz2, cxt2, list, new cxt(0.1875, 0.8125, 0.1875, 0.8125, 1.0, 0.8125));
        }
        if (((Boolean)dbk2.b(f)).booleanValue()) {
            bkg.a(cmz2, cxt2, list, new cxt(0.1875, 0.0, 0.1875, 0.8125, 0.1875, 0.8125));
        }
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            bkg.a(cmz2, cxt2, list, new cxt(0.1875, 0.1875, 0.0, 0.8125, 0.8125, 0.1875));
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            bkg.a(cmz2, cxt2, list, new cxt(0.1875, 0.1875, 0.8125, 0.8125, 0.8125, 1.0));
        }
    }

    @Override
    public int e(dbk dbk2) {
        return 0;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (!this.c(iu2, cmz2)) {
            iu2.b(cmz2, true);
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.cS;
    }

    @Override
    public int a(Random random) {
        return random.nextInt(2);
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        if (super.a(iu2, cmz2)) {
            return this.c(iu2, cmz2);
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!this.c(iu2, cmz2)) {
            iu2.a(cmz2, (bfa)this, 1);
        }
    }

    public boolean c(iu iu2, cmz cmz2) {
        boolean bl2 = iu2.c(cmz2.g());
        boolean bl3 = iu2.c(cmz2.h());
        for (bqk bqk2 : afj.a) {
            cmz cmz3 = cmz2.c(bqk2);
            bfa bfa2 = iu2.n(cmz3).t();
            if (bfa2 != this) continue;
            if (!bl2 && !bl3) {
                return false;
            }
            bfa bfa3 = iu2.n(cmz3.h()).t();
            if (bfa3 != this && bfa3 != blg.bH) continue;
            return true;
        }
        bfa bfa4 = iu2.n(cmz2.h()).t();
        return bfa4 == this || bfa4 == blg.bH;
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        bfa bfa2 = bnj2.n(cmz2.c(bqk2)).t();
        return bfa2 != this && bfa2 != blg.cS && (bqk2 != bqk.a || bfa2 != blg.bH);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, c, d, e, f);
    }

    @Override
    public boolean a(bnj bnj2, cmz cmz2) {
        return false;
    }
}

