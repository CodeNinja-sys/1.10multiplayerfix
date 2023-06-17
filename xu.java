/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class xu
extends acf {
    private int a;

    public xu() {
    }

    public xu(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
        this.a = Math.max(awx2.c(), awx2.e());
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Length", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.h("Length");
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        Object object;
        int n2;
        boolean bl2 = false;
        for (n2 = random.nextInt(5); n2 < this.a - 8; n2 += 2 + random.nextInt(5)) {
            object = this.a((yj)pc2, list, random, 0, n2);
            if (object == null) continue;
            n2 += Math.max(((pc)object).l.c(), ((pc)object).l.e());
            bl2 = true;
        }
        for (n2 = random.nextInt(5); n2 < this.a - 8; n2 += 2 + random.nextInt(5)) {
            object = this.b((yj)pc2, list, random, 0, n2);
            if (object == null) continue;
            n2 += Math.max(((pc)object).l.c(), ((pc)object).l.e());
            bl2 = true;
        }
        object = this.e();
        if (bl2 && random.nextInt(3) > 0 && object != null) {
            switch (arq.a[((Enum)object).ordinal()]) {
                default: {
                    ccv.b((yj)pc2, list, random, this.l.a - 1, this.l.b, this.l.c, bqk.e, this.c());
                    break;
                }
                case 2: {
                    ccv.b((yj)pc2, list, random, this.l.a - 1, this.l.b, this.l.f - 2, bqk.e, this.c());
                    break;
                }
                case 4: {
                    ccv.b((yj)pc2, list, random, this.l.d - 2, this.l.b, this.l.c - 1, bqk.c, this.c());
                    break;
                }
                case 3: {
                    ccv.b((yj)pc2, list, random, this.l.a, this.l.b, this.l.c - 1, bqk.c, this.c());
                }
            }
        }
        if (bl2 && random.nextInt(3) > 0 && object != null) {
            switch (arq.a[((Enum)object).ordinal()]) {
                default: {
                    ccv.b((yj)pc2, list, random, this.l.d + 1, this.l.b, this.l.c, bqk.f, this.c());
                    break;
                }
                case 2: {
                    ccv.b((yj)pc2, list, random, this.l.d + 1, this.l.b, this.l.f - 2, bqk.f, this.c());
                    break;
                }
                case 4: {
                    ccv.b((yj)pc2, list, random, this.l.d - 2, this.l.b, this.l.f + 1, bqk.d, this.c());
                    break;
                }
                case 3: {
                    ccv.b((yj)pc2, list, random, this.l.a, this.l.b, this.l.f + 1, bqk.d, this.c());
                }
            }
        }
    }

    public static awx a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2) {
        for (int i2 = 7 * cmk.a(random, 3, 5); i2 >= 7; i2 -= 7) {
            awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 3, 3, i2, bqk2);
            if (pc.a(list, awx2) != null) continue;
            return awx2;
        }
        return null;
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        dbk dbk2 = this.a(blg.da.s());
        dbk dbk3 = this.a(blg.f.s());
        dbk dbk4 = this.a(blg.n.s());
        dbk dbk5 = this.a(blg.e.s());
        for (int i2 = this.l.a; i2 <= this.l.d; ++i2) {
            block1: for (int i3 = this.l.c; i3 <= this.l.f; ++i3) {
                cmz cmz2 = new cmz(i2, 64, i3);
                if (!awx2.a(cmz2)) continue;
                if ((cmz2 = iu2.p(cmz2).h()).b() < iu2.u()) {
                    cmz2 = new cmz(cmz2.a(), iu2.u() - 1, cmz2.c());
                }
                while (cmz2.b() >= iu2.u() - 1) {
                    dbk dbk6 = iu2.n(cmz2);
                    if (dbk6.t() == blg.c && iu2.c(cmz2.g())) {
                        iu2.a(cmz2, dbk2, 2);
                        continue block1;
                    }
                    if (dbk6.a().d()) {
                        iu2.a(cmz2, dbk3, 2);
                        continue block1;
                    }
                    if (dbk6.t() == blg.m || dbk6.t() == blg.A || dbk6.t() == blg.cM) {
                        iu2.a(cmz2, dbk4, 2);
                        iu2.a(cmz2.h(), dbk5, 2);
                        continue block1;
                    }
                    cmz2 = cmz2.h();
                }
            }
        }
        return true;
    }
}

