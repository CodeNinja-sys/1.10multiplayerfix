/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import org.apache.commons.compress.archivers.f.h;
import org.apache.commons.compress.archivers.f.w;

public class x {
    private final w a;
    private final Object b;

    public x(w w2) {
        this(w2, null);
    }

    public x(w w2, Object object) {
        this.a = w2;
        this.b = object;
        if (object != null && !h.a(w2).a(object)) {
            throw new IllegalArgumentException("The " + (Object)((Object)w2) + " method doesn't support options of type " + object.getClass());
        }
    }

    public w a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }
}

