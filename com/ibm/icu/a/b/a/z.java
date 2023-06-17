/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

import com.ibm.icu.a.b.a.v;
import com.ibm.icu.a.b.j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class z
implements j {
    private String a;
    private String b;
    private TimeZone c;
    private SimpleDateFormat d;

    public z(String string) {
        this(string, Locale.getDefault().toString(), TimeZone.getDefault());
    }

    public z(String string, String string2, TimeZone timeZone) {
        this.a = string;
        this.b = string2;
        this.c = timeZone;
        Locale locale = v.a(string2);
        this.d = new SimpleDateFormat("yyyy/mm/dd", locale);
        this.d.setTimeZone(timeZone);
    }

    public String a(long l2) {
        return this.a(new Date(l2));
    }

    public String a(Date date) {
        return this.d.format(date);
    }

    public j a(String string) {
        if (!string.equals(this.b)) {
            return new z(this.a, string, this.c);
        }
        return this;
    }

    public j a(TimeZone timeZone) {
        if (!timeZone.equals(this.c)) {
            return new z(this.a, this.b, timeZone);
        }
        return this;
    }
}

