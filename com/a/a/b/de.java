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

final class de
extends cg {
    private final Object a;
    private static final long b = 0L;

    de(Object object) {
        this.a = object;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public Object c() {
        return this.a;
    }

    @Override
    public Object a(Object object) {
        cl.a(object, (Object)"use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override
    public cg a(cg cg2) {
        cl.a(cg2);
        return this;
    }

    @Override
    public Object a(dx dx2) {
        cl.a(dx2);
        return this.a;
    }

    @Override
    public Object d() {
        return this.a;
    }

    @Override
    public Set e() {
        return Collections.singleton(this.a);
    }

    @Override
    public cg a(bl bl2) {
        return new de(cl.a(bl2.a(this.a), (Object)"the Function passed to Optional.transform() must not return null."));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof de) {
            de de2 = (de)object;
            return this.a.equals(de2.a);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1502476572 + this.a.hashCode();
    }

    @Override
    public String toString() {
        return "Optional.of(" + this.a + ")";
    }
}

