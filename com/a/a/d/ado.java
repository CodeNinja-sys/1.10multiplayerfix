/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.add;
import java.util.Collection;
import java.util.Queue;

class ado
extends add
implements Queue {
    private static final long a = 0L;

    ado(Queue queue, Object object) {
        super(queue, object, null);
    }

    Queue c() {
        return (Queue)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object element() {
        Object object = this.h;
        synchronized (object) {
            return this.c().element();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean offer(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().offer(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object peek() {
        Object object = this.h;
        synchronized (object) {
            return this.c().peek();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object poll() {
        Object object = this.h;
        synchronized (object) {
            return this.c().poll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object remove() {
        Object object = this.h;
        synchronized (object) {
            return this.c().remove();
        }
    }

    @Override
    /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    /* synthetic */ Object e() {
        return this.c();
    }
}

