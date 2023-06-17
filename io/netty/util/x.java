/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.ag;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.y;
import io.netty.util.z;

public final class x {
    private static final g a = h.a(x.class);

    public static Object a(Object object) {
        if (object instanceof z) {
            return ((z)object).ae();
        }
        return object;
    }

    public static Object a(Object object, int n2) {
        if (object instanceof z) {
            return ((z)object).J(n2);
        }
        return object;
    }

    public static boolean b(Object object) {
        if (object instanceof z) {
            return ((z)object).ad();
        }
        return false;
    }

    public static boolean b(Object object, int n2) {
        if (object instanceof z) {
            return ((z)object).I(n2);
        }
        return false;
    }

    public static void c(Object object) {
        try {
            x.b(object);
        }
        catch (Throwable throwable) {
            a.d("Failed to release a message: {}", object, (Object)throwable);
        }
    }

    public static void c(Object object, int n2) {
        block2: {
            try {
                x.b(object, n2);
            }
            catch (Throwable throwable) {
                if (!a.f()) break block2;
                a.d("Failed to release a message: {} (decrement: {})", object, n2, throwable);
            }
        }
    }

    public static Object d(Object object) {
        return x.d(object, 1);
    }

    public static Object d(Object object, int n2) {
        if (object instanceof z) {
            ag.a(Thread.currentThread(), new y((z)object, n2));
        }
        return object;
    }

    private x() {
    }

    static /* synthetic */ g a() {
        return a;
    }
}

