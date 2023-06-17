/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.c.i.h;

public class a {
    private static final TimeZone j = TimeZone.getTimeZone("GMT");
    public static final h a = org.apache.commons.c.i.h.b("yyyy-MM-dd'T'HH:mm:ss");
    public static final h b = org.apache.commons.c.i.h.b("yyyy-MM-dd'T'HH:mm:ssZZ");
    public static final h c = org.apache.commons.c.i.h.b("yyyy-MM-dd");
    public static final h d = org.apache.commons.c.i.h.b("yyyy-MM-ddZZ");
    public static final h e = org.apache.commons.c.i.h.b("'T'HH:mm:ss");
    public static final h f = org.apache.commons.c.i.h.b("'T'HH:mm:ssZZ");
    public static final h g = org.apache.commons.c.i.h.b("HH:mm:ss");
    public static final h h = org.apache.commons.c.i.h.b("HH:mm:ssZZ");
    public static final h i = org.apache.commons.c.i.h.a("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);

    public static String a(long l2, String string) {
        return org.apache.commons.c.i.a.a(new Date(l2), string, j, null);
    }

    public static String a(Date date, String string) {
        return org.apache.commons.c.i.a.a(date, string, j, null);
    }

    public static String a(long l2, String string, Locale locale) {
        return org.apache.commons.c.i.a.a(new Date(l2), string, j, locale);
    }

    public static String a(Date date, String string, Locale locale) {
        return org.apache.commons.c.i.a.a(date, string, j, locale);
    }

    public static String b(long l2, String string) {
        return org.apache.commons.c.i.a.a(new Date(l2), string, null, null);
    }

    public static String b(Date date, String string) {
        return org.apache.commons.c.i.a.a(date, string, null, null);
    }

    public static String a(Calendar calendar, String string) {
        return org.apache.commons.c.i.a.a(calendar, string, null, null);
    }

    public static String a(long l2, String string, TimeZone timeZone) {
        return org.apache.commons.c.i.a.a(new Date(l2), string, timeZone, null);
    }

    public static String a(Date date, String string, TimeZone timeZone) {
        return org.apache.commons.c.i.a.a(date, string, timeZone, null);
    }

    public static String a(Calendar calendar, String string, TimeZone timeZone) {
        return org.apache.commons.c.i.a.a(calendar, string, timeZone, null);
    }

    public static String b(long l2, String string, Locale locale) {
        return org.apache.commons.c.i.a.a(new Date(l2), string, null, locale);
    }

    public static String b(Date date, String string, Locale locale) {
        return org.apache.commons.c.i.a.a(date, string, null, locale);
    }

    public static String a(Calendar calendar, String string, Locale locale) {
        return org.apache.commons.c.i.a.a(calendar, string, null, locale);
    }

    public static String a(long l2, String string, TimeZone timeZone, Locale locale) {
        return org.apache.commons.c.i.a.a(new Date(l2), string, timeZone, locale);
    }

    public static String a(Date date, String string, TimeZone timeZone, Locale locale) {
        h h2 = org.apache.commons.c.i.h.a(string, timeZone, locale);
        return h2.a(date);
    }

    public static String a(Calendar calendar, String string, TimeZone timeZone, Locale locale) {
        h h2 = org.apache.commons.c.i.h.a(string, timeZone, locale);
        return h2.a(calendar);
    }
}

