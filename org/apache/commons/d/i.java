/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d;

import java.security.PrivilegedAction;

final class i
implements PrivilegedAction {
    private final String a;
    private final String b;

    i(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public Object run() {
        return System.getProperty(this.a, this.b);
    }
}

