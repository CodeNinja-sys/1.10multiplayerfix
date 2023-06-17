/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.m;
import com.a.a.m.b;
import com.a.a.m.e;
import com.a.a.m.t;

public final class d
extends e {
    private final String b;

    d(String string, ClassLoader classLoader) {
        super(string, classLoader);
        this.b = com.a.a.m.b.c(string);
    }

    public String a() {
        return t.a(this.b);
    }

    public String b() {
        int n2 = this.b.lastIndexOf(36);
        if (n2 != -1) {
            String string = this.b.substring(n2 + 1);
            return m.c.l(string);
        }
        String string = this.a();
        if (string.isEmpty()) {
            return this.b;
        }
        return this.b.substring(string.length() + 1);
    }

    public String c() {
        return this.b;
    }

    public Class d() {
        try {
            return this.a.loadClass(this.b);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new IllegalStateException(classNotFoundException);
        }
    }

    @Override
    public String toString() {
        return this.b;
    }

    static /* synthetic */ String a(d d2) {
        return d2.b;
    }
}

