/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.ab;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opencl.x;

public final class CL {
    private static boolean a;

    private CL() {
    }

    private static native void nCreate(String var0);

    private static native void nCreateDefault();

    private static native void nDestroy();

    public static boolean a() {
        return a;
    }

    public static void b() {
        String[] arrstring;
        String string;
        if (a) {
            return;
        }
        switch (d.a()) {
            case 3: {
                string = "OpenCL";
                arrstring = new String[]{"OpenCL.dll"};
                break;
            }
            case 1: {
                string = "OpenCL";
                arrstring = new String[]{"libOpenCL64.so", "libOpenCL.so"};
                break;
            }
            case 2: {
                string = "OpenCL";
                arrstring = new String[]{"OpenCL.dylib"};
                break;
            }
            default: {
                throw new c("Unknown platform: " + d.a());
            }
        }
        String[] arrstring2 = d.a(string, arrstring, CL.class.getClassLoader());
        d.a((CharSequence)("Found " + arrstring2.length + " OpenCL paths"));
        for (String string2 : arrstring2) {
            try {
                CL.nCreate(string2);
                a = true;
                break;
            }
            catch (c c2) {
                d.a((CharSequence)("Failed to load " + string2 + ": " + c2.getMessage()));
            }
        }
        if (!a && d.a() == 2) {
            CL.nCreateDefault();
            a = true;
        }
        if (!a) {
            throw new c("Could not locate OpenCL library.");
        }
        if (!x.i) {
            throw new RuntimeException("OpenCL 1.0 not supported.");
        }
    }

    public static void c() {
    }

    static long a(String[] arrstring) {
        for (String string : arrstring) {
            long l2 = CL.a(string);
            if (l2 == 0L) continue;
            return l2;
        }
        return 0L;
    }

    static long a(String string) {
        ByteBuffer byteBuffer = o.a((CharSequence)string);
        return CL.ngetFunctionAddress(o.a(byteBuffer));
    }

    private static native long ngetFunctionAddress(long var0);

    static native ByteBuffer getHostBuffer(long var0, int var2);

    private static native void resetNativeStubs(Class var0);

    static {
        ab.b();
    }
}

