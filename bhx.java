/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class bhx
implements tv {
    private static final List c = ov.a();
    private static final int d;
    private static final int e;
    protected static final dbk a;
    protected static final dbk b;
    private final iu f;

    public bhx(iu iu2) {
        this.f = iu2;
    }

    @Override
    public bhm a(int n2, int n3) {
        int n4;
        cnb cnb2 = new cnb();
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n5 = n2 * 16 + i2;
                n4 = n3 * 16 + i3;
                cnb2.a(i2, 60, i3, b);
                dbk dbk2 = bhx.c(n5, n4);
                if (dbk2 == null) continue;
                cnb2.a(i2, 70, i3, dbk2);
            }
        }
        bhm bhm2 = new bhm(this.f, cnb2, n2, n3);
        bhm2.d();
        anr[] arranr = this.f.t_().b(null, n2 * 16, n3 * 16, 16, 16);
        byte[] arrby = bhm2.l();
        for (n4 = 0; n4 < arrby.length; ++n4) {
            arrby[n4] = (byte)anr.a(arranr[n4]);
        }
        bhm2.d();
        return bhm2;
    }

    public static dbk c(int n2, int n3) {
        int n4;
        dbk dbk2 = a;
        if (n2 > 0 && n3 > 0 && n2 % 2 != 0 && n3 % 2 != 0 && (n2 /= 2) <= d && (n3 /= 2) <= e && (n4 = cmk.a(n2 * d + n3)) < c.size()) {
            dbk2 = (dbk)c.get(n4);
        }
        return dbk2;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public boolean a(bhm bhm2, int n2, int n3) {
        return false;
    }

    @Override
    public List a(nx nx2, cmz cmz2) {
        anr anr2 = this.f.a(cmz2);
        return anr2.a(nx2);
    }

    @Override
    public cmz a(iu iu2, String string, cmz cmz2) {
        return null;
    }

    @Override
    public void b(bhm bhm2, int n2, int n3) {
    }

    static {
        a = blg.a.s();
        b = blg.cv.s();
        for (bfa bfa2 : bfa.v) {
            c.addAll(bfa2.r().a());
        }
        d = cmk.f(cmk.c((float)c.size()));
        e = cmk.f((float)c.size() / (float)d);
    }
}

