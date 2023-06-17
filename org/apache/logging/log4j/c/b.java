/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.c;

import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.c.a;
import org.apache.logging.log4j.f;

public class b
extends a {
    protected final a a;

    public b(a a2, String string, n n2) {
        super(string, n2);
        this.a = a2;
    }

    @Override
    public void a(f f2, String string, org.apache.logging.log4j.b b2, m m2, Throwable throwable) {
        this.a.a(f2, string, b2, m2, throwable);
    }

    @Override
    public boolean b(org.apache.logging.log4j.b b2, f f2, String string) {
        return this.a.b(b2, f2, string);
    }

    @Override
    public boolean b(org.apache.logging.log4j.b b2, f f2, String string, Throwable throwable) {
        return this.a.b(b2, f2, string, throwable);
    }

    @Override
    public boolean c(org.apache.logging.log4j.b b2, f f2, String string, Object ... arrobject) {
        return this.a.c(b2, f2, string, arrobject);
    }

    @Override
    public boolean b(org.apache.logging.log4j.b b2, f f2, Object object, Throwable throwable) {
        return this.a.b(b2, f2, object, throwable);
    }

    @Override
    public boolean b(org.apache.logging.log4j.b b2, f f2, m m2, Throwable throwable) {
        return this.a.b(b2, f2, m2, throwable);
    }
}

