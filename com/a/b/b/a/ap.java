/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class ap
extends an {
    private static final String a = "year";
    private static final String b = "month";
    private static final String c = "dayOfMonth";
    private static final String d = "hourOfDay";
    private static final String e = "minute";
    private static final String f = "second";

    ap() {
    }

    public Calendar b(a a2) {
        if (a2.f() == com.a.b.d.d.i) {
            a2.j();
            return null;
        }
        a2.c();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        while (a2.f() != com.a.b.d.d.d) {
            String string = a2.g();
            int n8 = a2.m();
            if (a.equals(string)) {
                n2 = n8;
                continue;
            }
            if (b.equals(string)) {
                n3 = n8;
                continue;
            }
            if (c.equals(string)) {
                n4 = n8;
                continue;
            }
            if (d.equals(string)) {
                n5 = n8;
                continue;
            }
            if (e.equals(string)) {
                n6 = n8;
                continue;
            }
            if (!f.equals(string)) continue;
            n7 = n8;
        }
        a2.d();
        return new GregorianCalendar(n2, n3, n4, n5, n6, n7);
    }

    public void a(e e2, Calendar calendar) {
        if (calendar == null) {
            e2.f();
            return;
        }
        e2.d();
        e2.a(a);
        e2.a((long)calendar.get(1));
        e2.a(b);
        e2.a((long)calendar.get(2));
        e2.a(c);
        e2.a((long)calendar.get(5));
        e2.a(d);
        e2.a((long)calendar.get(11));
        e2.a(e);
        e2.a((long)calendar.get(12));
        e2.a(f);
        e2.a((long)calendar.get(13));
        e2.e();
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

