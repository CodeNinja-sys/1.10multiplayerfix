/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.dm;

final class AWTSurfaceLock {
    private static final int a = 100;
    private final ByteBuffer b = AWTSurfaceLock.createHandle();
    private boolean c;

    AWTSurfaceLock() {
    }

    private static native ByteBuffer createHandle();

    public ByteBuffer a(Canvas canvas) {
        while (!this.b(canvas)) {
            d.a((CharSequence)"Could not get drawing surface info, retrying...");
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                d.a((CharSequence)("Interrupted while retrying: " + interruptedException));
            }
        }
        return this.b;
    }

    private boolean b(Canvas canvas) {
        if (this.c) {
            return AWTSurfaceLock.lockAndInitHandle(this.b, canvas);
        }
        try {
            this.c = (Boolean)AccessController.doPrivileged(new dm(this, canvas));
            return this.c;
        }
        catch (PrivilegedActionException privilegedActionException) {
            throw (c)privilegedActionException.getException();
        }
    }

    private static native boolean lockAndInitHandle(ByteBuffer var0, Canvas var1);

    void a() {
        AWTSurfaceLock.nUnlock(this.b);
    }

    private static native void nUnlock(ByteBuffer var0);

    static /* synthetic */ ByteBuffer a(AWTSurfaceLock aWTSurfaceLock) {
        return aWTSurfaceLock.b;
    }

    static /* synthetic */ boolean a(ByteBuffer byteBuffer, Canvas canvas) {
        return AWTSurfaceLock.lockAndInitHandle(byteBuffer, canvas);
    }
}

