/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.security.PrivilegedAction;

final class af
implements PrivilegedAction {
    private final String a;

    af(String string) {
        this.a = string;
    }

    public final Object run() {
        String string = System.getProperty("net.java.games.input.librarypath");
        if (string != null) {
            System.load(string + File.separator + System.mapLibraryName(this.a));
        } else {
            System.loadLibrary(this.a);
        }
        return null;
    }
}

