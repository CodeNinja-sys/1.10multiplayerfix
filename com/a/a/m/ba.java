/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.ax;
import com.a.a.m.ay;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

final class ba
extends ax {
    final /* synthetic */ AtomicReference a;

    ba(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override
    void a(TypeVariable typeVariable) {
        this.a.set(ay.a(typeVariable.getBounds()));
    }

    @Override
    void a(WildcardType wildcardType) {
        this.a.set(ay.a(wildcardType.getUpperBounds()));
    }

    @Override
    void a(GenericArrayType genericArrayType) {
        this.a.set(genericArrayType.getGenericComponentType());
    }

    @Override
    void a(Class class_) {
        this.a.set(class_.getComponentType());
    }
}

