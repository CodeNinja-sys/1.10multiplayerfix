/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.a.f.b.b;
import org.apache.a.f.b.h;
import org.apache.a.f.w;
import org.apache.a.m.i;
import org.apache.commons.d.a;

class y
extends i {
    private final a a;
    private final h b;

    public y(a a2, String string, b b2, w w2, long l2, TimeUnit timeUnit) {
        super(string, b2, w2, l2, timeUnit);
        this.a = a2;
        this.b = new h(b2);
    }

    public boolean a(long l2) {
        boolean bl2 = super.a(l2);
        if (bl2 && this.a.a()) {
            this.a.b("Connection " + this + " expired @ " + new Date(this.n()));
        }
        return bl2;
    }

    h a() {
        return this.b;
    }

    b b() {
        return (b)this.h();
    }

    b c() {
        return this.b.l();
    }

    public boolean e() {
        w w2 = (w)this.i();
        return !w2.c();
    }

    public void f() {
        w w2 = (w)this.i();
        try {
            w2.close();
        }
        catch (IOException iOException) {
            this.a.b("I/O error closing connection", iOException);
        }
    }
}

