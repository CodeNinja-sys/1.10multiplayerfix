/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.commons.d.a.o;
import org.apache.commons.d.a.r;

final class q {
    private final WeakReference a;
    private final int b;

    private q(Object object) {
        this.a = new WeakReference<Object>(object);
        this.b = object.hashCode();
    }

    private q(Object object, ReferenceQueue referenceQueue) {
        this.a = new r(object, referenceQueue, this, null);
        this.b = object.hashCode();
    }

    public int hashCode() {
        return this.b;
    }

    private Object a() {
        return this.a.get();
    }

    public boolean equals(Object object) {
        boolean bl2 = false;
        if (object instanceof q) {
            q q2 = (q)object;
            Object object2 = this.a();
            Object object3 = q2.a();
            if (object2 == null) {
                bl2 = object3 == null;
                bl2 = bl2 && this.hashCode() == q2.hashCode();
            } else {
                bl2 = object2.equals(object3);
            }
        }
        return bl2;
    }

    q(Object object, o o2) {
        this(object);
    }

    static Object a(q q2) {
        return q2.a();
    }

    q(Object object, ReferenceQueue referenceQueue, o o2) {
        this(object, referenceQueue);
    }
}

