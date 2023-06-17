/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import org.apache.commons.c.i.j;
import org.apache.commons.c.i.q;

class s
extends q {
    private final String a;
    private final SortedMap b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g = 4;

    s(Locale locale) {
        super(null);
        String[][] arrstring = DateFormatSymbols.getInstance(locale).getZoneStrings();
        for (String[] arrstring2 : arrstring) {
            if (arrstring2[0].startsWith("GMT")) continue;
            TimeZone timeZone = TimeZone.getTimeZone(arrstring2[0]);
            if (!this.b.containsKey(arrstring2[1])) {
                this.b.put(arrstring2[1], timeZone);
            }
            if (!this.b.containsKey(arrstring2[2])) {
                this.b.put(arrstring2[2], timeZone);
            }
            if (!timeZone.useDaylightTime()) continue;
            if (!this.b.containsKey(arrstring2[3])) {
                this.b.put(arrstring2[3], timeZone);
            }
            if (this.b.containsKey(arrstring2[4])) continue;
            this.b.put(arrstring2[4], timeZone);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
        for (String string : this.b.keySet()) {
            j.a(stringBuilder, string, false).append('|');
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ')');
        this.a = stringBuilder.toString();
    }

    @Override
    boolean a(j j2, StringBuilder stringBuilder) {
        stringBuilder.append(this.a);
        return true;
    }

    @Override
    void a(j j2, Calendar calendar, String string) {
        TimeZone timeZone;
        if (string.charAt(0) == '+' || string.charAt(0) == '-') {
            timeZone = TimeZone.getTimeZone("GMT" + string);
        } else if (string.startsWith("GMT")) {
            timeZone = TimeZone.getTimeZone(string);
        } else {
            timeZone = (TimeZone)this.b.get(string);
            if (timeZone == null) {
                throw new IllegalArgumentException(string + " is not a supported timezone name");
            }
        }
        calendar.setTimeZone(timeZone);
    }
}

