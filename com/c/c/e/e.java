/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

public class e {
    private final Object a;
    private final Object b;

    protected e(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public static e a(Object object, Object object2) {
        return new e(object, object2);
    }

    public Object a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    public String a(String string) {
        return String.format("%s%s%s", this.a, string, this.b);
    }
}

