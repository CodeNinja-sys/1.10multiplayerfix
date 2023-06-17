/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d;

import java.security.PrivilegedAction;

final class f
implements PrivilegedAction {
    private final ClassLoader a;
    private final String b;

    f(ClassLoader classLoader, String string) {
        this.a = classLoader;
        this.b = string;
    }

    public Object run() {
        if (this.a != null) {
            return this.a.getResourceAsStream(this.b);
        }
        return ClassLoader.getSystemResourceAsStream(this.b);
    }
}

