/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class avh
extends cay {
    public static final ddi a = ddi.b("powered");
    private final if e;

    protected avh(ahk ahk2, if if_) {
        super(ahk2);
        this.D(this.O.b().a(a, Boolean.valueOf(false)));
        this.e = if_;
    }

    @Override
    protected int m(dbk dbk2) {
        return (Boolean)dbk2.b(a) != false ? 15 : 0;
    }

    @Override
    protected dbk a(dbk dbk2, int n2) {
        return dbk2.a(a, Boolean.valueOf(n2 > 0));
    }

    @Override
    protected void c(iu iu2, cmz cmz2) {
        if (this.L == ahk.d) {
            iu2.a(null, cmz2, dah.hy, csg.e, 0.3f, 0.8f);
        } else {
            iu2.a(null, cmz2, dah.gs, csg.e, 0.3f, 0.6f);
        }
    }

    @Override
    protected void d(iu iu2, cmz cmz2) {
        if (this.L == ahk.d) {
            iu2.a(null, cmz2, dah.hx, csg.e, 0.3f, 0.7f);
        } else {
            iu2.a(null, cmz2, dah.gr, csg.e, 0.3f, 0.5f);
        }
    }

    @Override
    protected int e(iu iu2, cmz cmz2) {
        List list;
        cxt cxt2 = d.a(cmz2);
        switch (this.e) {
            case a: {
                list = iu2.b(null, cxt2);
                break;
            }
            case b: {
                list = iu2.a(bga.class, cxt2);
                break;
            }
            default: {
                return 0;
            }
        }
        if (!list.isEmpty()) {
            for (cpk cpk2 : list) {
                if (cpk2.au_()) continue;
                return 15;
            }
        }
        return 0;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Boolean.valueOf(n2 == 1));
    }

    @Override
    public int e(dbk dbk2) {
        return (Boolean)dbk2.b(a) != false ? 1 : 0;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

