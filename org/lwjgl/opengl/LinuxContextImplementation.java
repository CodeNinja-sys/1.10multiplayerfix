/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.c;
import org.lwjgl.opengl.LinuxDisplay;
import org.lwjgl.opengl.du;
import org.lwjgl.opengl.dw;
import org.lwjgl.opengl.ii;

final class LinuxContextImplementation
implements dw {
    LinuxContextImplementation() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ByteBuffer a(ii ii2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            ByteBuffer byteBuffer2 = ii2.g();
            try {
                ByteBuffer byteBuffer3 = LinuxContextImplementation.nCreate(byteBuffer2, intBuffer, byteBuffer);
                ii2.f();
                return byteBuffer3;
            }
            catch (Throwable throwable) {
                ii2.f();
                throw throwable;
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native ByteBuffer nCreate(ByteBuffer var0, IntBuffer var1, ByteBuffer var2);

    native long getGLXContext(ByteBuffer var1);

    native long getDisplay(ByteBuffer var1);

    public void a(ByteBuffer byteBuffer) {
    }

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
            ii ii2 = du2.e();
            LinuxDisplay.C();
            try {
                ByteBuffer byteBuffer = ii2.g();
                try {
                    LinuxContextImplementation.nSwapBuffers(byteBuffer);
                }
                finally {
                    ii2.f();
                }
            }
            finally {
                LinuxDisplay.D();
            }
        }
    }

    private static native void nSwapBuffers(ByteBuffer var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        du du2 = du.g();
        if (du2 == null) {
            throw new IllegalStateException("No context is current");
        }
        du du3 = du2;
        synchronized (du3) {
            ii ii2 = du2.e();
            LinuxDisplay.C();
            try {
                ByteBuffer byteBuffer = ii2.g();
                try {
                    LinuxContextImplementation.nReleaseCurrentContext(byteBuffer);
                }
                finally {
                    ii2.f();
                }
            }
            finally {
                LinuxDisplay.D();
            }
        }
    }

    private static native void nReleaseCurrentContext(ByteBuffer var0);

    public void b(ByteBuffer byteBuffer) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ii ii2, ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            ByteBuffer byteBuffer2 = ii2.g();
            try {
                LinuxContextImplementation.nMakeCurrent(byteBuffer2, byteBuffer);
            }
            finally {
                ii2.f();
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void nMakeCurrent(ByteBuffer var0, ByteBuffer var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c(ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            boolean bl2;
            boolean bl3 = bl2 = LinuxContextImplementation.nIsCurrent(byteBuffer);
            return bl3;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native boolean nIsCurrent(ByteBuffer var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2) {
        du du2 = du.g();
        ii ii2 = du2.e();
        if (du2 == null) {
            throw new IllegalStateException("No context is current");
        }
        du du3 = du2;
        synchronized (du3) {
            LinuxDisplay.C();
            try {
                ByteBuffer byteBuffer = ii2.g();
                try {
                    LinuxContextImplementation.nSetSwapInterval(byteBuffer, du2.j(), n2);
                }
                finally {
                    ii2.f();
                }
            }
            catch (c c2) {
                c2.printStackTrace();
            }
            finally {
                LinuxDisplay.D();
            }
        }
    }

    private static native void nSetSwapInterval(ByteBuffer var0, ByteBuffer var1, int var2);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(ii ii2, ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            ByteBuffer byteBuffer2 = ii2.g();
            try {
                LinuxContextImplementation.nDestroy(byteBuffer2, byteBuffer);
            }
            finally {
                ii2.f();
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void nDestroy(ByteBuffer var0, ByteBuffer var1);
}

