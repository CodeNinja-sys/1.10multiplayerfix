/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.c.i.ak;
import org.apache.commons.c.i.b;
import org.apache.commons.c.i.c;
import org.apache.commons.c.i.i;
import org.apache.commons.c.i.j;
import org.apache.commons.c.i.t;

public class h
extends Format
implements b,
c {
    private static final long e = 2L;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private static final ak f = new i();
    private final t g;
    private final j h;

    public static h d() {
        return (h)f.a();
    }

    public static h b(String string) {
        return (h)f.c(string, null, null);
    }

    public static h a(String string, TimeZone timeZone) {
        return (h)f.c(string, timeZone, null);
    }

    public static h a(String string, Locale locale) {
        return (h)f.c(string, null, locale);
    }

    public static h a(String string, TimeZone timeZone, Locale locale) {
        return (h)f.c(string, timeZone, locale);
    }

    public static h a(int n2) {
        return (h)f.a(n2, null, null);
    }

    public static h a(int n2, Locale locale) {
        return (h)f.a(n2, null, locale);
    }

    public static h a(int n2, TimeZone timeZone) {
        return (h)f.a(n2, timeZone, null);
    }

    public static h a(int n2, TimeZone timeZone, Locale locale) {
        return (h)f.a(n2, timeZone, locale);
    }

    public static h b(int n2) {
        return (h)f.b(n2, null, null);
    }

    public static h b(int n2, Locale locale) {
        return (h)f.b(n2, null, locale);
    }

    public static h b(int n2, TimeZone timeZone) {
        return (h)f.b(n2, timeZone, null);
    }

    public static h b(int n2, TimeZone timeZone, Locale locale) {
        return (h)f.b(n2, timeZone, locale);
    }

    public static h a(int n2, int n3) {
        return (h)f.a(n2, n3, (TimeZone)null, (Locale)null);
    }

    public static h a(int n2, int n3, Locale locale) {
        return (h)f.a(n2, n3, (TimeZone)null, locale);
    }

    public static h a(int n2, int n3, TimeZone timeZone) {
        return org.apache.commons.c.i.h.a(n2, n3, timeZone, null);
    }

    public static h a(int n2, int n3, TimeZone timeZone, Locale locale) {
        return (h)f.a(n2, n3, timeZone, locale);
    }

    protected h(String string, TimeZone timeZone, Locale locale) {
        this(string, timeZone, locale, null);
    }

    protected h(String string, TimeZone timeZone, Locale locale, Date date) {
        this.g = new t(string, timeZone, locale);
        this.h = new j(string, timeZone, locale, date);
    }

    @Override
    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.g.format(object, stringBuffer, fieldPosition);
    }

    @Override
    public String a(long l2) {
        return this.g.a(l2);
    }

    @Override
    public String a(Date date) {
        return this.g.a(date);
    }

    @Override
    public String a(Calendar calendar) {
        return this.g.a(calendar);
    }

    @Override
    public StringBuffer a(long l2, StringBuffer stringBuffer) {
        return this.g.a(l2, stringBuffer);
    }

    @Override
    public StringBuffer a(Date date, StringBuffer stringBuffer) {
        return this.g.a(date, stringBuffer);
    }

    @Override
    public StringBuffer a(Calendar calendar, StringBuffer stringBuffer) {
        return this.g.a(calendar, stringBuffer);
    }

    @Override
    public Date a(String string) {
        return this.h.a(string);
    }

    @Override
    public Date a(String string, ParsePosition parsePosition) {
        return this.h.a(string, parsePosition);
    }

    @Override
    public Object parseObject(String string, ParsePosition parsePosition) {
        return this.h.parseObject(string, parsePosition);
    }

    @Override
    public String a() {
        return this.g.a();
    }

    @Override
    public TimeZone b() {
        return this.g.b();
    }

    @Override
    public Locale c() {
        return this.g.c();
    }

    public int e() {
        return this.g.e();
    }

    public boolean equals(Object object) {
        if (!(object instanceof h)) {
            return false;
        }
        h h2 = (h)object;
        return this.g.equals(h2.g);
    }

    public int hashCode() {
        return this.g.hashCode();
    }

    public String toString() {
        return "FastDateFormat[" + this.g.a() + "," + this.g.c() + "," + this.g.b().getID() + "]";
    }

    protected StringBuffer b(Calendar calendar, StringBuffer stringBuffer) {
        return this.g.b(calendar, stringBuffer);
    }
}

