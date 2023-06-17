/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bsm
extends bfa {
    public bsm() {
        this(ahk.e.p());
    }

    public bsm(bif bif2) {
        super(ahk.e, bif2);
        this.a(zm.b);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (this == blg.q) {
            return hp.j;
        }
        if (this == blg.ag) {
            return hp.k;
        }
        if (this == blg.x) {
            return hp.bd;
        }
        if (this == blg.bP) {
            return hp.bY;
        }
        if (this == blg.co) {
            return hp.cq;
        }
        return azg.a(this);
    }

    @Override
    public int a(Random random) {
        if (this == blg.x) {
            return 4 + random.nextInt(5);
        }
        return 1;
    }

    @Override
    public int a(int n2, Random random) {
        if (n2 > 0 && azg.a(this) != this.a((dbk)this.r().a().aO_().next(), random, n2)) {
            int n3 = random.nextInt(n2 + 2) - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            return this.a(random) * (n3 + 1);
        }
        return this.a(random);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        super.a(iu2, cmz2, dbk2, f2, n2);
        if (this.a(dbk2, iu2.p, n2) != azg.a(this)) {
            int n3 = 0;
            if (this == blg.q) {
                n3 = cmk.a(iu2.p, 0, 2);
            } else if (this == blg.ag) {
                n3 = cmk.a(iu2.p, 3, 7);
            } else if (this == blg.bP) {
                n3 = cmk.a(iu2.p, 3, 7);
            } else if (this == blg.x) {
                n3 = cmk.a(iu2.p, 2, 5);
            } else if (this == blg.co) {
                n3 = cmk.a(iu2.p, 2, 5);
            }
            this.b(iu2, cmz2, n3);
        }
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this);
    }

    @Override
    public int d(dbk dbk2) {
        if (this == blg.x) {
            return dck.l.c();
        }
        return 0;
    }
}

