/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.m;
import java.lang.reflect.Method;

public class c
extends m {
    private Method a;
    private Object[] b;
    private int c;

    c(Class class_, Method method, Object[] arrobject, int n2) {
        super(class_);
        this.a = method;
        this.b = arrobject;
        this.c = n2;
    }

    public Method a() {
        return this.a;
    }

    public Object[] b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }
}

