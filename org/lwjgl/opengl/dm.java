/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.security.PrivilegedExceptionAction;
import org.lwjgl.opengl.AWTSurfaceLock;

class dm
implements PrivilegedExceptionAction {
    final /* synthetic */ Canvas a;
    final /* synthetic */ AWTSurfaceLock b;

    dm(AWTSurfaceLock aWTSurfaceLock, Canvas canvas) {
        this.b = aWTSurfaceLock;
        this.a = canvas;
    }

    public Boolean a() {
        return AWTSurfaceLock.a(AWTSurfaceLock.a(this.b), this.a);
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

