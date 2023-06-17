/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.a.a;
import com.a.b.k;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class b
implements ap {
    b() {
    }

    public an a(k k2, com.a.b.c.a a2) {
        Type type = a2.b();
        if (!(type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray())) {
            return null;
        }
        Type type2 = com.a.b.b.b.g(type);
        an an2 = k2.a(com.a.b.c.a.b(type2));
        return new a(k2, an2, com.a.b.b.b.e(type2));
    }
}

