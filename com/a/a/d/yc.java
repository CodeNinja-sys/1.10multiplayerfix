/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.yj;
import java.lang.reflect.Array;
import java.util.Collection;

public final class yc {
    static final Object[] a = new Object[0];

    private yc() {
    }

    public static Object[] a(Class class_, int n2) {
        return (Object[])Array.newInstance(class_, n2);
    }

    public static Object[] a(Object[] arrobject, int n2) {
        return yj.a(arrobject, n2);
    }

    public static Object[] a(Object[] arrobject, Object[] arrobject2, Class class_) {
        Object[] arrobject3 = yc.a(class_, arrobject.length + arrobject2.length);
        System.arraycopy(arrobject, 0, arrobject3, 0, arrobject.length);
        System.arraycopy(arrobject2, 0, arrobject3, arrobject.length, arrobject2.length);
        return arrobject3;
    }

    public static Object[] a(Object object, Object[] arrobject) {
        Object[] arrobject2 = yc.a(arrobject, arrobject.length + 1);
        arrobject2[0] = object;
        System.arraycopy(arrobject, 0, arrobject2, 1, arrobject.length);
        return arrobject2;
    }

    public static Object[] a(Object[] arrobject, Object object) {
        Object[] arrobject2 = yc.b(arrobject, arrobject.length + 1);
        arrobject2[arrobject.length] = object;
        return arrobject2;
    }

    static Object[] b(Object[] arrobject, int n2) {
        Object[] arrobject2 = yc.a(arrobject, n2);
        System.arraycopy(arrobject, 0, arrobject2, 0, Math.min(arrobject.length, n2));
        return arrobject2;
    }

    static Object[] a(Collection collection, Object[] arrobject) {
        int n2 = collection.size();
        if (arrobject.length < n2) {
            arrobject = yc.a(arrobject, n2);
        }
        yc.a((Iterable)collection, arrobject);
        if (arrobject.length > n2) {
            arrobject[n2] = null;
        }
        return arrobject;
    }

    static Object[] a(Object[] arrobject, int n2, int n3, Object[] arrobject2) {
        cl.a(n2, n2 + n3, arrobject.length);
        if (arrobject2.length < n3) {
            arrobject2 = yc.a(arrobject2, n3);
        } else if (arrobject2.length > n3) {
            arrobject2[n3] = null;
        }
        System.arraycopy(arrobject, n2, arrobject2, 0, n3);
        return arrobject2;
    }

    static Object[] a(Collection collection) {
        return yc.a((Iterable)collection, new Object[collection.size()]);
    }

    static Object[] a(Object[] arrobject, int n2, int n3) {
        cl.a(n2, n2 + n3, arrobject.length);
        if (n3 == 0) {
            return a;
        }
        Object[] arrobject2 = new Object[n3];
        System.arraycopy(arrobject, n2, arrobject2, 0, n3);
        return arrobject2;
    }

    private static Object[] a(Iterable iterable, Object[] arrobject) {
        int n2 = 0;
        for (Object t2 : iterable) {
            arrobject[n2++] = t2;
        }
        return arrobject;
    }

    static void b(Object[] arrobject, int n2, int n3) {
        Object object = arrobject[n2];
        arrobject[n2] = arrobject[n3];
        arrobject[n3] = object;
    }

    static Object[] a(Object ... arrobject) {
        return yc.c(arrobject, arrobject.length);
    }

    static Object[] c(Object[] arrobject, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            yc.a(arrobject[i2], i2);
        }
        return arrobject;
    }

    static Object a(Object object, int n2) {
        if (object == null) {
            throw new NullPointerException("at index " + n2);
        }
        return object;
    }
}

