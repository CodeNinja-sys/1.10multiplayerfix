/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.x;

public final class KHRICD {
    public static final int a = 2336;
    public static final int b = -1001;

    private KHRICD() {
    }

    public static int a(x x2, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.bs;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        int n2 = KHRICD.nclIcdGetPlatformIDsKHR(x2 == null ? 0 : x2.m(), o.d(x2), o.b(intBuffer), l2);
        return n2;
    }

    static native int nclIcdGetPlatformIDsKHR(int var0, long var1, long var3, long var5);
}

