/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.v;
import java.io.Serializable;
import java.nio.charset.Charset;

class ac
implements Serializable {
    private final String a;
    private static final long b = 0L;

    ac(Charset charset) {
        this.a = charset.name();
    }

    private Object a() {
        return v.a(Charset.forName(this.a));
    }
}

