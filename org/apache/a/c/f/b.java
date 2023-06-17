/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.apache.a.c.f.c;
import org.apache.a.o.a;

public final class b {
    public static final String a = "EEE, dd MMM yyyy HH:mm:ss zzz";
    public static final String b = "EEE, dd-MMM-yy HH:mm:ss zzz";
    public static final String c = "EEE MMM d HH:mm:ss yyyy";
    private static final String[] e = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private static final Date f;
    public static final TimeZone d;

    public static Date a(String string) {
        return org.apache.a.c.f.b.a(string, null, null);
    }

    public static Date a(String string, String[] arrstring) {
        return org.apache.a.c.f.b.a(string, arrstring, null);
    }

    public static Date a(String string, String[] arrstring, Date date) {
        org.apache.a.o.a.a((Object)string, "Date value");
        String[] arrstring2 = arrstring != null ? arrstring : e;
        Date date2 = date != null ? date : f;
        String string2 = string;
        if (string2.length() > 1 && string2.startsWith("'") && string2.endsWith("'")) {
            string2 = string2.substring(1, string2.length() - 1);
        }
        for (String string3 : arrstring2) {
            SimpleDateFormat simpleDateFormat = org.apache.a.c.f.c.a(string3);
            simpleDateFormat.set2DigitYearStart(date2);
            ParsePosition parsePosition = new ParsePosition(0);
            Date date3 = simpleDateFormat.parse(string2, parsePosition);
            if (parsePosition.getIndex() == 0) continue;
            return date3;
        }
        return null;
    }

    public static String a(Date date) {
        return org.apache.a.c.f.b.a(date, a);
    }

    public static String a(Date date, String string) {
        org.apache.a.o.a.a(date, "Date");
        org.apache.a.o.a.a((Object)string, "Pattern");
        SimpleDateFormat simpleDateFormat = org.apache.a.c.f.c.a(string);
        return simpleDateFormat.format(date);
    }

    public static void a() {
        org.apache.a.c.f.c.a();
    }

    private b() {
    }

    static {
        d = TimeZone.getTimeZone("GMT");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(d);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        f = calendar.getTime();
    }
}

