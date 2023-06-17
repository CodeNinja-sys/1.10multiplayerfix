/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.d;
import org.lwjgl.opencl.z;
import org.lwjgl.x;

public final class EXTMigrateMemobject {
    public static final int a = 1;
    public static final int b = 16448;

    private EXTMigrateMemobject() {
    }

    public static int a(z z2, x x2, long l2, x x3, x x4) {
        int n2;
        long l3 = org.lwjgl.opencl.x.bm;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(x2, 1);
        if (x3 != null) {
            org.lwjgl.a.b(x3);
        }
        if (x4 != null) {
            org.lwjgl.a.a(x4, 1);
        }
        if ((n2 = EXTMigrateMemobject.nclEnqueueMigrateMemObjectEXT(z2.a(), x2.m(), o.c(x2), l2, x3 == null ? 0 : x3.m(), o.d(x3), o.d(x4), l3)) == 0) {
            z2.a(x4);
        }
        return n2;
    }

    static native int nclEnqueueMigrateMemObjectEXT(long var0, int var2, long var3, long var5, int var7, long var8, long var10, long var12);

    public static int a(z z2, CLMem cLMem, long l2, x x2, x x3) {
        int n2;
        long l3 = org.lwjgl.opencl.x.bm;
        org.lwjgl.a.a(l3);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n2 = EXTMigrateMemobject.nclEnqueueMigrateMemObjectEXT(z2.a(), 1, d.a(cLMem), l2, x2 == null ? 0 : x2.m(), o.d(x2), o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n2;
    }
}

