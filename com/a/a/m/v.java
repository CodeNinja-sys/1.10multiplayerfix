/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.m.u;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class v
extends u {
    final TypeVariable a;

    protected v() {
        Type type = this.a();
        cl.a(type instanceof TypeVariable, "%s should be a type variable.", new Object[]{type});
        this.a = (TypeVariable)type;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object object) {
        if (object instanceof v) {
            v v2 = (v)object;
            return this.a.equals(v2.a);
        }
        return false;
    }

    public String toString() {
        return this.a.toString();
    }
}

