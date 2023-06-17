/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Date;
import java.util.TimeZone;
import org.apache.a.c.f.b;
import org.apache.a.i.d.t;

public final class u {
    public static final String a = "EEE, dd MMM yyyy HH:mm:ss zzz";
    public static final String b = "EEE, dd-MMM-yy HH:mm:ss zzz";
    public static final String c = "EEE MMM d HH:mm:ss yyyy";
    public static final TimeZone d = TimeZone.getTimeZone("GMT");

    public static Date a(String string) {
        return u.a(string, null, null);
    }

    public static Date a(String string, String[] arrstring) {
        return u.a(string, arrstring, null);
    }

    public static Date a(String string, String[] arrstring, Date date) {
        Date date2 = org.apache.a.c.f.b.a(string, arrstring, date);
        if (date2 == null) {
            throw new t("Unable to parse the date " + string);
        }
        return date2;
    }

    public static String a(Date date) {
        return org.apache.a.c.f.b.a(date);
    }

    public static String a(Date date, String string) {
        return org.apache.a.c.f.b.a(date, string);
    }

    private u() {
    }
}

