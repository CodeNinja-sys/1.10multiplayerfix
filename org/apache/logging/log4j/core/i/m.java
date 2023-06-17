/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

final class m
extends DateFormat {
    public static final int a = -2;
    public static final int b = -1;
    private static final long c = -1253877934598423628L;
    private static final String d = "0123456789";
    private static final int e = 654;
    private static final String f = "654";
    private static final int g = 987;
    private static final String h = "987";
    private static final String i = "000";
    private static final int j = 50;
    private static final int k = 1000;
    private static final int l = 100;
    private static final int m = 10;
    private static final long n = 1000L;
    private final DateFormat o;
    private int p;
    private long q;
    private final StringBuffer r = new StringBuffer(50);
    private final int s;
    private long t;
    private final Date u = new Date(0L);

    public m(DateFormat dateFormat, int n2) {
        if (dateFormat == null) {
            throw new IllegalArgumentException("dateFormat cannot be null");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("expiration must be non-negative");
        }
        this.o = dateFormat;
        this.s = n2;
        this.p = 0;
        this.t = Long.MIN_VALUE;
        this.q = Long.MIN_VALUE;
    }

    public static int a(long l2, String string, DateFormat dateFormat) {
        String string2;
        long l3 = l2 / 1000L * 1000L;
        if (l3 > l2) {
            l3 -= 1000L;
        }
        int n2 = (int)(l2 - l3);
        int n3 = 654;
        String string3 = f;
        if (n2 == 654) {
            n3 = 987;
            string3 = h;
        }
        if ((string2 = dateFormat.format(new Date(l3 + (long)n3))).length() != string.length()) {
            return -1;
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (string.charAt(i2) == string2.charAt(i2)) continue;
            StringBuffer stringBuffer = new StringBuffer("ABC");
            org.apache.logging.log4j.core.i.m.a(n2, stringBuffer, 0);
            String string4 = dateFormat.format(new Date(l3));
            if (string4.length() == string.length() && string3.regionMatches(0, string2, i2, string3.length()) && stringBuffer.toString().regionMatches(0, string, i2, string3.length()) && i.regionMatches(0, string4, i2, i.length())) {
                return i2;
            }
            return -1;
        }
        return -2;
    }

    @Override
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        this.a(date.getTime(), stringBuffer);
        return stringBuffer;
    }

    public StringBuffer a(long l2, StringBuffer stringBuffer) {
        if (l2 == this.t) {
            stringBuffer.append(this.r);
            return stringBuffer;
        }
        if (this.p != -1 && l2 < this.q + (long)this.s && l2 >= this.q && l2 < this.q + 1000L) {
            if (this.p >= 0) {
                org.apache.logging.log4j.core.i.m.a((int)(l2 - this.q), this.r, this.p);
            }
            this.t = l2;
            stringBuffer.append(this.r);
            return stringBuffer;
        }
        this.r.setLength(0);
        this.u.setTime(l2);
        this.r.append(this.o.format(this.u));
        stringBuffer.append(this.r);
        this.t = l2;
        this.q = this.t / 1000L * 1000L;
        if (this.q > this.t) {
            this.q -= 1000L;
        }
        if (this.p >= 0) {
            this.p = org.apache.logging.log4j.core.i.m.a(l2, this.r.toString(), this.o);
        }
        return stringBuffer;
    }

    private static void a(int n2, StringBuffer stringBuffer, int n3) {
        stringBuffer.setCharAt(n3, d.charAt(n2 / 100));
        stringBuffer.setCharAt(n3 + 1, d.charAt(n2 / 10 % 10));
        stringBuffer.setCharAt(n3 + 2, d.charAt(n2 % 10));
    }

    @Override
    public void setTimeZone(TimeZone timeZone) {
        this.o.setTimeZone(timeZone);
        this.t = Long.MIN_VALUE;
        this.q = Long.MIN_VALUE;
    }

    @Override
    public Date parse(String string, ParsePosition parsePosition) {
        return this.o.parse(string, parsePosition);
    }

    @Override
    public NumberFormat getNumberFormat() {
        return this.o.getNumberFormat();
    }

    public static int a(String string) {
        int n2 = string.indexOf(83);
        if (n2 >= 0 && n2 != string.lastIndexOf("SSS")) {
            return 1;
        }
        return 1000;
    }
}

