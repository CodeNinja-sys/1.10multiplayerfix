/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.e;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.e.c;

public final class f
implements c {
    private final Map a;

    f(Map map) {
        this.a = new ConcurrentHashMap(map);
    }

    public Object c(String string) {
        if (string == null) {
            return null;
        }
        return this.a.get(string.toLowerCase(Locale.US));
    }

    public String toString() {
        return this.a.toString();
    }
}

