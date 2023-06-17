/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d;

import java.security.PrivilegedAction;
import org.apache.commons.d.c;

final class e
implements PrivilegedAction {
    private final String a;
    private final ClassLoader b;

    e(String string, ClassLoader classLoader) {
        this.a = string;
        this.b = classLoader;
    }

    public Object run() {
        return c.b(this.a, this.b);
    }
}

