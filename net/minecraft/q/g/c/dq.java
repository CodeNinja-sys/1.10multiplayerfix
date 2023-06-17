/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.aa;
import net.minecraft.q.g.c.ab;
import net.minecraft.q.g.c.ad;
import net.minecraft.q.g.c.ah;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.ao;
import net.minecraft.q.g.c.ay;
import net.minecraft.q.g.c.bb;
import net.minecraft.q.g.c.be;
import net.minecraft.q.g.c.bi;
import net.minecraft.q.g.c.bo;
import net.minecraft.q.g.c.bt;
import net.minecraft.q.g.c.da;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.de;
import net.minecraft.q.g.c.df;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.e;
import net.minecraft.q.g.c.h;
import net.minecraft.q.g.c.r;
import net.minecraft.q.g.c.v;

public class dq {
    private static final v[] b = new v[]{new v(aa.class, 40, 0), new v(bo.class, 5, 5), new v(ah.class, 20, 0), new v(bb.class, 20, 0), new v(ao.class, 10, 6), new v(ab.class, 5, 5), new v(e.class, 5, 5), new v(bi.class, 5, 4), new v(h.class, 5, 4), new df(ay.class, 10, 2), new ad(de.class, 20, 1)};
    private static List c;
    private static Class d;
    static int a;
    private static final bt e;

    static {
        e = new bt(null);
    }

    public static void a() {
        da.a(h.class, "SHCC");
        da.a(be.class, "SHFC");
        da.a(bi.class, "SH5C");
        da.a(ah.class, "SHLT");
        da.a(ay.class, "SHLi");
        da.a(de.class, "SHPR");
        da.a(bo.class, "SHPH");
        da.a(bb.class, "SHRT");
        da.a(ao.class, "SHRC");
        da.a(e.class, "SHSD");
        da.a(ds.class, "SHStart");
        da.a(aa.class, "SHS");
        da.a(ab.class, "SHSSD");
    }

    public static void b() {
        c = ov.a();
        v[] arrv = b;
        int n2 = b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            v v2 = arrv[i2];
            v2.c = 0;
            c.add(v2);
        }
        d = null;
    }

    private static boolean e() {
        boolean bl2 = false;
        a = 0;
        for (v v2 : c) {
            if (v2.d > 0 && v2.c < v2.d) {
                bl2 = true;
            }
            a += v2.b;
        }
        return bl2;
    }

    private static am a(Class class_, List list, Random random, int n2, int n3, int n4, net.minecraft.u.ad ad2, int n5) {
        am am2 = null;
        if (class_ == aa.class) {
            am2 = aa.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == bo.class) {
            am2 = bo.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == ah.class) {
            am2 = ah.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == bb.class) {
            am2 = bb.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == ao.class) {
            am2 = ao.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == ab.class) {
            am2 = ab.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == e.class) {
            am2 = net.minecraft.q.g.c.e.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == bi.class) {
            am2 = bi.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == h.class) {
            am2 = h.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == ay.class) {
            am2 = ay.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == de.class) {
            am2 = de.a(list, random, n2, n3, n4, ad2, n5);
        }
        return am2;
    }

    private static am b(ds ds2, List list, Random random, int n2, int n3, int n4, net.minecraft.u.ad ad2, int n5) {
        if (!dq.e()) {
            return null;
        }
        if (d != null) {
            am am2 = dq.a(d, list, random, n2, n3, n4, ad2, n5);
            d = null;
            if (am2 != null) {
                return am2;
            }
        }
        int n6 = 0;
        block0: while (n6 < 5) {
            ++n6;
            int n7 = random.nextInt(a);
            for (v v2 : c) {
                if ((n7 -= v2.b) >= 0) continue;
                if (!v2.a(n5) || v2 == ds2.d) continue block0;
                am am3 = dq.a(v2.a, list, random, n2, n3, n4, ad2, n5);
                if (am3 == null) continue;
                ++v2.c;
                ds2.d = v2;
                if (!v2.a()) {
                    c.remove(v2);
                }
                return am3;
            }
        }
        dc dc2 = be.a(list, random, n2, n3, n4, ad2);
        if (dc2 != null && dc2.b > 1) {
            return new be(n5, random, dc2, ad2);
        }
        return null;
    }

    private static r c(ds ds2, List list, Random random, int n2, int n3, int n4, net.minecraft.u.ad ad2, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n2 - ds2.f().a) <= 112 && Math.abs(n4 - ds2.f().c) <= 112) {
            am am2 = dq.b(ds2, list, random, n2, n3, n4, ad2, n5 + 1);
            if (am2 != null) {
                list.add(am2);
                ds2.f.add(am2);
            }
            return am2;
        }
        return null;
    }

    static /* synthetic */ bt c() {
        return e;
    }

    static /* synthetic */ Class d() {
        return d;
    }

    static /* synthetic */ void a(Class class_) {
        d = class_;
    }

    static /* synthetic */ r a(ds ds2, List list, Random random, int n2, int n3, int n4, net.minecraft.u.ad ad2, int n5) {
        return dq.c(ds2, list, random, n2, n3, n4, ad2, n5);
    }
}

