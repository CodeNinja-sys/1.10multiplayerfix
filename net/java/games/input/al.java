/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.security.PrivilegedAction;
import net.java.games.input.ak;

final class al
implements PrivilegedAction {
    private final String a;

    al(String string) {
        this.a = string;
    }

    public final Object run() {
        try {
            String string = System.getProperty("net.java.games.input.librarypath");
            if (string != null) {
                System.load(string + File.separator + System.mapLibraryName(this.a));
            } else {
                System.loadLibrary(this.a);
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            unsatisfiedLinkError.printStackTrace();
            ak.a(false);
        }
        return null;
    }
}

