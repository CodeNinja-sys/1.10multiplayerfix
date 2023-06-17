/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cmv
extends lp {
    protected static final cxt a = new cxt(0.0625, 0.0, 0.0625, 0.9375, 0.09375, 0.9375);

    protected cmv() {
        this.a(zm.c);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        if (!(cpk2 instanceof cor)) {
            cmv.a(cmz2, cxt2, list, a);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        super.a(iu2, cmz2, dbk2, cpk2);
        if (cpk2 instanceof cor) {
            iu2.b(new cmz(cmz2), true);
        }
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return a;
    }

    @Override
    protected boolean m(dbk dbk2) {
        return dbk2.t() == blg.j || dbk2.a() == ahk.w;
    }

    @Override
    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (cmz2.b() < 0 || cmz2.b() >= 256) {
            return false;
        }
        dbk dbk3 = iu2.n(cmz2.h());
        ahk ahk2 = dbk3.a();
        return ahk2 == ahk.h && (Integer)dbk3.b(en.a) == 0 || ahk2 == ahk.w;
    }

    @Override
    public int e(dbk dbk2) {
        return 0;
    }
}

