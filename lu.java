/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class lu
extends ar {
    public static final qf a = qf.a("power", 0, 15);
    protected static final cxt b = new cxt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0);
    private final boolean c;

    public lu(boolean bl2) {
        super(ahk.d);
        this.c = bl2;
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.a(zm.d);
        this.c(0.2f);
        this.a(acv.a);
        this.b("daylightDetector");
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b;
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return (Integer)dbk2.b(a);
    }

    public void c(iu iu2, cmz cmz2) {
        if (iu2.q.n()) {
            return;
        }
        dbk dbk2 = iu2.n(cmz2);
        int n2 = iu2.b(bzq.a, cmz2) - iu2.R();
        float f2 = iu2.d(1.0f);
        if (this.c) {
            n2 = 15 - n2;
        }
        if (n2 > 0 && !this.c) {
            float f3 = f2 < (float)Math.PI ? 0.0f : (float)Math.PI * 2;
            f2 += (f3 - f2) * 0.2f;
            n2 = Math.round((float)n2 * cmk.b(f2));
        }
        n2 = cmk.a(n2, 0, 15);
        if ((Integer)dbk2.b(a) != n2) {
            iu2.a(cmz2, dbk2.a(a, Integer.valueOf(n2)), 3);
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (bdl2.aG()) {
            if (iu2.C) {
                return true;
            }
            if (this.c) {
                iu2.a(cmz2, blg.cl.s().a(a, dbk2.b(a)), 4);
                blg.cl.c(iu2, cmz2);
            } else {
                iu2.a(cmz2, blg.cm.s().a(a, dbk2.b(a)), 4);
                blg.cm.c(iu2, cmz2);
            }
            return true;
        }
        return super.a(iu2, cmz2, dbk2, bdl2, bqp2, bhl2, bqk2, f2, f3, f4);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.cl);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(blg.cl);
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
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public boolean i(dbk dbk2) {
        return true;
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new alh();
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        if (!this.c) {
            super.a(azg2, zm2, list);
        }
    }
}

