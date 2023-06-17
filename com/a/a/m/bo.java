/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.jl;
import com.a.a.m.ay;
import com.a.a.m.bh;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

final class bo
implements Serializable,
WildcardType {
    private final jl a;
    private final jl b;
    private static final long c = 0L;

    bo(Type[] arrtype, Type[] arrtype2) {
        ay.a(arrtype, "lower bound for wildcard");
        ay.a(arrtype2, "upper bound for wildcard");
        this.a = bh.c.a(arrtype);
        this.b = bh.c.a(arrtype2);
    }

    @Override
    public Type[] getLowerBounds() {
        return ay.a(this.a);
    }

    @Override
    public Type[] getUpperBounds() {
        return ay.a(this.b);
    }

    public boolean equals(Object object) {
        if (object instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)object;
            return this.a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.b.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("?");
        for (Type type : this.a) {
            stringBuilder.append(" super ").append(ay.d(type));
        }
        for (Type type : ay.a((Iterable)this.b)) {
            stringBuilder.append(" extends ").append(ay.d(type));
        }
        return stringBuilder.toString();
    }
}

