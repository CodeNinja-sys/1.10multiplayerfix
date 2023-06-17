/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.c.b.j;

public abstract class a
implements j {
    private final AtomicReference a = new AtomicReference();

    @Override
    public Object a() {
        Object object = this.a.get();
        if (object == null && !this.a.compareAndSet(null, object = this.b())) {
            object = this.a.get();
        }
        return object;
    }

    protected abstract Object b();
}

