/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.a;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.x;

public final class KHRTerminateContext {
    public static final int a = 8207;
    public static final int b = 8208;

    private KHRTerminateContext() {
    }

    public static int a(ab ab2) {
        long l2 = x.bw;
        org.lwjgl.a.a(l2);
        int n2 = KHRTerminateContext.nclTerminateContextKHR(ab2.a(), l2);
        return n2;
    }

    static native int nclTerminateContextKHR(long var0, long var2);
}

