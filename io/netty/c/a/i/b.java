/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.c.a.i.c;

class b
implements c {
    private final ClassLoader a;

    b(ClassLoader classLoader) {
        this.a = classLoader;
    }

    @Override
    public Class a(String string) {
        try {
            return this.a.loadClass(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return Class.forName(string, false, this.a);
        }
    }
}

