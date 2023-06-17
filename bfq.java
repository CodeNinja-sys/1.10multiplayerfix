/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bfq
extends cjv {
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;

    public bfq() {
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("hr", this.b);
        bvp2.a("sc", this.c);
        bvp2.a("hps", this.d);
        bvp2.a("Num", this.e);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.b = bvp2.p("hr");
        this.c = bvp2.p("sc");
        this.d = bvp2.p("hps");
        this.e = bvp2.h("Num");
    }

    public bfq(int n2, Random random, awx awx2, bqk bqk2, cfn cfn2) {
        super(n2, cfn2);
        this.a(bqk2);
        this.l = awx2;
        this.b = random.nextInt(3) == 0;
        this.c = !this.b && random.nextInt(23) == 0;
        this.e = this.e().l() == ctv.c ? awx2.e() / 5 : awx2.c() / 5;
    }

    public static awx a(List list, Random random, int n2, int n3, int n4, bqk bqk2) {
        int n5;
        awx awx2 = new awx(n2, n3, n4, n2, n3 + 2, n4);
        for (n5 = random.nextInt(3) + 2; n5 > 0; --n5) {
            int n6 = n5 * 5;
            switch (bqk2) {
                default: {
                    awx2.d = n2 + 2;
                    awx2.c = n4 - (n6 - 1);
                    break;
                }
                case d: {
                    awx2.d = n2 + 2;
                    awx2.f = n4 + (n6 - 1);
                    break;
                }
                case e: {
                    awx2.a = n2 - (n6 - 1);
                    awx2.f = n4 + 2;
                    break;
                }
                case f: {
                    awx2.d = n2 + (n6 - 1);
                    awx2.f = n4 + 2;
                }
            }
            if (pc.a(list, awx2) == null) break;
        }
        if (n5 > 0) {
            return awx2;
        }
        return null;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        block24: {
            int n2 = this.c();
            int n3 = random.nextInt(4);
            bqk bqk2 = this.e();
            if (bqk2 != null) {
                switch (bqk2) {
                    default: {
                        if (n3 <= 1) {
                            awc.a(pc2, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, bqk2, n2);
                            break;
                        }
                        if (n3 == 2) {
                            awc.a(pc2, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, bqk.e, n2);
                            break;
                        }
                        awc.a(pc2, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, bqk.f, n2);
                        break;
                    }
                    case d: {
                        if (n3 <= 1) {
                            awc.a(pc2, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, bqk2, n2);
                            break;
                        }
                        if (n3 == 2) {
                            awc.a(pc2, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, bqk.e, n2);
                            break;
                        }
                        awc.a(pc2, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.f - 3, bqk.f, n2);
                        break;
                    }
                    case e: {
                        if (n3 <= 1) {
                            awc.a(pc2, list, random, this.l.a - 1, this.l.b - 1 + random.nextInt(3), this.l.c, bqk2, n2);
                            break;
                        }
                        if (n3 == 2) {
                            awc.a(pc2, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.c - 1, bqk.c, n2);
                            break;
                        }
                        awc.a(pc2, list, random, this.l.a, this.l.b - 1 + random.nextInt(3), this.l.f + 1, bqk.d, n2);
                        break;
                    }
                    case f: {
                        if (n3 <= 1) {
                            awc.a(pc2, list, random, this.l.d + 1, this.l.b - 1 + random.nextInt(3), this.l.c, bqk2, n2);
                            break;
                        }
                        if (n3 == 2) {
                            awc.a(pc2, list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.c - 1, bqk.c, n2);
                            break;
                        }
                        awc.a(pc2, list, random, this.l.d - 3, this.l.b - 1 + random.nextInt(3), this.l.f + 1, bqk.d, n2);
                    }
                }
            }
            if (n2 >= 8) break block24;
            if (bqk2 == bqk.c || bqk2 == bqk.d) {
                int n4 = this.l.c + 3;
                while (n4 + 3 <= this.l.f) {
                    int n5 = random.nextInt(5);
                    if (n5 == 0) {
                        awc.a(pc2, list, random, this.l.a - 1, this.l.b, n4, bqk.e, n2 + 1);
                    } else if (n5 == 1) {
                        awc.a(pc2, list, random, this.l.d + 1, this.l.b, n4, bqk.f, n2 + 1);
                    }
                    n4 += 5;
                }
            } else {
                int n6 = this.l.a + 3;
                while (n6 + 3 <= this.l.d) {
                    int n7 = random.nextInt(5);
                    if (n7 == 0) {
                        awc.a(pc2, list, random, n6, this.l.b, this.l.c - 1, bqk.c, n2 + 1);
                    } else if (n7 == 1) {
                        awc.a(pc2, list, random, n6, this.l.b, this.l.f + 1, bqk.d, n2 + 1);
                    }
                    n6 += 5;
                }
            }
        }
    }

    @Override
    protected boolean a(iu iu2, awx awx2, Random random, int n2, int n3, int n4, bpx bpx2) {
        cmz cmz2 = new cmz(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (awx2.a(cmz2) && iu2.n(cmz2).a() == ahk.a && iu2.n(cmz2.h()).a() != ahk.a) {
            dbk dbk2 = blg.av.s().a(bsr.a, (Comparable)((Object)(random.nextBoolean() ? ctp.a : ctp.b)));
            this.a(iu2, dbk2, n2, n3, n4, awx2);
            cxa cxa2 = new cxa(iu2, (float)cmz2.a() + 0.5f, (float)cmz2.b() + 0.5f, (float)cmz2.c() + 0.5f);
            cxa2.a(bpx2, random.nextLong());
            iu2.b(cxa2);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.a(iu2, awx2)) {
            return false;
        }
        boolean bl2 = false;
        int n6 = 2;
        boolean bl3 = false;
        int n7 = 2;
        int n8 = this.e * 5 - 1;
        dbk dbk2 = this.f();
        this.a(iu2, awx2, 0, 0, 0, 2, 1, n8, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, random, 0.8f, 0, 2, 0, 2, 2, n8, blg.a.s(), blg.a.s(), false, 0);
        if (this.c) {
            this.a(iu2, awx2, random, 0.6f, 0, 0, 0, 2, 1, n8, blg.G.s(), blg.a.s(), false, 8);
        }
        for (n5 = 0; n5 < this.e; ++n5) {
            int n9;
            n4 = 2 + n5 * 5;
            this.a(iu2, awx2, 0, 0, n4, 2, 2, random);
            this.a(iu2, awx2, random, 0.1f, 0, 2, n4 - 1);
            this.a(iu2, awx2, random, 0.1f, 2, 2, n4 - 1);
            this.a(iu2, awx2, random, 0.1f, 0, 2, n4 + 1);
            this.a(iu2, awx2, random, 0.1f, 2, 2, n4 + 1);
            this.a(iu2, awx2, random, 0.05f, 0, 2, n4 - 2);
            this.a(iu2, awx2, random, 0.05f, 2, 2, n4 - 2);
            this.a(iu2, awx2, random, 0.05f, 0, 2, n4 + 2);
            this.a(iu2, awx2, random, 0.05f, 2, 2, n4 + 2);
            if (random.nextInt(100) == 0) {
                this.a(iu2, awx2, random, 2, 0, n4 - 1, bvm.f);
            }
            if (random.nextInt(100) == 0) {
                this.a(iu2, awx2, random, 0, 0, n4 + 1, bvm.f);
            }
            if (!this.c || this.d) continue;
            n3 = this.a(0);
            int n10 = n4 - 1 + random.nextInt(3);
            n2 = this.a(1, n10);
            cmz cmz2 = new cmz(n2, n3, n9 = this.b(1, n10));
            if (!awx2.a(cmz2) || this.b(iu2, 1, 0, n10, awx2) >= 8) continue;
            this.d = true;
            iu2.a(cmz2, blg.ac.s(), 2);
            bql bql2 = iu2.q(cmz2);
            if (!(bql2 instanceof ze)) continue;
            ((ze)bql2).d().a("CaveSpider");
        }
        for (n5 = 0; n5 <= 2; ++n5) {
            for (n4 = 0; n4 <= n8; ++n4) {
                n3 = -1;
                dbk dbk3 = this.a(iu2, n5, -1, n4, awx2);
                if (dbk3.a() != ahk.a || this.b(iu2, n5, -1, n4, awx2) >= 8) continue;
                n2 = -1;
                this.a(iu2, dbk2, n5, -1, n4, awx2);
            }
        }
        if (this.b) {
            dbk dbk4 = blg.av.s().a(bsr.a, (Comparable)((Object)ctp.a));
            for (n4 = 0; n4 <= n8; ++n4) {
                dbk dbk5 = this.a(iu2, 1, -1, n4, awx2);
                if (dbk5.a() == ahk.a || !dbk5.b()) continue;
                float f2 = this.b(iu2, 1, 0, n4, awx2) > 8 ? 0.9f : 0.7f;
                this.a(iu2, awx2, random, f2, 1, 0, n4, dbk4);
            }
        }
        return true;
    }

    private void a(iu iu2, awx awx2, int n2, int n3, int n4, int n5, int n6, Random random) {
        if (!this.a(iu2, awx2, n2, n6, n5, n4)) {
            return;
        }
        dbk dbk2 = this.f();
        dbk dbk3 = this.g();
        dbk dbk4 = blg.a.s();
        this.a(iu2, awx2, n2, n3, n4, n2, n5 - 1, n4, dbk3, dbk4, false);
        this.a(iu2, awx2, n6, n3, n4, n6, n5 - 1, n4, dbk3, dbk4, false);
        if (random.nextInt(4) == 0) {
            this.a(iu2, awx2, n2, n5, n4, n2, n5, n4, dbk2, dbk4, false);
            this.a(iu2, awx2, n6, n5, n4, n6, n5, n4, dbk2, dbk4, false);
        } else {
            this.a(iu2, awx2, n2, n5, n4, n6, n5, n4, dbk2, dbk4, false);
            this.a(iu2, awx2, random, 0.05f, n2 + 1, n5, n4 - 1, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.c)));
            this.a(iu2, awx2, random, 0.05f, n2 + 1, n5, n4 + 1, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.d)));
        }
    }

    private void a(iu iu2, awx awx2, Random random, float f2, int n2, int n3, int n4) {
        if (this.b(iu2, n2, n3, n4, awx2) < 8) {
            this.a(iu2, awx2, random, f2, n2, n3, n4, blg.G.s());
        }
    }
}

