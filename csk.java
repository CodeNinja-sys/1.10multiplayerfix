/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class csk {
    private final List a = ov.a();
    private final bga b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private String h;

    public csk(bga bga2) {
        this.b = bga2;
    }

    public void a() {
        this.h();
        if (this.b.ai()) {
            bfa bfa2 = this.b.aQ.n(new cmz(this.b.aU, this.b.cD().b, this.b.aW)).t();
            if (bfa2 == blg.au) {
                this.h = "ladder";
            } else if (bfa2 == blg.bn) {
                this.h = "vines";
            }
        } else if (this.b.V_()) {
            this.h = "water";
        }
    }

    public void a(ahy ahy2, float f2, float f3) {
        this.e();
        this.a();
        agt agt2 = new agt(ahy2, this.b.by, f2, f3, this.h, this.b.bq);
        this.a.add(agt2);
        this.c = this.b.by;
        this.g = true;
        if (agt2.c() && !this.f && this.b.bj()) {
            this.f = true;
            this.e = this.d = this.b.by;
            this.b.bB();
        }
    }

    public cbg b() {
        cbg cbg2;
        if (this.a.isEmpty()) {
            return new du("death.attack.generic", this.b.v());
        }
        agt agt2 = this.g();
        agt agt3 = (agt)this.a.get(this.a.size() - 1);
        cbg cbg3 = agt3.e();
        cpk cpk2 = agt3.a().b();
        if (agt2 != null && agt3.a() == ahy.j) {
            cbg cbg4 = agt2.e();
            if (agt2.a() == ahy.j || agt2.a() == ahy.l) {
                cbg2 = new du("death.fell.accident." + this.a(agt2), this.b.v());
            } else if (!(cbg4 == null || cbg3 != null && cbg4.equals(cbg3))) {
                bhl bhl2;
                cpk cpk3 = agt2.a().b();
                bhl bhl3 = bhl2 = cpk3 instanceof bga ? ((bga)cpk3).bt() : null;
                cbg2 = bhl2 != null && bhl2.s() ? new du("death.fell.assist.item", this.b.v(), cbg4, bhl2.B()) : new du("death.fell.assist", this.b.v(), cbg4);
            } else if (cbg3 != null) {
                bhl bhl4;
                bhl bhl5 = bhl4 = cpk2 instanceof bga ? ((bga)cpk2).bt() : null;
                cbg2 = bhl4 != null && bhl4.s() ? new du("death.fell.finish.item", this.b.v(), cbg3, bhl4.B()) : new du("death.fell.finish", this.b.v(), cbg3);
            } else {
                cbg2 = new du("death.fell.killer", this.b.v());
            }
        } else {
            cbg2 = agt3.a().a(this.b);
        }
        return cbg2;
    }

    public bga c() {
        bga bga2 = null;
        bdl bdl2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (agt agt2 : this.a) {
            if (agt2.a().b() instanceof bdl && (bdl2 == null || agt2.b() > f3)) {
                f3 = agt2.b();
                bdl2 = (bdl)agt2.a().b();
            }
            if (!(agt2.a().b() instanceof bga) || bga2 != null && !(agt2.b() > f2)) continue;
            f2 = agt2.b();
            bga2 = (bga)agt2.a().b();
        }
        if (bdl2 != null && f3 >= f2 / 3.0f) {
            return bdl2;
        }
        return bga2;
    }

    private agt g() {
        agt agt2 = null;
        agt agt3 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            agt agt4;
            agt agt5 = (agt)this.a.get(i2);
            agt agt6 = agt4 = i2 > 0 ? (agt)this.a.get(i2 - 1) : null;
            if ((agt5.a() == ahy.j || agt5.a() == ahy.l) && agt5.f() > 0.0f && (agt2 == null || agt5.f() > f3)) {
                agt2 = i2 > 0 ? agt4 : agt5;
                f3 = agt5.f();
            }
            if (agt5.d() == null || agt3 != null && !(agt5.b() > f2)) continue;
            agt3 = agt5;
            f2 = agt5.b();
        }
        if (f3 > 5.0f && agt2 != null) {
            return agt2;
        }
        if (f2 > 5.0f && agt3 != null) {
            return agt3;
        }
        return null;
    }

    private String a(agt agt2) {
        return agt2.d() == null ? "generic" : agt2.d();
    }

    public int d() {
        if (this.f) {
            return this.b.by - this.d;
        }
        return this.e - this.d;
    }

    private void h() {
        this.h = null;
    }

    public void e() {
        int n2;
        int n3 = n2 = this.f ? 300 : 100;
        if (this.g && (!this.b.bj() || this.b.by - this.c > n2)) {
            boolean bl2 = this.f;
            this.g = false;
            this.f = false;
            this.e = this.b.by;
            if (bl2) {
                this.b.bC();
            }
            this.a.clear();
        }
    }

    public bga f() {
        return this.b;
    }
}

