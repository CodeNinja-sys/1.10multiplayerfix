/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class acw
extends ar {
    public static final qf a = qf.a("legacy_data", 0, 15);
    public static final byc b = byc.a("contents", tx.class);
    protected static final cxt c = new cxt(0.3125, 0.0, 0.3125, 0.6875, 0.375, 0.6875);

    public acw() {
        super(ahk.q);
        this.D(this.O.b().a(b, (Comparable)((Object)tx.a)).a(a, Integer.valueOf(0)));
    }

    @Override
    public String az_() {
        return caf.a("item.flowerPot.name");
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return c;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (bhl2 == null || !(bhl2.a() instanceof ge)) {
            return false;
        }
        cbj cbj2 = this.c(iu2, cmz2);
        if (cbj2 == null) {
            return false;
        }
        if (cbj2.g() != null) {
            return false;
        }
        bfa bfa2 = bfa.a(bhl2.a());
        if (!this.a(bfa2, bhl2.h())) {
            return false;
        }
        cbj2.a(bhl2.a(), bhl2.h());
        cbj2.c_();
        iu2.a(cmz2, dbk2, dbk2, 3);
        bdl2.a(bpv.V);
        if (!bdl2.G.d) {
            --bhl2.b;
        }
        return true;
    }

    private boolean a(bfa bfa2, int n2) {
        if (bfa2 == blg.N || bfa2 == blg.O || bfa2 == blg.aK || bfa2 == blg.P || bfa2 == blg.Q || bfa2 == blg.g || bfa2 == blg.I) {
            return true;
        }
        return bfa2 == blg.H && n2 == deq.c.b();
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        bhl bhl2;
        cbj cbj2 = this.c(iu2, cmz2);
        if (cbj2 != null && (bhl2 = cbj2.f()) != null) {
            return bhl2;
        }
        return new bhl(hp.ca);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return super.a(iu2, cmz2) && iu2.n(cmz2.h()).q();
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!iu2.n(cmz2.h()).q()) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        cbj cbj2 = this.c(iu2, cmz2);
        if (cbj2 != null && cbj2.g() != null) {
            acw.a(iu2, cmz2, new bhl(cbj2.g(), 1, cbj2.h()));
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        cbj cbj2;
        super.a(iu2, cmz2, dbk2, bdl2);
        if (bdl2.G.d && (cbj2 = this.c(iu2, cmz2)) != null) {
            cbj2.a(null, 0);
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.ca;
    }

    private cbj c(iu iu2, cmz cmz2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof cbj) {
            return (cbj)bql2;
        }
        return null;
    }

    @Override
    public bql a(iu iu2, int n2) {
        bfa bfa2 = null;
        int n3 = 0;
        switch (n2) {
            default: {
                break;
            }
            case 1: {
                bfa2 = blg.O;
                n3 = amt.b.c();
                break;
            }
            case 2: {
                bfa2 = blg.N;
                break;
            }
            case 3: {
                bfa2 = blg.g;
                n3 = zg.a.b();
                break;
            }
            case 4: {
                bfa2 = blg.g;
                n3 = zg.b.b();
                break;
            }
            case 5: {
                bfa2 = blg.g;
                n3 = zg.c.b();
                break;
            }
            case 6: {
                bfa2 = blg.g;
                n3 = zg.d.b();
                break;
            }
            case 12: {
                bfa2 = blg.g;
                n3 = zg.e.b();
                break;
            }
            case 13: {
                bfa2 = blg.g;
                n3 = zg.f.b();
                break;
            }
            case 7: {
                bfa2 = blg.Q;
                break;
            }
            case 8: {
                bfa2 = blg.P;
                break;
            }
            case 9: {
                bfa2 = blg.aK;
                break;
            }
            case 10: {
                bfa2 = blg.I;
                break;
            }
            case 11: {
                bfa2 = blg.H;
                n3 = deq.c.b();
            }
        }
        return new cbj(azg.a(bfa2), n3);
    }

    @Override
    protected bkp a() {
        return new bkp(this, b, a);
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        cbj cbj2;
        azg azg2;
        tx tx2 = tx.a;
        bql bql2 = bnj2.q(cmz2);
        if (bql2 instanceof cbj && (azg2 = (cbj2 = (cbj)bql2).g()) instanceof ge) {
            int n2 = cbj2.h();
            bfa bfa2 = bfa.a(azg2);
            if (bfa2 == blg.g) {
                switch (zg.a(n2)) {
                    case a: {
                        tx2 = tx.l;
                        break;
                    }
                    case b: {
                        tx2 = tx.m;
                        break;
                    }
                    case c: {
                        tx2 = tx.n;
                        break;
                    }
                    case d: {
                        tx2 = tx.o;
                        break;
                    }
                    case e: {
                        tx2 = tx.p;
                        break;
                    }
                    case f: {
                        tx2 = tx.q;
                        break;
                    }
                    default: {
                        tx2 = tx.a;
                        break;
                    }
                }
            } else if (bfa2 == blg.H) {
                switch (n2) {
                    case 0: {
                        tx2 = tx.t;
                        break;
                    }
                    case 2: {
                        tx2 = tx.u;
                        break;
                    }
                    default: {
                        tx2 = tx.a;
                        break;
                    }
                }
            } else if (bfa2 == blg.N) {
                tx2 = tx.k;
            } else if (bfa2 == blg.O) {
                switch (amt.a(ayx.b, n2)) {
                    case b: {
                        tx2 = tx.b;
                        break;
                    }
                    case c: {
                        tx2 = tx.c;
                        break;
                    }
                    case d: {
                        tx2 = tx.d;
                        break;
                    }
                    case e: {
                        tx2 = tx.e;
                        break;
                    }
                    case f: {
                        tx2 = tx.f;
                        break;
                    }
                    case g: {
                        tx2 = tx.g;
                        break;
                    }
                    case h: {
                        tx2 = tx.h;
                        break;
                    }
                    case i: {
                        tx2 = tx.i;
                        break;
                    }
                    case j: {
                        tx2 = tx.j;
                        break;
                    }
                    default: {
                        tx2 = tx.a;
                        break;
                    }
                }
            } else if (bfa2 == blg.Q) {
                tx2 = tx.r;
            } else if (bfa2 == blg.P) {
                tx2 = tx.s;
            } else if (bfa2 == blg.I) {
                tx2 = tx.t;
            } else if (bfa2 == blg.aK) {
                tx2 = tx.v;
            }
        }
        return dbk2.a(b, (Comparable)((Object)tx2));
    }

    @Override
    public kj b() {
        return kj.c;
    }
}

