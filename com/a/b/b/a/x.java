/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.b.a.r;
import com.a.b.c.a;
import com.a.b.d.e;
import com.a.b.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class x
extends an {
    private final k a;
    private final an b;
    private final Type c;

    x(k k2, an an2, Type type) {
        this.a = k2;
        this.b = an2;
        this.c = type;
    }

    public Object a(com.a.b.d.a a2) {
        return this.b.a(a2);
    }

    public void a(e e2, Object object) {
        an an2 = this.b;
        Type type = this.a(this.c, object);
        if (type != this.c) {
            an an3 = this.a.a(com.a.b.c.a.b(type));
            an2 = !(an3 instanceof r) ? an3 : (!(this.b instanceof r) ? this.b : an3);
        }
        an2.a(e2, object);
    }

    private Type a(Type class_, Object object) {
        if (object != null && (class_ == Object.class || class_ instanceof TypeVariable || class_ instanceof Class)) {
            class_ = object.getClass();
        }
        return class_;
    }
}

