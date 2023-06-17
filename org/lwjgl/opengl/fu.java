/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;

final class fu
implements PrivilegedAction {
    fu() {
    }

    public String a() {
        return System.getProperty("os.name");
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

