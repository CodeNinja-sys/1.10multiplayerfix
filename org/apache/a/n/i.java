/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class i {
    public static final String a = "EEE, dd MMM yyyy HH:mm:ss zzz";
    public static final TimeZone b = TimeZone.getTimeZone("GMT");
    private final DateFormat c = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
    private long d = 0L;
    private String e = null;

    public i() {
        this.c.setTimeZone(b);
    }

    public synchronized String a() {
        long l2 = System.currentTimeMillis();
        if (l2 - this.d > 1000L) {
            this.e = this.c.format(new Date(l2));
            this.d = l2;
        }
        return this.e;
    }
}

