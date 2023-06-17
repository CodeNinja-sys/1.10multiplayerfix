/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class dc
extends apq {
    public tb a = new jg(this, "Enchant", true, 2);
    private final iu j;
    private final cmz k;
    private final Random l = new Random();
    public int b;
    public int[] c = new int[3];
    public int[] d = new int[]{-1, -1, -1};
    public int[] e = new int[]{-1, -1, -1};

    public dc(cps cps2, iu iu2) {
        this(cps2, iu2, cmz.e);
    }

    public dc(cps cps2, iu iu2, cmz cmz2) {
        int n2;
        this.j = iu2;
        this.k = cmz2;
        this.b = cps2.e.aC();
        this.b(new cho(this, this.a, 0, 15, 47));
        this.b(new bwf(this, this.a, 1, 35, 47));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(new ux(cps2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.b(new ux(cps2, n2, 8 + n2 * 18, 142));
        }
    }

    protected void a(cpx cpx2) {
        cpx2.a((apq)this, 0, this.c[0]);
        cpx2.a((apq)this, 1, this.c[1]);
        cpx2.a((apq)this, 2, this.c[2]);
        cpx2.a((apq)this, 3, this.b & 0xFFFFFFF0);
        cpx2.a((apq)this, 4, this.d[0]);
        cpx2.a((apq)this, 5, this.d[1]);
        cpx2.a((apq)this, 6, this.d[2]);
        cpx2.a((apq)this, 7, this.e[0]);
        cpx2.a((apq)this, 8, this.e[1]);
        cpx2.a((apq)this, 9, this.e[2]);
    }

    @Override
    public void b(cpx cpx2) {
        super.b(cpx2);
        this.a(cpx2);
    }

    @Override
    public void a() {
        super.a();
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            cpx cpx2 = (cpx)this.i.get(i2);
            this.a(cpx2);
        }
    }

    @Override
    public void a(int n2, int n3) {
        if (n2 >= 0 && n2 <= 2) {
            this.c[n2] = n3;
        } else if (n2 == 3) {
            this.b = n3;
        } else if (n2 >= 4 && n2 <= 6) {
            this.d[n2 - 4] = n3;
        } else if (n2 >= 7 && n2 <= 9) {
            this.e[n2 - 7] = n3;
        } else {
            super.a(n2, n3);
        }
    }

    @Override
    public void a(tb tb2) {
        if (tb2 == this.a) {
            bhl bhl2 = tb2.a(0);
            if (bhl2 == null || !bhl2.v()) {
                for (int i2 = 0; i2 < 3; ++i2) {
                    this.c[i2] = 0;
                    this.d[i2] = -1;
                    this.e[i2] = -1;
                }
            } else if (!this.j.C) {
                int n2;
                int n3 = 0;
                for (n2 = -1; n2 <= 1; ++n2) {
                    for (int i3 = -1; i3 <= 1; ++i3) {
                        if (n2 == 0 && i3 == 0 || !this.j.c(this.k.e(i3, 0, n2)) || !this.j.c(this.k.e(i3, 1, n2))) continue;
                        if (this.j.n(this.k.e(i3 * 2, 0, n2 * 2)).t() == blg.X) {
                            ++n3;
                        }
                        if (this.j.n(this.k.e(i3 * 2, 1, n2 * 2)).t() == blg.X) {
                            ++n3;
                        }
                        if (i3 == 0 || n2 == 0) continue;
                        if (this.j.n(this.k.e(i3 * 2, 0, n2)).t() == blg.X) {
                            ++n3;
                        }
                        if (this.j.n(this.k.e(i3 * 2, 1, n2)).t() == blg.X) {
                            ++n3;
                        }
                        if (this.j.n(this.k.e(i3, 0, n2 * 2)).t() == blg.X) {
                            ++n3;
                        }
                        if (this.j.n(this.k.e(i3, 1, n2 * 2)).t() != blg.X) continue;
                        ++n3;
                    }
                }
                this.l.setSeed(this.b);
                for (n2 = 0; n2 < 3; ++n2) {
                    this.c[n2] = acz.a(this.l, n2, n3, bhl2);
                    this.d[n2] = -1;
                    this.e[n2] = -1;
                    if (this.c[n2] >= n2 + 1) continue;
                    this.c[n2] = 0;
                }
                for (n2 = 0; n2 < 3; ++n2) {
                    List list;
                    if (this.c[n2] <= 0 || (list = this.a(bhl2, n2, this.c[n2])) == null || list.isEmpty()) continue;
                    bc bc2 = (bc)list.get(this.l.nextInt(list.size()));
                    this.d[n2] = dad.b(bc2.a);
                    this.e[n2] = bc2.b;
                }
                this.a();
            }
        }
    }

    @Override
    public boolean a(bdl bdl2, int n2) {
        bhl bhl2 = this.a.a(0);
        bhl bhl3 = this.a.a(1);
        int n3 = n2 + 1;
        if (!(bhl3 != null && bhl3.b >= n3 || bdl2.G.d)) {
            return false;
        }
        if (this.c[n2] > 0 && bhl2 != null && (bdl2.H >= n3 && bdl2.H >= this.c[n2] || bdl2.G.d)) {
            if (!this.j.C) {
                boolean bl2;
                List list = this.a(bhl2, n2, this.c[n2]);
                boolean bl3 = bl2 = bhl2.a() == hp.aS;
                if (list != null) {
                    bdl2.i(n3);
                    if (bl2) {
                        bhl2.a(hp.cn);
                    }
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        bc bc2 = (bc)list.get(i2);
                        if (bl2) {
                            hp.cn.a(bhl2, bc2);
                            continue;
                        }
                        bhl2.a(bc2.a, bc2.b);
                    }
                    if (!bdl2.G.d) {
                        bhl3.b -= n3;
                        if (bhl3.b <= 0) {
                            this.a.a(1, null);
                        }
                    }
                    bdl2.a(bpv.Y);
                    this.a.c_();
                    this.b = bdl2.aC();
                    this.a(this.a);
                    this.j.a(null, this.k, dah.aL, csg.e, 1.0f, this.j.p.nextFloat() * 0.1f + 0.9f);
                }
            }
            return true;
        }
        return false;
    }

    private List a(bhl bhl2, int n2, int n3) {
        this.l.setSeed(this.b + n2);
        List list = acz.b(this.l, bhl2, n3, false);
        if (bhl2.a() == hp.aS && list.size() > 1) {
            list.remove(this.l.nextInt(list.size()));
        }
        return list;
    }

    public int b() {
        bhl bhl2 = this.a.a(1);
        if (bhl2 == null) {
            return 0;
        }
        return bhl2.b;
    }

    @Override
    public void a(bdl bdl2) {
        super.a(bdl2);
        if (this.j.C) {
            return;
        }
        for (int i2 = 0; i2 < this.a.aI_(); ++i2) {
            bhl bhl2 = this.a.b(i2);
            if (bhl2 == null) continue;
            bdl2.a(bhl2, false);
        }
    }

    @Override
    public boolean b(bdl bdl2) {
        if (this.j.n(this.k).t() != blg.bC) {
            return false;
        }
        return !(bdl2.i((double)this.k.a() + 0.5, (double)this.k.b() + 0.5, (double)this.k.c() + 0.5) > 64.0);
    }

    @Override
    public bhl b(bdl bdl2, int n2) {
        bhl bhl2 = null;
        ux ux2 = (ux)this.g.get(n2);
        if (ux2 != null && ux2.b()) {
            bhl bhl3 = ux2.a();
            bhl2 = bhl3.j();
            if (n2 == 0) {
                if (!this.a(bhl3, 2, 38, true)) {
                    return null;
                }
            } else if (n2 == 1) {
                if (!this.a(bhl3, 2, 38, true)) {
                    return null;
                }
            } else if (bhl3.a() == hp.bd && dck.a(bhl3.h()) == dck.l) {
                if (!this.a(bhl3, 1, 2, true)) {
                    return null;
                }
            } else if (!((ux)this.g.get(0)).b() && ((ux)this.g.get(0)).a(bhl3)) {
                if (bhl3.n() && bhl3.b == 1) {
                    ((ux)this.g.get(0)).b(bhl3.j());
                    bhl3.b = 0;
                } else if (bhl3.b >= 1) {
                    ((ux)this.g.get(0)).b(new bhl(bhl3.a(), 1, bhl3.h()));
                    --bhl3.b;
                }
            } else {
                return null;
            }
            if (bhl3.b == 0) {
                ux2.b(null);
            } else {
                ux2.c();
            }
            if (bhl3.b == bhl2.b) {
                return null;
            }
            ux2.a(bdl2, bhl3);
        }
        return bhl2;
    }
}

