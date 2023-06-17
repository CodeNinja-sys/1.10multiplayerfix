/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.LinuxDisplay;
import org.lwjgl.opengl.jh;

class gp
implements PrivilegedAction {
    final /* synthetic */ LinuxDisplay a;

    gp(LinuxDisplay linuxDisplay) {
        this.a = linuxDisplay;
    }

    public DisplayMode a() {
        jh.b();
        return jh.a(jh.a());
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

