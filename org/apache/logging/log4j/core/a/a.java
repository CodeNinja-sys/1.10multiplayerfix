/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import org.apache.logging.log4j.core.a.n;
import org.apache.logging.log4j.core.b;
import org.apache.logging.log4j.core.c;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.h;

public abstract class a
extends org.apache.logging.log4j.core.c.b
implements b {
    private final boolean a;
    private c b = new n(this);
    private final f c;
    private final String d;
    private boolean e = false;

    public static int a(String string, int n2) {
        try {
            return org.apache.logging.log4j.core.d.n.a(string, n2);
        }
        catch (NumberFormatException numberFormatException) {
            h.b("Could not parse \"{}\" as an integer,  using default value {}: {}", string, n2, numberFormatException);
            return n2;
        }
    }

    protected a(String string, d d2, f f2) {
        this(string, d2, f2, true);
    }

    protected a(String string, d d2, f f2, boolean bl2) {
        super(d2);
        this.d = string;
        this.c = f2;
        this.a = bl2;
    }

    public void b(String string) {
        this.b.a(string);
    }

    public void a(String string, h h2, Throwable throwable) {
        this.b.a(string, h2, throwable);
    }

    public void a(String string, Throwable throwable) {
        this.b.a(string, throwable);
    }

    @Override
    public c d() {
        return this.b;
    }

    @Override
    public f b() {
        return this.c;
    }

    @Override
    public String a() {
        return this.d;
    }

    @Override
    public boolean c() {
        return this.a;
    }

    @Override
    public boolean g() {
        return this.e;
    }

    @Override
    public void a(c c2) {
        if (c2 == null) {
            h.b("The handler cannot be set to null");
        }
        if (this.g()) {
            h.b("The handler cannot be changed once the appender is started");
            return;
        }
        this.b = c2;
    }

    @Override
    public void e() {
        this.aZ_();
        this.e = true;
    }

    @Override
    public void f() {
        this.e = false;
        this.ba_();
    }

    public String toString() {
        return this.d;
    }
}

