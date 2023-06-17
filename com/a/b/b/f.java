/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.ae;
import com.a.b.b.g;
import com.a.b.b.h;
import com.a.b.b.i;
import com.a.b.b.j;
import com.a.b.b.k;
import com.a.b.b.l;
import com.a.b.b.m;
import com.a.b.b.n;
import com.a.b.b.o;
import com.a.b.b.p;
import com.a.b.b.q;
import com.a.b.b.r;
import com.a.b.c.a;
import com.a.b.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public final class f {
    private final Map a;

    public f(Map map) {
        this.a = map;
    }

    public ae a(a a2) {
        Type type = a2.b();
        Class class_ = a2.a();
        s s2 = (s)this.a.get(type);
        if (s2 != null) {
            return new g(this, s2, type);
        }
        s s3 = (s)this.a.get(class_);
        if (s3 != null) {
            return new k(this, s3, type);
        }
        ae ae2 = this.a(class_);
        if (ae2 != null) {
            return ae2;
        }
        ae ae3 = this.a(type, class_);
        if (ae3 != null) {
            return ae3;
        }
        return this.b(type, class_);
    }

    private ae a(Class class_) {
        try {
            Constructor constructor = class_.getDeclaredConstructor(new Class[0]);
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            return new l(this, constructor);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    private ae a(Type type, Class class_) {
        if (Collection.class.isAssignableFrom(class_)) {
            if (SortedSet.class.isAssignableFrom(class_)) {
                return new m(this);
            }
            if (EnumSet.class.isAssignableFrom(class_)) {
                return new n(this, type);
            }
            if (Set.class.isAssignableFrom(class_)) {
                return new o(this);
            }
            if (Queue.class.isAssignableFrom(class_)) {
                return new p(this);
            }
            return new q(this);
        }
        if (Map.class.isAssignableFrom(class_)) {
            if (SortedMap.class.isAssignableFrom(class_)) {
                return new r(this);
            }
            if (type instanceof ParameterizedType && !String.class.isAssignableFrom(com.a.b.c.a.b(((ParameterizedType)type).getActualTypeArguments()[0]).a())) {
                return new h(this);
            }
            return new i(this);
        }
        return null;
    }

    private ae b(Type type, Class class_) {
        return new j(this, class_, type);
    }

    public String toString() {
        return this.a.toString();
    }
}

