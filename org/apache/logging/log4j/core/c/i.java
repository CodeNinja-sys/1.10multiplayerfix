/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.a;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.f;

public final class i
extends a {
    private final String d;

    private i(String string, e e2, e e3) {
        super(e2, e3);
        this.d = string;
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, f f2, String string, Object ... arrobject) {
        return this.a(f2);
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, f f2, Object object, Throwable throwable) {
        return this.a(f2);
    }

    @Override
    public e a(org.apache.logging.log4j.core.i i2, b b2, f f2, m m2, Throwable throwable) {
        return this.a(f2);
    }

    @Override
    public e a(h h2) {
        return this.a(h2.e());
    }

    private e a(f f2) {
        return f2 != null && f2.a(this.d) ? this.b : this.c;
    }

    @Override
    public String toString() {
        return this.d;
    }

    public static i a(String string, String string2, String string3) {
        if (string == null) {
            a.b("A marker must be provided for MarkerFilter");
            return null;
        }
        e e2 = e.a(string2);
        e e3 = e.a(string3);
        return new i(string, e2, e3);
    }
}

