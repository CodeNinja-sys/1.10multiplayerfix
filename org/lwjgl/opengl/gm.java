/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.GraphicsConfiguration;
import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;

final class gm
implements PrivilegedExceptionAction {
    final /* synthetic */ GraphicsConfiguration a;

    gm(GraphicsConfiguration graphicsConfiguration) {
        this.a = graphicsConfiguration;
    }

    public Method a() {
        return this.a.getClass().getMethod("getVisual", new Class[0]);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

