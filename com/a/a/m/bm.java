/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.d.mq;
import com.a.a.m.ay;
import com.a.a.m.bh;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class bm
implements Serializable,
ParameterizedType {
    private final Type a;
    private final jl b;
    private final Class c;
    private static final long d = 0L;

    bm(Type type, Class class_, Type[] arrtype) {
        cl.a(class_);
        cl.a(arrtype.length == class_.getTypeParameters().length);
        ay.a(arrtype, "type parameter");
        this.a = type;
        this.c = class_;
        this.b = bh.c.a(arrtype);
    }

    @Override
    public Type[] getActualTypeArguments() {
        return ay.a(this.b);
    }

    @Override
    public Type getRawType() {
        return this.c;
    }

    @Override
    public Type getOwnerType() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            stringBuilder.append(ay.d(this.a)).append('.');
        }
        stringBuilder.append(this.c.getName()).append('<').append(ay.b().a(mq.a((Iterable)this.b, ay.a()))).append('>');
        return stringBuilder.toString();
    }

    public int hashCode() {
        return (this.a == null ? 0 : this.a.hashCode()) ^ this.b.hashCode() ^ this.c.hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType)object;
        return this.getRawType().equals(parameterizedType.getRawType()) && cc.a((Object)this.getOwnerType(), (Object)parameterizedType.getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }
}

