/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import org.apache.logging.log4j.core.c.a;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;

public final class n
extends a {
    private static final long d = 3600000L;
    private static final long e = 60000L;
    private static final long f = 1000L;
    private final long g;
    private final long h;
    private final TimeZone i;

    private n(long l2, long l3, TimeZone timeZone, e e2, e e3) {
        super(e2, e3);
        this.g = l2;
        this.h = l3;
        this.i = timeZone;
    }

    @Override
    public e a(h h2) {
        Calendar calendar = Calendar.getInstance(this.i);
        calendar.setTimeInMillis(h2.g());
        long l2 = (long)calendar.get(11) * 3600000L + (long)calendar.get(12) * 60000L + (long)calendar.get(13) * 1000L + (long)calendar.get(14);
        return l2 >= this.g && l2 < this.h ? this.b : this.c;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("start=").append(this.g);
        stringBuilder.append(", end=").append(this.h);
        stringBuilder.append(", timezone=").append(this.i.toString());
        return stringBuilder.toString();
    }

    public static n a(String string, String string2, String string3, String string4, String string5) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        long l2 = 0L;
        if (string != null) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                l2 = simpleDateFormat.parse(string).getTime();
            }
            catch (ParseException parseException) {
                a.f("Error parsing start value " + string, (Throwable)parseException);
            }
        }
        long l3 = Long.MAX_VALUE;
        if (string2 != null) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                l3 = simpleDateFormat.parse(string2).getTime();
            }
            catch (ParseException parseException) {
                a.f("Error parsing start value " + string2, (Throwable)parseException);
            }
        }
        TimeZone timeZone = string3 == null ? TimeZone.getDefault() : TimeZone.getTimeZone(string3);
        e e2 = org.apache.logging.log4j.core.e.a(string4, org.apache.logging.log4j.core.e.b);
        e e3 = org.apache.logging.log4j.core.e.a(string5, org.apache.logging.log4j.core.e.c);
        return new n(l2, l3, timeZone, e2, e3);
    }
}

