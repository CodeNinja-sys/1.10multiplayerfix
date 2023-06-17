/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.ab;
import org.lwjgl.opengl.ac;

public final class aa
extends org.lwjgl.aa {
    private static final int b = 37190;
    private static final int c = 37191;
    private static final int d = 37192;
    private static final int e = 33350;
    private static final int f = 33351;
    private static final int g = 33352;
    private static final int h = 33353;
    private static final int i = 33354;
    private static final int j = 33355;
    private static final int k = 33356;
    private static final int l = 33357;
    private static final int m = 33358;
    private static final int n = 33359;
    private static final int o = 33360;
    private static final int p = 33361;
    private static final long q;
    private final ac r;

    public aa() {
        this(new ab());
    }

    public aa(ac ac2) {
        super(q);
        this.r = ac2;
    }

    ac d() {
        return this.r;
    }

    static {
        long l2 = 0L;
        try {
            l2 = (Long)Class.forName("org.lwjgl.opengl.CallbackUtil").getDeclaredMethod("getDebugOutputCallbackARB", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
        q = l2;
    }
}

