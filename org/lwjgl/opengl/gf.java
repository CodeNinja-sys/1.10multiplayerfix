/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.aa;
import org.lwjgl.opengl.gg;
import org.lwjgl.opengl.gh;

public final class gf
extends aa {
    private static final int b = 37190;
    private static final int c = 37191;
    private static final int d = 37192;
    private static final int e = 33387;
    private static final int f = 33350;
    private static final int g = 33351;
    private static final int h = 33352;
    private static final int i = 33353;
    private static final int j = 33354;
    private static final int k = 33355;
    private static final int l = 33356;
    private static final int m = 33357;
    private static final int n = 33358;
    private static final int o = 33359;
    private static final int p = 33360;
    private static final int q = 33361;
    private static final int r = 33384;
    private static final long s;
    private final gh t;

    public gf() {
        this(new gg());
    }

    public gf(gh gh2) {
        super(s);
        this.t = gh2;
    }

    gh d() {
        return this.t;
    }

    static {
        long l2 = 0L;
        try {
            l2 = (Long)Class.forName("org.lwjgl.opengl.CallbackUtil").getDeclaredMethod("getDebugCallbackKHR", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
        s = l2;
    }
}

