/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import org.apache.commons.c.a.a;
import org.apache.commons.c.g.h;
import org.apache.commons.c.g.l;

public class k
implements a {
    private Type[] a;
    private Type[] b;

    private k() {
    }

    public k a(Type ... arrtype) {
        this.a = arrtype;
        return this;
    }

    public k b(Type ... arrtype) {
        this.b = arrtype;
        return this;
    }

    public WildcardType b() {
        return new l(this.a, this.b, null);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }

    /* synthetic */ k(h h2) {
        this();
    }
}

