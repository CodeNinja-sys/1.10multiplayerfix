/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.g.am;
import com.a.a.g.an;
import com.a.a.g.aq;
import com.a.a.g.ar;
import com.a.a.g.as;
import com.a.a.g.at;
import com.a.a.g.au;
import com.a.a.g.av;
import com.a.a.g.aw;
import com.a.a.g.ax;
import com.a.a.g.ay;
import com.a.a.g.az;
import com.a.a.g.bg;
import com.a.a.g.bi;
import com.a.a.g.bl;
import com.a.a.g.r;
import java.util.Iterator;

public final class ak {
    private static final int a = (int)System.currentTimeMillis();

    public static ai a(int n2) {
        int n3 = ak.d(n2);
        if (n3 == 32) {
            return av.b;
        }
        if (n3 <= 128) {
            return au.b;
        }
        int n4 = (n3 + 127) / 128;
        ai[] arrai = new ai[n4];
        arrai[0] = au.b;
        int n5 = a;
        for (int i2 = 1; i2 < n4; ++i2) {
            arrai[i2] = ak.c(n5 += 1500450271);
        }
        return new aq(arrai);
    }

    public static ai b(int n2) {
        return new bi(n2);
    }

    public static ai a() {
        return av.a;
    }

    public static ai c(int n2) {
        return new bg(n2);
    }

    public static ai b() {
        return au.a;
    }

    public static ai c() {
        return az.a;
    }

    public static ai a(long l2, long l3) {
        return new bl(2, 4, l2, l3);
    }

    public static ai d() {
        return at.a;
    }

    public static ai e() {
        return aw.a;
    }

    public static ai f() {
        return ax.a;
    }

    public static ai g() {
        return ay.a;
    }

    public static ai h() {
        return ar.a;
    }

    public static ai i() {
        return am.a;
    }

    private static ai b(an an2, String string) {
        return new r(an2, an.a(an2), string);
    }

    public static int a(ae ae2, int n2) {
        return ak.a(ae2.d(), n2);
    }

    public static int a(long l2, int n2) {
        int n3;
        cl.a(n2 > 0, "buckets must be positive: %s", new Object[]{n2});
        as as2 = new as(l2);
        int n4 = 0;
        while ((n3 = (int)((double)(n4 + 1) / as2.a())) >= 0 && n3 < n2) {
            n4 = n3;
        }
        return n4;
    }

    public static ae a(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        cl.a(iterator.hasNext(), (Object)"Must be at least 1 hash code to combine.");
        int n2 = ((ae)iterator.next()).a();
        byte[] arrby = new byte[n2 / 8];
        for (ae ae2 : iterable) {
            byte[] arrby2 = ae2.e();
            cl.a(arrby2.length == arrby.length, (Object)"All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < arrby2.length; ++i2) {
                arrby[i2] = (byte)(arrby[i2] * 37 ^ arrby2[i2]);
            }
        }
        return ae.b(arrby);
    }

    public static ae b(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        cl.a(iterator.hasNext(), (Object)"Must be at least 1 hash code to combine.");
        byte[] arrby = new byte[((ae)iterator.next()).a() / 8];
        for (ae ae2 : iterable) {
            byte[] arrby2 = ae2.e();
            cl.a(arrby2.length == arrby.length, (Object)"All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < arrby2.length; ++i2) {
                int n2 = i2;
                arrby[n2] = (byte)(arrby[n2] + arrby2[i2]);
            }
        }
        return ae.b(arrby);
    }

    static int d(int n2) {
        cl.a(n2 > 0, (Object)"Number of bits must be positive");
        return n2 + 31 & 0xFFFFFFE0;
    }

    private ak() {
    }

    static /* synthetic */ int j() {
        return a;
    }

    static /* synthetic */ ai a(an an2, String string) {
        return ak.b(an2, string);
    }
}

