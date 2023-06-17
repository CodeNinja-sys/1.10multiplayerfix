/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.du;
import org.lwjgl.opengl.dw;
import org.lwjgl.opengl.ii;

final class MacOSXContextImplementation
implements dw {
    MacOSXContextImplementation() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ByteBuffer a(ii ii2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ii2.g();
        try {
            ByteBuffer byteBuffer3 = MacOSXContextImplementation.nCreate(byteBuffer2, byteBuffer);
            return byteBuffer3;
        }
        finally {
            ii2.f();
        }
    }

    private static native ByteBuffer nCreate(ByteBuffer var0, ByteBuffer var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        du du2 = du.g();
        if (du2 == null) {
            throw new IllegalStateException("No context is current");
        }
        du du3 = du2;
        synchronized (du3) {
            MacOSXContextImplementation.nSwapBuffers(du2.j());
        }
    }

    native long getCGLShareGroup(ByteBuffer var1);

    private static native void nSwapBuffers(ByteBuffer var0);

    public void b(ByteBuffer byteBuffer) {
        MacOSXContextImplementation.nUpdate(byteBuffer);
    }

    private static native void nUpdate(ByteBuffer var0);

    public void b() {
        MacOSXContextImplementation.nReleaseCurrentContext();
    }

    private static native void nReleaseCurrentContext();

    public void a(ByteBuffer byteBuffer) {
        MacOSXContextImplementation.clearDrawable(byteBuffer);
    }

    private static native void clearDrawable(ByteBuffer var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void a(ii ii2, du du2) {
        ByteBuffer byteBuffer = ii2.g();
        try {
            du du3 = du2;
            synchronized (du3) {
                MacOSXContextImplementation.clearDrawable(du2.j());
                MacOSXContextImplementation.setView(byteBuffer, du2.j());
            }
        }
        finally {
            ii2.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ii ii2, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ii2.g();
        try {
            MacOSXContextImplementation.setView(byteBuffer2, byteBuffer);
            MacOSXContextImplementation.nMakeCurrent(byteBuffer);
        }
        finally {
            ii2.f();
        }
    }

    private static native void setView(ByteBuffer var0, ByteBuffer var1);

    private static native void nMakeCurrent(ByteBuffer var0);

    public boolean c(ByteBuffer byteBuffer) {
        boolean bl2 = MacOSXContextImplementation.nIsCurrent(byteBuffer);
        return bl2;
    }

    private static native boolean nIsCurrent(ByteBuffer var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2) {
        du du2;
        du du3 = du2 = du.g();
        synchronized (du3) {
            MacOSXContextImplementation.nSetSwapInterval(du2.j(), n2);
        }
    }

    private static native void nSetSwapInterval(ByteBuffer var0, int var1);

    public void b(ii ii2, ByteBuffer byteBuffer) {
        MacOSXContextImplementation.nDestroy(byteBuffer);
    }

    private static native void nDestroy(ByteBuffer var0);
}

