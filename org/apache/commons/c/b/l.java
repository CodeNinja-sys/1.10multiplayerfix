/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.apache.commons.c.b.i;
import org.apache.commons.c.b.j;
import org.apache.commons.c.b.k;
import org.apache.commons.c.b.m;

public class l {
    private l() {
    }

    public static i a(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        l.e(executionException);
        return new i(executionException.getMessage(), executionException.getCause());
    }

    public static k b(ExecutionException executionException) {
        if (executionException == null || executionException.getCause() == null) {
            return null;
        }
        l.e(executionException);
        return new k(executionException.getMessage(), executionException.getCause());
    }

    public static void c(ExecutionException executionException) {
        i i2 = l.a(executionException);
        if (i2 != null) {
            throw i2;
        }
    }

    public static void d(ExecutionException executionException) {
        k k2 = l.b(executionException);
        if (k2 != null) {
            throw k2;
        }
    }

    static Throwable a(Throwable throwable) {
        if (throwable != null && !(throwable instanceof RuntimeException) && !(throwable instanceof Error)) {
            return throwable;
        }
        throw new IllegalArgumentException("Not a checked exception: " + throwable);
    }

    private static void e(ExecutionException executionException) {
        if (executionException.getCause() instanceof RuntimeException) {
            throw (RuntimeException)executionException.getCause();
        }
        if (executionException.getCause() instanceof Error) {
            throw (Error)executionException.getCause();
        }
    }

    public static Object a(j j2) {
        return j2 != null ? j2.a() : null;
    }

    public static Object b(j j2) {
        try {
            return l.a(j2);
        }
        catch (i i2) {
            throw new k(i2.getCause());
        }
    }

    public static Object a(ConcurrentMap concurrentMap, Object object, Object object2) {
        if (concurrentMap == null) {
            return null;
        }
        Object object3 = concurrentMap.putIfAbsent(object, object2);
        return object3 != null ? object3 : object2;
    }

    public static Object a(ConcurrentMap concurrentMap, Object object, j j2) {
        if (concurrentMap == null || j2 == null) {
            return null;
        }
        Object v2 = concurrentMap.get(object);
        if (v2 == null) {
            return l.a(concurrentMap, object, j2.a());
        }
        return v2;
    }

    public static Object b(ConcurrentMap concurrentMap, Object object, j j2) {
        try {
            return l.a(concurrentMap, object, j2);
        }
        catch (i i2) {
            throw new k(i2.getCause());
        }
    }

    public static Future a(Object object) {
        return new m(object);
    }
}

