/*
 * Decompiled with CFR 0.150.
 */
public class rp
extends bfa {
    public static final ddi a = ddi.b("explode");

    public rp() {
        super(ahk.u);
        this.D(this.O.b().a(a, Boolean.valueOf(false)));
        this.a(zm.d);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        super.a(iu2, cmz2, dbk2);
        if (iu2.x(cmz2)) {
            this.a_(iu2, cmz2, dbk2.a(a, Boolean.valueOf(true)));
            iu2.f(cmz2);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (iu2.x(cmz2)) {
            this.a_(iu2, cmz2, dbk2.a(a, Boolean.valueOf(true)));
            iu2.f(cmz2);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, yk yk2) {
        if (iu2.C) {
            return;
        }
        cgg cgg2 = new cgg(iu2, (float)cmz2.a() + 0.5f, cmz2.b(), (float)cmz2.c() + 0.5f, yk2.c());
        cgg2.c((short)(iu2.p.nextInt(cgg2.w() / 4) + cgg2.w() / 8));
        iu2.b(cgg2);
    }

    @Override
    public void a_(iu iu2, cmz cmz2, dbk dbk2) {
        this.a(iu2, cmz2, dbk2, (bga)null);
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2) {
        if (iu2.C) {
            return;
        }
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            cgg cgg2 = new cgg(iu2, (float)cmz2.a() + 0.5f, cmz2.b(), (float)cmz2.c() + 0.5f, bga2);
            iu2.b(cgg2);
            iu2.a(null, cgg2.aU, cgg2.aV, cgg2.aW, dah.gz, csg.e, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (bhl2 != null && (bhl2.a() == hp.d || bhl2.a() == hp.bV)) {
            this.a(iu2, cmz2, dbk2.a(a, Boolean.valueOf(true)), (bga)bdl2);
            iu2.a(cmz2, blg.a.s(), 11);
            if (bhl2.a() == hp.d) {
                bhl2.a(1, (bga)bdl2);
            } else if (!bdl2.G.d) {
                --bhl2.b;
            }
            return true;
        }
        return super.a(iu2, cmz2, dbk2, bdl2, bqp2, bhl2, bqk2, f2, f3, f4);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        cwt cwt2;
        if (!iu2.C && cpk2 instanceof cwt && (cwt2 = (cwt)cpk2).y_()) {
            this.a(iu2, cmz2, iu2.n(cmz2).a(a, Boolean.valueOf(true)), cwt2.e instanceof bga ? (bga)cwt2.e : null);
            iu2.f(cmz2);
        }
    }

    @Override
    public boolean a(yk yk2) {
        return false;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Boolean.valueOf((n2 & 1) > 0));
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

