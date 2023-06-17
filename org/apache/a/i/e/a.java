/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.e;

import org.apache.a.aj;
import org.apache.a.h.e;
import org.apache.a.i.e.d;
import org.apache.a.t;

public class a
implements e {
    public static final a c = new a(new d(0));
    private final e d;

    public a(e e2) {
        this.d = e2;
    }

    public long a(t t2) {
        long l2 = this.d.a(t2);
        if (l2 == -1L) {
            throw new aj("Identity transfer encoding cannot be used");
        }
        return l2;
    }
}

