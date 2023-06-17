/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ddp
extends dcl {
    public static final qf a = qf.a("age", 0, 3);

    public ddp() {
        this.D(this.O.b().a(a, Integer.valueOf(0)));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf(cmk.a(n2, 0, 3)));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if ((random.nextInt(3) == 0 || this.d(iu2, cmz2) < 4) && iu2.j(cmz2) > 11 - (Integer)dbk2.b(a) - dbk2.c()) {
            this.a(iu2, cmz2, dbk2, random, true);
        } else {
            iu2.a(cmz2, (bfa)this, cmk.a(random, 20, 40));
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        int n2;
        if (bfa2 == this && (n2 = this.d(iu2, cmz2)) < 2) {
            this.c(iu2, cmz2);
        }
    }

    private int d(iu iu2, cmz cmz2) {
        int n2 = 0;
        for (bqk bqk2 : bqk.values()) {
            if (iu2.n(cmz2.c(bqk2)).t() != this || ++n2 < 4) continue;
            return n2;
        }
        return n2;
    }

    protected void a(iu iu2, cmz cmz2, dbk dbk2, Random random, boolean bl2) {
        int n2 = (Integer)dbk2.b(a);
        if (n2 < 3) {
            iu2.a(cmz2, dbk2.a(a, Integer.valueOf(n2 + 1)), 2);
            iu2.a(cmz2, (bfa)this, cmk.a(random, 20, 40));
        } else {
            this.c(iu2, cmz2);
            if (bl2) {
                for (bqk bqk2 : bqk.values()) {
                    cmz cmz3 = cmz2.c(bqk2);
                    dbk dbk3 = iu2.n(cmz3);
                    if (dbk3.t() != this) continue;
                    this.a(iu2, cmz3, dbk3, random, false);
                }
            }
        }
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return null;
    }
}

