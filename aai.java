/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class aai
extends bfa {
    public static final ddi a = ddi.b("decayable");
    public static final ddi b = ddi.b("check_decay");
    protected boolean c;
    int[] d;

    public aai() {
        super(ahk.j);
        this.b(true);
        this.a(zm.c);
        this.c(0.2f);
        this.h(1);
        this.a(acv.c);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        int n2;
        int n3;
        boolean bl2 = true;
        int n4 = 2;
        int n5 = cmz2.a();
        if (iu2.a(new cmz(n5 - 2, (n3 = cmz2.b()) - 2, (n2 = cmz2.c()) - 2), new cmz(n5 + 2, n3 + 2, n2 + 2))) {
            for (int i2 = -1; i2 <= 1; ++i2) {
                for (int i3 = -1; i3 <= 1; ++i3) {
                    for (int i4 = -1; i4 <= 1; ++i4) {
                        cmz cmz3 = cmz2.e(i2, i3, i4);
                        dbk dbk3 = iu2.n(cmz3);
                        if (dbk3.a() != ahk.j || ((Boolean)dbk3.b(b)).booleanValue()) continue;
                        iu2.a(cmz3, dbk3.a(b, Boolean.valueOf(true)), 4);
                    }
                }
            }
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        if (((Boolean)dbk2.b(b)).booleanValue() && ((Boolean)dbk2.b(a)).booleanValue()) {
            int n2;
            int n3 = 4;
            int n4 = 5;
            int n5 = cmz2.a();
            int n6 = cmz2.b();
            int n7 = cmz2.c();
            int n8 = 32;
            int n9 = 1024;
            int n10 = 16;
            if (this.d == null) {
                this.d = new int[32768];
            }
            if (iu2.a(new cmz(n5 - 5, n6 - 5, n7 - 5), new cmz(n5 + 5, n6 + 5, n7 + 5))) {
                int n11;
                int n12;
                int n13;
                pj pj2 = new pj();
                for (n13 = -4; n13 <= 4; ++n13) {
                    for (n12 = -4; n12 <= 4; ++n12) {
                        for (n11 = -4; n11 <= 4; ++n11) {
                            dbk dbk3 = iu2.n(pj2.a(n5 + n13, n6 + n12, n7 + n11));
                            bfa bfa2 = dbk3.t();
                            this.d[(n13 + 16) * 1024 + (n12 + 16) * 32 + n11 + 16] = bfa2 == blg.r || bfa2 == blg.s ? 0 : (dbk3.a() == ahk.j ? -2 : -1);
                        }
                    }
                }
                for (n13 = 1; n13 <= 4; ++n13) {
                    for (n12 = -4; n12 <= 4; ++n12) {
                        for (n11 = -4; n11 <= 4; ++n11) {
                            for (int i2 = -4; i2 <= 4; ++i2) {
                                if (this.d[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16] != n13 - 1) continue;
                                if (this.d[(n12 + 16 - 1) * 1024 + (n11 + 16) * 32 + i2 + 16] == -2) {
                                    this.d[(n12 + 16 - 1) * 1024 + (n11 + 16) * 32 + i2 + 16] = n13;
                                }
                                if (this.d[(n12 + 16 + 1) * 1024 + (n11 + 16) * 32 + i2 + 16] == -2) {
                                    this.d[(n12 + 16 + 1) * 1024 + (n11 + 16) * 32 + i2 + 16] = n13;
                                }
                                if (this.d[(n12 + 16) * 1024 + (n11 + 16 - 1) * 32 + i2 + 16] == -2) {
                                    this.d[(n12 + 16) * 1024 + (n11 + 16 - 1) * 32 + i2 + 16] = n13;
                                }
                                if (this.d[(n12 + 16) * 1024 + (n11 + 16 + 1) * 32 + i2 + 16] == -2) {
                                    this.d[(n12 + 16) * 1024 + (n11 + 16 + 1) * 32 + i2 + 16] = n13;
                                }
                                if (this.d[(n12 + 16) * 1024 + (n11 + 16) * 32 + (i2 + 16 - 1)] == -2) {
                                    this.d[(n12 + 16) * 1024 + (n11 + 16) * 32 + (i2 + 16 - 1)] = n13;
                                }
                                if (this.d[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16 + 1] != -2) continue;
                                this.d[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16 + 1] = n13;
                            }
                        }
                    }
                }
            }
            if ((n2 = this.d[16912]) >= 0) {
                iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(false)), 4);
            } else {
                this.c(iu2, cmz2);
            }
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        if (iu2.A(cmz2.g()) && !iu2.n(cmz2.h()).q() && random.nextInt(15) == 1) {
            double d2 = (float)cmz2.a() + random.nextFloat();
            double d3 = (double)cmz2.b() - 0.05;
            double d4 = (float)cmz2.c() + random.nextFloat();
            iu2.a(lz.s, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    private void c(iu iu2, cmz cmz2) {
        this.b(iu2, cmz2, iu2.n(cmz2), 0);
        iu2.f(cmz2);
    }

    @Override
    public int a(Random random) {
        return random.nextInt(20) == 0 ? 1 : 0;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(blg.g);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        if (!iu2.C) {
            int n3 = this.m(dbk2);
            if (n2 > 0 && (n3 -= 2 << n2) < 10) {
                n3 = 10;
            }
            if (iu2.p.nextInt(n3) == 0) {
                azg azg2 = this.a(dbk2, iu2.p, n2);
                aai.a(iu2, cmz2, new bhl(azg2, 1, this.d(dbk2)));
            }
            n3 = 200;
            if (n2 > 0 && (n3 -= 10 << n2) < 40) {
                n3 = 40;
            }
            this.a(iu2, cmz2, dbk2, n3);
        }
    }

    protected void a(iu iu2, cmz cmz2, dbk dbk2, int n2) {
    }

    protected int m(dbk dbk2) {
        return 20;
    }

    @Override
    public boolean b(dbk dbk2) {
        return !this.c;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    @Override
    public kj b() {
        return this.c ? kj.b : kj.a;
    }

    @Override
    public boolean ay_() {
        return false;
    }

    public abstract zg b(int var1);

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!this.c && bnj2.n(cmz2.c(bqk2)).t() == this) {
            return false;
        }
        return super.a(dbk2, bnj2, cmz2, bqk2);
    }
}

