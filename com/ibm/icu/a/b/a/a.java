/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

import com.ibm.icu.a.b.a.c;
import com.ibm.icu.a.b.a.d;
import com.ibm.icu.a.b.a.e;
import com.ibm.icu.a.b.a.f;
import com.ibm.icu.a.b.a.g;
import com.ibm.icu.a.b.a.h;
import com.ibm.icu.a.b.a.i;
import com.ibm.icu.a.b.a.j;
import com.ibm.icu.a.b.a.o;
import com.ibm.icu.a.b.a.p;
import com.ibm.icu.a.b.a.s;
import com.ibm.icu.a.b.a.t;
import java.util.ArrayList;

public class a {
    byte a;
    String[][] b;
    byte[] c;
    String[] d;
    String[] e;
    String[] f;
    String[] g;
    String[] h;
    String[] i;
    String[] j;
    String[] k;
    String[] l;
    byte[] m;
    byte[] n;
    String o;
    String p;
    boolean q;
    String r;
    String s;
    String t;
    String[] u;
    boolean[] v;
    boolean[] w;
    byte x;
    char y;
    char z;
    boolean A;
    boolean B;
    byte C;
    byte D;
    byte E;
    String F;
    boolean G;
    boolean H;
    byte I;
    p[] J;

    public static a a(String string, s s2) {
        if (s2.a("DataRecord")) {
            a a2 = new a();
            a2.a = s2.a("pl", com.ibm.icu.a.b.a.j.g);
            a2.b = s2.h("pluralName");
            a2.c = s2.b("gender", com.ibm.icu.a.b.a.e.d);
            a2.d = s2.g("singularName");
            a2.e = s2.g("halfName");
            a2.f = s2.g("numberName");
            a2.g = s2.g("mediumName");
            a2.h = s2.g("shortName");
            a2.i = s2.g("measure");
            a2.j = s2.g("rqdSuffix");
            a2.k = s2.g("optSuffix");
            a2.l = s2.g("halves");
            a2.m = s2.b("halfPlacement", com.ibm.icu.a.b.a.f.d);
            a2.n = s2.b("halfSupport", com.ibm.icu.a.b.a.g.d);
            a2.o = s2.f("fifteenMinutes");
            a2.p = s2.f("fiveMinutes");
            a2.q = s2.b("requiresDigitSeparator");
            a2.r = s2.f("digitPrefix");
            a2.s = s2.f("countSep");
            a2.t = s2.f("shortUnitSep");
            a2.u = s2.g("unitSep");
            a2.v = s2.c("unitSepRequiresDP");
            a2.w = s2.c("requiresSkipMarker");
            a2.x = s2.a("numberSystem", com.ibm.icu.a.b.a.i.e);
            a2.y = s2.d("zero");
            a2.z = s2.d("decimalSep");
            a2.A = s2.b("omitSingularCount");
            a2.B = s2.b("omitDualCount");
            a2.C = s2.a("zeroHandling", com.ibm.icu.a.b.a.o.c);
            a2.D = s2.a("decimalHandling", com.ibm.icu.a.b.a.c.e);
            a2.E = s2.a("fractionHandling", com.ibm.icu.a.b.a.d.e);
            a2.F = s2.f("skippedUnitMarker");
            a2.G = s2.b("allowZero");
            a2.H = s2.b("weeksAloneOnly");
            a2.I = s2.a("useMilliseconds", com.ibm.icu.a.b.a.h.d);
            if (s2.a("ScopeDataList")) {
                p p2;
                ArrayList<p> arrayList = new ArrayList<p>();
                while (null != (p2 = com.ibm.icu.a.b.a.p.a(s2))) {
                    arrayList.add(p2);
                }
                if (s2.a()) {
                    a2.J = arrayList.toArray(new p[arrayList.size()]);
                }
            }
            if (s2.a()) {
                return a2;
            }
        } else {
            throw new InternalError("did not find DataRecord while reading " + string);
        }
        throw new InternalError("null data read while reading " + string);
    }

    public void a(t t2) {
        t2.a("DataRecord");
        t2.a("pl", com.ibm.icu.a.b.a.j.g, this.a);
        t2.a("pluralName", this.b);
        t2.a("gender", com.ibm.icu.a.b.a.e.d, this.c);
        t2.a("singularName", this.d);
        t2.a("halfName", this.e);
        t2.a("numberName", this.f);
        t2.a("mediumName", this.g);
        t2.a("shortName", this.h);
        t2.a("measure", this.i);
        t2.a("rqdSuffix", this.j);
        t2.a("optSuffix", this.k);
        t2.a("halves", this.l);
        t2.a("halfPlacement", com.ibm.icu.a.b.a.f.d, this.m);
        t2.a("halfSupport", com.ibm.icu.a.b.a.g.d, this.n);
        t2.a("fifteenMinutes", this.o);
        t2.a("fiveMinutes", this.p);
        t2.a("requiresDigitSeparator", this.q);
        t2.a("digitPrefix", this.r);
        t2.a("countSep", this.s);
        t2.a("shortUnitSep", this.t);
        t2.a("unitSep", this.u);
        t2.a("unitSepRequiresDP", this.v);
        t2.a("requiresSkipMarker", this.w);
        t2.a("numberSystem", com.ibm.icu.a.b.a.i.e, this.x);
        t2.a("zero", this.y);
        t2.a("decimalSep", this.z);
        t2.a("omitSingularCount", this.A);
        t2.a("omitDualCount", this.B);
        t2.a("zeroHandling", com.ibm.icu.a.b.a.o.c, this.C);
        t2.a("decimalHandling", com.ibm.icu.a.b.a.c.e, this.D);
        t2.a("fractionHandling", com.ibm.icu.a.b.a.d.e, this.E);
        t2.a("skippedUnitMarker", this.F);
        t2.a("allowZero", this.G);
        t2.a("weeksAloneOnly", this.H);
        t2.a("useMilliseconds", com.ibm.icu.a.b.a.h.d, this.I);
        if (this.J != null) {
            t2.a("ScopeDataList");
            for (int i2 = 0; i2 < this.J.length; ++i2) {
                this.J[i2].a(t2);
            }
            t2.a();
        }
        t2.a();
    }
}

