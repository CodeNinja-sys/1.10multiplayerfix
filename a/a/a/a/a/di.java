/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cd;
import a.a.a.a.a.ch;
import a.a.a.a.a.cr;
import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.dj;
import a.a.a.a.a.dk;
import a.a.a.a.a.dl;
import a.a.a.a.a.dm;
import a.a.a.a.a.dn;
import a.a.a.a.a.do;
import a.a.a.a.a.dp;
import a.a.a.a.a.dq;
import a.a.a.a.a.dr;
import a.a.a.a.a.ds;
import a.a.a.a.a.dt;
import a.a.a.a.a.du;
import java.util.Iterator;
import java.util.ListIterator;

public class di {
    public static final dk a = new dk();

    private di() {
    }

    public static du a(int n2) {
        return new dp(n2);
    }

    public static du a(int[] arrn, int n2, int n3) {
        ch.e(arrn, n2, n3);
        return new dj(arrn, n2, n3);
    }

    public static du a(int[] arrn) {
        return new dj(arrn, 0, arrn.length);
    }

    public static int a(dh dh2, int[] arrn, int n2, int n3) {
        if (n3 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n3 + ") is negative");
        }
        if (n2 < 0 || n2 + n3 > arrn.length) {
            throw new IllegalArgumentException();
        }
        int n4 = n3;
        while (n4-- != 0 && dh2.hasNext()) {
            arrn[n2++] = dh2.a();
        }
        return n3 - n4 - 1;
    }

    public static int a(dh dh2, int[] arrn) {
        return di.a(dh2, arrn, 0, arrn.length);
    }

    public static int[] a(dh dh2, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n2 + ") is negative");
        }
        int[] arrn = new int[16];
        int n3 = 0;
        while (n2-- != 0 && dh2.hasNext()) {
            if (n3 == arrn.length) {
                arrn = ch.b(arrn, n3 + 1);
            }
            arrn[n3++] = dh2.a();
        }
        return ch.c(arrn, n3);
    }

    public static int[] a(dh dh2) {
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

    public static dt b(dh dh2, int n2) {
        cd cd2 = new cd();
        di.b(dh2, cd2, n2);
        cd2.m();
        return cd2;
    }

    public static dt b(dh dh2) {
        return di.b(dh2, Integer.MAX_VALUE);
    }

    public static dh a(Iterator iterator) {
        if (iterator instanceof dh) {
            return (dh)iterator;
        }
        return new dn(iterator);
    }

    public static du a(ListIterator listIterator) {
        if (listIterator instanceof du) {
            return (du)listIterator;
        }
        return new do(listIterator);
    }

    public static du a(int n2, int n3) {
        return new dl(n2, n3);
    }

    public static dh a(dh[] arrdh) {
        return di.a(arrdh, 0, arrdh.length);
    }

    public static dh a(dh[] arrdh, int n2, int n3) {
        return new dm(arrdh, n2, n3);
    }

    public static dh c(dh dh2) {
        return new dr(dh2);
    }

    public static cr a(cr cr2) {
        return new dq(cr2);
    }

    public static du a(du du2) {
        return new ds(du2);
    }
}

