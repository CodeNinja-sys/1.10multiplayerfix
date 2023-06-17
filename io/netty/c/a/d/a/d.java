/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.a;

import io.netty.c.a.d.a.b;
import java.util.concurrent.Callable;

final class d
implements Callable {
    private final Object a;

    private d(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        this.a = object;
    }

    public Object call() {
        return this.a;
    }

    /* synthetic */ d(Object object, b b2) {
        this(object);
    }
}

