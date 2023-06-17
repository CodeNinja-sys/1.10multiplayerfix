/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.util.List;
import org.lwjgl.c;
import org.lwjgl.opengl.gr;
import org.lwjgl.opengl.gs;
import org.lwjgl.opengl.gw;

class gt
implements gw {
    private static final String b = "/org/freedesktop/compiz/workarounds/allscreens/legacy_fullscreen";
    final /* synthetic */ gs a;

    gt(gs gs2) {
        this.a = gs2;
    }

    public boolean a() {
        List list = gr.a(new String[]{"dbus-send", "--print-reply", "--type=method_call", "--dest=org.freedesktop.compiz", b, "org.freedesktop.compiz.get"});
        if (list == null || list.size() < 2) {
            throw new c("Invalid Dbus reply.");
        }
        String string = (String)list.get(0);
        if (!string.startsWith("method return")) {
            throw new c("Invalid Dbus reply.");
        }
        string = ((String)list.get(1)).trim();
        if (!string.startsWith("boolean") || string.length() < 12) {
            throw new c("Invalid Dbus reply.");
        }
        return "true".equalsIgnoreCase(string.substring("boolean".length() + 1));
    }

    public void a(boolean bl2) {
        if (gr.a(new String[]{"dbus-send", "--type=method_call", "--dest=org.freedesktop.compiz", b, "org.freedesktop.compiz.set", "boolean:" + Boolean.toString(bl2)}) == null) {
            throw new c("Failed to apply Compiz LFS workaround.");
        }
    }
}

