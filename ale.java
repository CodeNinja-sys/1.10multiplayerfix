/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ale
extends ced {
    private bfa a;
    private bfa b;

    public ale() {
    }

    public ale(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
        this.a = this.a(random);
        this.b = this.a(random);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("CA", bfa.v.a(this.a));
        bvp2.a("CB", bfa.v.a(this.b));
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bfa.f(bvp2.h("CA"));
        this.b = bfa.f(bvp2.h("CB"));
    }

    private bfa a(Random random) {
        switch (random.nextInt(10)) {
            default: {
                return blg.aj;
            }
            case 0: 
            case 1: {
                return blg.cb;
            }
            case 2: 
            case 3: {
                return blg.cc;
            }
            case 4: 
        }
        return blg.cZ;
    }

    public static ale a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 7, 4, 9, bqk2);
        if (!ale.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new ale(yj2, n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 4 - 1, 0);
        }
        dbk dbk2 = this.a(blg.r.s());
        this.a(iu2, awx2, 0, 1, 0, 6, 4, 8, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 1, 0, 1, 2, 0, 7, blg.ak.s(), blg.ak.s(), false);
        this.a(iu2, awx2, 4, 0, 1, 5, 0, 7, blg.ak.s(), blg.ak.s(), false);
        this.a(iu2, awx2, 0, 0, 0, 0, 0, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 6, 0, 0, 6, 0, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 0, 0, 5, 0, 0, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 0, 8, 5, 0, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 3, 0, 1, 3, 0, 7, blg.j.s(), blg.j.s(), false);
        for (n3 = 1; n3 <= 7; ++n3) {
            n2 = ((kd)this.a).e();
            int n4 = n2 / 3;
            this.a(iu2, this.a.a(cmk.a(random, n4, n2)), 1, 1, n3, awx2);
            this.a(iu2, this.a.a(cmk.a(random, n4, n2)), 2, 1, n3, awx2);
            int n5 = ((kd)this.b).e();
            int n6 = n5 / 3;
            this.a(iu2, this.b.a(cmk.a(random, n6, n5)), 4, 1, n3, awx2);
            this.a(iu2, this.b.a(cmk.a(random, n6, n5)), 5, 1, n3, awx2);
        }
        for (n3 = 0; n3 < 9; ++n3) {
            for (n2 = 0; n2 < 7; ++n2) {
                this.c(iu2, n2, 4, n3, awx2);
                this.b(iu2, blg.d.s(), n2, -1, n3, awx2);
            }
        }
        return true;
    }
}

