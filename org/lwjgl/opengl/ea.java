/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;
import org.lwjgl.opengl.dx;

final class ea
implements PrivilegedAction {
    ea() {
    }

    public Object run() {
        Runtime.getRuntime().removeShutdownHook(dx.G());
        return null;
    }
}

