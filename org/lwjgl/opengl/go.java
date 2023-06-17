/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;
import org.lwjgl.opengl.LinuxDisplay;
import org.lwjgl.opengl.jh;

class go
implements PrivilegedAction {
    final /* synthetic */ LinuxDisplay a;

    go(LinuxDisplay linuxDisplay) {
        this.a = linuxDisplay;
    }

    public Object run() {
        jh.c();
        return null;
    }
}

