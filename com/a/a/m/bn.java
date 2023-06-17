/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.m.ay;
import com.a.a.m.bl;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class bn
implements TypeVariable {
    private final GenericDeclaration a;
    private final String b;
    private final jl c;

    bn(GenericDeclaration genericDeclaration, String string, Type[] arrtype) {
        ay.a(arrtype, "bound for type variable");
        this.a = (GenericDeclaration)cl.a(genericDeclaration);
        this.b = (String)cl.a(string);
        this.c = jl.a(arrtype);
    }

    @Override
    public Type[] getBounds() {
        return ay.a(this.c);
    }

    public GenericDeclaration getGenericDeclaration() {
        return this.a;
    }

    @Override
    public String getName() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (bl.a) {
            if (object instanceof bn) {
                bn bn2 = (bn)object;
                return this.b.equals(bn2.getName()) && this.a.equals(bn2.getGenericDeclaration()) && this.c.equals(bn2.c);
            }
            return false;
        }
        if (object instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable)object;
            return this.b.equals(typeVariable.getName()) && this.a.equals(typeVariable.getGenericDeclaration());
        }
        return false;
    }
}

