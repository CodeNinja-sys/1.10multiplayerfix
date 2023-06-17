/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class csv
extends bql
implements avf {
    private dbk a;
    private bqk b;
    private boolean c;
    private boolean d;
    private float e;
    private float f;

    public csv() {
    }

    public csv(dbk dbk2, bqk bqk2, boolean bl2, boolean bl3) {
        this.a = dbk2;
        this.b = bqk2;
        this.c = bl2;
        this.d = bl3;
    }

    public dbk f() {
        return this.a;
    }

    @Override
    public int x() {
        return 0;
    }

    public boolean g() {
        return this.c;
    }

    public bqk h() {
        return this.b;
    }

    public boolean k() {
        return this.d;
    }

    public float a(float f2) {
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return this.f + (this.e - this.f) * f2;
    }

    public float b(float f2) {
        return (float)this.b.h() * this.e(this.a(f2));
    }

    public float c(float f2) {
        return (float)this.b.i() * this.e(this.a(f2));
    }

    public float d(float f2) {
        return (float)this.b.j() * this.e(this.a(f2));
    }

    private float e(float f2) {
        return this.c ? f2 - 1.0f : 1.0f - f2;
    }

    public cxt a(bnj bnj2, cmz cmz2) {
        return this.a(bnj2, cmz2, this.e).a(this.a(bnj2, cmz2, this.f));
    }

    public cxt a(bnj bnj2, cmz cmz2, float f2) {
        f2 = this.e(f2);
        return this.a.c(bnj2, cmz2).c((double)(f2 * (float)this.b.h()), f2 * (float)this.b.i(), f2 * (float)this.b.j());
    }

    private void o() {
        cxt cxt2 = this.a(this.k, this.l).a(this.l);
        List list = this.k.b(null, cxt2);
        if (list.isEmpty()) {
            return;
        }
        bqk bqk2 = this.c ? this.b : this.b.e();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            cpk cpk2 = (cpk)list.get(i2);
            if (cpk2.P_() == bez.d) continue;
            if (this.a.t() == blg.cE) {
                switch (bqk2.l()) {
                    case a: {
                        cpk2.aX = bqk2.h();
                        break;
                    }
                    case b: {
                        cpk2.aY = bqk2.i();
                        break;
                    }
                    case c: {
                        cpk2.aZ = bqk2.j();
                    }
                }
            }
            double d2 = 0.0;
            double d3 = 0.0;
            double d4 = 0.0;
            cxt cxt3 = cpk2.cD();
            switch (bqk2.l()) {
                case a: {
                    d2 = bqk2.d() == yy.a ? cxt2.d - cxt3.a : cxt3.d - cxt2.a;
                    d2 += 0.01;
                    break;
                }
                case b: {
                    d3 = bqk2.d() == yy.a ? cxt2.e - cxt3.b : cxt3.e - cxt2.b;
                    d3 += 0.01;
                    break;
                }
                case c: {
                    d4 = bqk2.d() == yy.a ? cxt2.f - cxt3.c : cxt3.f - cxt2.c;
                    d4 += 0.01;
                }
            }
            cpk2.b(d2 * (double)bqk2.h(), d3 * (double)bqk2.i(), d4 * (double)bqk2.j());
        }
    }

    public void n() {
        if (this.f < 1.0f && this.k != null) {
            this.f = this.e = 1.0f;
            this.k.r(this.l);
            this.e_();
            if (this.k.n(this.l).t() == blg.M) {
                this.k.a(this.l, this.a, 3);
                this.k.c(this.l, this.a.t());
            }
        }
    }

    @Override
    public void a() {
        this.f = this.e;
        if (this.f >= 1.0f) {
            this.o();
            this.k.r(this.l);
            this.e_();
            if (this.k.n(this.l).t() == blg.M) {
                this.k.a(this.l, this.a, 3);
                this.k.c(this.l, this.a.t());
            }
            return;
        }
        this.e += 0.5f;
        if (this.e >= 1.0f) {
            this.e = 1.0f;
        }
        this.o();
    }

    public static void a(cgy cgy2) {
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a = bfa.f(bvp2.h("blockId")).a(bvp2.h("blockData"));
        this.b = bqk.a(bvp2.h("facing"));
        this.f = this.e = bvp2.j("progress");
        this.c = bvp2.p("extending");
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("blockId", bfa.c(this.a.t()));
        bvp2.a("blockData", this.a.t().e(this.a));
        bvp2.a("facing", this.b.b());
        bvp2.a("progress", this.f);
        bvp2.a("extending", this.c);
        return bvp2;
    }
}

