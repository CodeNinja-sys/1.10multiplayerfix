/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.m.ay;
import com.a.a.m.bg;
import com.a.a.m.bh;
import java.lang.reflect.Type;

final class bk
extends bh {
    @Override
    Type a(Type type) {
        if (type instanceof Class) {
            return ay.a((Class)type);
        }
        return new bg(type);
    }

    @Override
    Type b(Type type) {
        return (Type)cl.a(type);
    }
}

