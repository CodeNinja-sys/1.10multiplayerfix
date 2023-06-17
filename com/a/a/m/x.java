/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.m.ab;
import com.a.a.m.ax;
import com.a.a.m.ay;
import com.a.a.m.w;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

final class x
extends ax {
    final /* synthetic */ Map a;
    final /* synthetic */ Type b;

    x(Map map, Type type) {
        this.a = map;
        this.b = type;
    }

    @Override
    void a(TypeVariable typeVariable) {
        this.a.put(new ab(typeVariable), this.b);
    }

    @Override
    void a(WildcardType wildcardType) {
        int n2;
        WildcardType wildcardType2 = (WildcardType)w.a(WildcardType.class, this.b);
        Type[] arrtype = wildcardType.getUpperBounds();
        Type[] arrtype2 = wildcardType2.getUpperBounds();
        Type[] arrtype3 = wildcardType.getLowerBounds();
        Type[] arrtype4 = wildcardType2.getLowerBounds();
        cl.a(arrtype.length == arrtype2.length && arrtype3.length == arrtype4.length, "Incompatible type: %s vs. %s", new Object[]{wildcardType, this.b});
        for (n2 = 0; n2 < arrtype.length; ++n2) {
            w.a(this.a, arrtype[n2], arrtype2[n2]);
        }
        for (n2 = 0; n2 < arrtype3.length; ++n2) {
            w.a(this.a, arrtype3[n2], arrtype4[n2]);
        }
    }

    @Override
    void a(ParameterizedType parameterizedType) {
        ParameterizedType parameterizedType2 = (ParameterizedType)w.a(ParameterizedType.class, this.b);
        cl.a(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", new Object[]{parameterizedType, this.b});
        Type[] arrtype = parameterizedType.getActualTypeArguments();
        Type[] arrtype2 = parameterizedType2.getActualTypeArguments();
        cl.a(arrtype.length == arrtype2.length, "%s not compatible with %s", new Object[]{parameterizedType, parameterizedType2});
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            w.a(this.a, arrtype[i2], arrtype2[i2]);
        }
    }

    @Override
    void a(GenericArrayType genericArrayType) {
        Type type = ay.e(this.b);
        cl.a(type != null, "%s is not an array type.", new Object[]{this.b});
        w.a(this.a, genericArrayType.getGenericComponentType(), type);
    }

    @Override
    void a(Class class_) {
        throw new IllegalArgumentException("No type mapping from " + class_);
    }
}

