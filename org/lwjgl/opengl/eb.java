/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.security.PrivilegedAction;
import org.lwjgl.opengl.dx;

final class eb
implements PrivilegedAction {
    eb() {
    }

    public Object run() {
        Runtime.getRuntime().addShutdownHook(dx.G());
        return null;
    }
}

