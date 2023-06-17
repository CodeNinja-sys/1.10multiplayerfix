/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.gr;

final class gv
implements PrivilegedAction {
    final /* synthetic */ boolean a;

    gv(boolean bl2) {
        this.a = bl2;
    }

    public Object run() {
        try {
            gr.b().a(this.a);
        }
        catch (c c2) {
            d.a((CharSequence)("Failed to change Compiz Legacy Fullscreen Support. Reason: " + c2.getMessage()));
        }
        return null;
    }
}

