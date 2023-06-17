/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ae;
import com.a.b.b.f;
import com.a.b.x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

class n
implements ae {
    final /* synthetic */ Type a;
    final /* synthetic */ f b;

    n(f f2, Type type) {
        this.b = f2;
        this.a = type;
    }

    public Object a() {
        if (this.a instanceof ParameterizedType) {
            Type type = ((ParameterizedType)this.a).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return EnumSet.noneOf((Class)type);
            }
            throw new x("Invalid EnumSet type: " + this.a.toString());
        }
        throw new x("Invalid EnumSet type: " + this.a.toString());
    }
}

