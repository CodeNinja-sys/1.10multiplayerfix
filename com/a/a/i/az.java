/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.ay;
import com.a.a.i.ba;
import java.io.Closeable;
import java.lang.reflect.Method;

final class az
implements ba {
    static final az a = new az();
    static final Method b = az.b();

    az() {
    }

    static boolean a() {
        return b != null;
    }

    private static Method b() {
        try {
            return Throwable.class.getMethod("addSuppressed", Throwable.class);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @Override
    public void a(Closeable closeable, Throwable throwable, Throwable throwable2) {
        if (throwable == throwable2) {
            return;
        }
        try {
            b.invoke(throwable, throwable2);
        }
        catch (Throwable throwable3) {
            ay.a.a(closeable, throwable, throwable2);
        }
    }
}

