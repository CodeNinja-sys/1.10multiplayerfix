/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.m.ae;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

class g
extends AccessibleObject
implements Member {
    private final AccessibleObject a;
    private final Member b;

    g(AccessibleObject accessibleObject) {
        cl.a(accessibleObject);
        this.a = accessibleObject;
        this.b = (Member)((Object)accessibleObject);
    }

    public ae a() {
        return ae.a(this.getDeclaringClass());
    }

    public final boolean isAnnotationPresent(Class class_) {
        return this.a.isAnnotationPresent(class_);
    }

    public final Annotation getAnnotation(Class class_) {
        return this.a.getAnnotation(class_);
    }

    @Override
    public final Annotation[] getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override
    public final Annotation[] getDeclaredAnnotations() {
        return this.a.getDeclaredAnnotations();
    }

    @Override
    public final void setAccessible(boolean bl2) {
        this.a.setAccessible(bl2);
    }

    @Override
    public final boolean isAccessible() {
        return this.a.isAccessible();
    }

    public Class getDeclaringClass() {
        return this.b.getDeclaringClass();
    }

    @Override
    public final String getName() {
        return this.b.getName();
    }

    @Override
    public final int getModifiers() {
        return this.b.getModifiers();
    }

    @Override
    public final boolean isSynthetic() {
        return this.b.isSynthetic();
    }

    public final boolean b() {
        return Modifier.isPublic(this.getModifiers());
    }

    public final boolean c() {
        return Modifier.isProtected(this.getModifiers());
    }

    public final boolean d() {
        return !this.e() && !this.b() && !this.c();
    }

    public final boolean e() {
        return Modifier.isPrivate(this.getModifiers());
    }

    public final boolean f() {
        return Modifier.isStatic(this.getModifiers());
    }

    public final boolean g() {
        return Modifier.isFinal(this.getModifiers());
    }

    public final boolean h() {
        return Modifier.isAbstract(this.getModifiers());
    }

    public final boolean i() {
        return Modifier.isNative(this.getModifiers());
    }

    public final boolean j() {
        return Modifier.isSynchronized(this.getModifiers());
    }

    final boolean k() {
        return Modifier.isVolatile(this.getModifiers());
    }

    final boolean l() {
        return Modifier.isTransient(this.getModifiers());
    }

    public boolean equals(Object object) {
        if (object instanceof g) {
            g g2 = (g)object;
            return this.a().equals(g2.a()) && this.b.equals(g2.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString();
    }
}

