/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.c.i.al;

abstract class ak {
    static final int a = -1;
    private final ConcurrentMap b = new ConcurrentHashMap(7);
    private static final ConcurrentMap c = new ConcurrentHashMap(7);

    ak() {
    }

    public Format a() {
        return this.a(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public Format c(String string, TimeZone timeZone, Locale locale) {
        Format format;
        al al2;
        Format format2;
        if (string == null) {
            throw new NullPointerException("pattern must not be null");
        }
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        if ((format2 = (Format)this.b.get(al2 = new al(string, timeZone, locale))) == null && (format = this.b.putIfAbsent(al2, format2 = this.b(string, timeZone, locale))) != null) {
            format2 = format;
        }
        return format2;
    }

    protected abstract Format b(String var1, TimeZone var2, Locale var3);

    private Format a(Integer n2, Integer n3, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String string = ak.a(n2, n3, locale);
        return this.c(string, timeZone, locale);
    }

    Format a(int n2, int n3, TimeZone timeZone, Locale locale) {
        return this.a((Integer)n2, (Integer)n3, timeZone, locale);
    }

    Format a(int n2, TimeZone timeZone, Locale locale) {
        return this.a((Integer)n2, null, timeZone, locale);
    }

    Format b(int n2, TimeZone timeZone, Locale locale) {
        return this.a(null, (Integer)n2, timeZone, locale);
    }

    static String a(Integer n2, Integer n3, Locale locale) {
        al al2 = new al(n2, n3, locale);
        String string = (String)c.get(al2);
        if (string == null) {
            try {
                DateFormat dateFormat = n2 == null ? DateFormat.getTimeInstance(n3, locale) : (n3 == null ? DateFormat.getDateInstance(n2, locale) : DateFormat.getDateTimeInstance(n2, n3, locale));
                string = ((SimpleDateFormat)dateFormat).toPattern();
                String string2 = c.putIfAbsent(al2, string);
                if (string2 != null) {
                    string = string2;
                }
            }
            catch (ClassCastException classCastException) {
                throw new IllegalArgumentException("No date time pattern for locale: " + locale);
            }
        }
        return string;
    }
}

