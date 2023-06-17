/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.lang.reflect.Method;

public final class h {
    private static final Method a = h.a();

    private static Method a() {
        try {
            Class[] arrclass = new Class[]{Throwable.class};
            return Throwable.class.getMethod("initCause", arrclass);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public static void a(Throwable throwable, Throwable throwable2) {
        if (a != null) {
            try {
                a.invoke(throwable, throwable2);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private h() {
    }
}

