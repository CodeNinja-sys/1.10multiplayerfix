/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import net.minecraft.c.a;

public class ge
extends azg {
    protected final bfa a;

    public ge(bfa bfa2) {
        this.a = bfa2;
    }

    public ge a(String string) {
        super.b(string);
        return this;
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (!bfa2.a_((bnj)iu2, cmz2)) {
            cmz2 = cmz2.c(bqk2);
        }
        if (bhl2.b == 0 || !bdl2.a(cmz2, bqk2, bhl2) || !iu2.a(this.a, cmz2, false, bqk2, null, bhl2)) {
            return cey.c;
        }
        int n2 = this.a(bhl2.h());
        dbk dbk3 = this.a.a(iu2, cmz2, bqk2, f2, f3, f4, n2, bdl2);
        if (iu2.a(cmz2, dbk3, 11)) {
            dbk3 = iu2.n(cmz2);
            if (dbk3.t() == this.a) {
                ge.a(iu2, bdl2, cmz2, bhl2);
                this.a.a(iu2, cmz2, dbk3, bdl2, bhl2);
            }
            acv acv2 = this.a.t();
            iu2.a(bdl2, cmz2, acv2.e(), csg.e, (acv2.a() + 1.0f) / 2.0f, acv2.b() * 0.8f);
            --bhl2.b;
        }
        return cey.a;
    }

    public static boolean a(iu iu2, bdl bdl2, cmz cmz2, bhl bhl2) {
        bql bql2;
        a a2 = iu2.f();
        if (a2 == null) {
            return false;
        }
        if (bhl2.n() && bhl2.o().b("BlockEntityTag", 10) && (bql2 = iu2.q(cmz2)) != null) {
            if (!(iu2.C || !bql2.h_() || bdl2 != null && bdl2.aU())) {
                return false;
            }
            bvp bvp2 = bql2.b(new bvp());
            bvp bvp3 = bvp2.d();
            bvp bvp4 = (bvp)bhl2.o().c("BlockEntityTag");
            bvp2.a(bvp4);
            bvp2.a("x", cmz2.a());
            bvp2.a("y", cmz2.b());
            bvp2.a("z", cmz2.c());
            if (!bvp2.equals(bvp3)) {
                bql2.a(bvp2);
                bql2.c_();
                return true;
            }
        }
        return false;
    }

    public boolean a(iu iu2, cmz cmz2, bqk bqk2, bdl bdl2, bhl bhl2) {
        bfa bfa2 = iu2.n(cmz2).t();
        if (bfa2 == blg.aH) {
            bqk2 = bqk.b;
        } else if (!bfa2.a_((bnj)iu2, cmz2)) {
            cmz2 = cmz2.c(bqk2);
        }
        return iu2.a(this.a, cmz2, false, bqk2, null, bhl2);
    }

    @Override
    public String b(bhl bhl2) {
        return this.a.n();
    }

    @Override
    public String a() {
        return this.a.n();
    }

    @Override
    public zm b() {
        return this.a.q();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        this.a.a(azg2, zm2, list);
    }

    public bfa c() {
        return this.a;
    }

    @Override
    public /* synthetic */ azg b(String string) {
        return this.a(string);
    }
}

