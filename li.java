/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;
import org.apache.commons.c.am;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class li
extends apq {
    private static final d b = org.apache.logging.log4j.c.c();
    private final tb c = new cad();
    private final tb d = new bwz(this, "Repair", true, 2);
    private final iu e;
    private final cmz j;
    public int a;
    private int k;
    private String l;
    private final bdl m;

    public li(cps cps2, iu iu2, bdl bdl2) {
        this(cps2, iu2, cmz.e, bdl2);
    }

    public li(cps cps2, iu iu2, cmz cmz2, bdl bdl2) {
        int n2;
        this.j = cmz2;
        this.e = iu2;
        this.m = bdl2;
        this.b(new ux(this.d, 0, 27, 47));
        this.b(new ux(this.d, 1, 76, 47));
        this.b(new bjq(this, this.c, 2, 134, 47, iu2, cmz2));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.b(new ux(cps2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.b(new ux(cps2, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public void a(tb tb2) {
        super.a(tb2);
        if (tb2 == this.d) {
            this.b();
        }
    }

    public void b() {
        int n2;
        bhl bhl2 = this.d.a(0);
        this.a = 1;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (bhl2 == null) {
            this.c.a(0, null);
            this.a = 0;
            return;
        }
        bhl bhl3 = bhl2.j();
        bhl bhl4 = this.d.a(1);
        Map map = acz.a(bhl3);
        n4 += bhl2.A() + (bhl4 == null ? 0 : bhl4.A());
        this.k = 0;
        if (bhl4 != null) {
            int n6 = n2 = bhl4.a() == hp.cn && !hp.cn.h(bhl4).j() ? 1 : 0;
            if (bhl3.d() && bhl3.a().a(bhl2, bhl4)) {
                int n7;
                int n8 = Math.min(bhl3.g(), bhl3.i() / 4);
                if (n8 <= 0) {
                    this.c.a(0, null);
                    this.a = 0;
                    return;
                }
                for (n7 = 0; n8 > 0 && n7 < bhl4.b; ++n7) {
                    int n9 = bhl3.g() - n8;
                    bhl3.b(n9);
                    ++n3;
                    n8 = Math.min(bhl3.g(), bhl3.i() / 4);
                }
                this.k = n7;
            } else {
                int n10;
                int n11;
                if (!(n2 != 0 || bhl3.a() == bhl4.a() && bhl3.d())) {
                    this.c.a(0, null);
                    this.a = 0;
                    return;
                }
                if (bhl3.d() && n2 == 0) {
                    int n12 = bhl2.i() - bhl2.g();
                    int n13 = bhl4.i() - bhl4.g();
                    int n14 = n13 + bhl3.i() * 12 / 100;
                    n11 = n12 + n14;
                    n10 = bhl3.i() - n11;
                    if (n10 < 0) {
                        n10 = 0;
                    }
                    if (n10 < bhl3.h()) {
                        bhl3.b(n10);
                        n3 += 2;
                    }
                }
                Map map2 = acz.a(bhl4);
                for (dad dad2 : map2.keySet()) {
                    if (dad2 == null) continue;
                    n11 = map.containsKey(dad2) ? (Integer)map.get(dad2) : 0;
                    n10 = (Integer)map2.get(dad2);
                    n10 = n11 == n10 ? n10 + 1 : Math.max(n10, n11);
                    boolean bl2 = dad2.a(bhl2);
                    if (this.m.G.d || bhl2.a() == hp.cn) {
                        bl2 = true;
                    }
                    for (dad dad3 : map.keySet()) {
                        if (dad3 == dad2 || dad2.a(dad3)) continue;
                        bl2 = false;
                        ++n3;
                    }
                    if (!bl2) continue;
                    if (n10 > dad2.a()) {
                        n10 = dad2.a();
                    }
                    map.put(dad2, n10);
                    int n15 = 0;
                    switch (dad2.d()) {
                        case a: {
                            n15 = 1;
                            break;
                        }
                        case b: {
                            n15 = 2;
                            break;
                        }
                        case c: {
                            n15 = 4;
                            break;
                        }
                        case d: {
                            n15 = 8;
                        }
                    }
                    if (n2 != 0) {
                        n15 = Math.max(1, n15 / 2);
                    }
                    n3 += n15 * n10;
                }
            }
        }
        if (am.c((CharSequence)this.l)) {
            if (bhl2.s()) {
                n5 = 1;
                n3 += n5;
                bhl3.r();
            }
        } else if (!this.l.equals(bhl2.q())) {
            n5 = 1;
            n3 += n5;
            bhl3.a(this.l);
        }
        this.a = n4 + n3;
        if (n3 <= 0) {
            bhl3 = null;
        }
        if (n5 == n3 && n5 > 0 && this.a >= 40) {
            this.a = 39;
        }
        if (this.a >= 40 && !this.m.G.d) {
            bhl3 = null;
        }
        if (bhl3 != null) {
            n2 = bhl3.A();
            if (bhl4 != null && n2 < bhl4.A()) {
                n2 = bhl4.A();
            }
            if (n5 != n3 || n5 == 0) {
                n2 = n2 * 2 + 1;
            }
            bhl3.c(n2);
            acz.a(map, bhl3);
        }
        this.c.a(0, bhl3);
        this.a();
    }

    @Override
    public void b(cpx cpx2) {
        super.b(cpx2);
        cpx2.a((apq)this, 0, this.a);
    }

    @Override
    public void a(int n2, int n3) {
        if (n2 == 0) {
            this.a = n3;
        }
    }

    @Override
    public void a(bdl bdl2) {
        super.a(bdl2);
        if (this.e.C) {
            return;
        }
        for (int i2 = 0; i2 < this.d.aI_(); ++i2) {
            bhl bhl2 = this.d.b(i2);
            if (bhl2 == null) continue;
            bdl2.a(bhl2, false);
        }
    }

    @Override
    public boolean b(bdl bdl2) {
        if (this.e.n(this.j).t() != blg.cf) {
            return false;
        }
        return !(bdl2.i((double)this.j.a() + 0.5, (double)this.j.b() + 0.5, (double)this.j.c() + 0.5) > 64.0);
    }

    @Override
    public bhl b(bdl bdl2, int n2) {
        bhl bhl2 = null;
        ux ux2 = (ux)this.g.get(n2);
        if (ux2 != null && ux2.b()) {
            bhl bhl3 = ux2.a();
            bhl2 = bhl3.j();
            if (n2 == 2) {
                if (!this.a(bhl3, 3, 39, true)) {
                    return null;
                }
                ux2.a(bhl3, bhl2);
            } else if (n2 == 0 || n2 == 1 ? !this.a(bhl3, 3, 39, false) : n2 >= 3 && n2 < 39 && !this.a(bhl3, 0, 2, false)) {
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

    public void a(String string) {
        this.l = string;
        if (this.a(2).b()) {
            bhl bhl2 = this.a(2).a();
            if (am.c((CharSequence)string)) {
                bhl2.r();
            } else {
                bhl2.a(this.l);
            }
        }
        this.b();
    }

    static /* synthetic */ tb a(li li2) {
        return li2.d;
    }

    static /* synthetic */ int b(li li2) {
        return li2.k;
    }
}

