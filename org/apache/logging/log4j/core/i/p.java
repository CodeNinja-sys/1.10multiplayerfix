/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.l;

public final class p
extends ac
implements l {
    private static final String b = "ABSOLUTE";
    private static final String c = "COMPACT";
    private static final String d = "HH:mm:ss,SSS";
    private static final String e = "DATE";
    private static final String f = "dd MMM yyyy HH:mm:ss,SSS";
    private static final String g = "ISO8601";
    private static final String h = "ISO8601_BASIC";
    private static final String i = "yyyy-MM-dd HH:mm:ss,SSS";
    private static final String j = "yyyyMMdd HHmmss,SSS";
    private static final String k = "yyyyMMddHHmmssSSS";
    private String l;
    private long m;
    private final SimpleDateFormat n;

    private p(String[] arrstring) {
        super("Date", "date");
        SimpleDateFormat simpleDateFormat;
        String string = arrstring == null || arrstring.length == 0 ? null : arrstring[0];
        String string2 = string == null || string.equalsIgnoreCase(g) ? i : (string.equalsIgnoreCase(h) ? j : (string.equalsIgnoreCase(b) ? d : (string.equalsIgnoreCase(e) ? f : (string.equalsIgnoreCase(c) ? k : string))));
        try {
            simpleDateFormat = new SimpleDateFormat(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.f("Could not instantiate SimpleDateFormat with pattern " + string, (Throwable)illegalArgumentException);
            simpleDateFormat = new SimpleDateFormat(i);
        }
        if (arrstring != null && arrstring.length > 1) {
            TimeZone timeZone = TimeZone.getTimeZone(arrstring[1]);
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.n = simpleDateFormat;
    }

    public static p a(String[] arrstring) {
        return new p(arrstring);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        long l2 = h2.g();
        p p2 = this;
        synchronized (p2) {
            if (l2 != this.m) {
                this.m = l2;
                this.l = this.n.format(l2);
            }
        }
        stringBuilder.append(this.l);
    }

    @Override
    public void a(StringBuilder stringBuilder, Object ... arrobject) {
        for (Object object : arrobject) {
            if (!(object instanceof Date)) continue;
            this.a(object, stringBuilder);
            break;
        }
    }

    @Override
    public void a(Object object, StringBuilder stringBuilder) {
        if (object instanceof Date) {
            this.a((Date)object, stringBuilder);
        }
        super.a(object, stringBuilder);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Date date, StringBuilder stringBuilder) {
        p p2 = this;
        synchronized (p2) {
            stringBuilder.append(this.n.format(date.getTime()));
        }
    }

    public String b() {
        return this.n.toPattern();
    }
}

