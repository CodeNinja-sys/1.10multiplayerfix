/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.w;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class v
extends an {
    public static final ap a = new w();
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    public synchronized Time b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        try {
            Date date = this.b.parse(a2.h());
            return new Time(date.getTime());
        }
        catch (ParseException parseException) {
            throw new ag(parseException);
        }
    }

    public synchronized void a(e e2, Time time) {
        e2.b(time == null ? null : this.b.format(time));
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

