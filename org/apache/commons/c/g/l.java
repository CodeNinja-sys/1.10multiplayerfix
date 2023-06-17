/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import org.apache.commons.c.aa;
import org.apache.commons.c.g.g;
import org.apache.commons.c.g.h;

final class l
implements WildcardType {
    private static final Type[] a = new Type[0];
    private final Type[] b;
    private final Type[] c;

    private l(Type[] arrtype, Type[] arrtype2) {
        this.b = (Type[])aa.a((Object)arrtype, (Object)a);
        this.c = (Type[])aa.a((Object)arrtype2, (Object)a);
    }

    @Override
    public Type[] getUpperBounds() {
        return (Type[])this.b.clone();
    }

    @Override
    public Type[] getLowerBounds() {
        return (Type[])this.c.clone();
    }

    public String toString() {
        return g.e(this);
    }

    public boolean equals(Object object) {
        return object == this || object instanceof WildcardType && g.a(this, (Type)((WildcardType)object));
    }

    public int hashCode() {
        int n2 = 18688;
        n2 |= Arrays.hashCode(this.b);
        n2 <<= 8;
        return n2 |= Arrays.hashCode(this.c);
    }

    /* synthetic */ l(Type[] arrtype, Type[] arrtype2, h h2) {
        this(arrtype, arrtype2);
    }
}

