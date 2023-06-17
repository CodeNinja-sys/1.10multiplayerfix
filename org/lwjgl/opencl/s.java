/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.ad;
import org.lwjgl.opencl.t;
import org.lwjgl.opencl.u;
import org.lwjgl.opencl.v;
import org.lwjgl.opencl.x;

public final class s {
    public static final ad a;
    public static final ad b;
    public static final ad c;

    private s() {
    }

    static {
        if (x.a) {
            a = new t(CallbackUtil.getLogMessageToSystemLogAPPLE());
            b = new u(CallbackUtil.getLogMessageToStdoutAPPLE());
            c = new v(CallbackUtil.getLogMessageToStderrAPPLE());
        } else {
            a = null;
            b = null;
            c = null;
        }
    }
}

