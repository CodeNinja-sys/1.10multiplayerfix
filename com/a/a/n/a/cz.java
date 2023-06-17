/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dc;
import com.a.a.n.a.g;
import java.util.concurrent.CancellationException;

class cz
extends dc {
    private final CancellationException a = new CancellationException("Immediate cancelled future.");

    cz() {
        super(null);
    }

    @Override
    public boolean isCancelled() {
        return true;
    }

    @Override
    public Object get() {
        throw g.a("Task was cancelled.", this.a);
    }
}

