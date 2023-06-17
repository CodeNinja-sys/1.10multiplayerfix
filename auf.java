/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class auf
extends bfa {
    public static final qf a = qf.a("level", 0, 3);
    protected static final cxt b = new cxt(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0);
    protected static final cxt c = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.125);
    protected static final cxt d = new cxt(0.0, 0.0, 0.875, 1.0, 1.0, 1.0);
    protected static final cxt e = new cxt(0.875, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt f = new cxt(0.0, 0.0, 0.0, 0.125, 1.0, 1.0);

    public auf() {
        super(ahk.f, bif.m);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        auf.a(cmz2, cxt2, list, b);
        auf.a(cmz2, cxt2, list, f);
        auf.a(cmz2, cxt2, list, c);
        auf.a(cmz2, cxt2, list, e);
        auf.a(cmz2, cxt2, list, d);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return x;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        int n2 = (Integer)dbk2.b(a);
        float f2 = (float)cmz2.b() + (6.0f + (float)(3 * n2)) / 16.0f;
        if (!iu2.C && cpk2.y_() && n2 > 0 && cpk2.cD().b <= (double)f2) {
            cpk2.cb();
            this.a(iu2, cmz2, dbk2, n2 - 1);
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        Object object;
        if (bhl2 == null) {
            return true;
        }
        int n2 = (Integer)dbk2.b(a);
        azg azg2 = bhl2.a();
        if (azg2 == hp.az) {
            if (n2 < 3 && !iu2.C) {
                if (!bdl2.G.d) {
                    bdl2.a(bqp2, new bhl(hp.ay));
                }
                bdl2.a(bpv.K);
                this.a(iu2, cmz2, dbk2, 3);
            }
            return true;
        }
        if (azg2 == hp.ay) {
            if (n2 == 3 && !iu2.C) {
                if (!bdl2.G.d) {
                    --bhl2.b;
                    if (bhl2.b == 0) {
                        bdl2.a(bqp2, new bhl(hp.az));
                    } else if (!bdl2.n.c(new bhl(hp.az))) {
                        bdl2.a(new bhl(hp.az), false);
                    }
                }
                bdl2.a(bpv.L);
                this.a(iu2, cmz2, dbk2, 0);
            }
            return true;
        }
        if (azg2 == hp.bJ) {
            if (n2 > 0 && !iu2.C) {
                if (!bdl2.G.d) {
                    bhl bhl3 = anl.a(new bhl(hp.bG), im.b);
                    bdl2.a(bpv.L);
                    if (--bhl2.b == 0) {
                        bdl2.a(bqp2, bhl3);
                    } else if (!bdl2.n.c(bhl3)) {
                        bdl2.a(bhl3, false);
                    } else if (bdl2 instanceof czt) {
                        ((czt)bdl2).a(bdl2.o);
                    }
                }
                this.a(iu2, cmz2, dbk2, n2 - 1);
            }
            return true;
        }
        if (n2 > 0 && azg2 instanceof uh && ((uh)(object = (uh)azg2)).f() == in.a && ((uh)object).e(bhl2) && !iu2.C) {
            ((uh)object).g(bhl2);
            this.a(iu2, cmz2, dbk2, n2 - 1);
            bdl2.a(bpv.M);
            return true;
        }
        if (n2 > 0 && azg2 instanceof oj) {
            if (cwd.c(bhl2) > 0 && !iu2.C) {
                object = bhl2.j();
                ((bhl)object).b = 1;
                cwd.d((bhl)object);
                bdl2.a(bpv.N);
                if (!bdl2.G.d) {
                    --bhl2.b;
                }
                if (bhl2.b == 0) {
                    bdl2.a(bqp2, (bhl)object);
                } else if (!bdl2.n.c((bhl)object)) {
                    bdl2.a((bhl)object, false);
                } else if (bdl2 instanceof czt) {
                    ((czt)bdl2).a(bdl2.o);
                }
                if (!bdl2.G.d) {
                    this.a(iu2, cmz2, dbk2, n2 - 1);
                }
            }
            return true;
        }
        return false;
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, int n2) {
        iu2.a(cmz2, dbk2.a(a, Integer.valueOf(cmk.a(n2, 0, 3))), 2);
        iu2.f(cmz2, this);
    }

    @Override
    public void a_(iu iu2, cmz cmz2) {
        if (iu2.p.nextInt(20) != 1) {
            return;
        }
        float f2 = iu2.a(cmz2).c(cmz2);
        if (iu2.t_().a(f2, cmz2.b()) < 0.15f) {
            return;
        }
        dbk dbk2 = iu2.n(cmz2);
        if ((Integer)dbk2.b(a) < 3) {
            iu2.a(cmz2, dbk2.a(a), 2);
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.bQ;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.bQ);
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        return (Integer)dbk2.b(a);
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

    @Override
    public boolean a(bnj bnj2, cmz cmz2) {
        return true;
    }
}

