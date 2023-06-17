/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.z;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

class aa
extends z {
    final /* synthetic */ TypeVariable a;
    final /* synthetic */ z b;
    final /* synthetic */ z c;

    aa(z z2, TypeVariable typeVariable, z z3) {
        this.c = z2;
        this.a = typeVariable;
        this.b = z3;
    }

    @Override
    public Type a(TypeVariable typeVariable, z z2) {
        if (typeVariable.getGenericDeclaration().equals(this.a.getGenericDeclaration())) {
            return typeVariable;
        }
        return this.b.a(typeVariable, z2);
    }
}

