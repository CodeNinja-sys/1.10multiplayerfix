/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

public final class a {
    private a() {
    }

    public static Object a(Object object, String string) {
        if (object == null) {
            throw new NullPointerException(string + " is null");
        }
        return object;
    }
}

