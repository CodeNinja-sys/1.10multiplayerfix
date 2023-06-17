/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import org.apache.a.i.g.k;
import org.apache.a.j.e;
import org.apache.a.j.f;
import org.apache.a.j.i;
import org.apache.a.k.v;

public class l
implements f {
    public static final l a = new l();
    private final v b;

    public l(v v2) {
        this.b = v2 != null ? v2 : org.apache.a.k.k.b;
    }

    public l() {
        this(null);
    }

    public e a(i i2) {
        return new k(i2, this.b);
    }
}

