/*
 * Decompiled with CFR 0.150.
 */
public class eg
extends dad {
    public eg(bkl bkl2, dfm ... arrdfm) {
        super(bkl2, mo.c, arrdfm);
        this.b("frostWalker");
    }

    @Override
    public int a(int n2) {
        return n2 * 10;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public int a() {
        return 2;
    }

    public static void a(bga bga2, iu iu2, cmz cmz2, int n2) {
        if (!bga2.be) {
            return;
        }
        float f2 = Math.min(16, 2 + n2);
        pj pj2 = new pj(0, 0, 0);
        for (pj pj3 : cmz.b(cmz2.f(-f2, -1.0, -f2), cmz2.f(f2, -1.0, f2))) {
            dbk dbk2;
            if (!(pj3.e(bga2.aU, bga2.aV, bga2.aW) <= (double)(f2 * f2))) continue;
            pj2.a(pj3.a(), pj3.b() + 1, pj3.c());
            dbk dbk3 = iu2.n(pj2);
            if (dbk3.a() != ahk.a || (dbk2 = iu2.n(pj3)).a() != ahk.h || (Integer)dbk2.b(en.a) != 0 || !iu2.a(blg.de, (cmz)pj3, false, bqk.a, null, null)) continue;
            iu2.a((cmz)pj3, blg.de.s());
            iu2.a(pj3.d(), blg.de, cmk.a(bga2.aW(), 60, 120));
        }
    }

    @Override
    public boolean a(dad dad2) {
        return super.a(dad2) && dad2 != bbh.i;
    }
}

