/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class bfm
implements bde {
    private final List a = ov.a();

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, dbk dbk3, int n2) {
        if (!this.a(iu2, cmz2, dbk2, dbk3)) {
            return;
        }
        int n3 = this.a.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            dbn dbn2;
            dct dct2 = (dct)this.a.get(i2);
            if (dct2 == null || dct2.j() || (dbn2 = dct2.l()) == null || dbn2.b() || dbn2.d() == 0) continue;
            aqn aqn2 = dct2.c.c();
            double d2 = cmz2.d(((double)aqn2.a + dct2.a.aU) / 2.0, ((double)aqn2.b + dct2.a.aV) / 2.0, ((double)aqn2.c + dct2.a.aW) / 2.0);
            if (!(d2 < (double)(n4 = (dbn2.d() - dbn2.e()) * (dbn2.d() - dbn2.e())))) continue;
            dct2.k();
        }
    }

    protected boolean a(iu iu2, cmz cmz2, dbk dbk2, dbk dbk3) {
        cxt cxt2;
        cxt cxt3 = dbk2.d(iu2, cmz2);
        return cxt3 != (cxt2 = dbk3.d(iu2, cmz2)) && (cxt3 == null || !cxt3.equals(cxt2));
    }

    @Override
    public void a(cmz cmz2) {
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(bdl bdl2, bi bi2, csg csg2, double d2, double d3, double d4, float f2, float f3) {
    }

    @Override
    public void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
    }

    @Override
    public void a(cpk cpk2) {
        if (cpk2 instanceof xy) {
            this.a.add(((xy)cpk2).ap());
        }
    }

    @Override
    public void b(cpk cpk2) {
        if (cpk2 instanceof xy) {
            this.a.remove(((xy)cpk2).ap());
        }
    }

    @Override
    public void a(bi bi2, cmz cmz2) {
    }

    @Override
    public void a(int n2, cmz cmz2, int n3) {
    }

    @Override
    public void a(bdl bdl2, int n2, cmz cmz2, int n3) {
    }

    @Override
    public void b(int n2, cmz cmz2, int n3) {
    }
}

