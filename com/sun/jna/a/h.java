/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.b.f;
import com.sun.jna.a.d.dr;
import com.sun.jna.a.e;
import com.sun.jna.a.g;

class h {
    public static final e a;

    private h() {
    }

    static {
        String string = System.getProperty("os.name");
        a = string.startsWith("Windows") ? new dr() : (string.startsWith("Mac") ? new f() : new g(null));
    }
}

