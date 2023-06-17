/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cip
extends ar {
    public static final byc a = byc.a("mode", cfk.class);

    public cip() {
        super(ahk.f, bif.x);
        this.D(this.O.b());
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new i();
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof i) {
            return ((i)bql2).a(bdl2);
        }
        return false;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        if (iu2.C) {
            return;
        }
        bql bql2 = iu2.q(cmz2);
        if (!(bql2 instanceof i)) {
            return;
        }
        i i2 = (i)bql2;
        i2.a(bga2);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return super.c(iu2, cmz2, dbk2);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(a, (Comparable)((Object)cfk.d));
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)cfk.a(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((cfk)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (iu2.C) {
            return;
        }
        bql bql2 = iu2.q(cmz2);
        if (!(bql2 instanceof i)) {
            return;
        }
        i i2 = (i)bql2;
        boolean bl2 = iu2.x(cmz2);
        boolean bl3 = i2.s();
        if (bl2 && !bl3) {
            i2.d(true);
            this.a(i2);
        } else if (!bl2 && bl3) {
            i2.d(false);
        }
    }

    private void a(i i2) {
        switch (i2.i()) {
            case a: {
                i2.b(false);
                break;
            }
            case b: {
                i2.c(false);
                break;
            }
            case c: {
                i2.q();
                break;
            }
            case d: {
                break;
            }
        }
    }
}

