/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.GraphicsDevice;
import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;

final class gl
implements PrivilegedExceptionAction {
    final /* synthetic */ GraphicsDevice a;

    gl(GraphicsDevice graphicsDevice) {
        this.a = graphicsDevice;
    }

    public Method a() {
        return this.a.getClass().getMethod("getScreen", new Class[0]);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

