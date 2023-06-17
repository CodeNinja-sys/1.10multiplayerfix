/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.security.PrivilegedAction;
import net.java.games.input.bf;
import net.java.games.input.t;

final class bg
implements PrivilegedAction {
    private final String a;

    bg(String string) {
        this.a = string;
    }

    public final Object run() {
        String string = System.getProperty("net.java.games.input.librarypath");
        try {
            if (string != null) {
                System.load(string + File.separator + System.mapLibraryName(this.a));
            } else {
                System.loadLibrary(this.a);
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            t.a("Failed to load library: " + unsatisfiedLinkError.getMessage());
            unsatisfiedLinkError.printStackTrace();
            bf.a(false);
        }
        return null;
    }
}

