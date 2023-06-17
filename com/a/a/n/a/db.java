/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dc;
import java.util.concurrent.ExecutionException;

class db
extends dc {
    private final Throwable a;

    db(Throwable throwable) {
        super(null);
        this.a = throwable;
    }

    @Override
    public Object get() {
        throw new ExecutionException(this.a);
    }
}

