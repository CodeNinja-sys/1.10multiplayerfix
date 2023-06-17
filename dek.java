/*
 * Decompiled with CFR 0.150.
 */
public class dek
implements bnj {
    protected int a;
    protected int b;
    protected bhm[][] c;
    protected boolean d;
    protected iu e;

    public dek(iu iu2, cmz cmz2, cmz cmz3, int n2) {
        int n3;
        int n4;
        this.e = iu2;
        this.a = cmz2.a() - n2 >> 4;
        this.b = cmz2.c() - n2 >> 4;
        int n5 = cmz3.a() + n2 >> 4;
        int n6 = cmz3.c() + n2 >> 4;
        this.c = new bhm[n5 - this.a + 1][n6 - this.b + 1];
        this.d = true;
        for (n4 = this.a; n4 <= n5; ++n4) {
            for (n3 = this.b; n3 <= n6; ++n3) {
                this.c[n4 - this.a][n3 - this.b] = iu2.a(n4, n3);
            }
        }
        for (n4 = cmz2.a() >> 4; n4 <= cmz3.a() >> 4; ++n4) {
            for (n3 = cmz2.c() >> 4; n3 <= cmz3.c() >> 4; ++n3) {
                bhm bhm2 = this.c[n4 - this.a][n3 - this.b];
                if (bhm2 == null || bhm2.c(cmz2.b(), cmz3.b())) continue;
                this.d = false;
            }
        }
    }

    @Override
    public boolean M() {
        return this.d;
    }

    @Override
    public bql q(cmz cmz2) {
        int n2 = (cmz2.a() >> 4) - this.a;
        int n3 = (cmz2.c() >> 4) - this.b;
        return this.c[n2][n3].a(cmz2, bfw.a);
    }

    @Override
    public int b(cmz cmz2, int n2) {
        int n3 = this.b(bzq.a, cmz2);
        int n4 = this.b(bzq.b, cmz2);
        if (n4 < n2) {
            n4 = n2;
        }
        return n3 << 20 | n4 << 4;
    }

    @Override
    public dbk n(cmz cmz2) {
        if (cmz2.b() >= 0 && cmz2.b() < 256) {
            bhm bhm2;
            int n2 = (cmz2.a() >> 4) - this.a;
            int n3 = (cmz2.c() >> 4) - this.b;
            if (n2 >= 0 && n2 < this.c.length && n3 >= 0 && n3 < this.c[n2].length && (bhm2 = this.c[n2][n3]) != null) {
                return bhm2.c(cmz2);
            }
        }
        return blg.a.s();
    }

    @Override
    public anr a(cmz cmz2) {
        int n2 = (cmz2.a() >> 4) - this.a;
        int n3 = (cmz2.c() >> 4) - this.b;
        return this.c[n2][n3].a(cmz2, this.e.t_());
    }

    private int b(bzq bzq2, cmz cmz2) {
        if (bzq2 == bzq.a && this.e.q.n()) {
            return 0;
        }
        if (cmz2.b() < 0 || cmz2.b() >= 256) {
            return bzq2.c;
        }
        if (this.n(cmz2).f()) {
            int n2 = 0;
            for (bqk bqk2 : bqk.values()) {
                int n3 = this.a(bzq2, cmz2.c(bqk2));
                if (n3 > n2) {
                    n2 = n3;
                }
                if (n2 < 15) continue;
                return n2;
            }
            return n2;
        }
        int n4 = (cmz2.a() >> 4) - this.a;
        int n5 = (cmz2.c() >> 4) - this.b;
        return this.c[n4][n5].a(bzq2, cmz2);
    }

    @Override
    public boolean c(cmz cmz2) {
        return this.n(cmz2).a() == ahk.a;
    }

    public int a(bzq bzq2, cmz cmz2) {
        if (cmz2.b() < 0 || cmz2.b() >= 256) {
            return bzq2.c;
        }
        int n2 = (cmz2.a() >> 4) - this.a;
        int n3 = (cmz2.c() >> 4) - this.b;
        return this.c[n2][n3].a(bzq2, cmz2);
    }

    @Override
    public int a(cmz cmz2, bqk bqk2) {
        return this.n(cmz2).b(this, cmz2, bqk2);
    }

    @Override
    public aaf v() {
        return this.e.v();
    }
}

