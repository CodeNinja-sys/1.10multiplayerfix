/*
 * Decompiled with CFR 0.150.
 */
public class rn
extends ge {
    private final bnr b;
    private final bnr c;

    public rn(bfa bfa2, bnr bnr2, bnr bnr3) {
        super(bfa2);
        this.b = bnr2;
        this.c = bnr3;
        this.e(0);
        this.a(true);
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String b(bhl bhl2) {
        return this.b.b(bhl2.h());
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        if (bhl2.b == 0 || !bdl2.a(cmz2.c(bqk2), bqk2, bhl2)) {
            return cey.c;
        }
        Comparable comparable = this.b.a(bhl2);
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.t() == this.b) {
            bvs bvs2 = this.b.av_();
            Comparable comparable2 = dbk2.b(bvs2);
            dew dew2 = (dew)((Object)dbk2.b(bnr.c));
            if ((bqk2 == bqk.b && dew2 == dew.b || bqk2 == bqk.a && dew2 == dew.a) && comparable2 == comparable) {
                dbk dbk3 = this.a(bvs2, comparable2);
                cxt cxt2 = dbk3.d(iu2, cmz2);
                if (cxt2 != bfa.y && iu2.c(cxt2.a(cmz2)) && iu2.a(cmz2, dbk3, 11)) {
                    acv acv2 = this.c.t();
                    iu2.a(bdl2, cmz2, acv2.e(), csg.e, (acv2.a() + 1.0f) / 2.0f, acv2.b() * 0.8f);
                    --bhl2.b;
                }
                return cey.a;
            }
        }
        if (this.a(bdl2, bhl2, iu2, cmz2.c(bqk2), comparable)) {
            return cey.a;
        }
        return super.a(bhl2, bdl2, iu2, cmz2, bqp2, bqk2, f2, f3, f4);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, bqk bqk2, bdl bdl2, bhl bhl2) {
        dbk dbk2;
        cmz cmz3 = cmz2;
        bvs bvs2 = this.b.av_();
        Comparable comparable = this.b.a(bhl2);
        dbk dbk3 = iu2.n(cmz2);
        if (dbk3.t() == this.b) {
            boolean bl2;
            boolean bl3 = bl2 = dbk3.b(bnr.c) == dew.a;
            if ((bqk2 == bqk.b && !bl2 || bqk2 == bqk.a && bl2) && comparable == dbk3.b(bvs2)) {
                return true;
            }
        }
        if ((dbk2 = iu2.n(cmz2 = cmz2.c(bqk2))).t() == this.b && comparable == dbk2.b(bvs2)) {
            return true;
        }
        return super.a(iu2, cmz3, bqk2, bdl2, bhl2);
    }

    private boolean a(bdl bdl2, bhl bhl2, iu iu2, cmz cmz2, Object object) {
        Comparable comparable;
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.t() == this.b && (comparable = dbk2.b(this.b.av_())) == object) {
            dbk dbk3 = this.a(this.b.av_(), comparable);
            cxt cxt2 = dbk3.d(iu2, cmz2);
            if (cxt2 != bfa.y && iu2.c(cxt2.a(cmz2)) && iu2.a(cmz2, dbk3, 11)) {
                acv acv2 = this.c.t();
                iu2.a(bdl2, cmz2, acv2.e(), csg.e, (acv2.a() + 1.0f) / 2.0f, acv2.b() * 0.8f);
                --bhl2.b;
            }
            return true;
        }
        return false;
    }

    protected dbk a(bvs bvs2, Comparable comparable) {
        return this.c.s().a(bvs2, comparable);
    }
}

