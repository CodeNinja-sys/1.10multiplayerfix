/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.cg;
import com.a.a.b.cl;
import com.a.a.b.dx;
import java.util.Collections;
import java.util.Set;

final class a
extends cg {
    static final a a = new a();
    private static final long b = 0L;

    static cg a() {
        return a;
    }

    private a() {
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public Object a(Object object) {
        return cl.a(object, (Object)"use Optional.orNull() instead of Optional.or(null)");
    }

    @Override
    public cg a(cg cg2) {
        return (cg)cl.a(cg2);
    }

    @Override
    public Object a(dx dx2) {
        return cl.a(dx2.a(), (Object)"use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override
    public Object d() {
        return null;
    }

    @Override
    public Set e() {
        return Collections.emptySet();
    }

    @Override
    public cg a(bl bl2) {
        cl.a(bl2);
        return cg.f();
    }

    @Override
    public boolean equals(Object object) {
        return object == this;
    }

    @Override
    public int hashCode() {
        return 1502476572;
    }

    @Override
    public String toString() {
        return "Optional.absent()";
    }

    private Object g() {
        return a;
    }
}

