/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

class m
extends k {
    final Method a;

    m(Method method) {
        super(method);
        this.a = method;
    }

    @Override
    final Object b(Object object, Object[] arrobject) {
        return this.a.invoke(object, arrobject);
    }

    @Override
    Type u() {
        return this.a.getGenericReturnType();
    }

    @Override
    Type[] r() {
        return this.a.getGenericParameterTypes();
    }

    @Override
    Type[] s() {
        return this.a.getGenericExceptionTypes();
    }

    @Override
    final Annotation[][] t() {
        return this.a.getParameterAnnotations();
    }

    public final TypeVariable[] getTypeParameters() {
        return this.a.getTypeParameters();
    }

    @Override
    public final boolean m() {
        return !this.g() && !this.e() && !this.f() && !Modifier.isFinal(this.getDeclaringClass().getModifiers());
    }

    @Override
    public final boolean n() {
        return this.a.isVarArgs();
    }
}

