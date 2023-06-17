/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.ag;
import com.sun.jna.a.d.aj;
import com.sun.jna.a.d.al;
import com.sun.jna.a.d.am;
import com.sun.jna.a.d.ao;
import com.sun.jna.a.d.ap;
import com.sun.jna.a.d.b;
import com.sun.jna.a.d.bn;
import com.sun.jna.a.d.bp;
import com.sun.jna.a.d.bq;
import com.sun.jna.a.d.br;
import com.sun.jna.a.d.bs;
import com.sun.jna.a.d.bt;
import com.sun.jna.a.d.bu;
import com.sun.jna.a.d.bz;
import com.sun.jna.a.d.cd;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.s;
import com.sun.jna.a.d.v;
import com.sun.jna.a.d.x;
import com.sun.jna.at;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.b.g;
import com.sun.jna.b.h;
import java.util.ArrayList;

public abstract class bo {
    public static String a() {
        return bo.a(null, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(String string, String string2) {
        h h2 = new h();
        try {
            int n2 = bn.g.a(string2, string, h2);
            if (0 != n2) {
                throw new dy(n2);
            }
            String string3 = h2.d().a(0L, true);
            return string3;
        }
        finally {
            if (0 != bn.g.a(h2.d())) {
                throw new dy(ac.g.f());
            }
        }
    }

    public static int b() {
        return bo.a(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(String string) {
        h h2 = new h();
        e e2 = new e();
        try {
            int n2 = bn.g.a(string, h2, e2);
            if (0 != n2) {
                throw new dy(n2);
            }
            int n3 = e2.d();
            return n3;
        }
        finally {
            int n4;
            if (h2.c() != null && 0 != (n4 = bn.g.a(h2.d()))) {
                throw new dy(n4);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String b(String string) {
        h h2 = new h();
        e e2 = new e();
        try {
            int n2 = bn.g.a(string, h2, e2);
            if (0 != n2) {
                throw new dy(n2);
            }
            String string2 = h2.d().a(0L, true);
            return string2;
        }
        finally {
            int n3;
            if (h2.c() != null && 0 != (n3 = bn.g.a(h2.d()))) {
                throw new dy(n3);
            }
        }
    }

    public static bs[] c() {
        return bo.c(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static bs[] c(String string) {
        h h2 = new h();
        e e2 = new e();
        e e3 = new e();
        try {
            int n2 = bn.g.a(string, 1, h2, -1, e2, e3, null);
            if (0 != n2 || h2.d() == ay.I) {
                throw new dy(n2);
            }
            al al2 = new al(h2.d());
            al[] arral = (al[])al2.e(e2.d());
            ArrayList<bs> arrayList = new ArrayList<bs>();
            for (al al3 : arral) {
                bs bs2 = new bs();
                bs2.a = al3.a.toString();
                bs2.b = al3.b.toString();
                arrayList.add(bs2);
            }
            Object[] arrobject = arrayList.toArray(new bs[0]);
            return arrobject;
        }
        finally {
            int n3;
            if (h2.d() != ay.I && 0 != (n3 = bn.g.a(h2.d()))) {
                throw new dy(n3);
            }
        }
    }

    public static br[] d() {
        return bo.d(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static br[] d(String string) {
        h h2 = new h();
        e e2 = new e();
        e e3 = new e();
        try {
            int n2 = bn.g.b(string, 1, h2, -1, e2, e3, null);
            if (0 != n2 || h2.d() == ay.I) {
                throw new dy(n2);
            }
            ag ag2 = new ag(h2.d());
            ag[] arrag = (ag[])ag2.e(e2.d());
            ArrayList<bs> arrayList = new ArrayList<bs>();
            for (ag ag3 : arrag) {
                bs bs2 = new bs();
                bs2.a = ag3.a.toString();
                bs2.b = ag3.b.toString();
                arrayList.add(bs2);
            }
            Object[] arrobject = arrayList.toArray(new bs[0]);
            return arrobject;
        }
        finally {
            int n3;
            if (h2.d() != ay.I && 0 != (n3 = bn.g.a(h2.d()))) {
                throw new dy(n3);
            }
        }
    }

    public static bt[] e() {
        return bo.e(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static bt[] e(String string) {
        h h2 = new h();
        e e2 = new e();
        e e3 = new e();
        try {
            int n2 = bn.g.a(string, 1, 0, h2, -1, e2, e3, null);
            if (0 != n2 || h2.d() == ay.I) {
                throw new dy(n2);
            }
            ao ao2 = new ao(h2.d());
            ao[] arrao = (ao[])ao2.e(e2.d());
            ArrayList<bt> arrayList = new ArrayList<bt>();
            for (ao ao3 : arrao) {
                bt bt2 = new bt();
                bt2.a = ao3.a.toString();
                arrayList.add(bt2);
            }
            Object[] arrobject = arrayList.toArray(new bt[0]);
            return arrobject;
        }
        finally {
            int n3;
            if (h2.d() != ay.I && 0 != (n3 = bn.g.a(h2.d()))) {
                throw new dy(n3);
            }
        }
    }

    public static br[] f() {
        return bo.f(cd.a(2));
    }

    public static br[] f(String string) {
        return bo.b(string, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static br[] b(String string, String string2) {
        h h2 = new h();
        e e2 = new e();
        e e3 = new e();
        try {
            int n2 = bn.g.a(string2, string, 0, 0, h2, -1, e2, e3);
            if (n2 != 0) {
                throw new dy(n2);
            }
            am am2 = new am(h2.d());
            am[] arram = (am[])am2.e(e2.d());
            ArrayList<bs> arrayList = new ArrayList<bs>();
            for (am am3 : arram) {
                bs bs2 = new bs();
                bs2.a = am3.a.toString();
                arrayList.add(bs2);
            }
            Object[] arrobject = arrayList.toArray(new br[0]);
            return arrobject;
        }
        finally {
            int n3;
            if (h2.d() != ay.I && 0 != (n3 = bn.g.a(h2.d()))) {
                throw new dy(n3);
            }
        }
    }

    public static br[] g(String string) {
        return bo.c(string, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static br[] c(String string, String string2) {
        h h2 = new h();
        e e2 = new e();
        e e3 = new e();
        try {
            int n2 = bn.g.a(string2, string, 0, h2, -1, e2, e3);
            if (n2 != 0) {
                throw new dy(n2);
            }
            aj aj2 = new aj(h2.d());
            aj[] arraj = (aj[])aj2.e(e2.d());
            ArrayList<br> arrayList = new ArrayList<br>();
            for (aj aj3 : arraj) {
                br br2 = new br();
                br2.a = aj3.a.toString();
                arrayList.add(br2);
            }
            Object[] arrobject = arrayList.toArray(new br[0]);
            return arrobject;
        }
        finally {
            int n3;
            if (h2.d() != ay.I && 0 != (n3 = bn.g.a(h2.d()))) {
                throw new dy(n3);
            }
        }
    }

    public static bp g() {
        v v2 = new v();
        int n2 = bn.g.a(null, null, null, null, 0, v2);
        if (0 != n2) {
            throw new dy(n2);
        }
        bp bp2 = new bp();
        bp2.b = v2.a.b.toString();
        bp2.c = v2.a.c;
        bp2.h = v2.a.K.toString();
        bp2.f = v2.a.H.toString();
        bp2.d = v2.a.F;
        bp2.e = v2.a.G.toString();
        bp2.g = v2.a.I;
        bp2.a = v2.a.a.toString();
        n2 = bn.g.a(v2.a.g());
        if (0 != n2) {
            throw new dy(n2);
        }
        return bp2;
    }

    public static bq[] h() {
        return bo.h(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static bq[] h(String string) {
        x x2 = new x();
        g g2 = new g();
        int n2 = bn.g.a(string, new at(63L), x2, g2);
        if (0 != n2) {
            throw new dy(n2);
        }
        try {
            int n3 = g2.d().intValue();
            ArrayList<bq> arrayList = new ArrayList<bq>(n3);
            for (s s2 : x2.f(n3)) {
                bq bq2 = new bq();
                bq2.b = s2.b.toString();
                bq2.a = s2.a.toString();
                bq2.c = s2.I;
                bq2.d = b.b(s2.I);
                bq2.e = s2.J;
                bq2.f = bz.a(s2.J);
                bq.a(bq2, s2.c.intValue());
                arrayList.add(bq2);
            }
            Object[] arrobject = arrayList.toArray(new bq[0]);
            return arrobject;
        }
        finally {
            n2 = bn.g.a(x2.g());
            if (0 != n2) {
                throw new dy(n2);
            }
        }
    }

    public static bu i(String string) {
        return bo.d(string, bo.a());
    }

    public static bu d(String string, String string2) {
        h h2 = new h();
        int n2 = -1;
        try {
            n2 = bn.g.a(bo.a(), string, 23, h2);
            if (n2 == 0) {
                ap ap2 = new ap(h2.d());
                bu bu2 = new bu();
                bu2.b = ap2.c.toString();
                bu2.f = ap2.F;
                bu2.c = ap2.b.toString();
                bu2.a = ap2.a.toString();
                bu2.d = b.b(ap2.G);
                bu2.e = ap2.G;
                bu bu3 = bu2;
                return bu3;
            }
            throw new dy(n2);
        }
        finally {
            if (h2.d() != ay.I) {
                bn.g.a(h2.d());
            }
        }
    }
}

