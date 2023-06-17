/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.aa;
import org.lwjgl.opengl.c;
import org.lwjgl.opengl.d;

public final class b
extends aa {
    private static final int b = 37190;
    private static final int c = 37191;
    private static final int d = 37192;
    private static final int e = 37193;
    private static final int f = 37194;
    private static final int g = 37195;
    private static final int h = 37196;
    private static final int i = 37197;
    private static final int j = 37198;
    private static final int k = 37199;
    private static final int l = 37200;
    private static final long m;
    private final d n;

    public b() {
        this(new c());
    }

    public b(d d2) {
        super(m);
        this.n = d2;
    }

    d d() {
        return this.n;
    }

    static {
        long l2 = 0L;
        try {
            l2 = (Long)Class.forName("org.lwjgl.opengl.CallbackUtil").getDeclaredMethod("getDebugOutputCallbackAMD", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
        m = l2;
    }
}

