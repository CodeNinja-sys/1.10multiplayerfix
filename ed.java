/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ed {
    private final List a = ov.a();
    private final List b = ov.a();
    private cmz c = cmz.e;
    private String d = "?";

    public cmz a() {
        return this.c;
    }

    public void a(String string) {
        this.d = string;
    }

    public String b() {
        return this.d;
    }

    public void a(iu iu2, cmz cmz2, cmz cmz3, boolean bl2, bfa bfa2) {
        if (cmz3.a() < 1 || cmz3.b() < 1 || cmz3.c() < 1) {
            return;
        }
        cmz cmz4 = cmz2.g(cmz3).e(-1, -1, -1);
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a();
        ArrayList arrayList3 = ov.a();
        cmz cmz5 = new cmz(Math.min(cmz2.a(), cmz4.a()), Math.min(cmz2.b(), cmz4.b()), Math.min(cmz2.c(), cmz4.c()));
        cmz cmz6 = new cmz(Math.max(cmz2.a(), cmz4.a()), Math.max(cmz2.b(), cmz4.b()), Math.max(cmz2.c(), cmz4.c()));
        this.c = cmz3;
        for (pj pj2 : cmz.b(cmz5, cmz6)) {
            cmz cmz7 = pj2.h(cmz5);
            dbk dbk2 = iu2.n(pj2);
            if (bfa2 != null && bfa2 == dbk2.t()) continue;
            bql bql2 = iu2.q(pj2);
            if (bql2 != null) {
                bvp bvp2 = bql2.b(new bvp());
                bvp2.q("x");
                bvp2.q("y");
                bvp2.q("z");
                arrayList2.add(new xo(cmz7, dbk2, bvp2));
                continue;
            }
            if (dbk2.b() || dbk2.h()) {
                arrayList.add(new xo(cmz7, dbk2, null));
                continue;
            }
            arrayList3.add(new xo(cmz7, dbk2, null));
        }
        this.a.clear();
        this.a.addAll(arrayList);
        this.a.addAll(arrayList2);
        this.a.addAll(arrayList3);
        if (bl2) {
            this.a(iu2, cmz5, cmz6.e(1, 1, 1));
        } else {
            this.b.clear();
        }
    }

    private void a(iu iu2, cmz cmz2, cmz cmz3) {
        List list = iu2.a(cpk.class, new cxt(cmz2, cmz3), (cm)new zp(this));
        this.b.clear();
        for (cpk cpk2 : list) {
            amj amj2 = new amj(cpk2.aU - (double)cmz2.a(), cpk2.aV - (double)cmz2.b(), cpk2.aW - (double)cmz2.c());
            bvp bvp2 = new bvp();
            cpk2.c(bvp2);
            cmz cmz4 = cpk2 instanceof cbk ? ((cbk)cpk2).p().h(cmz2) : new cmz(amj2);
            this.b.add(new bzu(amj2, cmz4, bvp2));
        }
    }

    public Map a(cmz cmz2, cwl cwl2) {
        HashMap hashMap = sz.c();
        awx awx2 = cwl2.g();
        for (xo xo2 : this.a) {
            cfk cfk2;
            dbk dbk2;
            cmz cmz3 = ed.a(cwl2, xo2.a).g(cmz2);
            if (awx2 != null && !awx2.a(cmz3) || (dbk2 = xo2.b).t() != blg.dk || xo2.c == null || (cfk2 = cfk.valueOf(xo2.c.l("mode"))) != cfk.d) continue;
            hashMap.put(cmz3, xo2.c.l("metadata"));
        }
        return hashMap;
    }

    public cmz a(cwl cwl2, cmz cmz2, cwl cwl3, cmz cmz3) {
        cmz cmz4 = ed.a(cwl2, cmz2);
        cmz cmz5 = ed.a(cwl3, cmz3);
        return cmz4.h(cmz5);
    }

    public static cmz a(cwl cwl2, cmz cmz2) {
        return ed.b(cmz2, cwl2.b(), cwl2.c());
    }

    public void a(iu iu2, cmz cmz2, cwl cwl2) {
        cwl2.i();
        this.b(iu2, cmz2, cwl2);
    }

    public void b(iu iu2, cmz cmz2, cwl cwl2) {
        this.a(iu2, cmz2, new afq(cmz2, cwl2), cwl2, 2);
    }

    public void a(iu iu2, cmz cmz2, cwl cwl2, int n2) {
        this.a(iu2, cmz2, new afq(cmz2, cwl2), cwl2, n2);
    }

    public void a(iu iu2, cmz cmz2, bzf bzf2, cwl cwl2, int n2) {
        Object object;
        cmz cmz3;
        if (this.a.isEmpty() || this.c.a() < 1 || this.c.b() < 1 || this.c.c() < 1) {
            return;
        }
        bfa bfa2 = cwl2.f();
        awx awx2 = cwl2.g();
        for (xo xo2 : this.a) {
            bql bql2;
            cmz3 = ed.a(cwl2, xo2.a).g(cmz2);
            Object object2 = object = bzf2 != null ? bzf2.a(iu2, cmz3, xo2) : xo2;
            if (object == null) continue;
            bfa bfa3 = ((xo)object).b.t();
            if (bfa2 != null && bfa2 == bfa3 || cwl2.h() && bfa3 == blg.dk || awx2 != null && !awx2.a(cmz3)) continue;
            dbk dbk2 = ((xo)object).b.a(cwl2.b());
            dbk dbk3 = dbk2.a(cwl2.c());
            if (((xo)object).c != null && (bql2 = iu2.q(cmz3)) != null) {
                if (bql2 instanceof tb) {
                    ((tb)((Object)bql2)).g();
                }
                iu2.a(cmz3, blg.cv.s(), 4);
            }
            if (!iu2.a(cmz3, dbk3, n2) || ((xo)object).c == null || (bql2 = iu2.q(cmz3)) == null) continue;
            ((xo)object).c.a("x", cmz3.a());
            ((xo)object).c.a("y", cmz3.b());
            ((xo)object).c.a("z", cmz3.c());
            bql2.a(((xo)object).c);
            bql2.a_(cwl2.b());
            bql2.a_(cwl2.c());
        }
        for (xo xo2 : this.a) {
            if (bfa2 != null && bfa2 == xo2.b.t()) continue;
            cmz3 = ed.a(cwl2, xo2.a).g(cmz2);
            if (awx2 != null && !awx2.a(cmz3)) continue;
            iu2.a(cmz3, xo2.b.t());
            if (xo2.c == null || (object = iu2.q(cmz3)) == null) continue;
            ((bql)object).c_();
        }
        if (!cwl2.e()) {
            this.a(iu2, cmz2, cwl2.b(), cwl2.c(), awx2);
        }
    }

    private void a(iu iu2, cmz cmz2, cdk cdk2, ih ih2, awx awx2) {
        for (bzu bzu2 : this.b) {
            cpk cpk2;
            cmz cmz3 = ed.b(bzu2.b, cdk2, ih2).g(cmz2);
            if (awx2 != null && !awx2.a(cmz3)) continue;
            bvp bvp2 = bzu2.c;
            amj amj2 = ed.a(bzu2.a, cdk2, ih2);
            amj amj3 = amj2.b(cmz2.a(), cmz2.b(), cmz2.c());
            bmh bmh2 = new bmh();
            bmh2.a(new cab(amj3.b));
            bmh2.a(new cab(amj3.c));
            bmh2.a(new cab(amj3.d));
            bvp2.a("Pos", bmh2);
            bvp2.a("UUID", UUID.randomUUID());
            try {
                cpk2 = vb.a(bvp2, iu2);
            }
            catch (Exception exception) {
                cpk2 = null;
            }
            if (cpk2 == null) continue;
            float f2 = cpk2.a(cdk2);
            cpk2.a_(amj3.b, amj3.c, amj3.d, f2 += cpk2.ba - cpk2.a(ih2), cpk2.bb);
            iu2.b(cpk2);
        }
    }

    public cmz a(ih ih2) {
        switch (ih2) {
            case d: 
            case b: {
                return new cmz(this.c.c(), this.c.b(), this.c.a());
            }
        }
        return this.c;
    }

    private static cmz b(cmz cmz2, cdk cdk2, ih ih2) {
        int n2 = cmz2.a();
        int n3 = cmz2.b();
        int n4 = cmz2.c();
        boolean bl2 = true;
        switch (cdk2) {
            case b: {
                n4 = -n4;
                break;
            }
            case c: {
                n2 = -n2;
                break;
            }
            default: {
                bl2 = false;
            }
        }
        switch (ih2) {
            case c: {
                return new cmz(-n2, n3, -n4);
            }
            case d: {
                return new cmz(n4, n3, -n2);
            }
            case b: {
                return new cmz(-n4, n3, n2);
            }
        }
        return bl2 ? new cmz(n2, n3, n4) : cmz2;
    }

    private static amj a(amj amj2, cdk cdk2, ih ih2) {
        double d2 = amj2.b;
        double d3 = amj2.c;
        double d4 = amj2.d;
        boolean bl2 = true;
        switch (cdk2) {
            case b: {
                d4 = 1.0 - d4;
                break;
            }
            case c: {
                d2 = 1.0 - d2;
                break;
            }
            default: {
                bl2 = false;
            }
        }
        switch (ih2) {
            case c: {
                return new amj(1.0 - d2, d3, 1.0 - d4);
            }
            case d: {
                return new amj(d4, d3, 1.0 - d2);
            }
            case b: {
                return new amj(1.0 - d4, d3, d2);
            }
        }
        return bl2 ? new amj(d2, d3, d4) : amj2;
    }

    public cmz a(cmz cmz2, cdk cdk2, ih ih2) {
        int n2 = this.a().a() - 1;
        int n3 = this.a().c() - 1;
        int n4 = cdk2 == cdk.c ? n2 : 0;
        int n5 = cdk2 == cdk.b ? n3 : 0;
        cmz cmz3 = cmz2;
        switch (ih2) {
            case a: {
                cmz3 = cmz2.e(n4, 0, n5);
                break;
            }
            case b: {
                cmz3 = cmz2.e(n3 - n5, 0, n4);
                break;
            }
            case c: {
                cmz3 = cmz2.e(n2 - n4, 0, n3 - n5);
                break;
            }
            case d: {
                cmz3 = cmz2.e(n5, 0, n2 - n4);
            }
        }
        return cmz3;
    }

    public bvp a(bvp bvp2) {
        Object object2;
        awr awr2 = new awr(null);
        bmh bmh2 = new bmh();
        for (Object object2 : this.a) {
            Object object3 = new bvp();
            ((bvp)object3).a("pos", this.a(((xo)object2).a.a(), ((xo)object2).a.b(), ((xo)object2).a.c()));
            ((bvp)object3).a("state", awr2.a(((xo)object2).b));
            if (((xo)object2).c != null) {
                ((bvp)object3).a("nbt", ((xo)object2).c);
            }
            bmh2.a((azt)object3);
        }
        bmh bmh3 = new bmh();
        for (Object object3 : this.b) {
            Object object4 = new bvp();
            ((bvp)object4).a("pos", this.a(object3.a.b, object3.a.c, object3.a.d));
            ((bvp)object4).a("blockPos", this.a(((bzu)object3).b.a(), ((bzu)object3).b.b(), ((bzu)object3).b.c()));
            if (((bzu)object3).c != null) {
                ((bvp)object4).a("nbt", ((bzu)object3).c);
            }
            bmh3.a((azt)object4);
        }
        object2 = new bmh();
        for (Object object4 : awr2) {
            ((bmh)object2).a(ayj.a(new bvp(), (dbk)object4));
        }
        bvp2.a("palette", (azt)object2);
        bvp2.a("blocks", bmh2);
        bvp2.a("entities", bmh3);
        bvp2.a("size", this.a(this.c.a(), this.c.b(), this.c.c()));
        bvp2.a("version", 1);
        bvp2.a("author", this.d);
        return bvp2;
    }

    public void b(bvp bvp2) {
        azt azt2;
        Object object;
        Object object2;
        azt azt3;
        this.a.clear();
        this.b.clear();
        bmh bmh2 = bvp2.c("size", 3);
        this.c = new cmz(bmh2.c(0), bmh2.c(1), bmh2.c(2));
        this.d = bvp2.l("author");
        awr awr2 = new awr(null);
        bmh bmh3 = bvp2.c("palette", 10);
        for (int i2 = 0; i2 < bmh3.b(); ++i2) {
            awr2.a(ayj.d(bmh3.b(i2)), i2);
        }
        bmh bmh4 = bvp2.c("blocks", 10);
        for (int i3 = 0; i3 < bmh4.b(); ++i3) {
            bvp bvp3 = bmh4.b(i3);
            azt3 = bvp3.c("pos", 3);
            object2 = new cmz(((bmh)azt3).c(0), ((bmh)azt3).c(1), ((bmh)azt3).c(2));
            object = awr2.a(bvp3.h("state"));
            azt2 = bvp3.e("nbt") ? bvp3.o("nbt") : null;
            this.a.add(new xo((cmz)object2, (dbk)object, (bvp)azt2));
        }
        bmh bmh5 = bvp2.c("entities", 10);
        for (int i4 = 0; i4 < bmh5.b(); ++i4) {
            azt3 = bmh5.b(i4);
            object2 = ((bvp)azt3).c("pos", 6);
            object = new amj(((bmh)object2).e(0), ((bmh)object2).e(1), ((bmh)object2).e(2));
            azt2 = ((bvp)azt3).c("blockPos", 3);
            cmz cmz2 = new cmz(((bmh)azt2).c(0), ((bmh)azt2).c(1), ((bmh)azt2).c(2));
            if (!((bvp)azt3).e("nbt")) continue;
            bvp bvp4 = ((bvp)azt3).o("nbt");
            this.b.add(new bzu((amj)object, cmz2, bvp4));
        }
    }

    private bmh a(int ... arrn) {
        bmh bmh2 = new bmh();
        for (int n2 : arrn) {
            bmh2.a(new iq(n2));
        }
        return bmh2;
    }

    private bmh a(double ... arrd) {
        bmh bmh2 = new bmh();
        for (double d2 : arrd) {
            bmh2.a(new cab(d2));
        }
        return bmh2;
    }
}

