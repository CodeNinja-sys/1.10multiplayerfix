/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.commons.d.a.o;
import org.apache.commons.d.a.q;

final class r
extends WeakReference {
    private final q a;

    private r(Object object, ReferenceQueue referenceQueue, q q2) {
        super(object, referenceQueue);
        this.a = q2;
    }

    private q a() {
        return this.a;
    }

    static q a(r r2) {
        return r2.a();
    }

    r(Object object, ReferenceQueue referenceQueue, q q2, o o2) {
        this(object, referenceQueue, q2);
    }
}

