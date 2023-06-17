/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.security.PrivilegedAction;
import net.java.games.input.ds;
import net.java.games.input.dx;

class dw
implements PrivilegedAction {
    private final ds a;

    dw(ds ds2) {
        this.a = ds2;
    }

    public final Object run() {
        Runtime.getRuntime().addShutdownHook(new dx(this.a, null));
        return null;
    }
}

