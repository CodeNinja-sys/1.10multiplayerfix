/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.b;
import com.ibm.icu.a.b.i;
import com.ibm.icu.a.b.j;
import com.ibm.icu.a.b.k;
import com.ibm.icu.a.b.l;
import com.ibm.icu.a.b.q;
import com.ibm.icu.a.b.t;
import java.util.Locale;
import java.util.TimeZone;

class c
implements l {
    private i a;
    private t b;
    private q c;
    private j d;
    private long e;
    private String f;
    private TimeZone g;
    private b h;

    c(i i2) {
        this.a = i2;
        this.f = Locale.getDefault().toString();
        this.g = TimeZone.getDefault();
    }

    public l a(t t2) {
        if (t2 != this.b) {
            this.b = t2;
            this.i();
        }
        return this;
    }

    public l a(q q2) {
        if (q2 != this.c) {
            this.c = q2;
            this.i();
        }
        return this;
    }

    public l a(j j2) {
        boolean bl2;
        boolean bl3 = j2 == null ? this.d != null : (bl2 = !j2.equals(this.d));
        if (bl2) {
            this.d = j2;
            this.i();
        }
        return this;
    }

    public l a(long l2) {
        if (l2 < 0L) {
            l2 = 0L;
        }
        if (l2 != this.e) {
            this.e = l2;
            this.i();
        }
        return this;
    }

    public l a(String string) {
        if (!string.equals(this.f)) {
            this.f = string;
            if (this.c != null) {
                this.c = this.c.a(string);
            }
            if (this.b != null) {
                this.b = this.b.a(string);
            }
            this.i();
        }
        return this;
    }

    public l a(TimeZone timeZone) {
        if (!timeZone.equals(this.g)) {
            this.g = timeZone;
            if (this.c != null) {
                this.c = this.c.a(timeZone);
            }
            this.i();
        }
        return this;
    }

    public k a() {
        if (this.h == null) {
            if (this.d != null) {
                this.d = this.d.a(this.f).a(this.g);
            }
            this.b = this.b();
            this.c = this.c();
            this.h = this.h();
        }
        return this.h;
    }

    public t b() {
        if (this.b == null) {
            this.b = this.a.c().a(this.f).g();
        }
        return this.b;
    }

    public q c() {
        if (this.c == null) {
            this.c = this.a.d().a(this.f).a(this.g).a();
        }
        return this.c;
    }

    public j d() {
        return this.d;
    }

    public long e() {
        return this.d == null ? 0L : this.e;
    }

    public String f() {
        return this.f;
    }

    public TimeZone g() {
        return this.g;
    }

    protected b h() {
        return new b(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    protected void i() {
        this.h = null;
    }
}

