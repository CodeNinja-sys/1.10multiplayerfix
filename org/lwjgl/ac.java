/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.io.File;
import java.security.PrivilegedAction;
import org.lwjgl.d;

final class ac
implements PrivilegedAction {
    final /* synthetic */ String a;

    ac(String string) {
        this.a = string;
    }

    public Object run() {
        String string = System.getProperty("org.lwjgl.librarypath");
        if (string != null) {
            System.load(string + File.separator + d.a(this.a));
        } else {
            System.loadLibrary(this.a);
        }
        return null;
    }
}

