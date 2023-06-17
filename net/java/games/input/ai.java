/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.security.PrivilegedAction;
import net.java.games.input.ae;

class ai
implements PrivilegedAction {
    private final ae a;

    ai(ae ae2) {
        this.a = ae2;
    }

    public Object run() {
        ae.a(this.a);
        return null;
    }
}

