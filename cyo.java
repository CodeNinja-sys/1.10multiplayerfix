/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class cyo
extends ced {
    private bfa a;
    private bfa b;
    private bfa c;
    private bfa d;

    public cyo() {
    }

    public cyo(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
        this.a = this.a(random);
        this.b = this.a(random);
        this.c = this.a(random);
        this.d = this.a(random);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("CA", bfa.v.a(this.a));
        bvp2.a("CB", bfa.v.a(this.b));
        bvp2.a("CC", bfa.v.a(this.c));
        bvp2.a("CD", bfa.v.a(this.d));
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bfa.f(bvp2.h("CA"));
        this.b = bfa.f(bvp2.h("CB"));
        this.c = bfa.f(bvp2.h("CC"));
        this.d = bfa.f(bvp2.h("CD"));
        if (!(this.a instanceof kd)) {
            this.a = blg.aj;
        }
        if (!(this.b instanceof kd)) {
            this.b = blg.cb;
        }
        if (!(this.c instanceof kd)) {
            this.c = blg.cc;
        }
        if (!(this.d instanceof kd)) {
            this.d = blg.cZ;
        }
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

    public static cyo a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 13, 4, 9, bqk2);
        if (!cyo.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new cyo(yj2, n5, random, awx2, bqk2);
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
        this.a(iu2, awx2, 0, 1, 0, 12, 4, 8, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 1, 0, 1, 2, 0, 7, blg.ak.s(), blg.ak.s(), false);
        this.a(iu2, awx2, 4, 0, 1, 5, 0, 7, blg.ak.s(), blg.ak.s(), false);
        this.a(iu2, awx2, 7, 0, 1, 8, 0, 7, blg.ak.s(), blg.ak.s(), false);
        this.a(iu2, awx2, 10, 0, 1, 11, 0, 7, blg.ak.s(), blg.ak.s(), false);
        this.a(iu2, awx2, 0, 0, 0, 0, 0, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 6, 0, 0, 6, 0, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 12, 0, 0, 12, 0, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 0, 0, 11, 0, 0, dbk2, dbk2, false);
        this.a(iu2, awx2, 1, 0, 8, 11, 0, 8, dbk2, dbk2, false);
        this.a(iu2, awx2, 3, 0, 1, 3, 0, 7, blg.j.s(), blg.j.s(), false);
        this.a(iu2, awx2, 9, 0, 1, 9, 0, 7, blg.j.s(), blg.j.s(), false);
        for (n3 = 1; n3 <= 7; ++n3) {
            n2 = ((kd)this.a).e();
            int n4 = n2 / 3;
            this.a(iu2, this.a.a(cmk.a(random, n4, n2)), 1, 1, n3, awx2);
            this.a(iu2, this.a.a(cmk.a(random, n4, n2)), 2, 1, n3, awx2);
            int n5 = ((kd)this.b).e();
            int n6 = n5 / 3;
            this.a(iu2, this.b.a(cmk.a(random, n6, n5)), 4, 1, n3, awx2);
            this.a(iu2, this.b.a(cmk.a(random, n6, n5)), 5, 1, n3, awx2);
            int n7 = ((kd)this.c).e();
            int n8 = n7 / 3;
            this.a(iu2, this.c.a(cmk.a(random, n8, n7)), 7, 1, n3, awx2);
            this.a(iu2, this.c.a(cmk.a(random, n8, n7)), 8, 1, n3, awx2);
            int n9 = ((kd)this.d).e();
            int n10 = n9 / 3;
            this.a(iu2, this.d.a(cmk.a(random, n10, n9)), 10, 1, n3, awx2);
            this.a(iu2, this.d.a(cmk.a(random, n10, n9)), 11, 1, n3, awx2);
        }
        for (n3 = 0; n3 < 9; ++n3) {
            for (n2 = 0; n2 < 13; ++n2) {
                this.c(iu2, n2, 4, n3, awx2);
                this.b(iu2, blg.d.s(), n2, -1, n3, awx2);
            }
        }
        return true;
    }
}

