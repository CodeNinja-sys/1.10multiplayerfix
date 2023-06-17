/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.d;
import com.ibm.icu.a.b.e;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.q;
import com.ibm.icu.a.b.x;
import java.util.TimeZone;

abstract class s
implements q {
    protected e a;

    public p a(long l2) {
        return this.a(l2, System.currentTimeMillis());
    }

    public long a(x x2) {
        return d.a(x2);
    }

    public p a(long l2, long l3) {
        p p2;
        boolean bl2;
        boolean bl3 = bl2 = l2 < 0L;
        if (bl2) {
            l2 = -l2;
        }
        if ((p2 = this.a.a(l2, bl2)) == null && (p2 = this.a(l2, l3, bl2)) == null) {
            p2 = p.c(1.0f, this.a.b()).b(bl2);
        }
        return p2;
    }

    public q a(TimeZone timeZone) {
        return this;
    }

    public q a(String string) {
        e e2 = this.a.a(string);
        if (e2 != this.a) {
            return this.a(e2);
        }
        return this;
    }

    protected abstract q a(e var1);

    protected abstract p a(long var1, long var3, boolean var5);

    protected s(e e2) {
        this.a = e2;
    }
}

