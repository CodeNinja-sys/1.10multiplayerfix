/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.m.bg;
import com.a.a.m.bh;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class bj
extends bh {
    GenericArrayType c(Type type) {
        return new bg(type);
    }

    @Override
    Type b(Type type) {
        Class class_;
        cl.a(type);
        if (type instanceof Class && (class_ = (Class)type).isArray()) {
            return new bg(class_.getComponentType());
        }
        return type;
    }

    @Override
    /* synthetic */ Type a(Type type) {
        return this.c(type);
    }
}

