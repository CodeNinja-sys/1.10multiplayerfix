/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.security.PrivilegedAction;
import org.apache.commons.d.a.l;

final class m
implements PrivilegedAction {
    private final String a;

    m(String string) {
        this.a = string;
    }

    public Object run() {
        ClassLoader classLoader = l.h();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(this.a);
        }
        return ClassLoader.getSystemResourceAsStream(this.a);
    }
}

