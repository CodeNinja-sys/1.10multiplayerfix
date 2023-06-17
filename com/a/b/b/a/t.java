/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.u;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class t
extends an {
    public static final ap a = new u();
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    public synchronized Date b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        try {
            long l2 = this.b.parse(a2.h()).getTime();
            return new Date(l2);
        }
        catch (ParseException parseException) {
            throw new ag(parseException);
        }
    }

    public synchronized void a(e e2, Date date) {
        e2.b(date == null ? null : this.b.format(date));
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

