/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import org.apache.logging.log4j.core.d.c;
import org.apache.logging.log4j.core.d.f;
import org.apache.logging.log4j.core.d.i;
import org.apache.logging.log4j.core.d.w;
import org.apache.logging.log4j.d.d;

public final class g {
    public static final String a = "log4j.Clock";
    private static final d b = d.k();

    private g() {
    }

    public static f a() {
        return g.b();
    }

    private static f b() {
        String string = System.getProperty(a);
        if (string == null || "SystemClock".equals(string)) {
            b.a("Using default SystemClock for timestamps");
            return new w();
        }
        if (c.class.getName().equals(string) || "CachedClock".equals(string)) {
            b.a("Using specified CachedClock for timestamps");
            return c.a();
        }
        if (i.class.getName().equals(string) || "CoarseCachedClock".equals(string)) {
            b.a("Using specified CoarseCachedClock for timestamps");
            return i.a();
        }
        try {
            f f2 = (f)Class.forName(string).newInstance();
            b.a("Using {} for timestamps", new Object[]{string});
            return f2;
        }
        catch (Exception exception) {
            String string2 = "Could not create {}: {}, using default SystemClock for timestamps";
            b.b("Could not create {}: {}, using default SystemClock for timestamps", string, exception);
            return new w();
        }
    }
}

