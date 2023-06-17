/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class en
extends bfa {
    public static final qf a = qf.a("level", 0, 15);

    protected en(ahk ahk2) {
        super(ahk2);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.b(true);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return x;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public boolean a(bnj bnj2, cmz cmz2) {
        return this.L != ahk.i;
    }

    public static float b(int n2) {
        if (n2 >= 8) {
            n2 = 0;
        }
        return (float)(n2 + 1) / 9.0f;
    }

    protected int l(dbk dbk2) {
        if (dbk2.a() == this.L) {
            return (Integer)dbk2.b(a);
        }
        return -1;
    }

    protected int m(dbk dbk2) {
        int n2 = this.l(dbk2);
        return n2 >= 8 ? 0 : n2;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(dbk dbk2, boolean bl2) {
        return bl2 && (Integer)dbk2.b(a) == 0;
    }

    @Override
    public boolean a(bnj bnj2, cmz cmz2, bqk bqk2) {
        ahk ahk2 = bnj2.n(cmz2).a();
        if (ahk2 == this.L) {
            return false;
        }
        if (bqk2 == bqk.b) {
            return true;
        }
        if (ahk2 == ahk.w) {
            return false;
        }
        return super.a(bnj2, cmz2, bqk2);
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bnj2.n(cmz2.c(bqk2)).a() == this.L) {
            return false;
        }
        if (bqk2 == bqk.b) {
            return true;
        }
        return super.a(dbk2, bnj2, cmz2, bqk2);
    }

    public boolean b(bnj bnj2, cmz cmz2) {
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                dbk dbk2 = bnj2.n(cmz2.e(i2, 0, i3));
                if (dbk2.a() == this.L || dbk2.b()) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.b;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    protected amj a(bnj bnj2, cmz cmz2, dbk dbk2) {
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        int n2 = this.m(dbk2);
        bjb bjb2 = bjb.e();
        for (Object object : afj.a) {
            int n3;
            bjb2.d(cmz2).b((bqk)object);
            int n4 = this.m(bnj2.n(bjb2));
            if (n4 < 0) {
                if (bnj2.n(bjb2).a().c() || (n4 = this.m(bnj2.n(bjb2.h()))) < 0) continue;
                n3 = n4 - (n2 - 8);
                d2 += (double)(((bqk)object).h() * n3);
                d3 += (double)(((bqk)object).i() * n3);
                d4 += (double)(((bqk)object).j() * n3);
                continue;
            }
            if (n4 < 0) continue;
            n3 = n4 - n2;
            d2 += (double)(((bqk)object).h() * n3);
            d3 += (double)(((bqk)object).i() * n3);
            d4 += (double)(((bqk)object).j() * n3);
        }
        Object object = new amj(d2, d3, d4);
        if ((Integer)dbk2.b(a) >= 8) {
            for (bqk bqk2 : afj.a) {
                bjb2.d(cmz2).b(bqk2);
                if (!this.a(bnj2, (cmz)bjb2, bqk2) && !this.a(bnj2, bjb2.g(), bqk2)) continue;
                object = ((amj)object).a().b(0.0, -6.0, 0.0);
                break;
            }
        }
        bjb2.f();
        return ((amj)object).a();
    }

    @Override
    public amj a(iu iu2, cmz cmz2, cpk cpk2, amj amj2) {
        return amj2.e(this.a((bnj)iu2, cmz2, iu2.n(cmz2)));
    }

    @Override
    public int a(iu iu2) {
        if (this.L == ahk.h) {
            return 5;
        }
        if (this.L == ahk.i) {
            return iu2.q.n() ? 10 : 30;
        }
        return 0;
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2) {
        int n2 = bnj2.b(cmz2, 0);
        int n3 = bnj2.b(cmz2.g(), 0);
        int n4 = n2 & 0xFF;
        int n5 = n3 & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        int n7 = n3 >> 16 & 0xFF;
        return (n4 > n5 ? n4 : n5) | (n6 > n7 ? n6 : n7) << 16;
    }

    @Override
    public kj b() {
        return this.L == ahk.h ? kj.d : kj.a;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        ahk ahk2;
        double d2 = cmz2.a();
        double d3 = cmz2.b();
        double d4 = cmz2.c();
        if (this.L == ahk.h) {
            int n2 = (Integer)dbk2.b(a);
            if (n2 > 0 && n2 < 8) {
                if (random.nextInt(64) == 0) {
                    iu2.a(d2 + 0.5, d3 + 0.5, d4 + 0.5, dah.gM, csg.e, random.nextFloat() * 0.25f + 0.75f, random.nextFloat() + 0.5f, false);
                }
            } else if (random.nextInt(10) == 0) {
                iu2.a(lz.h, d2 + (double)random.nextFloat(), d3 + (double)random.nextFloat(), d4 + (double)random.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
            }
        }
        if (this.L == ahk.i && iu2.n(cmz2.g()).a() == ahk.a && !iu2.n(cmz2.g()).p()) {
            if (random.nextInt(100) == 0) {
                double d5 = d2 + (double)random.nextFloat();
                double d6 = d3 + dbk2.c((bnj)iu2, (cmz)cmz2).e;
                double d7 = d4 + (double)random.nextFloat();
                iu2.a(lz.B, d5, d6, d7, 0.0, 0.0, 0.0, new int[0]);
                iu2.a(d5, d6, d7, dah.di, csg.e, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
            if (random.nextInt(200) == 0) {
                iu2.a(d2, d3, d4, dah.dg, csg.e, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
        if (random.nextInt(10) == 0 && iu2.n(cmz2.h()).q() && !(ahk2 = iu2.n(cmz2.c(2)).a()).c() && !ahk2.d()) {
            double d8 = d2 + (double)random.nextFloat();
            double d9 = d3 - 1.05;
            double d10 = d4 + (double)random.nextFloat();
            if (this.L == ahk.h) {
                iu2.a(lz.s, d8, d9, d10, 0.0, 0.0, 0.0, new int[0]);
            } else {
                iu2.a(lz.t, d8, d9, d10, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    public static float a(bnj bnj2, cmz cmz2, ahk ahk2, dbk dbk2) {
        amj amj2 = en.a(ahk2).a(bnj2, cmz2, dbk2);
        if (amj2.b == 0.0 && amj2.d == 0.0) {
            return -1000.0f;
        }
        return (float)cmk.b(amj2.d, amj2.b) - 1.5707964f;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        this.d(iu2, cmz2, dbk2);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        this.d(iu2, cmz2, dbk2);
    }

    public boolean d(iu iu2, cmz cmz2, dbk dbk2) {
        if (this.L == ahk.i) {
            boolean bl2 = false;
            for (bqk bqk2 : bqk.values()) {
                if (bqk2 == bqk.a || iu2.n(cmz2.c(bqk2)).a() != ahk.h) continue;
                bl2 = true;
                break;
            }
            if (bl2) {
                Integer n2 = (Integer)dbk2.b(a);
                if (n2 == 0) {
                    iu2.a(cmz2, blg.Z.s());
                    this.b(iu2, cmz2);
                    return true;
                }
                if (n2 <= 4) {
                    iu2.a(cmz2, blg.e.s());
                    this.b(iu2, cmz2);
                    return true;
                }
            }
        }
        return false;
    }

    protected void b(iu iu2, cmz cmz2) {
        double d2 = cmz2.a();
        double d3 = cmz2.b();
        double d4 = cmz2.c();
        iu2.a(null, cmz2, dah.dh, csg.e, 0.5f, 2.6f + (iu2.p.nextFloat() - iu2.p.nextFloat()) * 0.8f);
        for (int i2 = 0; i2 < 8; ++i2) {
            iu2.a(lz.m, d2 + Math.random(), d3 + 1.2, d4 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    public static cyi a(ahk ahk2) {
        if (ahk2 == ahk.h) {
            return blg.i;
        }
        if (ahk2 == ahk.i) {
            return blg.k;
        }
        throw new IllegalArgumentException("Invalid material");
    }

    public static arf b(ahk ahk2) {
        if (ahk2 == ahk.h) {
            return blg.j;
        }
        if (ahk2 == ahk.i) {
            return blg.l;
        }
        throw new IllegalArgumentException("Invalid material");
    }
}

