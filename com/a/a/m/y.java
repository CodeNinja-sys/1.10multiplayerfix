/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.d.jt;
import com.a.a.d.sz;
import com.a.a.m.ab;
import com.a.a.m.ac;
import com.a.a.m.ax;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

final class y
extends ax {
    private static final ac a = new ac(null);
    private final Map b = sz.c();

    private y() {
    }

    static jt a(Type type) {
        y y2 = new y();
        y2.a(a.a(type));
        return jt.b(y2.b);
    }

    @Override
    void a(Class class_) {
        this.a(class_.getGenericSuperclass());
        this.a(class_.getGenericInterfaces());
    }

    @Override
    void a(ParameterizedType parameterizedType) {
        Type[] arrtype;
        Class class_ = (Class)parameterizedType.getRawType();
        TypeVariable<Class<T>>[] arrtypeVariable = class_.getTypeParameters();
        cl.b(arrtypeVariable.length == (arrtype = parameterizedType.getActualTypeArguments()).length);
        for (int i2 = 0; i2 < arrtypeVariable.length; ++i2) {
            this.a(new ab(arrtypeVariable[i2]), arrtype[i2]);
        }
        this.a(new Type[]{class_});
        this.a(parameterizedType.getOwnerType());
    }

    @Override
    void a(TypeVariable typeVariable) {
        this.a(typeVariable.getBounds());
    }

    @Override
    void a(WildcardType wildcardType) {
        this.a(wildcardType.getUpperBounds());
    }

    private void a(ab ab2, Type type) {
        if (this.b.containsKey(ab2)) {
            return;
        }
        Type type2 = type;
        while (type2 != null) {
            if (ab2.b(type2)) {
                Type type3 = type;
                while (type3 != null) {
                    type3 = (Type)this.b.remove(ab.a(type3));
                }
                return;
            }
            type2 = (Type)this.b.get(ab.a(type2));
        }
        this.b.put(ab2, type);
    }
}

