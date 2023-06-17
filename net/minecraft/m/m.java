/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fi;
import net.minecraft.g.s;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.v.d;
import net.minecraft.w.h.ad;
import net.minecraft.w.l;

public class m
extends cg {
    public static final int[] a = new int[]{0x1E1B1B, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 0xABABAB, 0x434343, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 0xF0F0F0};

    public m() {
        this.a(true);
        this.e(0);
        this.a(d.l);
    }

    @Override
    public String d(cu cu2) {
        int n2 = cu2.h();
        return String.valueOf(super.cw_()) + "." + cd.a(n2).d();
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, net.minecraft.u.ad ad2, float f2, float f3, float f4) {
        if (!b2.a(b3.a(ad2), ad2, cu2)) {
            return ab.c;
        }
        cd cd2 = cd.a(cu2.h());
        if (cd2 == cd.a) {
            if (m.a(cu2, k2, b3)) {
                if (!k2.C) {
                    k2.b(2005, b3, 0);
                }
                return ab.a;
            }
        } else if (cd2 == cd.m) {
            b b4 = k2.n(b3);
            cn cn2 = b4.c();
            if (cn2 == p.r && b4.a(s.a) == net.minecraft.g.b.d) {
                if (ad2 != net.minecraft.u.ad.a && ad2 != net.minecraft.u.ad.b) {
                    if (k2.c(b3 = b3.a(ad2))) {
                        b b5 = p.bN.a(k2, b3, ad2, f2, f3, f4, 0, b2);
                        k2.a(b3, b5, 10);
                        if (!b2.J.d) {
                            --cu2.b;
                        }
                    }
                    return ab.a;
                }
                return ab.c;
            }
            return ab.c;
        }
        return ab.b;
    }

    public static boolean a(cu cu2, k k2, net.minecraft.u.b.b b2) {
        fi fi2;
        b b3 = k2.n(b2);
        if (b3.c() instanceof fi && (fi2 = (fi)((Object)b3.c())).a(k2, b2, b3, k2.C)) {
            if (!k2.C) {
                if (fi2.a(k2, k2.p, b2, b3)) {
                    fi2.b(k2, k2.p, b2, b3);
                }
                --cu2.b;
            }
            return true;
        }
        return false;
    }

    public static void a(k k2, net.minecraft.u.b.b b2, int n2) {
        b b3;
        if (n2 == 0) {
            n2 = 15;
        }
        if ((b3 = k2.n(b2)).d() != net.minecraft.g.a.h.a) {
            for (int i2 = 0; i2 < n2; ++i2) {
                double d2 = h.nextGaussian() * 0.02;
                double d3 = h.nextGaussian() * 0.02;
                double d4 = h.nextGaussian() * 0.02;
                k2.a(aj.v, (double)((float)b2.cy_() + h.nextFloat()), (double)b2.k() + (double)h.nextFloat() * b3.c((n)k2, (net.minecraft.u.b.b)b2).e, (double)((float)b2.l() + h.nextFloat()), d2, d3, d4, new int[0]);
            }
        }
    }

    @Override
    public boolean a(cu cu2, net.minecraft.w.a.b b2, l l2, ah ah2) {
        if (l2 instanceof ad) {
            ad ad2 = (ad)l2;
            cd cd2 = cd.a(cu2.h());
            if (!ad2.q() && ad2.p() != cd2) {
                ad2.b(cd2);
                --cu2.b;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new cu(cg2, 1, i2));
        }
    }
}

