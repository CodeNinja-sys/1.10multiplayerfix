/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import com.a.a.b.cl;
import java.io.Serializable;

final class au
extends ak
implements Serializable {
    private final Class a;
    private static final long b = 0L;

    au(Class class_) {
        this.a = (Class)cl.a(class_);
    }

    protected Enum a(String string) {
        return Enum.valueOf(this.a, string);
    }

    protected String a(Enum enum_) {
        return enum_.name();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof au) {
            au au2 = (au)object;
            return this.a.equals(au2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Enums.stringConverter(" + this.a.getName() + ".class)";
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((Enum)object);
    }

    @Override
    protected /* synthetic */ Object c(Object object) {
        return this.a((String)object);
    }
}

