/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.c.i.j;
import org.apache.commons.c.i.q;

class r
extends q {
    private final int a;
    private final Map b;

    r(int n2, Calendar calendar, Locale locale) {
        super(null);
        this.a = n2;
        this.b = j.a(n2, calendar, locale);
    }

    @Override
    boolean a(j j2, StringBuilder stringBuilder) {
        stringBuilder.append('(');
        for (String string : this.b.keySet()) {
            j.a(stringBuilder, string, false).append('|');
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ')');
        return true;
    }

    @Override
    void a(j j2, Calendar calendar, String string) {
        Integer n2 = (Integer)this.b.get(string);
        if (n2 == null) {
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.append(" not in (");
            for (String string2 : this.b.keySet()) {
                stringBuilder.append(string2).append(' ');
            }
            stringBuilder.setCharAt(stringBuilder.length() - 1, ')');
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        calendar.set(this.a, n2);
    }
}

