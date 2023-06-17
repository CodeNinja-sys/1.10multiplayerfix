/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.security.PrivilegedAction;
import net.java.games.input.bf;
import net.java.games.input.bp;

class bj
implements PrivilegedAction {
    private final bf a;

    bj(bf bf2) {
        this.a = bf2;
    }

    public final Object run() {
        Runtime.getRuntime().addShutdownHook(new bp(this.a, null));
        return null;
    }
}

