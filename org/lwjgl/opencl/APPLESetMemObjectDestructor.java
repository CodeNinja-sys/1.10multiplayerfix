/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.a;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.ao;
import org.lwjgl.opencl.x;

public final class APPLESetMemObjectDestructor {
    private APPLESetMemObjectDestructor() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(CLMem cLMem, ao ao2) {
        long l2 = x.f;
        a.a(l2);
        long l3 = CallbackUtil.a(ao2);
        int n2 = 0;
        try {
            int n3 = n2 = APPLESetMemObjectDestructor.nclSetMemObjectDestructorAPPLE(cLMem.a(), ao2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    static native int nclSetMemObjectDestructorAPPLE(long var0, long var2, long var4, long var6);
}

