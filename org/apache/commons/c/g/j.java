/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import org.apache.commons.c.aa;
import org.apache.commons.c.g.g;
import org.apache.commons.c.g.h;

final class j
implements ParameterizedType {
    private final Class a;
    private final Type b;
    private final Type[] c;

    private j(Class class_, Type type, Type[] arrtype) {
        this.a = class_;
        this.b = type;
        this.c = arrtype;
    }

    @Override
    public Type getRawType() {
        return this.a;
    }

    @Override
    public Type getOwnerType() {
        return this.b;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return (Type[])this.c.clone();
    }

    public String toString() {
        return g.e(this);
    }

    public boolean equals(Object object) {
        return object == this || object instanceof ParameterizedType && g.a(this, (Type)((ParameterizedType)object));
    }

    public int hashCode() {
        int n2 = 1136;
        n2 |= this.a.hashCode();
        n2 <<= 4;
        n2 |= aa.a((Object)this.b);
        n2 <<= 8;
        return n2 |= Arrays.hashCode(this.c);
    }

    /* synthetic */ j(Class class_, Type type, Type[] arrtype, h h2) {
        this(class_, type, arrtype);
    }
}

