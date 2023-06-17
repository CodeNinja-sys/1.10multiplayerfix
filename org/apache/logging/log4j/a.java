/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j;

import org.apache.logging.log4j.a.y;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public final class a {
    private static final String b = "EventLogger";
    public static final f a = g.a("EVENT");
    private static final String c = a.class.getName();
    private static org.apache.logging.log4j.c.b d;

    private a() {
    }

    public static void a(y y2) {
        d.a(a, c, org.apache.logging.log4j.b.a, y2, null);
    }

    public static void a(y y2, b b2) {
        d.a(a, c, b2, y2, null);
    }

    static {
        d d2 = org.apache.logging.log4j.c.b(b);
        if (!(d2 instanceof org.apache.logging.log4j.c.a)) {
            throw new e("Logger returned must be based on AbstractLogger");
        }
        d = new org.apache.logging.log4j.c.b((org.apache.logging.log4j.c.a)d2, b, null);
    }
}

