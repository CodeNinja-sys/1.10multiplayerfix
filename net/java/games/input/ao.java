/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.security.PrivilegedAction;
import net.java.games.input.ak;
import net.java.games.input.ap;

class ao
implements PrivilegedAction {
    private final ak a;

    ao(ak ak2) {
        this.a = ak2;
    }

    public final Object run() {
        Runtime.getRuntime().addShutdownHook(new ap(this.a, null));
        return null;
    }
}

