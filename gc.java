/*
 * Decompiled with CFR 0.150.
 */
public class gc
extends azg {
    private final bfa a;

    public gc(bfa bfa2) {
        this.a = bfa2;
        this.a(zm.d);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        if (bqk2 != bqk.b) {
            return cey.c;
        }
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (!bfa2.a_((bnj)iu2, cmz2)) {
            cmz2 = cmz2.c(bqk2);
        }
        if (!bdl2.a(cmz2, bqk2, bhl2) || !this.a.a(iu2, cmz2)) {
            return cey.c;
        }
        bqk bqk3 = bqk.a(bdl2.ba);
        int n2 = bqk3.h();
        int n3 = bqk3.j();
        boolean bl2 = n2 < 0 && f4 < 0.5f || n2 > 0 && f4 > 0.5f || n3 < 0 && f2 > 0.5f || n3 > 0 && f2 < 0.5f;
        gc.a(iu2, cmz2, bqk3, this.a, bl2);
        acv acv2 = this.a.t();
        iu2.a(bdl2, cmz2, acv2.e(), csg.e, (acv2.a() + 1.0f) / 2.0f, acv2.b() * 0.8f);
        --bhl2.b;
        return cey.a;
    }

    public static void a(iu iu2, cmz cmz2, bqk bqk2, bfa bfa2, boolean bl2) {
        boolean bl3;
        cmz cmz3 = cmz2.c(bqk2.f());
        cmz cmz4 = cmz2.c(bqk2.g());
        int n2 = (iu2.n(cmz4).l() ? 1 : 0) + (iu2.n(cmz4.g()).l() ? 1 : 0);
        int n3 = (iu2.n(cmz3).l() ? 1 : 0) + (iu2.n(cmz3.g()).l() ? 1 : 0);
        boolean bl4 = iu2.n(cmz4).t() == bfa2 || iu2.n(cmz4.g()).t() == bfa2;
        boolean bl5 = bl3 = iu2.n(cmz3).t() == bfa2 || iu2.n(cmz3.g()).t() == bfa2;
        if (bl4 && !bl3 || n3 > n2) {
            bl2 = true;
        } else if (bl3 && !bl4 || n3 < n2) {
            bl2 = false;
        }
        cmz cmz5 = cmz2.g();
        boolean bl6 = iu2.x(cmz2) || iu2.x(cmz5);
        dbk dbk2 = bfa2.s().a(xt.a, (Comparable)((Object)bqk2)).a(xt.c, (Comparable)((Object)(bl2 ? bjl.b : bjl.a))).a(xt.d, Boolean.valueOf(bl6)).a(xt.b, Boolean.valueOf(bl6));
        iu2.a(cmz2, dbk2.a(xt.e, (Comparable)((Object)em.b)), 2);
        iu2.a(cmz5, dbk2.a(xt.e, (Comparable)((Object)em.a)), 2);
        iu2.b(cmz2, bfa2);
        iu2.b(cmz5, bfa2);
    }
}

