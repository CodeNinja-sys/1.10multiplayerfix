/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.lp;
import com.a.a.m.ae;
import com.a.a.m.ax;
import com.a.a.m.ay;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

final class ai
extends ax {
    final /* synthetic */ lp a;

    ai(lp lp2) {
        this.a = lp2;
    }

    @Override
    void a(TypeVariable typeVariable) {
        this.a(typeVariable.getBounds());
    }

    @Override
    void a(WildcardType wildcardType) {
        this.a(wildcardType.getUpperBounds());
    }

    @Override
    void a(ParameterizedType parameterizedType) {
        this.a.c((Class)parameterizedType.getRawType());
    }

    @Override
    void a(Class class_) {
        this.a.c(class_);
    }

    @Override
    void a(GenericArrayType genericArrayType) {
        this.a.c(ay.a(ae.d(genericArrayType.getGenericComponentType())));
    }
}

