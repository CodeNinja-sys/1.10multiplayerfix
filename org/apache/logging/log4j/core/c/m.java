/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.a;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.f;

public final class m
extends a {
    private final b d;

    private m(b b2, e e2, e e3) {
        super(e2, e3);
        this.d = b2;
    }

    @Override
    public e a(i i2, b b2, f f2, String string, Object ... arrobject) {
        return this.a(b2);
    }

    @Override
    public e a(i i2, b b2, f f2, Object object, Throwable throwable) {
        return this.a(b2);
    }

    @Override
    public e a(i i2, b b2, f f2, org.apache.logging.log4j.a.m m2, Throwable throwable) {
        return this.a(b2);
    }

    @Override
    public e a(h h2) {
        return this.a(h2.a());
    }

    private e a(b b2) {
        return b2.a(this.d) ? this.b : this.c;
    }

    @Override
    public String toString() {
        return this.d.toString();
    }

    public static m a(String string, String string2, String string3) {
        b b2 = org.apache.logging.log4j.b.a(string, org.apache.logging.log4j.b.c);
        e e2 = e.a(string2, e.b);
        e e3 = e.a(string3, e.c);
        return new m(b2, e2, e3);
    }
}

