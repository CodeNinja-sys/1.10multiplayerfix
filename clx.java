/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.UUID;
import net.minecraft.c.a;

public class clx
extends azg {
    public clx() {
        this.a(zm.f);
    }

    @Override
    public String c(bhl bhl2) {
        String string = ("" + caf.a(this.a() + ".name")).trim();
        String string2 = clx.h(bhl2);
        if (string2 != null) {
            string = string + " " + caf.a("entity." + string2 + ".name");
        }
        return string;
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        cpk cpk2;
        bql bql2;
        if (iu2.C) {
            return cey.a;
        }
        if (!bdl2.a(cmz2.c(bqk2), bqk2, bhl2)) {
            return cey.c;
        }
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.t() == blg.ac && (bql2 = iu2.q(cmz2)) instanceof ze) {
            cft cft2 = ((ze)bql2).d();
            cft2.a(clx.h(bhl2));
            bql2.c_();
            iu2.a(cmz2, dbk2, dbk2, 3);
            if (!bdl2.G.d) {
                --bhl2.b;
            }
            return cey.a;
        }
        cmz2 = cmz2.c(bqk2);
        double d2 = 0.0;
        if (bqk2 == bqk.b && dbk2 instanceof gd) {
            d2 = 0.5;
        }
        if ((cpk2 = clx.a(iu2, clx.h(bhl2), (double)cmz2.a() + 0.5, (double)cmz2.b() + d2, (double)cmz2.c() + 0.5)) != null) {
            if (cpk2 instanceof bga && bhl2.s()) {
                cpk2.g(bhl2.q());
            }
            clx.a(iu2, bdl2, bhl2, cpk2);
            if (!bdl2.G.d) {
                --bhl2.b;
            }
        }
        return cey.a;
    }

    public static void a(iu iu2, bdl bdl2, bhl bhl2, cpk cpk2) {
        a a2 = iu2.f();
        if (a2 == null || cpk2 == null) {
            return;
        }
        bvp bvp2 = bhl2.o();
        if (bvp2 != null && bvp2.b("EntityTag", 10)) {
            if (!(iu2.C || !cpk2.O_() || bdl2 != null && ((cmt)((Object)a2.al())).e(bdl2.aq()))) {
                return;
            }
            bvp bvp3 = cpk2.e(new bvp());
            UUID uUID = cpk2.cx();
            bvp3.a(bvp2.o("EntityTag"));
            cpk2.b(uUID);
            cpk2.f(bvp3);
        }
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (iu2.C) {
            return new wx(cey.b, bhl2);
        }
        auu auu2 = this.a(iu2, bdl2, true);
        if (auu2 == null || auu2.a != bmw.b) {
            return new wx(cey.b, bhl2);
        }
        cmz cmz2 = auu2.a();
        if (!(iu2.n(cmz2).t() instanceof en)) {
            return new wx(cey.b, bhl2);
        }
        if (!iu2.a(bdl2, cmz2) || !bdl2.a(cmz2, auu2.b, bhl2)) {
            return new wx(cey.c, bhl2);
        }
        cpk cpk2 = clx.a(iu2, clx.h(bhl2), (double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5);
        if (cpk2 == null) {
            return new wx(cey.b, bhl2);
        }
        if (cpk2 instanceof bga && bhl2.s()) {
            cpk2.g(bhl2.q());
        }
        clx.a(iu2, bdl2, bhl2, cpk2);
        if (!bdl2.G.d) {
            --bhl2.b;
        }
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }

    public static cpk a(iu iu2, String string, double d2, double d3, double d4) {
        if (string == null || !vb.a.containsKey(string)) {
            return null;
        }
        cpk cpk2 = null;
        for (int i2 = 0; i2 < 1; ++i2) {
            cpk2 = vb.b(string, iu2);
            if (!(cpk2 instanceof bga)) continue;
            xy xy2 = (xy)cpk2;
            cpk2.a_(d2, d3, d4, cmk.g(iu2.p.nextFloat() * 360.0f), 0.0f);
            xy2.aj = xy2.ba;
            xy2.ah = xy2.ba;
            xy2.a(iu2.C(new cmz(xy2)), null);
            iu2.b(cpk2);
            xy2.as();
        }
        return cpk2;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (qb qb2 : vb.a.values()) {
            bhl bhl2 = new bhl(azg2, 1);
            clx.a(bhl2, qb2.a);
            list.add(bhl2);
        }
    }

    public static void a(bhl bhl2, String string) {
        bvp bvp2 = bhl2.n() ? bhl2.o() : new bvp();
        bvp bvp3 = new bvp();
        bvp3.a("id", string);
        bvp2.a("EntityTag", bvp3);
        bhl2.d(bvp2);
    }

    public static String h(bhl bhl2) {
        bvp bvp2 = bhl2.o();
        if (bvp2 == null) {
            return null;
        }
        if (!bvp2.b("EntityTag", 10)) {
            return null;
        }
        bvp bvp3 = bvp2.o("EntityTag");
        if (!bvp3.b("id", 8)) {
            return null;
        }
        return bvp3.l("id");
    }
}

