/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.g;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.f;

public abstract class a
implements org.apache.logging.log4j.core.d,
g {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    protected final e b;
    protected final e c;
    private boolean d;

    protected a() {
        this(null, null);
    }

    protected a(e e2, e e3) {
        this.b = e2 == null ? e.b : e2;
        this.c = e3 == null ? e.c : e3;
    }

    @Override
    public void e() {
        this.d = true;
    }

    @Override
    public boolean g() {
        return this.d;
    }

    @Override
    public void f() {
        this.d = false;
    }

    @Override
    public final e a() {
        return this.c;
    }

    @Override
    public final e b() {
        return this.b;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public e a(i i2, b b2, f f2, String string, Object ... arrobject) {
        return e.b;
    }

    @Override
    public e a(i i2, b b2, f f2, Object object, Throwable throwable) {
        return e.b;
    }

    @Override
    public e a(i i2, b b2, f f2, m m2, Throwable throwable) {
        return e.b;
    }

    @Override
    public e a(h h2) {
        return e.b;
    }
}

