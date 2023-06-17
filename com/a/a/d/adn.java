/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class adn
implements Serializable {
    final Object g;
    final Object h;
    private static final long a = 0L;

    adn(Object object, Object object2) {
        this.g = cl.a(object);
        this.h = object2 == null ? this : object2;
    }

    Object e() {
        return this.g;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString() {
        Object object = this.h;
        synchronized (object) {
            return this.g.toString();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(ObjectOutputStream objectOutputStream) {
        Object object = this.h;
        synchronized (object) {
            objectOutputStream.defaultWriteObject();
        }
    }
}

