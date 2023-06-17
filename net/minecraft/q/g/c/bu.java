/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.al;
import net.minecraft.q.g.c.an;
import net.minecraft.q.g.c.aq;
import net.minecraft.q.g.c.by;
import net.minecraft.q.g.c.ca;
import net.minecraft.q.g.c.cc;
import net.minecraft.q.g.c.cl;
import net.minecraft.q.g.c.co;
import net.minecraft.q.g.c.cq;
import net.minecraft.q.g.c.cs;
import net.minecraft.q.g.c.cu;
import net.minecraft.q.g.c.cw;
import net.minecraft.q.g.c.d;
import net.minecraft.q.g.c.da;
import net.minecraft.q.g.c.du;
import net.minecraft.q.g.c.f;
import net.minecraft.q.g.c.g;
import net.minecraft.q.g.c.o;
import net.minecraft.u.ad;

public class bu {
    private static final o[] a = new o[]{new o(aq.class, 30, 0, true), new o(cu.class, 10, 4), new o(an.class, 10, 4), new o(cq.class, 10, 3), new o(f.class, 5, 2), new o(g.class, 5, 1)};
    private static final o[] b = new o[]{new o(cl.class, 25, 0, true), new o(cw.class, 15, 5), new o(by.class, 5, 10), new o(du.class, 5, 10), new o(co.class, 10, 3, true), new o(ca.class, 7, 2), new o(cs.class, 5, 2)};

    public static void a() {
        da.a(cu.class, "NeBCr");
        da.a(al.class, "NeBEF");
        da.a(aq.class, "NeBS");
        da.a(co.class, "NeCCS");
        da.a(ca.class, "NeCTB");
        da.a(g.class, "NeCE");
        da.a(cw.class, "NeSCSC");
        da.a(du.class, "NeSCLT");
        da.a(cl.class, "NeSC");
        da.a(by.class, "NeSCRT");
        da.a(cs.class, "NeCSR");
        da.a(f.class, "NeMT");
        da.a(an.class, "NeRC");
        da.a(cq.class, "NeSR");
        da.a(cc.class, "NeStart");
    }

    private static d b(o o2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        Class class_ = o2.a;
        d d2 = null;
        if (class_ == aq.class) {
            d2 = aq.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == cu.class) {
            d2 = cu.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == an.class) {
            d2 = an.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == cq.class) {
            d2 = cq.a(list, random, n2, n3, n4, n5, ad2);
        } else if (class_ == f.class) {
            d2 = f.a(list, random, n2, n3, n4, n5, ad2);
        } else if (class_ == g.class) {
            d2 = g.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == cl.class) {
            d2 = cl.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == by.class) {
            d2 = by.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == du.class) {
            d2 = du.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == co.class) {
            d2 = co.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == ca.class) {
            d2 = ca.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == cw.class) {
            d2 = cw.a(list, random, n2, n3, n4, ad2, n5);
        } else if (class_ == cs.class) {
            d2 = cs.a(list, random, n2, n3, n4, ad2, n5);
        }
        return d2;
    }

    static /* synthetic */ d a(o o2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        return bu.b(o2, list, random, n2, n3, n4, ad2, n5);
    }

    static /* synthetic */ o[] b() {
        return a;
    }

    static /* synthetic */ o[] c() {
        return b;
    }
}

