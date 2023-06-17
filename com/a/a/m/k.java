/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.m.ae;
import com.a.a.m.g;
import com.a.a.m.l;
import com.a.a.m.m;
import com.a.a.m.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public abstract class k
extends g
implements GenericDeclaration {
    k(AccessibleObject accessibleObject) {
        super(accessibleObject);
    }

    public static k a(Method method) {
        return new m(method);
    }

    public static k a(Constructor constructor) {
        return new l(constructor);
    }

    public abstract boolean m();

    public abstract boolean n();

    public final Object a(Object object, Object ... arrobject) {
        return this.b(object, (Object[])cl.a(arrobject));
    }

    public final ae o() {
        return ae.a(this.u());
    }

    public final jl p() {
        Type[] arrtype = this.r();
        Annotation[][] arrannotation = this.t();
        jn jn2 = jl.g();
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            jn2.c(new s(this, i2, ae.a(arrtype[i2]), arrannotation[i2]));
        }
        return jn2.b();
    }

    public final jl q() {
        jn jn2 = jl.g();
        for (Type type : this.s()) {
            ae ae2 = ae.a(type);
            jn2.c(ae2);
        }
        return jn2.b();
    }

    public final k a(Class class_) {
        return this.a(ae.a(class_));
    }

    public final k a(ae ae2) {
        if (!ae2.a(this.o())) {
            throw new IllegalArgumentException("Invokable is known to return " + this.o() + ", not " + ae2);
        }
        k k2 = this;
        return k2;
    }

    @Override
    public final Class getDeclaringClass() {
        return super.getDeclaringClass();
    }

    @Override
    public ae a() {
        return ae.a(this.getDeclaringClass());
    }

    abstract Object b(Object var1, Object[] var2);

    abstract Type[] r();

    abstract Type[] s();

    abstract Annotation[][] t();

    abstract Type u();
}

