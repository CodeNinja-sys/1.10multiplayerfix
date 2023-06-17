/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.bc;
import com.a.a.g.bd;
import java.io.Serializable;

final class bf
implements Serializable {
    private final String a;
    private final int b;
    private final String c;
    private static final long d = 0L;

    private bf(String string, int n2, String string2) {
        this.a = string;
        this.b = n2;
        this.c = string2;
    }

    private Object a() {
        return new bc(this.a, this.b, this.c);
    }

    /* synthetic */ bf(String string, int n2, String string2, bd bd2) {
        this(string, n2, string2);
    }
}

