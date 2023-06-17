/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.g;

import io.netty.c.a.d.br;

public final class l {
    public static final br a = new br("RTSP", 1, 0, true);

    public static br a(String string) {
        if (string == null) {
            throw new NullPointerException("text");
        }
        if ("RTSP/1.0".equals(string = string.trim().toUpperCase())) {
            return a;
        }
        return new br(string, true);
    }

    private l() {
    }
}

