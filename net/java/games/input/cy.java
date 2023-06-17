/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.security.PrivilegedAction;

final class cy
implements PrivilegedAction {
    private final String a;
    private final String b;

    cy(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public Object run() {
        return System.getProperty(this.a, this.b);
    }
}

