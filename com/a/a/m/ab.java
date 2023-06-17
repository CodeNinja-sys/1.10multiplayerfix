/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cc;
import com.a.a.b.cl;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class ab {
    private final TypeVariable a;

    ab(TypeVariable typeVariable) {
        this.a = (TypeVariable)cl.a(typeVariable);
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a.getGenericDeclaration(), this.a.getName()});
    }

    public boolean equals(Object object) {
        if (object instanceof ab) {
            ab ab2 = (ab)object;
            return this.a(ab2.a);
        }
        return false;
    }

    public String toString() {
        return this.a.toString();
    }

    static Object a(Type type) {
        if (type instanceof TypeVariable) {
            return new ab((TypeVariable)type);
        }
        return null;
    }

    boolean b(Type type) {
        if (type instanceof TypeVariable) {
            return this.a((TypeVariable)type);
        }
        return false;
    }

    private boolean a(TypeVariable typeVariable) {
        return this.a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.a.getName().equals(typeVariable.getName());
    }
}

