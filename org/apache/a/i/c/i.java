/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.a.f.b.b;
import org.apache.a.f.u;
import org.apache.a.j;
import org.apache.commons.d.a;

class i
extends org.apache.a.m.i {
    private final a a;
    private volatile boolean b;

    public i(a a2, String string, b b2, u u2, long l2, TimeUnit timeUnit) {
        super(string, b2, u2, l2, timeUnit);
        this.a = a2;
    }

    public void a() {
        this.b = true;
    }

    public boolean b() {
        return this.b;
    }

    public void c() {
        j j2 = (j)this.i();
        j2.close();
    }

    public void d() {
        j j2 = (j)this.i();
        j2.f();
    }

    public boolean a(long l2) {
        boolean bl2 = super.a(l2);
        if (bl2 && this.a.a()) {
            this.a.b("Connection " + this + " expired @ " + new Date(this.n()));
        }
        return bl2;
    }

    public boolean e() {
        j j2 = (j)this.i();
        return !j2.c();
    }

    public void f() {
        try {
            this.c();
        }
        catch (IOException iOException) {
            this.a.b("I/O error closing connection", iOException);
        }
    }
}

