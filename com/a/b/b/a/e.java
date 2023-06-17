/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.f;
import com.a.b.d.a;
import com.a.b.d.d;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class e
extends an {
    public static final ap a = new f();
    private final DateFormat b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
    private final DateFormat d = e.b();

    private static DateFormat b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public Date b(a a2) {
        if (a2.f() == com.a.b.d.d.i) {
            a2.j();
            return null;
        }
        return this.b(a2.h());
    }

    private synchronized Date b(String string) {
        try {
            return this.c.parse(string);
        }
        catch (ParseException parseException) {
            try {
                return this.b.parse(string);
            }
            catch (ParseException parseException2) {
                try {
                    return this.d.parse(string);
                }
                catch (ParseException parseException3) {
                    throw new ag(string, parseException3);
                }
            }
        }
    }

    public synchronized void a(com.a.b.d.e e2, Date date) {
        if (date == null) {
            e2.f();
            return;
        }
        String string = this.b.format(date);
        e2.b(string);
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

