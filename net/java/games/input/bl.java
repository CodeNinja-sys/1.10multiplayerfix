/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.security.PrivilegedAction;

final class bl
implements PrivilegedAction {
    private final File a;

    bl(File file) {
        this.a = file;
    }

    public Object run() {
        return this.a.getAbsolutePath();
    }
}

