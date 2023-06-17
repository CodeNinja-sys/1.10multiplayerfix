/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.h;

public final class g {
    private static ConcurrentMap a = new ConcurrentHashMap();

    private g() {
    }

    public static f a(String string) {
        a.putIfAbsent(string, new h(string));
        return (f)a.get(string);
    }

    public static f a(String string, String string2) {
        f f2 = (f)a.get(string2);
        if (f2 == null) {
            throw new IllegalArgumentException("Parent Marker " + string2 + " has not been defined");
        }
        return g.a(string, f2);
    }

    public static f a(String string, f f2) {
        a.putIfAbsent(string, new h(string, f2));
        return (f)a.get(string);
    }
}

