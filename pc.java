/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public abstract class pc {
    protected awx l;
    private bqk a;
    private cdk b;
    private ih c;
    protected int m;

    public pc() {
    }

    protected pc(int n2) {
        this.m = n2;
    }

    public final bvp a() {
        bvp bvp2 = new bvp();
        bvp2.a("id", mb.a(this));
        bvp2.a("BB", this.l.g());
        bqk bqk2 = this.e();
        bvp2.a("O", bqk2 == null ? -1 : bqk2.c());
        bvp2.a("GD", this.m);
        this.a(bvp2);
        return bvp2;
    }

    protected abstract void a(bvp var1);

    public void a(iu iu2, bvp bvp2) {
        int n2;
        if (bvp2.e("BB")) {
            this.l = new awx(bvp2.n("BB"));
        }
        this.a((n2 = bvp2.h("O")) == -1 ? null : bqk.b(n2));
        this.m = bvp2.h("GD");
        this.b(bvp2);
    }

    protected abstract void b(bvp var1);

    public void a(pc pc2, List list, Random random) {
    }

    public abstract boolean a(iu var1, Random var2, awx var3);

    public awx b() {
        return this.l;
    }

    public int c() {
        return this.m;
    }

    public static pc a(List list, awx awx2) {
        for (pc pc2 : list) {
            if (pc2.b() == null || !pc2.b().a(awx2)) continue;
            return pc2;
        }
        return null;
    }

    public cmz d() {
        return new cmz(this.l.f());
    }

    protected boolean a(iu iu2, awx awx2) {
        int n2;
        int n3;
        int n4 = Math.max(this.l.a - 1, awx2.a);
        int n5 = Math.max(this.l.b - 1, awx2.b);
        int n6 = Math.max(this.l.c - 1, awx2.c);
        int n7 = Math.min(this.l.d + 1, awx2.d);
        int n8 = Math.min(this.l.e + 1, awx2.e);
        int n9 = Math.min(this.l.f + 1, awx2.f);
        pj pj2 = new pj();
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n6; n2 <= n9; ++n2) {
                if (iu2.n(pj2.a(n3, n5, n2)).a().d()) {
                    return true;
                }
                if (!iu2.n(pj2.a(n3, n8, n2)).a().d()) continue;
                return true;
            }
        }
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                if (iu2.n(pj2.a(n3, n2, n6)).a().d()) {
                    return true;
                }
                if (!iu2.n(pj2.a(n3, n2, n9)).a().d()) continue;
                return true;
            }
        }
        for (n3 = n6; n3 <= n9; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                if (iu2.n(pj2.a(n4, n2, n3)).a().d()) {
                    return true;
                }
                if (!iu2.n(pj2.a(n7, n2, n3)).a().d()) continue;
                return true;
            }
        }
        return false;
    }

    protected int a(int n2, int n3) {
        bqk bqk2 = this.e();
        if (bqk2 == null) {
            return n2;
        }
        switch (bqk2) {
            case c: 
            case d: {
                return this.l.a + n2;
            }
            case e: {
                return this.l.d - n3;
            }
            case f: {
                return this.l.a + n3;
            }
        }
        return n2;
    }

    protected int a(int n2) {
        if (this.e() == null) {
            return n2;
        }
        return n2 + this.l.b;
    }

    protected int b(int n2, int n3) {
        bqk bqk2 = this.e();
        if (bqk2 == null) {
            return n3;
        }
        switch (bqk2) {
            case c: {
                return this.l.f - n3;
            }
            case d: {
                return this.l.c + n3;
            }
            case e: 
            case f: {
                return this.l.c + n2;
            }
        }
        return n3;
    }

    protected void a(iu iu2, dbk dbk2, int n2, int n3, int n4, awx awx2) {
        cmz cmz2 = new cmz(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (!awx2.a(cmz2)) {
            return;
        }
        if (this.b != cdk.a) {
            dbk2 = dbk2.a(this.b);
        }
        if (this.c != ih.a) {
            dbk2 = dbk2.a(this.c);
        }
        iu2.a(cmz2, dbk2, 2);
    }

    protected dbk a(iu iu2, int n2, int n3, int n4, awx awx2) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        cmz cmz2 = new cmz(n7, n6 = this.a(n3), n5 = this.b(n2, n4));
        if (!awx2.a(cmz2)) {
            return blg.a.s();
        }
        return iu2.n(cmz2);
    }

    protected int b(iu iu2, int n2, int n3, int n4, awx awx2) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        cmz cmz2 = new cmz(n7, n6 = this.a(n3 + 1), n5 = this.b(n2, n4));
        if (!awx2.a(cmz2)) {
            return bzq.a.c;
        }
        return iu2.b(bzq.a, cmz2);
    }

    protected void a(iu iu2, awx awx2, int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    this.a(iu2, blg.a.s(), i3, i2, i4, awx2);
                }
            }
        }
    }

    protected void a(iu iu2, awx awx2, int n2, int n3, int n4, int n5, int n6, int n7, dbk dbk2, dbk dbk3, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(iu2, i3, i2, i4, awx2).a() == ahk.a) continue;
                    if (i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7) {
                        this.a(iu2, dbk2, i3, i2, i4, awx2);
                        continue;
                    }
                    this.a(iu2, dbk3, i3, i2, i4, awx2);
                }
            }
        }
    }

    protected void a(iu iu2, awx awx2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, Random random, ajx ajx2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(iu2, i3, i2, i4, awx2).a() == ahk.a) continue;
                    ajx2.a(random, i3, i2, i4, i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7);
                    this.a(iu2, ajx2.a(), i3, i2, i4, awx2);
                }
            }
        }
    }

    protected void a(iu iu2, awx awx2, Random random, float f2, int n2, int n3, int n4, int n5, int n6, int n7, dbk dbk2, dbk dbk3, boolean bl2, int n8) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (random.nextFloat() > f2 || bl2 && this.a(iu2, i3, i2, i4, awx2).a() == ahk.a || n8 > 0 && this.b(iu2, i3, i2, i4, awx2) >= n8) continue;
                    if (i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7) {
                        this.a(iu2, dbk2, i3, i2, i4, awx2);
                        continue;
                    }
                    this.a(iu2, dbk3, i3, i2, i4, awx2);
                }
            }
        }
    }

    protected void a(iu iu2, awx awx2, Random random, float f2, int n2, int n3, int n4, dbk dbk2) {
        if (random.nextFloat() < f2) {
            this.a(iu2, dbk2, n2, n3, n4, awx2);
        }
    }

    protected void a(iu iu2, awx awx2, int n2, int n3, int n4, int n5, int n6, int n7, dbk dbk2, boolean bl2) {
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = n7 - n4 + 1;
        float f5 = (float)n2 + f2 / 2.0f;
        float f6 = (float)n4 + f4 / 2.0f;
        for (int i2 = n3; i2 <= n6; ++i2) {
            float f7 = (float)(i2 - n3) / f3;
            for (int i3 = n2; i3 <= n5; ++i3) {
                float f8 = ((float)i3 - f5) / (f2 * 0.5f);
                for (int i4 = n4; i4 <= n7; ++i4) {
                    float f9;
                    float f10 = ((float)i4 - f6) / (f4 * 0.5f);
                    if (bl2 && this.a(iu2, i3, i2, i4, awx2).a() == ahk.a || !((f9 = f8 * f8 + f7 * f7 + f10 * f10) <= 1.05f)) continue;
                    this.a(iu2, dbk2, i3, i2, i4, awx2);
                }
            }
        }
    }

    protected void c(iu iu2, int n2, int n3, int n4, awx awx2) {
        cmz cmz2 = new cmz(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (!awx2.a(cmz2)) {
            return;
        }
        while (!iu2.c(cmz2) && cmz2.b() < 255) {
            iu2.a(cmz2, blg.a.s(), 2);
            cmz2 = cmz2.g();
        }
    }

    protected void b(iu iu2, dbk dbk2, int n2, int n3, int n4, awx awx2) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        if (!awx2.a(new cmz(n7, n6 = this.a(n3), n5 = this.b(n2, n4)))) {
            return;
        }
        while ((iu2.c(new cmz(n7, n6, n5)) || iu2.n(new cmz(n7, n6, n5)).a().d()) && n6 > 1) {
            iu2.a(new cmz(n7, n6, n5), dbk2, 2);
            --n6;
        }
    }

    protected boolean a(iu iu2, awx awx2, Random random, int n2, int n3, int n4, bpx bpx2) {
        cmz cmz2 = new cmz(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (awx2.a(cmz2) && iu2.n(cmz2).t() != blg.ae) {
            dbk dbk2 = blg.ae.s();
            iu2.a(cmz2, blg.ae.f(iu2, cmz2, dbk2), 2);
            bql bql2 = iu2.q(cmz2);
            if (bql2 instanceof bdm) {
                ((bdm)bql2).a(bpx2, random.nextLong());
            }
            return true;
        }
        return false;
    }

    protected boolean a(iu iu2, awx awx2, Random random, int n2, int n3, int n4, bqk bqk2, bpx bpx2) {
        cmz cmz2 = new cmz(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (awx2.a(cmz2) && iu2.n(cmz2).t() != blg.z) {
            this.a(iu2, blg.z.s().a(crh.a, (Comparable)((Object)bqk2)), n2, n3, n4, awx2);
            bql bql2 = iu2.q(cmz2);
            if (bql2 instanceof bqo) {
                ((bqo)bql2).a(bpx2, random.nextLong());
            }
            return true;
        }
        return false;
    }

    protected void a(iu iu2, awx awx2, Random random, int n2, int n3, int n4, bqk bqk2, xt xt2) {
        this.a(iu2, xt2.s().a(xt.a, (Comparable)((Object)bqk2)), n2, n3, n4, awx2);
        this.a(iu2, xt2.s().a(xt.a, (Comparable)((Object)bqk2)).a(xt.e, (Comparable)((Object)em.a)), n2, n3 + 1, n4, awx2);
    }

    public void a_(int n2, int n3, int n4) {
        this.l.a(n2, n3, n4);
    }

    public bqk e() {
        return this.a;
    }

    public void a(bqk bqk2) {
        this.a = bqk2;
        if (bqk2 == null) {
            this.c = ih.a;
            this.b = cdk.a;
        } else {
            switch (bqk2) {
                case d: {
                    this.b = cdk.b;
                    this.c = ih.a;
                    break;
                }
                case e: {
                    this.b = cdk.b;
                    this.c = ih.b;
                    break;
                }
                case f: {
                    this.b = cdk.a;
                    this.c = ih.b;
                    break;
                }
                default: {
                    this.b = cdk.a;
                    this.c = ih.a;
                }
            }
        }
    }
}

