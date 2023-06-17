/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.io.IOException;
import java.security.PrivilegedAction;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.gr;
import org.lwjgl.opengl.gt;
import org.lwjgl.opengl.gu;

final class gs
implements PrivilegedAction {
    gs() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object run() {
        try {
            if (!gr.a("compiz")) {
                Object var1_1 = null;
                return var1_1;
            }
            gr.a(null);
            String string = null;
            if (gr.a("dbus-daemon")) {
                string = "Dbus";
                gr.a(new gt(this));
            } else {
                try {
                    Runtime.getRuntime().exec("gconftool");
                    string = "gconftool";
                    gr.a(new gu(this));
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if (gr.b() != null) {
                if (!gr.b().a()) {
                    gr.b(true);
                    d.a((CharSequence)("Using " + string + " to apply Compiz LFS workaround."));
                }
            }
        }
        catch (c c2) {}
        finally {
            return null;
        }
    }
}

