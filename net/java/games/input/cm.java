/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.security.PrivilegedAction;

final class cm
implements PrivilegedAction {
    private final String a;

    cm(String string) {
        this.a = string;
    }

    public Object run() {
        return System.getProperty(this.a);
    }
}

