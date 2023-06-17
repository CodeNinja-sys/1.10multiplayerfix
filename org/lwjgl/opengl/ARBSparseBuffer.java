/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBSparseBuffer {
    public static final int a = 1024;
    public static final int b = 33528;

    private ARBSparseBuffer() {
    }

    public static void a(int n2, long l2, long l3, boolean bl2) {
        dt dt2 = GLContext.a();
        long l4 = dt2.lR;
        org.lwjgl.a.a(l4);
        ARBSparseBuffer.nglBufferPageCommitmentARB(n2, l2, l3, bl2, l4);
    }

    static native void nglBufferPageCommitmentARB(int var0, long var1, long var3, boolean var5, long var6);
}

