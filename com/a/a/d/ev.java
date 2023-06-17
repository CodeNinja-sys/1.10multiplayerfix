/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ep;
import com.a.a.d.et;
import com.a.a.d.eu;
import java.io.Serializable;

final class ev
implements Serializable {
    private final ep a;
    private static final long b = 0L;

    private ev(ep ep2) {
        this.a = ep2;
    }

    private Object a() {
        return new et(this.a);
    }

    /* synthetic */ ev(ep ep2, eu eu2) {
        this(ep2);
    }
}

