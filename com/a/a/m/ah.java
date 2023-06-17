/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.ae;
import com.a.a.m.ax;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

class ah
extends ax {
    final /* synthetic */ ae a;

    ah(ae ae2) {
        this.a = ae2;
    }

    @Override
    void a(TypeVariable typeVariable) {
        throw new IllegalArgumentException(ae.c(this.a) + "contains a type variable and is not safe for the operation");
    }

    @Override
    void a(WildcardType wildcardType) {
        this.a(wildcardType.getLowerBounds());
        this.a(wildcardType.getUpperBounds());
    }

    @Override
    void a(ParameterizedType parameterizedType) {
        this.a(parameterizedType.getActualTypeArguments());
        this.a(parameterizedType.getOwnerType());
    }

    @Override
    void a(GenericArrayType genericArrayType) {
        this.a(genericArrayType.getGenericComponentType());
    }
}

