/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bii
extends bql
implements avf {
    private static final d a = org.apache.logging.log4j.c.c();
    private long b;
    private int c;
    private cmz d;
    private boolean e;

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("Age", this.b);
        if (this.d != null) {
            bvp2.a("ExitPortal", ayj.a(this.d));
        }
        if (this.e) {
            bvp2.a("ExactTeleport", this.e);
        }
        return bvp2;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.b = bvp2.i("Age");
        if (bvp2.b("ExitPortal", 10)) {
            this.d = ayj.c(bvp2.o("ExitPortal"));
        }
        this.e = bvp2.p("ExactTeleport");
    }

    @Override
    public double d_() {
        return 65536.0;
    }

    @Override
    public void a() {
        List list;
        boolean bl2 = this.f();
        boolean bl3 = this.g();
        ++this.b;
        if (bl3) {
            --this.c;
        } else if (!this.k.C && !(list = this.k.a(cpk.class, new cxt(this.y()))).isEmpty()) {
            this.a((cpk)list.get(0));
        }
        if (bl2 != this.f() || bl3 != this.g()) {
            this.c_();
        }
    }

    public boolean f() {
        return this.b < 200L;
    }

    public boolean g() {
        return this.c > 0;
    }

    public float h() {
        return cmk.a((float)this.b / 200.0f, 0.0f, 1.0f);
    }

    public float k() {
        return 1.0f - cmk.a((float)this.c / 20.0f, 0.0f, 1.0f);
    }

    @Override
    public hv a_() {
        return new hv(this.l, 8, this.b());
    }

    @Override
    public bvp b() {
        return this.b(new bvp());
    }

    public void n() {
        if (!this.k.C) {
            this.c = 20;
            this.k.c(this.y(), this.z(), 1, 0);
            this.c_();
        }
    }

    @Override
    public boolean a_(int n2, int n3) {
        if (n2 == 1) {
            this.c = 20;
            return true;
        }
        return super.a_(n2, n3);
    }

    public void a(cpk cpk2) {
        if (this.k.C || this.g()) {
            return;
        }
        this.c = 100;
        if (this.d == null && this.k.q instanceof cup) {
            this.q();
        }
        if (this.d != null) {
            cmz cmz2 = this.e ? this.d : this.p();
            cpk2.l((double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5);
        }
        this.n();
    }

    private cmz p() {
        cmz cmz2 = bii.a(this.k, this.d, 5, false);
        a.a("Best exit position for portal at {} is {}", this.d, cmz2);
        return cmz2.g();
    }

    private void q() {
        amj amj2 = new amj(this.y().a(), 0.0, this.y().c()).a();
        amj amj3 = amj2.a(1024.0);
        int n2 = 16;
        while (bii.a(this.k, amj3).a() > 0 && n2-- > 0) {
            a.a("Skipping backwards past nonempty chunk at {}", amj3);
            amj3 = amj3.e(amj2.a(-16.0));
        }
        n2 = 16;
        while (bii.a(this.k, amj3).a() == 0 && n2-- > 0) {
            a.a("Skipping forward past empty chunk at {}", amj3);
            amj3 = amj3.e(amj2.a(16.0));
        }
        a.a("Found chunk at {}", amj3);
        bhm bhm2 = bii.a(this.k, amj3);
        this.d = bii.a(bhm2);
        if (this.d == null) {
            this.d = new cmz(amj3.b + 0.5, 75.0, amj3.d + 0.5);
            a.a("Failed to find suitable block, settling on {}", this.d);
            new bpf().a(this.k, new Random(this.d.m()), this.d);
        } else {
            a.a("Found block at {}", this.d);
        }
        this.d = bii.a(this.k, this.d, 16, true);
        a.a("Creating portal at {}", this.d);
        this.d = this.d.b(10);
        this.a(this.d);
        this.c_();
    }

    private static cmz a(iu iu2, cmz cmz2, int n2, boolean bl2) {
        cjx cjx2 = null;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            block1: for (int i3 = -n2; i3 <= n2; ++i3) {
                if (i2 == 0 && i3 == 0 && !bl2) continue;
                for (int i4 = 255; i4 > (cjx2 == null ? 0 : cjx2.b()); --i4) {
                    cmz cmz3 = new cmz(cmz2.a() + i2, i4, cmz2.c() + i3);
                    dbk dbk2 = iu2.n(cmz3);
                    if (!dbk2.k() || !bl2 && dbk2.t() == blg.h) continue;
                    cjx2 = cmz3;
                    continue block1;
                }
            }
        }
        return cjx2 == null ? cmz2 : cjx2;
    }

    private static bhm a(iu iu2, amj amj2) {
        return iu2.a(cmk.c(amj2.b / 16.0), cmk.c(amj2.d / 16.0));
    }

    private static cmz a(bhm bhm2) {
        cmz cmz2 = new cmz(bhm2.b * 16, 30, bhm2.c * 16);
        int n2 = bhm2.a() + 16 - 1;
        cmz cmz3 = new cmz(bhm2.b * 16 + 16 - 1, n2, bhm2.c * 16 + 16 - 1);
        cmz cmz4 = null;
        double d2 = 0.0;
        for (cmz cmz5 : cmz.a(cmz2, cmz3)) {
            dbk dbk2 = bhm2.c(cmz5);
            if (dbk2.t() != blg.bH || bhm2.c(cmz5.b(1)).k() || bhm2.c(cmz5.b(2)).k()) continue;
            double d3 = cmz5.e(0.0, 0.0, 0.0);
            if (cmz4 != null && !(d3 < d2)) continue;
            cmz4 = cmz5;
            d2 = d3;
        }
        return cmz4;
    }

    private void a(cmz cmz2) {
        new cic().a(this.k, new Random(), cmz2);
        bql bql2 = this.k.q(cmz2);
        if (bql2 instanceof bii) {
            bii bii2 = (bii)bql2;
            bii2.d = new cmz(this.y());
            bii2.c_();
        } else {
            a.f("Couldn't save exit portal at {}", cmz2);
        }
    }

    public boolean a(bqk bqk2) {
        return this.z().s().c(this.k, this.y(), bqk2);
    }

    public int o() {
        int n2 = 0;
        for (bqk bqk2 : bqk.values()) {
            n2 += this.a(bqk2) ? 1 : 0;
        }
        return n2;
    }
}

