/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.c.b.j;

public abstract class b
implements j {
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();

    @Override
    public final Object a() {
        Object v2;
        while ((v2 = this.b.get()) == null) {
            if (!this.a.compareAndSet(null, this)) continue;
            this.b.set(this.b());
        }
        return v2;
    }

    protected abstract Object b();
}

