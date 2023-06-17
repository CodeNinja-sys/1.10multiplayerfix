/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

final class CallbackUtil {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();
    private static final Map c = new HashMap();

    private CallbackUtil() {
    }

    static long a(Object object) {
        return object == null ? 0L : CallbackUtil.ncreateGlobalRef(object);
    }

    private static native long ncreateGlobalRef(Object var0);

    private static native void deleteGlobalRef(long var0);

    private static void a(long l2, Map map) {
        dt dt2 = GLContext.a();
        if (dt2 == null) {
            CallbackUtil.deleteGlobalRef(l2);
            throw new IllegalStateException("No context is current.");
        }
        Long l3 = (Long)map.remove(dt2);
        if (l3 != null) {
            CallbackUtil.deleteGlobalRef(l3);
        }
        if (l2 != 0L) {
            map.put(dt2, l2);
        }
    }

    static void b(Object object) {
        dt dt2 = GLContext.a(object);
        Long l2 = (Long)a.remove(dt2);
        if (l2 != null) {
            CallbackUtil.deleteGlobalRef(l2);
        }
        if ((l2 = (Long)b.remove(dt2)) != null) {
            CallbackUtil.deleteGlobalRef(l2);
        }
        if ((l2 = (Long)c.remove(dt2)) != null) {
            CallbackUtil.deleteGlobalRef(l2);
        }
    }

    static native long getDebugOutputCallbackARB();

    static void a(long l2) {
        CallbackUtil.a(l2, a);
    }

    static native long getDebugOutputCallbackAMD();

    static void b(long l2) {
        CallbackUtil.a(l2, b);
    }

    static native long getDebugCallbackKHR();

    static void c(long l2) {
        CallbackUtil.a(l2, c);
    }
}

