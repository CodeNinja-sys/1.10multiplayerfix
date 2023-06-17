/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.c.a.e;

public class z
extends e {
    private static final long a = 2799598826487038726L;

    public z(Object object, Class ... arrclass) {
        super(z.a(object == null ? "null" : object.getClass().getName(), arrclass));
    }

    public z() {
    }

    public z(String string, Throwable throwable) {
        super(string, throwable);
    }

    public z(String string) {
        super(string);
    }

    public z(Throwable throwable) {
        super(throwable);
    }

    private static String a(String string, Class ... arrclass) {
        StringBuilder stringBuilder = new StringBuilder(string);
        if (arrclass != null && arrclass.length > 0) {
            Class class_;
            stringBuilder.append(" (expected: ").append(arrclass[0].getName());
            for (int i2 = 1; i2 < arrclass.length && (class_ = arrclass[i2]) != null; ++i2) {
                stringBuilder.append(", ").append(class_.getName());
            }
            stringBuilder.append(')');
        }
        return stringBuilder.toString();
    }
}

