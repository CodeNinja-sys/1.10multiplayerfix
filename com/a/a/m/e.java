/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.m.d;
import java.net.URL;

public class e {
    private final String b;
    final ClassLoader a;

    static e a(String string, ClassLoader classLoader) {
        if (string.endsWith(".class")) {
            return new d(string, classLoader);
        }
        return new e(string, classLoader);
    }

    e(String string, ClassLoader classLoader) {
        this.b = (String)cl.a(string);
        this.a = (ClassLoader)cl.a(classLoader);
    }

    public final URL e() {
        return (URL)cl.a(this.a.getResource(this.b), "Failed to load resource: %s", this.b);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof e) {
            e e2 = (e)object;
            return this.b.equals(e2.b) && this.a == e2.a;
        }
        return false;
    }

    public String toString() {
        return this.b;
    }
}

