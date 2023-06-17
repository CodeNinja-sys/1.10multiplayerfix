/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.bf;
import net.minecraft.q.g.c.bh;
import net.minecraft.q.g.c.bq;
import net.minecraft.q.g.c.bx;
import net.minecraft.q.g.c.bz;
import net.minecraft.q.g.c.ce;
import net.minecraft.q.g.c.cx;
import net.minecraft.q.g.c.cy;
import net.minecraft.q.g.c.cz;
import net.minecraft.q.g.c.da;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.i;
import net.minecraft.q.g.c.m;
import net.minecraft.q.g.c.r;
import net.minecraft.q.g.c.t;
import net.minecraft.q.g.c.x;
import net.minecraft.u.ad;
import net.minecraft.u.b.n;

public class aw {
    public static void a() {
        da.a(cy.class, "ViBH");
        da.a(x.class, "ViDF");
        da.a(bf.class, "ViF");
        da.a(i.class, "ViL");
        da.a(bq.class, "ViPH");
        da.a(bh.class, "ViSH");
        da.a(t.class, "ViSmH");
        da.a(bx.class, "ViST");
        da.a(ce.class, "ViS");
        da.a(ak.class, "ViStart");
        da.a(bz.class, "ViSR");
        da.a(cz.class, "ViTRH");
        da.a(m.class, "ViW");
    }

    public static List a(Random random, int n2) {
        ArrayList arrayList = ov.a();
        arrayList.add(new cx(bh.class, 4, n.a(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new cx(bx.class, 20, n.a(random, 0 + n2, 1 + n2)));
        arrayList.add(new cx(cy.class, 20, n.a(random, 0 + n2, 2 + n2)));
        arrayList.add(new cx(t.class, 3, n.a(random, 2 + n2, 5 + n2 * 3)));
        arrayList.add(new cx(bq.class, 15, n.a(random, 0 + n2, 2 + n2)));
        arrayList.add(new cx(x.class, 3, n.a(random, 1 + n2, 4 + n2)));
        arrayList.add(new cx(bf.class, 3, n.a(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new cx(ce.class, 15, n.a(random, 0, 1 + n2)));
        arrayList.add(new cx(cz.class, 8, n.a(random, 0 + n2, 3 + n2 * 2)));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (((cx)iterator.next()).d != 0) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private static int a(List list) {
        boolean bl2 = false;
        int n2 = 0;
        for (cx cx2 : list) {
            if (cx2.d > 0 && cx2.c < cx2.d) {
                bl2 = true;
            }
            n2 += cx2.b;
        }
        return bl2 ? n2 : -1;
    }

    private static dn a(ak ak2, cx cx2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        Class class_ = cx2.a;
        dn dn2 = null;
        if (class_ == bh.class) {
            dn2 = bh.a(ak2, list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == bx.class) {
            dn2 = bx.a(ak2, list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == cy.class) {
            dn2 = cy.a(ak2, list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == t.class) {
            dn2 = t.a(ak2, list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == bq.class) {
            dn2 = bq.a(ak2, list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == x.class) {
            dn2 = x.a(ak2, list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == bf.class) {
            dn2 = bf.a(ak2, list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == ce.class) {
            dn2 = ce.a(ak2, list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == cz.class) {
            dn2 = cz.a(ak2, list, random, n2, n3, n4, ad2, n5);
        }
        return dn2;
    }

    private static dn c(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        int n6 = aw.a(ak2.f);
        if (n6 <= 0) {
            return null;
        }
        int n7 = 0;
        block0: while (n7 < 5) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (cx cx2 : ak2.f) {
                if ((n8 -= cx2.b) >= 0) continue;
                if (!cx2.a(n5) || cx2 == ak2.e && ak2.f.size() > 1) continue block0;
                dn dn2 = aw.a(ak2, cx2, list, random, n2, n3, n4, ad2, n5);
                if (dn2 == null) continue;
                ++cx2.c;
                ak2.e = cx2;
                if (!cx2.a()) {
                    ak2.f.remove(cx2);
                }
                return dn2;
            }
        }
        dc dc2 = i.a(ak2, list, random, n2, n3, n4, ad2);
        if (dc2 != null) {
            return new i(ak2, n5, random, dc2, ad2);
        }
        return null;
    }

    private static r d(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n2 - ak2.f().a) <= 112 && Math.abs(n4 - ak2.f().c) <= 112) {
            dn dn2 = aw.c(ak2, list, random, n2, n3, n4, ad2, n5 + 1);
            if (dn2 != null) {
                list.add(dn2);
                ak2.g.add(dn2);
                return dn2;
            }
            return null;
        }
        return null;
    }

    private static r e(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        if (n5 > 3 + ak2.d) {
            return null;
        }
        if (Math.abs(n2 - ak2.f().a) <= 112 && Math.abs(n4 - ak2.f().c) <= 112) {
            dc dc2 = bz.a(ak2, list, random, n2, n3, n4, ad2);
            if (dc2 != null && dc2.b > 10) {
                bz bz2 = new bz(ak2, n5, random, dc2, ad2);
                list.add(bz2);
                ak2.h.add(bz2);
                return bz2;
            }
            return null;
        }
        return null;
    }

    static /* synthetic */ r a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        return aw.e(ak2, list, random, n2, n3, n4, ad2, n5);
    }

    static /* synthetic */ r b(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        return aw.d(ak2, list, random, n2, n3, n4, ad2, n5);
    }
}

