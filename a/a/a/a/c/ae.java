/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.af;
import a.a.a.a.c.ag;
import a.a.a.a.c.ah;
import a.a.a.a.c.ai;
import a.a.a.a.c.aj;
import a.a.a.a.c.ak;
import a.a.a.a.c.al;
import a.a.a.a.c.am;
import a.a.a.a.c.an;
import a.a.a.a.c.ao;
import a.a.a.a.c.ap;
import a.a.a.a.c.k;
import a.a.a.a.c.o;
import a.a.a.a.c.v;
import a.a.a.a.c.w;
import java.util.Iterator;
import java.util.ListIterator;

public class ae {
    public static final ag a = new ag();

    private ae() {
    }

    public static ap a(Object object) {
        return new ak(object);
    }

    public static ap a(Object[] arrobject, int n2, int n3) {
        o.e(arrobject, n2, n3);
        return new af(arrobject, n2, n3);
    }

    public static ap a(Object[] arrobject) {
        return new af(arrobject, 0, arrobject.length);
    }

    public static int a(Iterator iterator, Object[] arrobject, int n2, int n3) {
        if (n3 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n3 + ") is negative");
        }
        if (n2 < 0 || n2 + n3 > arrobject.length) {
            throw new IllegalArgumentException();
        }
        int n4 = n3;
        while (n4-- != 0 && iterator.hasNext()) {
            arrobject[n2++] = iterator.next();
        }
        return n3 - n4 - 1;
    }

    public static int a(Iterator iterator, Object[] arrobject) {
        return ae.a(iterator, arrobject, 0, arrobject.length);
    }

    public static Object[] a(Iterator iterator, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n2 + ") is negative");
        }
        Object[] arrobject = new Object[16];
        int n3 = 0;
        while (n2-- != 0 && iterator.hasNext()) {
            if (n3 == arrobject.length) {
                arrobject = o.b(arrobject, n3 + 1);
            }
            arrobject[n3++] = iterator.next();
        }
        return o.c(arrobject, n3);
    }

    public static Object[] a(Iterator iterator) {
        return ae.a(iterator, Integer.MAX_VALUE);
    }

    public static int a(Iterator iterator, w w2, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n2 + ") is negative");
        }
        int n3 = n2;
        while (n3-- != 0 && iterator.hasNext()) {
            w2.add(iterator.next());
        }
        return n2 - n3 - 1;
    }

    public static long a(Iterator iterator, w w2) {
        long l2 = 0L;
        while (iterator.hasNext()) {
            w2.add(iterator.next());
            ++l2;
        }
        return l2;
    }

    public static int b(Iterator iterator, w w2, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n2 + ") is negative");
        }
        int n3 = n2;
        while (n3-- != 0 && iterator.hasNext()) {
            w2.add(iterator.next());
        }
        return n2 - n3 - 1;
    }

    public static int b(Iterator iterator, w w2) {
        return ae.b(iterator, w2, Integer.MAX_VALUE);
    }

    public static ao b(Iterator iterator, int n2) {
        k k2 = new k();
        ae.b(iterator, k2, n2);
        k2.h();
        return k2;
    }

    public static ao b(Iterator iterator) {
        return ae.b(iterator, Integer.MAX_VALUE);
    }

    public static ad c(Iterator iterator) {
        if (iterator instanceof ad) {
            return (ad)iterator;
        }
        return new ai(iterator);
    }

    public static ap a(ListIterator listIterator) {
        if (listIterator instanceof ap) {
            return (ap)listIterator;
        }
        return new aj(listIterator);
    }

    public static ad a(ad[] arrad) {
        return ae.a(arrad, 0, arrad.length);
    }

    public static ad a(ad[] arrad, int n2, int n3) {
        return new ah(arrad, n2, n3);
    }

    public static ad a(ad ad2) {
        return new am(ad2);
    }

    public static v a(v v2) {
        return new al(v2);
    }

    public static ap a(ap ap2) {
        return new an(ap2);
    }
}

