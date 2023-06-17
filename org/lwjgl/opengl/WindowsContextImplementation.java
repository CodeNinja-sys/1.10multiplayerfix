/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.d;
import org.lwjgl.opengl.du;
import org.lwjgl.opengl.dw;
import org.lwjgl.opengl.ii;
import org.lwjgl.opengl.iy;

final class WindowsContextImplementation
implements dw {
    WindowsContextImplementation() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ByteBuffer a(ii ii2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ii2.g();
        try {
            ByteBuffer byteBuffer3 = WindowsContextImplementation.nCreate(byteBuffer2, intBuffer, byteBuffer);
            return byteBuffer3;
        }
        finally {
            ii2.f();
        }
    }

    private static native ByteBuffer nCreate(ByteBuffer var0, IntBuffer var1, ByteBuffer var2);

    native long getHGLRC(ByteBuffer var1);

    native long getHDC(ByteBuffer var1);

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
            ByteBuffer byteBuffer = ii2.g();
            try {
                WindowsContextImplementation.nSwapBuffers(byteBuffer);
            }
            finally {
                ii2.f();
            }
        }
    }

    private static native void nSwapBuffers(ByteBuffer var0);

    public void a(ByteBuffer byteBuffer) {
    }

    public void b(ByteBuffer byteBuffer) {
    }

    public void b() {
        WindowsContextImplementation.nReleaseCurrentContext();
    }

    private static native void nReleaseCurrentContext();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ii ii2, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ii2.g();
        try {
            WindowsContextImplementation.nMakeCurrent(byteBuffer2, byteBuffer);
        }
        finally {
            ii2.f();
        }
    }

    private static native void nMakeCurrent(ByteBuffer var0, ByteBuffer var1);

    public boolean c(ByteBuffer byteBuffer) {
        boolean bl2 = WindowsContextImplementation.nIsCurrent(byteBuffer);
        return bl2;
    }

    private static native boolean nIsCurrent(ByteBuffer var0);

    public void a(int n2) {
        boolean bl2 = WindowsContextImplementation.nSetSwapInterval(n2);
        if (!bl2) {
            d.a((CharSequence)"Failed to set swap interval");
        }
        iy.a();
    }

    private static native boolean nSetSwapInterval(int var0);

    public void b(ii ii2, ByteBuffer byteBuffer) {
        WindowsContextImplementation.nDestroy(byteBuffer);
    }

    private static native void nDestroy(ByteBuffer var0);
}

