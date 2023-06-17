/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.List;
import java.util.Random;
import java.util.Set;

public final class cnv {
    private static final int a = (int)Math.pow(17.0, 2.0);
    private final Set b = aad.a();

    public int a(alj alj2, boolean bl2, boolean bl3, boolean bl4) {
        Object object;
        int n2;
        int n3;
        Object object22;
        if (!bl2 && !bl3) {
            return 0;
        }
        this.b.clear();
        int n4 = 0;
        for (Object object22 : alj2.g) {
            if (((bdl)object22).aL()) continue;
            int n5 = cmk.c(((bdl)object22).aU / 16.0);
            int n6 = cmk.c(((bdl)object22).aW / 16.0);
            int n7 = 8;
            for (int i2 = -8; i2 <= 8; ++i2) {
                for (n3 = -8; n3 <= 8; ++n3) {
                    Object object3;
                    n2 = i2 == -8 || i2 == 8 || n3 == -8 || n3 == 8 ? 1 : 0;
                    object = new zz(i2 + n5, n3 + n6);
                    if (this.b.contains(object)) continue;
                    ++n4;
                    if (n2 != 0 || !alj2.U().a((zz)object) || (object3 = alj2.ag().b(((zz)object).a, ((zz)object).b)) == null || !((asi)object3).e()) continue;
                    this.b.add(object);
                }
            }
        }
        int n8 = 0;
        object22 = alj2.B();
        for (nx nx2 : nx.values()) {
            if (nx2.c() && !bl3 || !nx2.c() && !bl2 || nx2.d() && !bl4 || (n3 = alj2.a(nx2.a())) > (n2 = nx2.b() * n4 / a)) continue;
            object = new pj();
            block6: for (zz zz2 : this.b) {
                cmz cmz2 = cnv.a(alj2, zz2.a, zz2.b);
                int n9 = cmz2.a();
                int n10 = cmz2.b();
                int n11 = cmz2.c();
                dbk dbk2 = alj2.n(cmz2);
                if (dbk2.l()) continue;
                int n12 = 0;
                block7: for (int i3 = 0; i3 < 3; ++i3) {
                    int n13 = n9;
                    int n14 = n10;
                    int n15 = n11;
                    int n16 = 6;
                    clh clh2 = null;
                    aql aql2 = null;
                    int n17 = cmk.f(Math.random() * 4.0);
                    for (int i4 = 0; i4 < n17; ++i4) {
                        xy xy2;
                        ((pj)object).a(n13 += alj2.p.nextInt(6) - alj2.p.nextInt(6), n14 += alj2.p.nextInt(1) - alj2.p.nextInt(1), n15 += alj2.p.nextInt(6) - alj2.p.nextInt(6));
                        float f2 = (float)n13 + 0.5f;
                        float f3 = (float)n15 + 0.5f;
                        if (alj2.a(f2, (double)n14, f3, 24.0) || ((cjx)object22).d(f2, (double)n14, f3) < 576.0) continue;
                        if (clh2 == null && (clh2 = alj2.a(nx2, (cmz)object)) == null) continue block7;
                        if (!alj2.a(nx2, clh2, (cmz)object) || !cnv.a(bva.a(clh2.a), alj2, (cmz)object)) continue;
                        try {
                            xy2 = (xy)clh2.a.getConstructor(iu.class).newInstance(alj2);
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return n8;
                        }
                        xy2.a_(f2, n14, f3, alj2.p.nextFloat() * 360.0f, 0.0f);
                        if (xy2.h() && xy2.i()) {
                            aql2 = xy2.a(alj2.C(new cmz(xy2)), aql2);
                            if (xy2.i()) {
                                ++n12;
                                alj2.b(xy2);
                            } else {
                                xy2.ak_();
                            }
                            if (n12 >= xy2.z()) continue block6;
                        }
                        n8 += n12;
                    }
                }
            }
        }
        return n8;
    }

    private static cmz a(iu iu2, int n2, int n3) {
        int n4;
        int n5;
        bhm bhm2 = iu2.a(n2, n3);
        int n6 = cmk.c(bhm2.a(new cmz(n5 = n2 * 16 + iu2.p.nextInt(16), 0, n4 = n3 * 16 + iu2.p.nextInt(16))) + 1, 16);
        int n7 = iu2.p.nextInt(n6 > 0 ? n6 : bhm2.a() + 16 - 1);
        return new cmz(n5, n7, n4);
    }

    public static boolean a(dbk dbk2) {
        if (dbk2.k()) {
            return false;
        }
        if (dbk2.m()) {
            return false;
        }
        if (dbk2.a().d()) {
            return false;
        }
        return !bxs.m(dbk2);
    }

    public static boolean a(ais ais2, iu iu2, cmz cmz2) {
        if (iu2.U().a(cmz2)) {
            dbk dbk2 = iu2.n(cmz2);
            if (ais2 == ais.c) {
                return dbk2.a().d() && iu2.n(cmz2.h()).a().d() && !iu2.n(cmz2.g()).l();
            }
            cmz cmz3 = cmz2.h();
            if (!iu2.n(cmz3).q()) {
                return false;
            }
            bfa bfa2 = iu2.n(cmz3).t();
            boolean bl2 = bfa2 != blg.h && bfa2 != blg.cv;
            return bl2 && cnv.a(dbk2) && cnv.a(iu2.n(cmz2.g()));
        }
        return false;
    }

    public static void a(iu iu2, anr anr2, int n2, int n3, int n4, int n5, Random random) {
        List list = anr2.a(nx.b);
        if (list.isEmpty()) {
            return;
        }
        while (random.nextFloat() < anr2.f()) {
            clh clh2 = (clh)ctt.a(iu2.p, list);
            int n6 = clh2.b + random.nextInt(1 + clh2.d - clh2.b);
            aql aql2 = null;
            int n7 = n2 + random.nextInt(n4);
            int n8 = n3 + random.nextInt(n5);
            int n9 = n7;
            int n10 = n8;
            for (int i2 = 0; i2 < n6; ++i2) {
                boolean bl2 = false;
                for (int i3 = 0; !bl2 && i3 < 4; ++i3) {
                    cmz cmz2 = iu2.p(new cmz(n7, 0, n8));
                    if (cnv.a(ais.a, iu2, cmz2)) {
                        xy xy2;
                        try {
                            xy2 = (xy)clh2.a.getConstructor(iu.class).newInstance(iu2);
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            continue;
                        }
                        xy2.a_((float)n7 + 0.5f, cmz2.b(), (float)n8 + 0.5f, random.nextFloat() * 360.0f, 0.0f);
                        iu2.b(xy2);
                        aql2 = xy2.a(iu2.C(new cmz(xy2)), aql2);
                        bl2 = true;
                    }
                    n7 += random.nextInt(5) - random.nextInt(5);
                    n8 += random.nextInt(5) - random.nextInt(5);
                    while (n7 < n2 || n7 >= n2 + n4 || n8 < n3 || n8 >= n3 + n4) {
                        n7 = n9 + random.nextInt(5) - random.nextInt(5);
                        n8 = n10 + random.nextInt(5) - random.nextInt(5);
                    }
                }
            }
        }
    }
}

