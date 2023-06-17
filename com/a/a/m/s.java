/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.m.ae;
import com.a.a.m.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public final class s
implements AnnotatedElement {
    private final k a;
    private final int b;
    private final ae c;
    private final jl d;

    s(k k2, int n2, ae ae2, Annotation[] arrannotation) {
        this.a = k2;
        this.b = n2;
        this.c = ae2;
        this.d = jl.a(arrannotation);
    }

    public ae a() {
        return this.c;
    }

    public k b() {
        return this.a;
    }

    public boolean isAnnotationPresent(Class class_) {
        return this.getAnnotation(class_) != null;
    }

    public Annotation getAnnotation(Class class_) {
        cl.a(class_);
        for (Annotation annotation : this.d) {
            if (!class_.isInstance(annotation)) continue;
            return (Annotation)class_.cast(annotation);
        }
        return null;
    }

    @Override
    public Annotation[] getAnnotations() {
        return this.getDeclaredAnnotations();
    }

    @Override
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[])this.d.toArray(new Annotation[this.d.size()]);
    }

    public boolean equals(Object object) {
        if (object instanceof s) {
            s s2 = (s)object;
            return this.b == s2.b && this.a.equals(s2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return this.c + " arg" + this.b;
    }
}

