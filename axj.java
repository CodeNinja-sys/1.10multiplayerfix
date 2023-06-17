/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.vi;

public class axj
extends azg {
    private final float b;
    protected avx a;

    public axj(avx avx2) {
        this.a = avx2;
        this.k = 1;
        this.e(avx2.a());
        this.a(zm.i);
        this.b = avx2.c() + 1.0f;
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        if (!bdl2.a(cmz2.c(bqk2), bqk2, bhl2)) {
            return cey.c;
        }
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bqk2 != bqk.a && iu2.n(cmz2.g()).a() == ahk.a) {
            if (bfa2 == blg.c || bfa2 == blg.da) {
                this.a(bhl2, bdl2, iu2, cmz2, blg.ak.s());
                return cey.a;
            }
            if (bfa2 == blg.d) {
                switch ((dgu)((Object)dbk2.b(bwt.a))) {
                    case a: {
                        this.a(bhl2, bdl2, iu2, cmz2, blg.ak.s());
                        return cey.a;
                    }
                    case b: {
                        this.a(bhl2, bdl2, iu2, cmz2, blg.d.s().a(bwt.a, (Comparable)((Object)dgu.a)));
                        return cey.a;
                    }
                }
            }
        }
        return cey.b;
    }

    @Override
    public boolean a(bhl bhl2, bga bga2, bga bga3) {
        bhl2.a(1, bga3);
        return true;
    }

    protected void a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, dbk dbk2) {
        iu2.a(bdl2, cmz2, dah.co, csg.e, 1.0f, 1.0f);
        if (!iu2.C) {
            iu2.a(cmz2, dbk2, 11);
            bhl2.a(1, (bga)bdl2);
        }
    }

    @Override
    public boolean aD_() {
        return true;
    }

    public String f() {
        return this.a.toString();
    }

    @Override
    public vi a(dfm dfm2) {
        vi vi2 = super.a(dfm2);
        if (dfm2 == dfm.a) {
            vi2.a(cgz.e.b(), new cs(h, "Weapon modifier", 0.0, 0));
            vi2.a(cgz.f.b(), new cs(i, "Weapon modifier", this.b - 4.0f, 0));
        }
        return vi2;
    }
}

