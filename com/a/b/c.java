/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.b.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class c {
    private final Field a;

    public c(Field field) {
        com.a.b.b.a.a(field);
        this.a = field;
    }

    public Class a() {
        return this.a.getDeclaringClass();
    }

    public String b() {
        return this.a.getName();
    }

    public Type c() {
        return this.a.getGenericType();
    }

    public Class d() {
        return this.a.getType();
    }

    public Annotation a(Class class_) {
        return this.a.getAnnotation(class_);
    }

    public Collection e() {
        return Arrays.asList(this.a.getAnnotations());
    }

    public boolean a(int n2) {
        return (this.a.getModifiers() & n2) != 0;
    }

    Object a(Object object) {
        return this.a.get(object);
    }

    boolean f() {
        return this.a.isSynthetic();
    }
}

