/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.util.HashMap;
import java.util.Map;

final class CallbackUtil {
    private static final Map a = new HashMap();

    private CallbackUtil() {
    }

    static long a(Object object) {
        return object == null ? 0L : CallbackUtil.ncreateGlobalRef(object);
    }

    private static native long ncreateGlobalRef(Object var0);

    static native void deleteGlobalRef(long var0);

    static void a(int n2, long l2) {
        if (n2 != 0 && l2 != 0L) {
            CallbackUtil.deleteGlobalRef(l2);
        }
    }

    static native long getContextCallback();

    static native long getMemObjectDestructorCallback();

    static native long getProgramCallback();

    static native long getNativeKernelCallback();

    static native long getEventCallback();

    static native long getPrintfCallback();

    static native long getLogMessageToSystemLogAPPLE();

    static native long getLogMessageToStdoutAPPLE();

    static native long getLogMessageToStderrAPPLE();
}

