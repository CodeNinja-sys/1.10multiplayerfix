/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.c.i.t;
import org.apache.commons.c.i.x;

class ab
implements x {
    private final Locale a;
    private final int b;
    private final String c;
    private final String d;

    ab(TimeZone timeZone, Locale locale, int n2) {
        this.a = locale;
        this.b = n2;
        this.c = t.a(timeZone, false, n2, locale);
        this.d = t.a(timeZone, true, n2, locale);
    }

    @Override
    public int a() {
        return Math.max(this.c.length(), this.d.length());
    }

    @Override
    public void a(StringBuffer stringBuffer, Calendar calendar) {
        TimeZone timeZone = calendar.getTimeZone();
        if (timeZone.useDaylightTime() && calendar.get(16) != 0) {
            stringBuffer.append(t.a(timeZone, true, this.b, this.a));
        } else {
            stringBuffer.append(t.a(timeZone, false, this.b, this.a));
        }
    }
}

