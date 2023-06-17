/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.j;
import com.ibm.icu.a.b.k;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.q;
import com.ibm.icu.a.b.t;
import java.util.Date;
import java.util.TimeZone;

class b
implements k {
    private t a;
    private q b;
    private j c;
    private long d;
    private String e;
    private TimeZone f;

    public b(t t2, q q2, j j2, long l2) {
        this.a = t2;
        this.b = q2;
        this.c = j2;
        this.d = l2 < 0L ? 0L : l2;
    }

    protected b(t t2, q q2, j j2, long l2, String string, TimeZone timeZone) {
        this.a = t2;
        this.b = q2;
        this.c = j2;
        this.d = l2;
        this.e = string;
        this.f = timeZone;
    }

    public String a(Date date) {
        long l2 = System.currentTimeMillis();
        long l3 = l2 - date.getTime();
        return this.a(l3, l2);
    }

    public String a(long l2) {
        return this.a(l2, System.currentTimeMillis());
    }

    public String a(long l2, long l3) {
        String string = this.b(l2, l3);
        if (string == null) {
            p p2 = this.c(l2, l3);
            string = this.a(p2);
        }
        return string;
    }

    public k a(String string) {
        if (!string.equals(this.e)) {
            t t2 = this.a.a(string);
            q q2 = this.b.a(string);
            j j2 = this.c == null ? null : this.c.a(string);
            return new b(t2, q2, j2, this.d, string, this.f);
        }
        return this;
    }

    public k a(TimeZone timeZone) {
        if (!timeZone.equals(this.f)) {
            q q2 = this.b.a(timeZone);
            j j2 = this.c == null ? null : this.c.a(timeZone);
            return new b(this.a, q2, j2, this.d, this.e, timeZone);
        }
        return this;
    }

    protected String b(long l2, long l3) {
        if (this.c != null && this.d > 0L && Math.abs(l2) >= this.d) {
            return this.c.a(l3 + l2);
        }
        return null;
    }

    protected p c(long l2, long l3) {
        return this.b.a(l2, l3);
    }

    protected String a(p p2) {
        if (!p2.f()) {
            throw new IllegalArgumentException("period is not set");
        }
        return this.a.a(p2);
    }
}

