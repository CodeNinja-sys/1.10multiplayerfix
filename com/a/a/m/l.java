/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.ay;
import com.a.a.m.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

class l
extends k {
    final Constructor a;

    l(Constructor constructor) {
        super(constructor);
        this.a = constructor;
    }

    @Override
    final Object b(Object object, Object[] arrobject) {
        try {
            return this.a.newInstance(arrobject);
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException(this.a + " failed.", instantiationException);
        }
    }

    @Override
    Type u() {
        Class class_ = this.getDeclaringClass();
        Type[] arrtype = class_.getTypeParameters();
        if (arrtype.length > 0) {
            return ay.a(class_, arrtype);
        }
        return class_;
    }

    @Override
    Type[] r() {
        Class<?>[] arrclass;
        Type[] arrtype = this.a.getGenericParameterTypes();
        if (arrtype.length > 0 && this.v() && arrtype.length == (arrclass = this.a.getParameterTypes()).length && arrclass[0] == this.getDeclaringClass().getEnclosingClass()) {
            return Arrays.copyOfRange(arrtype, 1, arrtype.length);
        }
        return arrtype;
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
        TypeVariable<Class<T>>[] arrtypeVariable = this.getDeclaringClass().getTypeParameters();
        TypeVariable<Constructor<T>>[] arrtypeVariable2 = this.a.getTypeParameters();
        TypeVariable[] arrtypeVariable3 = new TypeVariable[arrtypeVariable.length + arrtypeVariable2.length];
        System.arraycopy(arrtypeVariable, 0, arrtypeVariable3, 0, arrtypeVariable.length);
        System.arraycopy(arrtypeVariable2, 0, arrtypeVariable3, arrtypeVariable.length, arrtypeVariable2.length);
        return arrtypeVariable3;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean n() {
        return this.a.isVarArgs();
    }

    private boolean v() {
        Class class_ = this.a.getDeclaringClass();
        if (class_.getEnclosingConstructor() != null) {
            return true;
        }
        Method method = class_.getEnclosingMethod();
        if (method != null) {
            return !Modifier.isStatic(method.getModifiers());
        }
        return class_.getEnclosingClass() != null && !Modifier.isStatic(class_.getModifiers());
    }
}

