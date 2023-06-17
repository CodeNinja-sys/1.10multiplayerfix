/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.apache.logging.log4j.core.a.c.r;
import org.apache.logging.log4j.core.e.d;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.h.n;
import org.apache.logging.log4j.core.i.as;
import org.apache.logging.log4j.core.i.l;
import org.apache.logging.log4j.core.i.p;
import org.apache.logging.log4j.core.i.t;

public class e {
    private static final String a = "FileConverter";
    private static final char b = 'y';
    private static final char c = 'M';
    private static final char[] d = new char[]{'w', 'W'};
    private static final char[] e = new char[]{'D', 'd', 'F', 'E'};
    private static final char[] f = new char[]{'H', 'K', 'h', 'k'};
    private static final char g = 'm';
    private static final char h = 's';
    private static final char i = 'S';
    private final l[] j;
    private final t[] k;
    private long l = 0L;
    private long m = 0L;
    private r n = null;

    public e(String string) {
        as as2 = this.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        as2.a(string, arrayList, arrayList2);
        t[] arrt = new t[arrayList2.size()];
        this.k = arrayList2.toArray(arrt);
        l[] arrl = new l[arrayList.size()];
        for (l l2 : this.j = arrayList.toArray(arrl)) {
            if (!(l2 instanceof p)) continue;
            p p2 = (p)l2;
            this.n = this.a(p2.b());
        }
    }

    public long a(long l2, int n2, boolean bl2) {
        this.l = this.m;
        if (this.n == null) {
            throw new IllegalStateException("Pattern does not contain a date");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), 0, 1, 0, 0, 0);
        calendar2.set(14, 0);
        if (this.n == r.a) {
            this.a(calendar2, 1, n2, bl2);
            long l3 = calendar2.getTimeInMillis();
            calendar2.add(1, -1);
            this.m = calendar2.getTimeInMillis();
            return l3;
        }
        if (this.n == r.b) {
            this.a(calendar2, 2, n2, bl2);
            long l4 = calendar2.getTimeInMillis();
            calendar2.add(2, -1);
            this.m = calendar2.getTimeInMillis();
            return l4;
        }
        if (this.n == r.c) {
            this.a(calendar2, 3, n2, bl2);
            long l5 = calendar2.getTimeInMillis();
            calendar2.add(3, -1);
            this.m = calendar2.getTimeInMillis();
            return l5;
        }
        calendar2.set(6, calendar.get(6));
        if (this.n == r.d) {
            this.a(calendar2, 6, n2, bl2);
            long l6 = calendar2.getTimeInMillis();
            calendar2.add(6, -1);
            this.m = calendar2.getTimeInMillis();
            return l6;
        }
        calendar2.set(10, calendar.get(10));
        if (this.n == r.e) {
            this.a(calendar2, 10, n2, bl2);
            long l7 = calendar2.getTimeInMillis();
            calendar2.add(10, -1);
            this.m = calendar2.getTimeInMillis();
            return l7;
        }
        calendar2.set(12, calendar.get(12));
        if (this.n == r.f) {
            this.a(calendar2, 12, n2, bl2);
            long l8 = calendar2.getTimeInMillis();
            calendar2.add(12, -1);
            this.m = calendar2.getTimeInMillis();
            return l8;
        }
        calendar2.set(13, calendar.get(13));
        if (this.n == r.g) {
            this.a(calendar2, 13, n2, bl2);
            long l9 = calendar2.getTimeInMillis();
            calendar2.add(13, -1);
            this.m = calendar2.getTimeInMillis();
            return l9;
        }
        this.a(calendar2, 14, n2, bl2);
        long l10 = calendar2.getTimeInMillis();
        calendar2.add(14, -1);
        this.m = calendar2.getTimeInMillis();
        return l10;
    }

    private void a(Calendar calendar, int n2, int n3, boolean bl2) {
        int n4 = bl2 ? n3 - calendar.get(n2) % n3 : n3;
        calendar.add(n2, n4);
    }

    public final void a(StringBuilder stringBuilder, Object object) {
        long l2 = this.l == 0L ? System.currentTimeMillis() : this.l;
        this.a(stringBuilder, new Date(l2), object);
    }

    public final void a(n n2, StringBuilder stringBuilder, Object object) {
        long l2 = this.l == 0L ? System.currentTimeMillis() : this.l;
        this.a(stringBuilder, new Date(l2), object);
        d d2 = new d(l2);
        String string = n2.a((h)d2, stringBuilder);
        stringBuilder.setLength(0);
        stringBuilder.append(string);
    }

    protected final void a(StringBuilder stringBuilder, Object ... arrobject) {
        for (int i2 = 0; i2 < this.j.length; ++i2) {
            int n2 = stringBuilder.length();
            this.j[i2].a(stringBuilder, arrobject);
            if (this.k[i2] == null) continue;
            this.k[i2].a(n2, stringBuilder);
        }
    }

    private r a(String string) {
        if (this.a(string, 'S')) {
            return r.h;
        }
        if (this.a(string, 's')) {
            return r.g;
        }
        if (this.a(string, 'm')) {
            return r.f;
        }
        if (this.a(string, f)) {
            return r.e;
        }
        if (this.a(string, e)) {
            return r.d;
        }
        if (this.a(string, d)) {
            return r.c;
        }
        if (this.a(string, 'M')) {
            return r.b;
        }
        if (this.a(string, 'y')) {
            return r.a;
        }
        return null;
    }

    private as a() {
        return new as(null, a, null);
    }

    private boolean a(String string, char ... arrc) {
        for (char c2 : arrc) {
            if (!this.a(string, c2)) continue;
            return true;
        }
        return false;
    }

    private boolean a(String string, char c2) {
        return string.indexOf(c2) >= 0;
    }
}

