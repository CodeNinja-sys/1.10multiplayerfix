/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.b;

import org.apache.commons.c.b.j;

public abstract class o
implements j {
    private volatile Object a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a() {
        Object object = this.a;
        if (object == null) {
            o o2 = this;
            synchronized (o2) {
                object = this.a;
                if (object == null) {
                    this.a = object = this.b();
                }
            }
        }
        return object;
    }

    protected abstract Object b();
}

