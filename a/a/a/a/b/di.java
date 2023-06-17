/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cd;
import a.a.a.a.b.ch;
import a.a.a.a.b.cr;
import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.dj;
import a.a.a.a.b.dk;
import a.a.a.a.b.dl;
import a.a.a.a.b.dm;
import a.a.a.a.b.dn;
import a.a.a.a.b.do;
import a.a.a.a.b.dp;
import a.a.a.a.b.dq;
import a.a.a.a.b.dr;
import a.a.a.a.b.ds;
import a.a.a.a.b.dt;
import a.a.a.a.b.du;
import a.a.a.a.b.dv;
import java.util.Iterator;
import java.util.ListIterator;

public class di {
    public static final dk a = new dk();

    private di() {
    }

    public static dv a(long l2) {
        return new dq(l2);
    }

    public static dv a(long[] arrl, int n2, int n3) {
        ch.e(arrl, n2, n3);
        return new dj(arrl, n2, n3);
    }

    public static dv a(long[] arrl) {
        return new dj(arrl, 0, arrl.length);
    }

    public static int a(dh dh2, long[] arrl, int n2, int n3) {
        if (n3 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n3 + ") is negative");
        }
        if (n2 < 0 || n2 + n3 > arrl.length) {
            throw new IllegalArgumentException();
        }
        int n4 = n3;
        while (n4-- != 0 && dh2.hasNext()) {
            arrl[n2++] = dh2.a();
        }
        return n3 - n4 - 1;
    }

    public static int a(dh dh2, long[] arrl) {
        return di.a(dh2, arrl, 0, arrl.length);
    }

    public static long[] a(dh dh2, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n2 + ") is negative");
        }
        long[] arrl = new long[16];
        int n3 = 0;
        while (n2-- != 0 && dh2.hasNext()) {
            if (n3 == arrl.length) {
                arrl = ch.b(arrl, n3 + 1);
            }
            arrl[n3++] = dh2.a();
        }
        return ch.c(arrl, n3);
    }

    public static long[] a(dh dh2) {
        return di.a(dh2, Integer.MAX_VALUE);
    }

    public static int a(dh dh2, cs cs2, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n2 + ") is negative");
        }
        int n3 = n2;
        while (n3-- != 0 && dh2.hasNext()) {
            cs2.e(dh2.a());
        }
        return n2 - n3 - 1;
    }

    public static long a(dh dh2, cs cs2) {
        long l2 = 0L;
        while (dh2.hasNext()) {
            cs2.e(dh2.a());
            ++l2;
        }
        return l2;
    }

    public static int b(dh dh2, cs cs2, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n2 + ") is negative");
        }
        int n3 = n2;
        while (n3-- != 0 && dh2.hasNext()) {
            cs2.e(dh2.a());
        }
        return n2 - n3 - 1;
    }

    public static int b(dh dh2, cs cs2) {
        return di.b(dh2, cs2, Integer.MAX_VALUE);
    }

    public static du b(dh dh2, int n2) {
        cd cd2 = new cd();
        di.b(dh2, cd2, n2);
        cd2.m();
        return cd2;
    }

    public static du b(dh dh2) {
        return di.b(dh2, Integer.MAX_VALUE);
    }

    public static dh a(Iterator iterator) {
        if (iterator instanceof dh) {
            return (dh)iterator;
        }
        return new do(iterator);
    }

    public static dv a(ListIterator listIterator) {
        if (listIterator instanceof dv) {
            return (dv)listIterator;
        }
        return new dp(listIterator);
    }

    public static cr a(long l2, long l3) {
        return new dm(l2, l3);
    }

    public static dh a(dh[] arrdh) {
        return di.a(arrdh, 0, arrdh.length);
    }

    public static dh a(dh[] arrdh, int n2, int n3) {
        return new dn(arrdh, n2, n3);
    }

    public static dh c(dh dh2) {
        return new ds(dh2);
    }

    public static cr a(cr cr2) {
        return new dr(cr2);
    }

    public static dv a(dv dv2) {
        return new dt(dv2);
    }

    public static dh a(a.a.a.a.a.dh dh2) {
        return new dl(dh2);
    }
}

