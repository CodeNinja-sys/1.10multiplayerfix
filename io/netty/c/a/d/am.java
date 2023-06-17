/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.an;
import io.netty.c.a.d.ao;
import io.netty.c.a.d.ap;
import io.netty.util.b.z;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class am
extends SimpleDateFormat {
    private static final long a = -925286159755905325L;
    private final SimpleDateFormat b = new ao();
    private final SimpleDateFormat c = new ap();
    private static final z d = new an();

    static am a() {
        return (am)d.f();
    }

    private am() {
        super("E, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        this.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    @Override
    public Date parse(String string, ParsePosition parsePosition) {
        Date date = super.parse(string, parsePosition);
        if (date == null) {
            date = this.b.parse(string, parsePosition);
        }
        if (date == null) {
            date = this.c.parse(string, parsePosition);
        }
        return date;
    }

    /* synthetic */ am(an an2) {
        this();
    }
}

