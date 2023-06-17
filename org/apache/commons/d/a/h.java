/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.security.PrivilegedAction;
import org.apache.commons.d.a.e;

class h
implements PrivilegedAction {
    private final ClassLoader a;
    private final e b;

    h(e e2, ClassLoader classLoader) {
        this.b = e2;
        this.a = classLoader;
    }

    public Object run() {
        return this.a.getParent();
    }
}

