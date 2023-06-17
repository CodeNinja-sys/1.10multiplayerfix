/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.a.a.c.an;
import com.a.a.c.f;
import com.c.c.b.i;
import com.c.c.b.m;
import com.c.c.e.t;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class s {
    public static an a = f.a().a(60L, TimeUnit.MINUTES).a(new t());
    private static final d b = org.apache.logging.log4j.c.c();
    private static final int c = 60;
    private static final int d = 3600;
    private static final int e = 86400;

    public static void a(String string) {
        try {
            URI uRI = new URI(string);
            Class<?> class_ = Class.forName("java.awt.Desktop");
            Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            class_.getMethod("browse", URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            b.b("Couldn't open link");
        }
    }

    public static String a(Long l2) {
        if (l2 < 0L) {
            return "right now";
        }
        long l3 = l2 / 1000L;
        if (l3 < 60L) {
            return (l3 == 1L ? "1 second" : l3 + " seconds") + " ago";
        }
        if (l3 < 3600L) {
            long l4 = l3 / 60L;
            return (l4 == 1L ? "1 minute" : l4 + " minutes") + " ago";
        }
        if (l3 < 86400L) {
            long l5 = l3 / 3600L;
            return (l5 == 1L ? "1 hour" : l5 + " hours") + " ago";
        }
        long l6 = l3 / 86400L;
        return (l6 == 1L ? "1 day" : l6 + " days") + " ago";
    }

    public static boolean a(com.c.c.b.s s2) {
        return s2.n && s2.m.equals("1.8.9");
    }

    public static boolean a(i i2) {
        return i2.u != null && i2.u.equals("1.8.9") && !i2.n.equals((Object)m.a);
    }
}

